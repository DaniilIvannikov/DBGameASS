package ru.samsung.itschool.dbgame;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StatActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        DBManager dbManager = DBManager.getInstance(this);
        TextView gamesCount = findViewById(R.id.info);
        gamesCount.setText(dbManager.gamesCount()+"");
    }
}
