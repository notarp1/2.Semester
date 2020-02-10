public interface Stak {

    //Indsæt element = 'push'
    void push(String e);

    //Udtag element = 'pop'
    void pop();

    boolean isEmpty();
    boolean isFull();

    void show();


    // return a string representation of the invoking Complex object
    String toString();


}
