package lesson7.exercise2;

public class Surgeon extends Doctor{
    private String name;
    private String post;

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
        setName("Дмитрий");
        setPost("Хирург");
        System.out.println("Лечищий врач: "+getName()+"\nДолжность врача: "+getPost());
    }
}
