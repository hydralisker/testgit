package com.hxl.config;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        String abc = charSequence.toString();
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        Boolean bool = s.equals(charSequence.toString());
        return bool;
    }
}
