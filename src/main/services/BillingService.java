package main.services;

import main.models.Bill;
import main.utils.FileManager;
import java.util.*;

public class BillingService {
    private List<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        bills.add(bill);
        FileManager.saveBill(bill);
    }

    public List<Bill> getBills() {
        return FileManager.loadBills();
    }
}
