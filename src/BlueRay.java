public class BlueRay extends Disco {
    public BlueRay(String name, int capacity, String brand) {
        super(name, capacity, new Object[0], brand);
    }
    public BlueRay(String name, int capacity, Object[] content, String brand) {
        super(name, capacity, content, brand);
    }
    @Override
    public void writeData(Class clase, Object data) {
        super.writeData(clase, data);
    }
    @Override
    public void readData(Class clase) {
        super.readData(clase);
    }
    @Override
    public void spinDisc(Class clase) {
        super.spinDisc(clase);
    }
}
