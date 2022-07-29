package kr.hs.buil.trashgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void builStart(View v){

        switch(v.getId()){
            case R.id.btnIntroLogin:

                Log.e("인트로화면","로그인버튼이 눌러 졌습니다.");

                Intent Intent =new Intent(this,LoginActivity.class);
                startActivity(Intent);
                break;

            case R.id.btnIntroRegMember:

                Log.e("인트로화면","회원가입버튼이 눌러 졌습니다.");
                Intent regmember = new Intent(this, RegMember.class);
                startActivity(regmember);
                break;


            default:

                Toast.makeText(this,"잘못된 입력입니다.",Toast.LENGTH_LONG).show();
                break;
        }
    }
}