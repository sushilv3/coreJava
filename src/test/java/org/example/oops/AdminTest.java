package org.example.oops;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class AdminTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Admin}
     *   <li>{@link Admin#readData()}
     *   <li>{@link Admin#writeData()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Admin actualAdmin = new Admin();
        actualAdmin.readData();
        actualAdmin.writeData();
        assertNull(actualAdmin.name);
    }
}

