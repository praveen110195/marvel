package com.app.marvel;

/**
 * The Gender enumeration.
 */
public enum Gender {
    MALE("Male"),FEMALE("Female"), TRANSGENDER("Trans Gender");

    private String displayName;

	Gender(String displayName) {
        this.displayName=displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
