/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2.dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import gt.edu.miumg.progra2.model.Color;
import gt.edu.miumg.progra2.model.TcExample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melgust
 */
public class Query extends ConnectionDB {

    Connection connection;
    PreparedStatement preparedStatement;

    public void insert() {
        String sql = "INSERT INTO tb_example (name, email) VALUES (?, ?)";
        try {
            connection = openDB();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Juan Perez");
            preparedStatement.setString(2, "jperez@miumg.edu.gt");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<TcExample> selectExample(String sql, Map<Integer, Object> parameters) {
        List<TcExample> data = new ArrayList<>();
        try {
            connection = openDB();
            preparedStatement = connection.prepareStatement(sql);
            if (parameters != null) {
                for (Integer key : parameters.keySet()) {
                    preparedStatement.setObject(key, parameters.get(key));
                }
            }
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TcExample tcExample = new TcExample();
                tcExample.setExampleId(resultSet.getLong("example_id"));
                tcExample.setName(resultSet.getString("name"));
                tcExample.setEmail(resultSet.getString("email"));
                tcExample.setCreatedAt(resultSet.getDate("created_at"));
                data.add(tcExample);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void insertColor(String colorDesc) {
        String sql = "INSERT INTO color (color_desc) VALUES (?)";
        try {
            connection = openDB();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, colorDesc);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Color> getColores() {
        List<Color> data = new ArrayList<>();
        String sql = "SELECT * FROM color";
        try {
            connection = openDB();
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                Color color = new Color();
                color.setColorId(resultSet.getLong("color_id"));
                color.setColorDesc(resultSet.getString("color_desc"));
                color.setEstadoId(resultSet.getInt("estado_id"));
                color.setFechaRegistro(resultSet.getDate("fecha_registro"));
                data.add(color);
            }
            preparedStatement.close();
            connection.close();
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
