package chapter2.invoice;

import java.util.ArrayList;
import java.util.List;

public class FakeDBConnection implements IDBConnection{
    public List<Invoice> getInvoices() {
        return new ArrayList<>();
    }
}