import java.util.Arrays;
public class Disco {
    protected String name;
    protected int capacity;
    protected String type;
    protected Object[] content;
    protected String brand;


    // CONSTRUCTOR
    public Disco(String name, int capacity, int[] content, String brand) {
        this.name = name;
        this.capacity = capacity;
        this.content = new Object[0];
        this.brand = brand;
    }

    public Disco(String name, int capacity, Object[] objects, String brand) {
    }

    //GETTERS Y SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    // MÉTODOS
    public String toString() {
        return "Disco<\n" +
                "name: " + name + "\n" +
                "capacity: " + capacity + "\n" +
                "content: " + Arrays.toString(content) + "\n" +
                "type: " + type + "\n" +
                ">";
    }
    public void writeData(Class clase, Object data) {
        Object[] newContent = Arrays.copyOf(content, content.length + 1);
        newContent[content.length] = data;
        content = newContent;
        if(clase == Cd.class) {
            System.out.println("Escribiendo datos en CD por láser...");
        } else if (clase == DiscoDuro.class) {
            System.out.println("Escribiendo datos por cabezal magnético...");
        } else if (clase == Lp.class) {
            System.out.println("Grabando contenido en el Vinilo...");
        } else if (clase == BlueRay.class) {
            System.out.println("Escribiendo datos en BlueRay por láser...");
        }
    }

    public void readData(Class clase) {
        System.out.println("Contenido del disco " + name + ":");
        for (Object item : content) {
            System.out.println(item.toString());
        }
    }

    public void spinDisc(Class clase) {
        if(clase == Cd.class) {
            System.out.println("Girando CD...");
        } else if (clase == DiscoDuro.class) {
            System.out.println("Girando Disco Duro...");
        } else if (clase == Lp.class) {
            System.out.println("Girando el Vinilo...");
        } else if (clase == BlueRay.class) {
            System.out.println("Girando BlueRay...");
        }
    }
}
