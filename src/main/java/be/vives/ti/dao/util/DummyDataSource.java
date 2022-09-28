package be.vives.ti.dao.util;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * De klasse DummyDataSource implementeert de interface javax.sql.DataSource, een Java EE interface
 * die instaat om het aanmaken van een connectie naar de fysieke database.
 *
 * We beschikken voor deze applicatie niet over een fysieke database.
 * Meer deze klasse zal het opvragen van een connectie naar de (niet bestaande) database simuleren.
 *
 * De DAO (Data Access Object) klasses zijn verantwoordelijk voor het communiceren met de database en
 * zullen dus een instantie van deze klasse nodig hebben om een connectie op te vragen naar de database.
 * Het is de methode getConnection() die in de DAO-klasses zal worden aangeroepen om dit gedrag te simuleren.
 *
 * Alle methodes uit de interface javax.sql.DataSource worden hierin overschreven met een dummy implementatie,
 * wat geen probleem is aangezien we toch niet echt willen connecteren met een database.
 *
 * In het verder vervolg van deze oefening zal via properties de connectionstring naar de dummy-database worden ingeladen
 */
@Component
public class DummyDataSource implements DataSource {
    @Override
    public Connection getConnection() throws SQLException {
        System.out.println("Een connectie naar de database wordt opgevraagd");
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
