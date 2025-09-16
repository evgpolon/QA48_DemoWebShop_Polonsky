package com.telran.demoshop.qa48.utils;

import com.telran.demoshop.qa48.models.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProviders {

    @DataProvider
    public Iterator<Object[]> newUserMaleWithCsv() throws IOException {

        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/usersMale.csv")));
        String line = reader.readLine();
        while(line!=null) {
            String[] split = line.split(",");
            list.add(new Object[]{new User().setFirstName(split[0])
                    .setLastName(split[1]).setEmail(split[2])
                    .setPassword(split[3]).setConfirmPassword(split[4])
                    });
            line = reader.readLine();
        }
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> newUserFemaleWithCsv() throws IOException {

        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/usersFemale.csv")));
        String line = reader.readLine();
        while(line!=null) {
            String[] split = line.split(",");
            list.add(new Object[]{new User().setFirstName(split[0])
                    .setLastName(split[1]).setEmail(split[2])
                    .setPassword(split[3]).setConfirmPassword(split[4])
            });
            line = reader.readLine();
        }
        return list.iterator();
    }
}
