package com.alt.hrm.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
public class User {
    private  int id;
    private String name;
    private String email;
    private Address address;
    private List<Book> books;
}
