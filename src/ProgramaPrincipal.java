import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ProgramaPrincipal {
    /**
     *
     * @param args se ejecutan los métodos llamando a la clase Prisma
     */
    public static void main(String[] args) {
        //Creación de 3 objetos Prisma con valores aleatorios
        Random rand = new Random();
        Prisma prisma1 = new Prisma(rand.nextInt(10) + 1, rand.nextInt(10) + 1,0 );
        Prisma prisma2 = new Prisma(rand.nextInt(10) + 1, rand.nextInt(10) + 1,0 );
        Prisma prisma3 = new Prisma(rand.nextInt(10) + 1, rand.nextInt(10) + 1,0 );

        //Creación de un ArrayList para ordenar los objetos de mayor a menor área
        ArrayList<Prisma> prismas = new ArrayList<>();
        prismas.add(prisma1);
        prismas.add(prisma2);
        prismas.add(prisma3);
        for(Prisma prisma : prismas) {
            System.out.println("Prisma " + prisma.getId() + " -> Base: " + prisma.getBaseTriangulo() + " Altura: " + prisma.getAlturaPrisma() + " Area total: " + prisma.areaTotal());
        }

        Collections.sort(prismas, (p1, p2) -> Float.compare(p2.areaTotal(), p1.areaTotal()));
        System.out.println("");
        //Impresión de los objetos ordenados por área total
        System.out.println("Prismas ordenados por area total: ");
        for(Prisma prisma : prismas) {
            System.out.println("Prisma " + prisma.getId() + " -> Base: " + prisma.getBaseTriangulo() + " Altura: " + prisma.getAlturaPrisma() + " Area total: " + prisma.areaTotal());
        }
    }
}