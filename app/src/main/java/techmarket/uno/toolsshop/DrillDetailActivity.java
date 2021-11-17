package techmarket.uno.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DrillDetailActivity extends AppCompatActivity {
    private TextView tvTitle;
    private TextView tvInfo;
    private ImageView ivDrill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        tvInfo = findViewById(R.id.tvInfo);
        tvTitle = findViewById(R.id.tvTitle);
        ivDrill = findViewById(R.id.ivDrill);
        Intent intent = getIntent();
        //проверить - содержит данный интент нужную информацию
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("resId")){
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int resId = intent.getIntExtra("resId",-1);
            tvTitle.setText(title);
            tvInfo.setText(info);
            ivDrill.setImageResource(resId);
        }else{
           Intent backToCategoryActivity = new Intent(this,DrillCategoryActivity.class);
           startActivity(backToCategoryActivity);
        }

    }
}