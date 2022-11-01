package org.example.uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.stream.Stream;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class User extends Base{
    private String  firstName;
    private String  lastName;
    private int phoneNumber;
    private String password;
    private int month;
    private int birthday;
    private int year;
    private String gender;

}
