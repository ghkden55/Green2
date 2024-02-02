package com.example.myWeb;

import com.example.myWeb.dao.DBcon;
import com.example.myWeb.dao.DBconSgt;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

public class TestDBcon {

    @Test
    void test() {
        Connection conn = DBcon.getConnection();
        assertNotNull(conn);
    }

    @Test
    void testDBcon() {

        Connection conn1 = DBconSgt.getConnection();
        Connection conn2 = DBconSgt.getConnection();

        System.out.println(conn1);
        System.out.println(conn2);

        assertEquals(conn1, conn2);
    }
}
