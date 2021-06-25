package JavaBySuresh.Collection.ArrayList;

public class Emp implements Comparable<Emp> {
    int eno;
    String ename;

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

    public Emp(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public int compareTo(Emp emp) { //emp is a reference variable for Emp class. Emp class data's are stored in emp reference variable and it compares 2 variables using compareTo()
        if (this.eno > emp.getEno()) {
            return 1;
        } else if (this.eno < emp.getEno()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }
}
