package Tests;

public class TestDLL {
    private String id;
    private int data;

    public TestDLL(int id, int data) {
        this.id = 'X' + String.valueOf(id);
        this.data = data;
    }
    
    public TestDLL(){}

    public String getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nTestDLL{" + "\nid=" + id 
                                  + "\ndata=" + data + '}';
    }
}
