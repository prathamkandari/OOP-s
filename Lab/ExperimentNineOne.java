class T1 extends Thread {
    public void run() {
        System.out.println("Running");
    }
}

class T2 extends Thread {
    public void run() {
        System.out.println("Runnable");
    }
}

class ExperimentNineOne {
    public static void main(String args[]) {
        T1 obj1 = new T1();
        obj1.start();
        T2 obj2 = new T2();
        obj2.start();
    }
}
