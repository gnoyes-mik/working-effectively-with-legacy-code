package chapter2.invoice;

import java.util.ArrayList;
import java.util.List;

public class DBConnection implements IDBConnection{
    public List<Invoice> getInvoices() {
        return new ArrayList<>();
    }
}
