public class Main {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Loja A", 15, 1500.0);
        System.out.println(loja1);
        System.out.println("Gastos com salário: " + loja1.gastosComSalario());
        System.out.println("Tamanho da loja: " + loja1.tamanhoDaLoja());

        Loja loja2 = new Loja("Loja B", 5);
        System.out.println(loja2);
        System.out.println("Gastos com salário: " + loja2.gastosComSalario());
        System.out.println("Tamanho da loja: " + loja2.tamanhoDaLoja());
    }
}
