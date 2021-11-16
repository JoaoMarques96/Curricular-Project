/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.Services;

import com.jsf.Models.Data;
import com.jsf.Utils.OpUtils;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.json.JSONArray;

/**
 *
 * @author
 */
@ManagedBean(name = "dataservice")
@ApplicationScoped
public class DataService implements Serializable {

    private static final Logger LOG = Logger.getLogger(DataService.class.getName());

    public void insertData() {
        Data data = new Data();
        
        data.setCorrente1(OpUtils.getRandom(40, 100));
        data.setCorrente2(OpUtils.getRandom(40, 100));
        data.setCorrente3(OpUtils.getRandom(40, 100));
        data.setTensao1(OpUtils.getRandom(225, 235));
        data.setTensao2(OpUtils.getRandom(225, 235));
        data.setTensao3(OpUtils.getRandom(225, 235));

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String sql = "INSERT INTO DATA (CORRENTE1, CORRENTE2, CORRENTE3, TENSAO1, TENSAO2, TENSAO3, DATARECOLHA)"
                + " VALUES (" + data.getCorrente1() + ", " + data.getCorrente2() + ", " + data.getCorrente3() + ","
                + " "+ data.getTensao1() + ", " + data.getTensao2() + ", " + data.getTensao3() + ", '" + timestamp + "');";

        PostgreSQLManager con = new PostgreSQLManager();
        con.executeQuery(sql);
    }

    public JSONArray getDataList() {
        List<Data> dataList = new ArrayList<>();

        String sql = "SELECT * FROM DATA order by DATARECOLHA DESC LIMIT 10";
        PostgreSQLManager con = new PostgreSQLManager();

        try {
            ResultSet resultSet = con.executeQuery(sql);
            while (resultSet.next()) {
                Data data = new Data();
                data.setCorrente1(resultSet.getInt("CORRENTE1"));
                data.setCorrente2(resultSet.getInt("CORRENTE2"));
                data.setCorrente3(resultSet.getInt("CORRENTE3"));

                data.setTensao1(resultSet.getInt("TENSAO1"));
                data.setTensao2(resultSet.getInt("TENSAO2"));
                data.setTensao3(resultSet.getInt("TENSAO3"));

                data.setDataRecolha(resultSet.getTimestamp("DATARECOLHA"));
                dataList.add(data);
            }
        } catch (SQLException e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }

        return new JSONArray(dataList);
    }
}
