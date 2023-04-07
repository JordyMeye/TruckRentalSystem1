//ProtectionFactory Test.java
// Test for the Protection Factory
// Author: Jordy Meye (220072841)
// Date: 24 03 2023


package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import za.ac.cput.domain.Protection;

import static org.junit.jupiter.api.Assertions.*;

class ProtectionFactoryTest {

    @Test
    public void createProtection(){

        Protection protection = ProtectionFactory.createProtection("cdm" , "rmd", "do not call", "december" , "october");
        // assertNotNull(protection);
        // assertNotNull(protection);
        System.out.println(protection);

    }

}