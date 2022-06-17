package sg.edu.np.mad.s10219317_ryanyong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user = new User("Ryan", "Is clueless??", 10, true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.title_text);
        username.setText(user.name);

        TextView description = findViewById(R.id.para_text);
        description.setText(user.description);
    }


    public void hiClick(View v){
        //event handler
        user.followed = !(user.followed);
        TextView txt = findViewById(R.id.follow_btn);
        if (!user.followed){
            txt.setText("Follow");
        }
        else{
            txt.setText("Unfollow");
        }

    }

}