package com.company.Chapter9;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoadBikeTest extends BicycleTest {

    @Test
    public void getTire_size() {
        assertEquals(23,new RoadBike().getTire_size());
    }
}