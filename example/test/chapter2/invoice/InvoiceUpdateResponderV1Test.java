package chapter2.invoice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceUpdateResponderV1Test {

    /**
     * So difficult to test. Because Creation of InvoiceUpdateServlet is difficult!
     */
    @Test
    void getResponseTextTest() {
        // given
        List<Long> invoiceIdList = List.of(1L, 2L, 3L);

        // when
        InvoiceUpdateResponderV1 invoiceUpdateResponderV1
                = new InvoiceUpdateResponderV1(new DBConnection(), new InvoiceUpdateServlet());
        String responseText = invoiceUpdateResponderV1.getResponseText();

        // then
        assertEquals("", responseText);
    }
}