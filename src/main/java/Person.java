/***
 * Personクラス
 */
public class Person {
    String name;
    String job;
    int age;
    long bankBalance;

    public Person(String name, String job, int age, long bankBalance) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(long bankBalance) {
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", bankBalance=" + bankBalance +
                '}';
    }
}
