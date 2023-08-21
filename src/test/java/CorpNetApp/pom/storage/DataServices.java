package CorpNetApp.pom.storage;

import com.google.appengine.api.datastore.*;

public class DataServices {
    private DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

    public Key saveTask (String transactionReferenceNumber,double amount, int isMaker){
        Entity todo = new Entity("transaction","1245");
        todo.setProperty("transactionReferenceNumber",transactionReferenceNumber);
        todo.setProperty("amount",amount);
        todo.setProperty("isMaker",isMaker);
        return  datastore.put(todo);
    }

    public Object getTask (String transactionReferenceNumber ) throws EntityNotFoundException {
        Key key = new KeyFactory.Builder( "transaction","1245").getKey();
        Object entity = datastore.get(key).getProperty("transactionReferenceNumber");
        return entity;
    }
}
