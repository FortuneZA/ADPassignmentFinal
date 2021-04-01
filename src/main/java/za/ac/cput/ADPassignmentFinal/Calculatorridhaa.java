package za.ac.cput.ADPassignmentFinal;

//author Ridhaa Flanders - 218204191

public class Calculatorridhaa {
    public int addition(int a,int b)
    {
        return a + b;
    }

    public void countToFive()
    {
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Three Seconds Has Passed");
    }
}
