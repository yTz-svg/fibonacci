package packeg;

public class algoritimo {
    public static void main(String[] args) {

        int choice = 10;// Escolha o valor
        var print = System.out;

        int f1 = 0;
        int f2 = 1;
        int limit = choice;
        while(f2 < limit) {
            int fn = f1 + f2;
            if(fn > limit) {
                break;
            }
        print.println(fn);
        
        f1 = f2;
        f2 = fn;

    }
    }
}
