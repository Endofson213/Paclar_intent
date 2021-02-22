package mcm.edu.ph.paclar_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listener();
    }

    public void Listener() {
        Button next1 = findViewById(R.id.btnNextCon1);
        TextView display = findViewById(R.id.txtDisplay);


        next1.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        startActivity(i);

        EditText input = findViewById(R.id.txtMonthValue);
        int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

        switch (v.getId()) {
            case R.id.btnNextCon1:

                i.putExtra("INT_MONTHS", numberMonths);

                startActivity(i);
                break;

        }
    }
}