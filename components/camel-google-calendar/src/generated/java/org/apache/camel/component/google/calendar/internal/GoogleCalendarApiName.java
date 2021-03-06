
/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar.internal;

import org.apache.camel.support.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component GoogleCalendar
 */
public enum GoogleCalendarApiName implements ApiName {

    ACL("acl"),

    LIST("list"),

    CALENDARS("calendars"),

    CHANNELS("channels"),

    COLORS("colors"),

    FREEBUSY("freebusy"),

    EVENTS("events"),

    SETTINGS("settings");


    private static final GoogleCalendarApiName[] CACHED_ENUM_VALUES = values();
    
    private final String name;

    private GoogleCalendarApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static GoogleCalendarApiName fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].name.equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
