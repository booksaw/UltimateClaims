package com.craftaro.ultimateclaims.database.migrations;

import com.craftaro.core.database.DataMigration;
import com.craftaro.core.database.DatabaseConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class _6_FlySetting extends DataMigration {
    public _6_FlySetting() {
        super(6);
    }

    @Override
    public void migrate(Connection connection, String tablePrefix) throws SQLException {
        // Create permissions table
        try (Statement statement = connection.createStatement()) {
            statement.execute("ALTER TABLE " + tablePrefix + "settings ADD COLUMN fly TINYINT NOT NULL DEFAULT 0");
        }
    }
}
