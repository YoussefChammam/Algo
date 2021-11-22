package de.htw;

import de.htw.commands.Algorithms.GCDEuclidDivisionRestIt;
import de.htw.commands.Algorithms.GCDEuclidDivisionRestRec;
import de.htw.commands.Algorithms.GCDEuclidSubtractionIt;
import de.htw.commands.Algorithms.GCDEuclidSubtractionRec;
import myproject.commands.Algorithms.*;
import org.junit.Assert;
import org.junit.Test;

public class AlgorithmTesting {

    // Testing the iterative version of the gcd function
    @Test public void GCDIterative(){
        int expected = 1;
        int result = GCDEuclidSubtractionIt.gcd(5 , 21);
        Assert.assertEquals(expected , result);
    }

    // Testing the recursive version of the gcd function
    @Test public void GCDRekursiv(){
        int expected = 1;
        int result = GCDEuclidSubtractionRec.gcd(5 , 31);
        Assert.assertEquals(expected , result);
    }

    // Testing the iterative modern gcd function
    @Test public void GCDModernIterative(){
        System.out.println(GCDEuclidDivisionRestIt.gcd(33 , 5));
        //Ich verstehe nicht warum ich immer 1 bekomme ...
    }

    // Testing the recursive modern gcd function
    @Test public void GCdModernRecursive(){
        int expeced = 2;
        int result = GCDEuclidDivisionRestRec.gcd(22 , 10);
        Assert.assertEquals(expeced , result);
    }
}
