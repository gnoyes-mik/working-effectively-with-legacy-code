package chapter2.invoice;

public class InvoiceUpdateResponderV1 {

    private final DBConnection dbConnection;
    private final InvoiceUpdateServlet invoiceUpdateServlet;

    public InvoiceUpdateResponderV1(DBConnection dbConnection, InvoiceUpdateServlet invoiceUpdateServlet) {
        this.dbConnection = dbConnection;
        this.invoiceUpdateServlet = invoiceUpdateServlet;
    }

    public void update() {
        // just a fake reference to the constructor parameters
        int i = dbConnection.hashCode();
        int j = invoiceUpdateServlet.hashCode();
    }

    /** Need to change **/
    public String getResponseText() {
        return "";
    }
}
