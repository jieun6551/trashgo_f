package kr.hs.buil.trashgo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    //온클릭 이벤트
    public <RegisterActivity> void builStart(View v) {

        switch (v.getId()) {
            case R.id.btnLoginlogin:
                //로그인 버튼이 눌러 졌을 때 .
                Log.e("로그인화면", "로그인버튼이 눌러 졌습니다.");

                //화면 컴포넌트 연결
                EditText textLoginId = (EditText)findViewById(R.id.textLoginId);
                EditText textLoginPw = (EditText)findViewById(R.id.textLoginPw);

                //화면에서 입력한 ID/PW 가져옴.
                String strId = textLoginId.getText().toString();
                String strPw = textLoginPw.getText().toString();

                Log.e("로그인화면" , "사용자가 입력한 아이디 : " + strId + " 패스워드 : "+ strPw);

                /* Validation Check 입력값 체크 */
                if ( strPw.length() == 0 || strId.length() == 0)  {
                    Toast.makeText(this,"아이디 또는 비밀번호를 입력 해 주세요 ! ",Toast.LENGTH_LONG).show();
                    return ;
                }

                //사용자가 입력 한 아이디 /PW 를 서버로 전송한다.

                //작성 예정.

                ///////////////////////////////////////////////////
                if ( true ) {
                    //서버 전송 후 ID&PW 가 일치 하다면
                    Intent Intent = new Intent(this, MainActivity.class);
                    startActivity(Intent);
                }else{
                    //서버 전송 후 ID&PW 가 일치 하지 않다면.
                    Toast.makeText(this,"아이디 또는 비밀번호가 일치 하지 않습니다 ! ",Toast.LENGTH_LONG).show();
                }
                break;

            default:
                Toast.makeText(this, "잘못된 입력입니다.", Toast.LENGTH_LONG).show();
                break;
        }

    }
}