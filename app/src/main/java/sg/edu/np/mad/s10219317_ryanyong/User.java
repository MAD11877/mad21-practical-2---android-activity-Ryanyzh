package sg.edu.np.mad.s10219317_ryanyong;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(String u, String d, int i, boolean f){
        name = u;
        description = d;
        id = i;
        followed = f;
    }
}
