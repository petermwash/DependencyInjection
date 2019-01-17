package com.pemwa.dependencyinjection;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pemwa.dependencyinjection.objects.moreDagger2.BraavosModule;
import com.pemwa.dependencyinjection.objects.moreDagger2.Cash;
import com.pemwa.dependencyinjection.objects.moreDagger2.Soldiers;
import com.pemwa.dependencyinjection.objects.withDIconcept.Boltons;
import com.pemwa.dependencyinjection.objects.withDIconcept.Starks;
//import com.pemwa.dependencyinjection.objects.withDagger2.BattleComponent;
//import com.pemwa.dependencyinjection.objects.withDagger2.DaggerBattleComponent;
//import com.pemwa.dependencyinjection.objects.withDagger2.War;
import com.pemwa.dependencyinjection.objects.moreDagger2.BattleComponent;
import com.pemwa.dependencyinjection.objects.moreDagger2.DaggerBattleComponent;
import com.pemwa.dependencyinjection.objects.moreDagger2.War;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button houses_btn, war_btn;

    War war1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt);
        houses_btn = findViewById(R.id.hses);
        war_btn = findViewById(R.id.war);

        houses_btn.setOnClickListener(this);
        war_btn.setOnClickListener(this);

//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();
//        //IronBank bank = new IronBank();
//        //Allies allies = new Allies(bank);
//
//        War war = new War(starks,boltons);
//        war.prepare();
//        war.report();

        BattleComponent component = DaggerBattleComponent
                .builder().braavosModule(new BraavosModule(cash, soldiers)).build();
        war1 = component.getWar();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.hses:
                textView.setText(war1.prepare());
                Handler handler = new Handler();
                handler.postDelayed(() -> {
                    textView.setText(war1.report());
                }, 4000);
                break;

            case R.id.war:
                textView.setText(war1.fight());
                break;
        }
    }
}
