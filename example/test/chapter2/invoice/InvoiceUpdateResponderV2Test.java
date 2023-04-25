package chapter2.invoice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceUpdateResponderV2Test {

    /**
     * Testing is no longer difficult. Because the dependency with InvoiceUpdateServlet has been removed.
     * So, I can create InvoiceUpdateResponderV2 without InvoiceUpdateServlet.
     * I can also test the getResponseText method without creating InvoiceUpdateServlet.
     * Also, I can inject the FakeDBConnection.
     * So, I don't need to connect to the database.
     **/
    @Test
    void getResponseTextTest() {
        // given
        List<Long> invoiceIdList = List.of(1L, 2L, 3L);

        // when
        InvoiceUpdateResponderV2 invoiceUpdateResponderV2
                = new InvoiceUpdateResponderV2(new FakeDBConnection(), null, invoiceIdList);
        String responseText = invoiceUpdateResponderV2.getResponseText();

        // then
        assertEquals("1/2/3", responseText);
    }
}