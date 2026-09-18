package be.vives.ti.dao.util;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * BELANGRIJK — wat deze klasse WEL en NIET doet:
 *
 * DummyDataSource stelt GEEN echte databankconnectie voor. Er bestaat geen fysieke database:
 * er wordt nooit iets gelezen van of weggeschreven naar een echte databank via deze klasse.
 * getConnection() geeft altijd null terug, en dat blijft ook zo doorheen de volledige oefening
 *  — dat is bewust zo en geen fout.
 *
 * Waarom implementeert deze klasse dan toch javax.sql.DataSource (de standaard JDBC-interface
 * die elke echte databankconnectiepool, zoals HikariCP, ook implementeert)?
 * De DAO-klasses (StudentDao, TeacherDao) zijn geschreven tegen deze standaardinterface, zodat ze
 * er precies hetzelfde uitzien als DAO's die later in de cursus wél met een echte database praten.
 * Alle overige methodes van de interface
 * (getLogWriter, setLoginTimeout, unwrap, ...) worden enkel overschreven omdat de Java-interface
 * dat verplicht — ze doen inhoudelijk niets en worden nergens gebruikt.
 *
 * Vanaf lesson 3 (properties & profiles) krijgt deze klasse drie @Value-velden (username, password, url)
 * die via een properties-bestand worden ingeladen. Ook dat is bewust nep: het dient enkel om te tonen
 * dat property-injectie met @Value werkt, niet om er echt mee te connecteren.
 *
 * De échte (fictieve) data van de "database" zit NIET in deze klasse, maar in SchoolDatabaseStub.
 */
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
