import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private List<Integer> sequence;

    public Fibonacci() {
        sequence = new ArrayList<>();
        sequence.add(0); // Inicializa a sequência com o primeiro número 0
    }

    public void generateSequence(int limit) {
        int fibonacciAtual = sequence.get(sequence.size() - 1);
        int fibonacciAnterior = 0;

        while (fibonacciAtual < limit) {
            sequence.add(fibonacciAtual);
            int proximoFibonacci = fibonacciAtual + fibonacciAnterior;

            fibonacciAnterior = fibonacciAtual;
            fibonacciAtual = proximoFibonacci;
        }
    }

    public void printSequence() {
        for (int number : sequence) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public int getSum() {
        int sum = 0;
        for (int number : sequence) {
            sum += number;
        }
        return sum;
    }

    public int getMin() {
        int min = sequence.get(0);
        for (int number : sequence) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int getMax() {
        int max = sequence.get(0);
        for (int number : sequence) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int limit = 100; // Escolha o valor limite
        fibonacci.generateSequence(limit);

        System.out.println("Sequência de Fibonacci até " + limit + ":");
        fibonacci.printSequence();

        System.out.println("Soma dos números na sequência: " + fibonacci.getSum());
        System.out.println("Menor número na sequência: " + fibonacci.getMin());
        System.out.println("Maior número na sequência: " + fibonacci.getMax());
    }
}
