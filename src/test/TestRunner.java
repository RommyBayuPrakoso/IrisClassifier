
package test;

import classifier.Classifier;
public class TestRunner {
    public static void main(String[] args) {
        Classifier classifier = new Classifier();
        
        //Test Case 1
        System.out.println(classifier.predict(4.3,3.0,1.1,0.1));
        
        //Test Case 2
        System.out.println(classifier.predict(4.8,3.0,1.4,0.1));
        
        //Test Case 3
        System.out.println(classifier.predict(5.2,4.1,1.5,0.1));
        
        //Test Case 4
        System.out.println(classifier.predict(4.6,3.6,1.0,0.2));
        
        //Test Case 5
        System.out.println(classifier.predict(5.1,3.3,1.7,0.5));
        
        //Test Case 6
        System.out.println(classifier.predict(5.0,3.5,1.6,0.6));
        
        //Test Case 7
        System.out.println(classifier.predict(5.0,2.3,3.3,1.0));
        
        //Test Case 8
        System.out.println(classifier.predict(4.9,2.4,3.3,1.0));
        
        //Test Case 9
        System.out.println(classifier.predict(5.0,2.0,3.5,1.0));
        
        //Test Case 10
        System.out.println(classifier.predict(6.1,2.8,4.0,1.3));
        
        //Test Case 11
        System.out.println(classifier.predict(5.7,2.8,4.1,1.3));
        
        //Test Case 12
        System.out.println(classifier.predict(5.6,3.0,4.1,1.3));
        
        //Test Case 13
        System.out.println(classifier.predict(6.1,2.6,5.6,1.4));
        
        //Test Case 14
        System.out.println(classifier.predict(6.0,2.2,5.0,1.5));
        
        //Test Case 15
        System.out.println(classifier.predict(6.3,2.8,5.1,1.5));
        
        //Test Case 16
        System.out.println(classifier.predict(7.2,3.0,5.8,1.6));
        
        //Test Case 17
        System.out.println(classifier.predict(4.9,2.5,4.5,1.7));
        
        //Test Case 18
        System.out.println(classifier.predict(6.2,2.8,4.8,1.8));
 
        
    }
}
