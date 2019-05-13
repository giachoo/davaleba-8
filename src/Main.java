import java.io.Console;

public class Main {
    public static void main(String[] args) {
       String input="1sdkjkfsdj";
    try {
       if (input.contains("1")){
           throw new StringFormatExeption();
       }
    }
    catch (StringFormatExeption ex){
        System.out.println("შემოტანილი სტრიქონი შეიცავს 1-ს");
    }
    }
}

/*
ა)დაწერეთ თქვენი გამონაკლისის(exception)კლასი და გააკეთეთ მისი გასროლის და დაჭერის დემონსტრირება.
ბ)შექმენით ინტენფეისი და კლასი,რომელიც ამ ინტერფეისს იყენებს.შექმენით ინტერფეისის განმახორციელებელი კლასი
და მოახდინეთ მისი გამოყენების დემონსტრირება.*/
