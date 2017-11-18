package sttg.inf.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailOlahraga extends AppCompatActivity {

    TextView detailol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_olahraga);

        detailol = (TextView) findViewById(R.id.text_det_ol);

        Intent newIntent = getIntent();
        String ol = newIntent.getStringExtra("olahraga");
        detailol.setText(ol);


    }
}
