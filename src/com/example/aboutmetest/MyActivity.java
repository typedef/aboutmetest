package com.example.aboutmetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private static String TAG = Package.class.getSimpleName();
    private  Button mScanButton;
    private  Button mMakeQRCodeButton;
    private  Button mShowMyInfoButton;
    private  View.OnClickListener mOnClickListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mScanButton = (Button)findViewById(R.id.scan_button);
        mMakeQRCodeButton = (Button)findViewById(R.id.make_qrcode_button);
        mShowMyInfoButton = (Button)findViewById(R.id.show_my_info_button);

        mOnClickListener = createOnClickListener();
        mScanButton.setOnClickListener(mOnClickListener);
        mShowMyInfoButton.setOnClickListener(mOnClickListener);
        mMakeQRCodeButton.setOnClickListener(mOnClickListener);
    }


    public  View.OnClickListener createOnClickListener()    {

        return new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                switch (v.getId()){

                    case R.id.show_my_info_button:
                        //Toast.makeText(getBaseContext(),"you click on button show my info button", Toast.LENGTH_LONG);
                        openShowMyInfo();
                        break;
                    case R.id.make_qrcode_button:
                        Toast.makeText(getBaseContext(),"you click on button make_qrcode_button", Toast.LENGTH_LONG);
                        break;
                    case R.id.scan_button:
                        Toast.makeText(getBaseContext(),"you click on button scan_button", Toast.LENGTH_LONG);
                        break;
                    //default:
                        //Log.d(TAG, "No Button match for id:" + v.getId());

                }
            }
        };

    }

    private void openShowMyInfo(){

        Intent intent = getIntent();
        intent.setClass(MyActivity.this,  ShowMyInfoActivity.class);
        startActivity(intent);
        //overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);

    }

}
