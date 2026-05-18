package com.corejava.java8.streamsrealworld.users;

import java.util.Optional;

class User {
    private String id;
    private Optional<Profile> profile;

    public User(String id, Optional<Profile> profile) {
        this.id = id;
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Optional<Profile> getProfile() {
        return profile;
    }

    public void setProfile(Optional<Profile> profile) {
        this.profile = profile;
    }
}
