package com.privalia.external.configuration;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @ToString
public class Database {
    private String url;
    private String username;
    private String password;
}
