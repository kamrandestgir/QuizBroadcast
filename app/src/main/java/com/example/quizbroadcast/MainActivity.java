package com.example.quizbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTxt=findViewById(R.id.ShowTxt);

        IntentFilter intentFilter=new IntentFilter("sender.ab.customsender.SENDER_DATA");
        registerReceiver(innerBroadcast,intentFilter);
    }

    private BroadcastReceiver innerBroadcast=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            if("sender.ab.customsender.SENDER_DATA".equals(intent.getAction())){
                String text=intent.getStringExtra("sendMessage");

            }
}
