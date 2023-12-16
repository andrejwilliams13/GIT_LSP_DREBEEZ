// Andre Williams LSP Final Exam

package org.howard.edu.lsp.exam.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogger {

    @Test
    void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test Message 1");
        logger.logMessage("Test Message 2");

        String expected = "Log:\nTest Message 1\nTest Message 2\n";
        assertEquals(expected, logger.displayLog());
    }

    @Test
    void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2);
    }
}
