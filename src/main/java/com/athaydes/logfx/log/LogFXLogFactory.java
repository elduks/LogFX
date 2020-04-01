package com.athaydes.logfx.log;

import com.athaydes.logfx.config.Properties;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.nio.file.Path;

public final class LogFXLogFactory implements ILoggerFactory {

    private final LogLevel currentLevel = Properties.getLogLevel().orElse( LogLevel.INFO );

    private final Path logFilePath = Properties.LOGFX_DIR.resolve( "logfx.log" );

    @Override
    public Logger getLogger( String name ) {
        return new LogFXLogger( name, this );
    }

    boolean isLogLevelEnabled( LogLevel logLevel ) {
        return logLevel.ordinal() >= currentLevel.ordinal();
    }

    public Path getLogFilePath() {
        return logFilePath;
    }
}
