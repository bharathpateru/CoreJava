package com.corejava.java8.streamsrealworld.logs;

import java.util.List;
import java.util.Optional;

class ServiceInstance {
    private String serviceName;
    private Optional<List<LogEntry>> logs;

    public ServiceInstance(String serviceName, Optional<List<LogEntry>> logs) {
        this.serviceName = serviceName;
        this.logs = logs;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Optional<List<LogEntry>> getLogs() {
        return logs;
    }

    public void setLogs(Optional<List<LogEntry>> logs) {
        this.logs = logs;
    }
}
