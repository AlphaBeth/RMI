package client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import server.ServiceNotFoundException;

import java.io.IOException;

public class RegistryImplTest {
    private Registry registry;

    @Before
    public void init(){
        registry = new RegistryImpl(24555);
    }

    @Test(expected = IllegalArgumentException.class)
    public void lookupTestEmptyName() throws IOException, ServiceNotFoundException {
        registry.lookup("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void lookupTestNullName() throws IOException, ServiceNotFoundException {
        registry.lookup(null);
    }

}
