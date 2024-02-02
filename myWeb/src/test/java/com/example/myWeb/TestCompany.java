package com.example.myWeb;

import com.example.myWeb.dto.Company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompany {

    @Test
    void TestSingleton() {

        Company con1 = Company.getInstance();
        Company con2 = Company.getInstance();
        Company con3 = Company.getInstance();

        System.out.println("주소: " + con1);
        System.out.println("주소: " + con2);
        System.out.println("주소: " + con3);

        assertEquals(con1, con2);
        assertEquals(con1, con3);
        assertEquals(con2, con3);
    }
}
