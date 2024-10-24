class First{
    String name, semister;
    Integer id;

    public CLASS() {
    }

    public CLASS(String semister, Integer id, String name) {
        this.semister = semister;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){
        return "I am print methd";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemister() {
        return semister;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", semister='" + semister + '\'' +
                ", id=" + id +
                '}';
    }
}
