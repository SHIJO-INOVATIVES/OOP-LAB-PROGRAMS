 // Create a generic class 
class GenericsClass<T> {
    // Variable of type T
    private T data;

    // Constructor
    public GenericsClass(T data) {
        this.data = data;
    }

    // Method that returns the T type variable
    public T getData() {
        return this.data;
    }
}

// Main class
public class Generic {
    public static void main(String[] args) {
        // Initialize generic class with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // Initialize generic class with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}
