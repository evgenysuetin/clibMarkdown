package com.evgeny.clib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

import in.uncod.android.bypass.Bypass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //char[] str = Character.toChars("что \то значит?"));
        String s = "\u0447\u0442\u043e \\\u0442\u043e \u0437\u043d\u0430\u0447\u0438\u0442?";
        try {
            s = new String(s.getBytes(),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        ((TextView) findViewById(R.id.textView)).setText(new Bypass().markdownToSpannable(s));
    }
}
