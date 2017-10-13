package ca.bcit.ass2.bahugun_bak;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;

import static java.security.AccessController.getContext;

public class Continents extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continents);
        final ListView list_continents = (ListView) findViewById(R.id.list_continents);
        list_continents.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>adapter,View v, int i, long l){
                Intent intent = new Intent(Continents.this, Countries.class);
                startActivity(intent);
            }
        });
    }
}
