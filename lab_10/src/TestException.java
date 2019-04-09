public class TestException extends Exception{
    TestException() { }

    void func() {
        try {
            int a = 0;
            int b= 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        }
        catch(ArithmeticException e) {
            System.out.println(("Деление на ноль:  ") + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(("Индекс элемента C:  ") + e);
        }
        System.out.println(("После блока try/catch."));
    }

    void func1() {
        try {
            throw new NullPointerException("Исключение");
        } catch (NullPointerException a) {
            System.out.println("Исключение перехвачено в  func()");
            throw a;
        }
    }

    void func2() {
        try {
            func();
        } catch (NullPointerException a){
            System.out.println("Перехват повторения : " + a);
        }
    }
}