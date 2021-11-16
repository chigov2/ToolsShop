package techmarket.uno.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTools = findViewById(R.id.lvTools);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        //должны передать объект класса, который реализует данный интерфейс = созается анонимный класс
        lvTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //в тоаст нельзя передать this
                Toast.makeText(getApplicationContext(),"Position: " +position,Toast.LENGTH_SHORT).show();
                //выбираем активность в зависимости ои нажатого элемента
                switch (position){
                    case 0:
                        //снова нельзя передать this, так как находимся в setOnItemClickListener
                        Intent intent = new Intent(getApplicationContext(),DrillCategoryActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}