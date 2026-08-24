/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public class el
extends Vector {
    private String a;

    public el(String string) {
        this.a = string;
    }

    private el() {
    }

    public synchronized void removeAllElements() {
        super.removeAllElements();
    }

    public synchronized boolean removeElement(Object object) {
        return super.removeElement(object);
    }

    public synchronized void removeElementAt(int n2) {
        super.removeElementAt(n2);
    }

    public synchronized void addElement(Object object) {
        if (this.size() > 1000) {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||" + this.a + " num= " + this.size());
        }
        super.addElement(object);
    }

    public synchronized void insertElementAt(Object object, int n2) {
        if (this.size() > 1000) {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||" + this.a + " num= " + this.size());
        }
        super.insertElementAt(object, n2);
    }
}

