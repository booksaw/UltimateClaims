package com.craftaro.ultimateclaims.database.migrations;

import com.craftaro.core.database.DataMigration;
import com.craftaro.core.database.DatabaseConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class _5_TntSetting extends DataMigration {
    public _5_TntSetting() {
        super(5);
    }

    @Override
    public void migrate(Connection connection, String tablePrefix) throws SQLException {
        // Create permissions table
        try (Statement statement = connection.createStatement()) {
            statement.execute("ALTER TABLE " + tablePrefix + "settings ADD COLUMN tnt TINYINT NOT NULL DEFAULT 0");
        }
    }
}
