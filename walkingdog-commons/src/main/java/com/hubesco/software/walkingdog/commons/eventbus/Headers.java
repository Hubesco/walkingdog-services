package com.hubesco.software.walkingdog.commons.eventbus;

/**
 *
 * @author paoesco
 */
public enum Headers {

    COMMAND("command");

    private final String header;

    private Headers(String header) {
        this.header = header;
    }

    public String header() {
        return this.header;
    }
    
}
