package com.creativity.example.programmingfunctional.referencia;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

@FunctionalInterface
public interface IUser {
    User crear(String name);
}
