package appewtc.masterung.sutfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private EditText nameEditText,addEditText,
            phonEditText,userEditText,passwordEditText;
    private String nameString,addressString,phoneString,
    userString,passwordString,genderString,imageString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        addEditText = (EditText) findViewById(R.id.editText2);
        phonEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);

    }   // Main Method

    //สร้างmethod
    public void clickSignUpSign(View view) {
        nameString = nameEditText.getText().toString().trim();
        addressString=addEditText.getText().toString().trim();
        phoneString=addEditText.getText().toString().trim();
        userString=userEditText.getText().toString().trim();
        passwordString=passwordEditText.getText().toString().trim();

    }



}   // Main Class
