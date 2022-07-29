package kr.hs.buil.trashgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class reportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public void builStart(View v){

        switch(v.getId()){
            case R.id.btnReportCall:


                Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("12345"));
                startActivity(intent);

                break;
        }


    }
}