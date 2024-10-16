interface Students {
    void std_info();
}

interface Answer {
    void display();
}

class Result implements Students, Answer {
    private int age;
    private String name;

    // Constructor to initialize the student's info
    public Result(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void std_info() {
        // This could be extended to gather information if needed
    }

    public void display() {
        System.out.println("Details recorded:");
        System.out.println("Age of student: " + age);
        System.out.println("Name: " + name);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        // Create an object of Result with age and name
        Result obj = new Result(20, "Alice");

        // Call methods to display information
        obj.std_info();
        obj.display();
    }
}
