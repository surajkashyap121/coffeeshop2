package myccd.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText a;
EditText b;
RadioButton c;
RadioButton d;
Button e;
int price;
int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.name);
        b=(EditText)findViewById(R.id.cap);
        c=(RadioButton)findViewById(R.id.btn1);
        d=(RadioButton)findViewById(R.id.btn2);
        e=(Button)findViewById(R.id.submit1);
        e.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String name=a.getText().toString();
              int capacity=Integer.parseInt(b.getText().toString());
              if(c.isChecked())
              {
                  quantity=10;
              }
              else
              {
                  quantity=20;
              }
              price=quantity*capacity;
              Toast.makeText(getApplicationContext(),""+price,Toast.LENGTH_LONG).show();
          }
      });
    }
}

