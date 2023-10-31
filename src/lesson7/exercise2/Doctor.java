package lesson7.exercise2;

public class Doctor {
    String name;
    String post;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void info(){
        setName("");
        setPost("");
        System.out.println("Лечищий врач: "+getName()+"\nДолжность врача: "+getPost());
    }
}
