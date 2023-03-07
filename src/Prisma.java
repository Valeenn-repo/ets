/**
 * Clase que calcula el area total de un prisma
 */
public class Prisma {
    private static int nextId = 1;
    private int id;
    private int baseTriangulo;
    private int alturaPrisma;

    //Constructor que recibe por parámetro todos los atributos

    /**
     * Método constructor de la clase
     * @param baseTriangulo parámetro base del triángulo de la clase
     * @param alturaPrisma  parámetro altura del prisma de la clase
     * @param id parámetro que se autoincrementa cada vez que crea un objeto de la clase
     */
    public Prisma(int baseTriangulo, int alturaPrisma, int id) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
        this.id = nextId++;
    }

    //Getters y setters

    /**
     * getter de la base del triángulo
     * @return devuelve la base del triángulo
     */
    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    /**
     * setter de la base del triángulo
     * @param baseTriangulo cambia el valor de la base del triángulo
     */
    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    /**
     * getter de la altura del prisma
     * @return delvuelve la altura del prisma
     */
    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    /**
     * setter de la altura del prisma
     * @param alturaPrisma cambia el valor de la altura del prisma
     */
    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * getter del id del objeto
     * @return devuelve el id
     */
    public int getId() {
        return id;
    }

    /**
     * setter del id del objeto
     * @param id cambia el valor del id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Método que calcula la altura del triángulo
     * @return devuelve el cálculo de la altura del triángulo
     */
    public float alturaTriangulo () {
        return (float) ((Math.sqrt(3)/2) * baseTriangulo);
    }


    /**
     * Método que calcula el area base del prisma
     * @return devuelve el area base del prisma
     */
    public float areaBase () {
        return (float) ((baseTriangulo * alturaTriangulo())/2);
    }


    /**
     * Método que calcula el perimetro del triangulo
     * @return devuelve el perímetro del triángulo
     */
    public float perimetro () {
        return baseTriangulo*3;
    }


    /**
     * Método que calcula el area lateral del prisma
     * @return devuelve el área lateral del prisma
     */
    public float areaLateral () {
        return perimetro()*alturaPrisma;
    }

    /**
     * Método que calcula el area total del prisma
     * @return calcula y devuelve el área total del prisma
     */
    public float areaTotal () {
        return areaBase() + areaLateral();
    }
}

