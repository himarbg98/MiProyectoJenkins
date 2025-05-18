package com.mycompany.mavenfreestyle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MavenFreeStyleTest {

    @Test
    public void testFibonacci_0() {
        MavenFreeStyle app = new MavenFreeStyle();
        assertEquals(0, app.fibonacci(0));
    }

    @Test
    public void testFibonacci_1() {
        MavenFreeStyle app = new MavenFreeStyle();
        assertEquals(1, app.fibonacci(1));
    }

    @Test
    public void testFibonacci_5() {
        MavenFreeStyle app = new MavenFreeStyle();
        assertEquals(5, app.fibonacci(5)); // fibonacci(5) = 5
    }
}
