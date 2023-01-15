import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Student joaozinho = new Student();
        joaozinho.setName("Joãozinho");

        Subject calculo = new Subject();
        calculo.setName("Cálculo");

        joaozinho.addSubject(calculo);

        System.out.println(joaozinho.getName());
        System.out.println(calculo.getName());
        System.out.println(joaozinho.getSubjects());
    }
}
