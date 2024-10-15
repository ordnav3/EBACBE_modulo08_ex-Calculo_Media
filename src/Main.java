public class Main {
    public static void main(String[] args) {
        Media aluno1 = new Media();

        aluno1.setNota1(8.0);
        aluno1.setNota2(5.0);
        aluno1.setNota3(7.0);
        aluno1.setNota4(6.0);

        System.out.println("A Media Total das notas é: " +aluno1.calculaMedia());
    }
}