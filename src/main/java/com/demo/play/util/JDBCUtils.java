package com.demo.play.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
   private static DataSource ds;
   static {
       try {
           //加载配置文件
           Properties pro = new Properties();
           pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
           //获取DataSource
           ds = DruidDataSourceFactory.createDataSource(pro);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

    //获取连接
    public  static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //获取连接池
    public static DataSource getDataSource() {
        return ds;
    }

}