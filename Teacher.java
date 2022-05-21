public class Teacher {

    private String name;
    private int salary;
    private int salaryEarned;
    private int ID;


    public Teacher(String name. int ID, int salary) {
        salaryEarned = 0;
        this.salary = salary;
        this.name = name;
        this.ID = ID;


        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public int getID() {
            return ID;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

    public void recieveSalary() {
            salaryEarned = salaryEarned + salary;
        }

    }0
