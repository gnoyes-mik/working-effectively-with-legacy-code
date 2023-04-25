package chapter2.invoice;

import java.util.List;
import java.util.stream.Collectors;

public class InvoiceUpdateResponderV2 {

    private final IDBConnection dbConnection;
    private final InvoiceUpdateServlet invoiceUpdateServlet;

    private final List<Long> invoiceIdList;

    // I don't need to inject the InvoiceUpdateServlet because I only need to test the getResponseText method.
    // So, I try to inject only the invoiceIdList that I really need.
    public InvoiceUpdateResponderV2(IDBConnection dbConnection, InvoiceUpdateServlet invoiceUpdateServlet, List<Long> invoiceIdList) {
        this.dbConnection = dbConnection;
        this.invoiceUpdateServlet = invoiceUpdateServlet;
        this.invoiceIdList = invoiceIdList;
    }

    public void update() {
        // just a fake reference to the constructor parameters
        int i = dbConnection.hashCode();
        int j = invoiceUpdateServlet.hashCode();
    }

    /** Changed!! **/
    public String getResponseText() {
        return invoiceIdList.stream()
                .map(Object::toString)
                .collect(Collectors.joining("/"));
    }
}
