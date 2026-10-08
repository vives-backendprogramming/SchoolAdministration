package be.vives.ti.dao.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

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
 *
 * @Component: deze klasse is vanaf deze branch (springcontextaware) een Spring-bean, zodat ze
 * via constructor injection in StudentDao/TeacherDao kan worden gestoken.
 */
@Component
public class DummyDataSource {

    private static final Logger log = LoggerFactory.getLogger(DummyDataSource.class);

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.url}")
    private String url;

    public Connection getConnection() throws SQLException {
        log.info("Connecting with username={}, url={}", username, url);
        log.debug("Using password={}", password); // never log secrets at INFO or above in real code!
        return null;
    }

}
