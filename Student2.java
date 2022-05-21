public class Student2 {

    private int ID;
    private int grade;
    private int feespaid;
    private int feestotal;
    private String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public void setFeespaid(int feespaid) {
        this.feespaid = feespaid;
    }

    public int getFeestotal() {
        return feestotal;
    }

    public void setFeestotal(int feestotal) {
        this.feestotal = feestotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student2(int ID, int grade, String name) {
        feespaid = 0;
        feestotal = 120120120;
        this.ID = ID;
        this.grade = grade;
        this.name = name;


        public void set payFees(int fees) {
            feespaid = feespaid + fees;
        }

        public int getID() {
            return ID;
        }

        public int getGrade() {
            return grade;
        }

        public int getFeespaid() {
            return feespaid;
        }

        public int getFeestotal() {
            return feestotal;
        }

        public String getName() {
            return name;
        }

        public int getRemainingFees() {
            return feestotal - feespaid;
        }



    }
}
