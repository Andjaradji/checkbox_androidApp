package com.rds.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox mOptOneCheckBox;
    private CheckBox mOptTwoCheckBox;
    private CheckBox mOptThreeCheckBox;

    private TextView mResultTextView;

    private Button mShowButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOptOneCheckBox = (CheckBox)findViewById(R.id.optCheckOneID);
        mOptTwoCheckBox = (CheckBox)findViewById(R.id.optCheckTwoID);
        mOptThreeCheckBox = (CheckBox)findViewById(R.id.optCheckThreeID);

        mResultTextView = (TextView)findViewById(R.id.resulTextID);

        mShowButton = (Button)findViewById(R.id.showButtonID);

        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder mStringBuilder = new StringBuilder();
                mStringBuilder.append(mOptOneCheckBox.getText().toString()+ " status is " + mOptOneCheckBox.isChecked()+"\n");
                mStringBuilder.append(mOptTwoCheckBox.getText().toString()+ " status is " + mOptTwoCheckBox.isChecked()+"\n");
                mStringBuilder.append(mOptThreeCheckBox.getText().toString()+ " status is " + mOptThreeCheckBox.isChecked());

                mResultTextView.setText(mStringBuilder);
            }
        });



    }
}
