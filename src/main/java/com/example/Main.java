package com.example;

import java.util.List;

import com.example.factory.ConnectionFactory;
import com.example.factory.JDBCConnectionFactory;
import com.example.factory.JPAConnectionFactory;
import com.example.modelo.Alumno;
import com.example.utils.Config;

public class Main
{
    public static ConnectionFactory getConnectionFactory() {
        if (Config.getInstance().getProperty("connection.type").equals("JPA")) {
            return new JPAConnectionFactory();
        } else {
            return new JDBCConnectionFactory();
        }
    }

    public static void main( String[] args )
    {
        ConnectionFactory connFactory = getConnectionFactory();
        connFactory.connect();
        //Alumno al = new Alumno(0, null, null, null, null)
        
        
    }
}

