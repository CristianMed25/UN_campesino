/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author CristianM
 */
public class Test {
    private String id;
    private String data;

    public Test(int id, String data) {
        this.id = "T" + String.valueOf(id);
        this.data = data;
    }
    
    public Test(){}

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "\nTestQueue{" + "\nid=" + id 
                                  + "\ndata=" + data + '}';
    }
}
