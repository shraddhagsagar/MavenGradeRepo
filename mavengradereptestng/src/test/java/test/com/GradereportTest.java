/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ShraddhaGanesh
 */
public class GradereportTest {
    Graderep graderepo;
  
    
    public GradereportTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
      
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
        
    }
    
    @Test
    public void GradegetTotal(){
     graderepo = new Graderep(100, 200);       
     assertEquals(300, graderepo.getTotal());
                    }
    @Test        
    public void GradegetAvg(){
     graderepo = new Graderep(200, 200);       
    assertEquals(200, graderepo.getAvg());
    }
    }
    
    
    
    

