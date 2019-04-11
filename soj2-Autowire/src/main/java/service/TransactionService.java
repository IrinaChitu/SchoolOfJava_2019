package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.TransactionRepository;

@Component //ca sa ma lase sa injectez repository-ul | treb sa fie o componenta ca sa se conecteze la un bean?
public class TransactionService {

    @Autowired    //-merge in ambele parti (field si setter)
    private TransactionRepository transactionRepository;

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }

//    @Autowired    // dar nu prea se foloseste pe setter, mai degraba pe field, sau pe constructor
    public void setTransactionRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public String toString() {
        return "TransactionService{" +
                "transactionRepository=" + transactionRepository +
                '}';
    }
}
