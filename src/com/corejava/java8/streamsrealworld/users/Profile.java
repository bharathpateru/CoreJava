package com.corejava.java8.streamsrealworld.users;

import java.util.Optional;

class Profile {
    private Optional<String> email;

    public Optional<String> getEmail() {
        return email;
    }

    public Profile(Optional<String> email) {
        this.email = email;
    }
}
