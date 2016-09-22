package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
public interface Storage {
    
    
    public AddressBook load() throws StorageOperationException;
    public String getPath();
    public void save(AddressBook addressBook) throws StorageOperationException;
    
    

}
