package repository;

import model.BorrowRecord;

import java.util.ArrayList;
import java.util.List;

public class BorrowRepository {
    private List<BorrowRecord> records = new ArrayList<>();

    public void save(BorrowRecord record){
        records.add(record);
    }
}
