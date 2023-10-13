package OOP;

public class HybridInheritance {
    public static void main(String[] args) {
        dog name = new dog();
        name.sound();
    }

    class animal {
        String name = "Dog";

        void animals() {
            System.out.println("Animals");
        }

        void Sound() {
            System.out.println("Sound");
        }
    }

    class dog extends animal {
        void breed() {

            System.out.println("Dobber");
        }

    }

    class human extends animal {
        void Walk() {
            System.out.println("Walk");
        }
    }

    class women extends human {
        void Run() {
            System.out.println("Running");
        }
    }

}
