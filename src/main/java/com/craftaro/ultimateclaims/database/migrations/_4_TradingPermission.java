package com.craftaro.ultimateclaims.database.migrations;

import com.craftaro.core.database.DataMigration;
import com.craftaro.core.database.DatabaseConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class _4_TradingPermission extends DataMigration {
    public _4_TradingPermission() {
        super(4);
    }

    @Override
    public void migrate(Connection connection, String tablePrefix) throws SQLException {
        // Create permissions table
        try (Statement statement = connection.createStatement()) {
            statement.execute("ALTER TABLE " + tablePrefix + "permissions ADD COLUMN trading TINYINT NOT NULL DEFAULT 0");
        }
    }
}
