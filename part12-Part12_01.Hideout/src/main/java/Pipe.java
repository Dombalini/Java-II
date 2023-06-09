/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarza
 */
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.values.size() == 0;
    }

    public int size() {
        return this.values.size();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        return this.values.remove(0);
    }

    public boolean isInPipe() {
        return this.values.size() > 0;
    }
}
