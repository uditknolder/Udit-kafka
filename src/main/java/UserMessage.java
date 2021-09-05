class UserMessage {

    private int id;
    private int age;
    private String name;
    private String course;
    public UserMessage(final int id, final String name, final int age, final String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;

    }

    public String toString() {

        return ("\"Id\":" + "\"" + Integer.toString(id) + "\"," + "\"Name\":" + "\"" + name + "\"," + "\"Age\":" + "\"" + Integer.toString(age) + "\"," + "\"Course\":" + "\"" + course + "\"");
    }

}
