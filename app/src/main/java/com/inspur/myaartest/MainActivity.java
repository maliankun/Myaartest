package com.inspur.myaartest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.inspur.osp.AppConfig;
import com.inspur.topo.LogicTopoActivity;
import com.inspur.topo.NetTopoActivity;
import com.inspur.topo.TopoConnectActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv_click;
    TextView tv_wuli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_click = findViewById(R.id.tv_click);
        tv_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NetTopoActivity.class);
                //intent.putExtra("type", "provincetopo");
                intent.putExtra("aNeId", "1558619973");
                intent.putExtra("aPortId", "100");
                intent.putExtra("zNeId", "1503746476");
                intent.putExtra("zPortId", "200");


                startActivity(intent);
            }
        });
        tv_wuli = findViewById(R.id.tv_wuli);
        tv_wuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopoConnectActivity.startAct(MainActivity.this, AppConfig.Constants.TOPO_LIST_IDS, "1,489847209");
            }
        });




    }
}
