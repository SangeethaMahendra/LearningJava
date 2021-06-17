package JavaBySuresh.Serialization;

import java.io.Serializable;

public class Parent implements Serializable {

    int eno;
    String ename;
    String dep;
    public Parent()
    {

    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    public Parent(int eno, String ename, String dep) {
        super();
        this.eno = eno;
        this.ename = ename;
        this.dep = dep;
    }
}
