package com.acheron.db.type;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    SELLER,ADMIN,USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
