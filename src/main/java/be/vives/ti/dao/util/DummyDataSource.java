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
 * Vanaf lesson 3 (properties & profiles) krijgt deze klasse drie @Value-velden (username, password, url)
 * die via een properties-bestand worden ingeladen. Ook dat is bewust nep: het dient enkel om te tonen
 * dat property-injectie met @Value werkt, niet om er echt mee te connecteren.
 *
 * De échte (fictieve) data van de "database" zit NIET in deze klasse, maar in SchoolDatabaseStub.
 */
public class DummyDataSource {
    public Connection getConnection() throws SQLException {
        System.out.println("Een connectie naar de database wordt opgevraagd");
        return null;
    }
}
