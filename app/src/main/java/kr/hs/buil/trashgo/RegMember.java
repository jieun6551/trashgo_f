package kr.hs.buil.trashgo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMember extends AppCompatActivity {

    public RegMember(Intent intent) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_member);
    }

    //온클릭 이벤트
    public <RegisterActivity> void builStart(View v) {



        switch (v.getId()) {
            case R.id.Regreg:

                //화면 컴포넌트 연결
                EditText textRegId = (EditText)findViewById(R.id.textRegId);
                EditText textRegPw = (EditText)findViewById(R.id.textRegPw);
                EditText textRegPc = (EditText)findViewById(R.id.textRegPc);
                EditText textRegname = (EditText)findViewById(R.id.textRegname);
                EditText textRegemail = (EditText)findViewById(R.id.textRegemail);


                //화면에서 입력한 ID/PW 가져옴.
                String strId = textRegId.getText().toString();
                String strPw = textRegPw.getText().toString();
                String strPc = textRegPc.getText().toString();
                String strname = textRegname.getText().toString();
                String stremail = textRegemail.getText().toString();


                Log.e("로그인화면" , "사용자가 입력한 아이디 : " + strId + " 패스워드 : "+ strPw);

                /* Validation Check 입력값 체크 */
                //1. 입력누락 확인
                if ( strPw.length() == 0 || strId.length() == 0 || strPc.length() == 0 || strname.length() == 0 || stremail.length() == 0)  {
                    Toast.makeText(this,"입력되지 않은 정보가 있습니다.",Toast.LENGTH_LONG).show();
                    return ;
                }
                //2. PW 체크

                if ( !strPw.equals(strPc)) {
                    Toast.makeText(this, "입력한 패스워드가 일치하지 않습니다.", Toast.LENGTH_LONG).show();
                    return;
                }




                //사용자가 입력한 회원가입정를 서버로 전송한다.

                //작성 예정.

                ///////////////////////////////////////////////////

                //아이디 중복체크 했는지 확인
                    if ( true ) {
                        //서버 전송 후 ID&PW 가 일치 하다면
                        Toast.makeText(this,"회원가입 완료 ! 로그인 해 주세요 ! ",Toast.LENGTH_LONG).show();
                        Intent Intent = new Intent(this, LoginActivity.class);
                        startActivity(Intent);
                    }else{
                        //서버 전송 후 ID&PW 가 일치 하지 않다면.
                        Toast.makeText(this,"오류메세지",Toast.LENGTH_LONG).show();
                    }
                break;

            default:
                Toast.makeText(this, "잘못된 입력입니다.", Toast.LENGTH_LONG).show();
                break;
        }
        void check_validation(String CharSequence email, String CharSequence password;) {
            // 비밀번호 유효성 검사식1 : 숫자, 특수문자가 포함되어야 한다.
            String val_symbol = "([0-9].*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*[0-9])";
            // 비밀번호 유효성 검사식2 : 영문자 대소문자가 적어도 하나씩은 포함되어야 한다.
            String val_alpha = "([a-z].*[A-Z])|([A-Z].*[a-z])";
            // 정규표현식 컴파일
            Pattern pattern_symbol = Pattern.compile(val_symbol);
            Pattern pattern_alpha = Pattern.compile(val_alpha);

            Matcher matcher_symbol = pattern_symbol.matcher(password);
            Matcher matcher_alpha = pattern_alpha.matcher(password);

            if (matcher_symbol.find() && matcher_alpha.find()) {
                // email과 password로 회원가입 진행
                email_signIn(email, password);
            }else {
                Toast.makeText(this, "비밀번호로 부적절합니다", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void email_signIn(CharSequence email, CharSequence password) {
    }
}
