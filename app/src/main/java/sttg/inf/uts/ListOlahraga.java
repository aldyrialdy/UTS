package sttg.inf.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListOlahraga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_olahraga);

        String[] arrOlahraga = {"Lari", "Futsal", "Basket", "Bulutangkis", "Tenis"};
        final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.item_olahraga, arrOlahraga);
        ListView listView = (ListView) findViewById(R.id.list_olahraga);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String olahraga = adapterView.getItemAtPosition(i).toString();
                Intent intDetail = new Intent(getApplicationContext(), DetailOlahraga.class);
                intDetail.putExtra("olahraga", olahraga);
                startActivity(intDetail);
            }
        });

    }
}
