package me.yifeiyuan.periscopelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.yifeiyuan.library.PeriscopeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PeriscopeLayout periscopeLayout = (PeriscopeLayout) findViewById(R.id.periscope);
        periscopeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                periscopeLayout.addHeart();
            }
        });
    }
}
