package Stak;

public class ArrayStak implements Stak {


    private String[] currentEle = new String[0];

    public static void main(String[] args) {

        ArrayStak heja = new ArrayStak();

    }



    public ArrayStak(){


        push("Ko");
        isFull();
        push("læs ");
        push("fede ");
        push("dit ");
        push("dig ");
        push("med ");
        push("hej ");
        show();

    }

    //Indsæt element
    @Override
    public void push(String e) {


        if (!isFull()) {

            String[] newEle = new String[currentEle.length + 1];
            newEle[0] = e;


            for (int i = 0; i < currentEle.length; i++) {
                newEle[i + 1] = currentEle[i];
            }

            currentEle = newEle;

        }


    }


    //Udtag element
    @Override
    public void pop() {

        String[] newEle = new String[currentEle.length-1];


        for(int i = 0; i < currentEle.length-1; i++) {

            newEle[i] = currentEle[i];

        }

        currentEle = newEle;

    }

    @Override
    public boolean isEmpty() {

        if (currentEle.length==0){
            System.out.println("Stakken er tom");
            return  true;
        } else

            System.out.println("Stakken er ikke tom");
            return false;
    }

    @Override
    public boolean isFull() {

        if(currentEle.length==7){
            System.out.println("The stack is full");
            return true;
        }
        System.out.println("The stack isn't full");
        return false;
    }

    @Override
    public void show() {

        System.out.println(toString());
    }

    @Override
    public String toString() {
        String out = "";
        for(int i = 0; i < currentEle.length; i++){
            out += currentEle[i];

        }
        return out;
    }

}
