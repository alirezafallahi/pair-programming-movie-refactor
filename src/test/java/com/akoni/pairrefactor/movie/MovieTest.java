package com.akoni.pairrefactor.movie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void test0() {
       Movie movie = new Movie(0);
       assertEquals(2, movie.getCharge(1), 0);
       assertEquals(2, movie.getCharge(2), 0);
       assertEquals(3.5, movie.getCharge(3), 0);
    }

    @Test
    public void test1() {
        Movie movie = new Movie(1);
        assertEquals(3, movie.getCharge(1), 0);
        assertEquals(6, movie.getCharge(2), 0);
        assertEquals(9, movie.getCharge(3), 0);
    }

    @Test
    public void test2() {
        Movie movie = new Movie(2);
        assertEquals(1.5, movie.getCharge(1), 0);
        assertEquals(1.5, movie.getCharge(2), 0);
        assertEquals(1.5, movie.getCharge(3), 0);
        assertEquals(3, movie.getCharge(4), 0);
    }

}
