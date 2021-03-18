package a4e2;

/**
 *
 * @author Mario
 */
public class A4E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Urna<Papeleta> urna = new EnlazadaUrna<Papeleta>();

        for (int i = 1; i <= 10; i++) {
            int aleatorio1 = (int) (Math.random() * 10 + 1);
            int aleatorio2;
            do {
                aleatorio2 = (int) (Math.random() * 10 + 1);
            } while (aleatorio2 == aleatorio1);
            urna.insertar(new Papeleta(aleatorio1, aleatorio2));
        }

        int[] resultados = new int[11];
        while (urna.tamanho() != 0) {
            Papeleta p = urna.recuperar();
            resultados[p.getCandidato1()]++;
            resultados[p.getCandidato2()]++;
            urna.eliminar(p);
        }

        for (int i = 1; i < resultados.length; i++) {
            System.out.println("El candidato " + i + " obtuvo " + resultados[i]
                    + " votos");
        }
    }
}
