package com.corejava.java8.streamsrealworld.logs;

import java.util.Optional;

class LogEntry {
    private LogLevel level;
    private Optional<String> errorCode;

    public LogEntry(LogLevel level, Optional<String> errorCode) {
        this.level = level;
        this.errorCode = errorCode;
    }

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public Optional<String> getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Optional<String> errorCode) {
        this.errorCode = errorCode;
    }
}
