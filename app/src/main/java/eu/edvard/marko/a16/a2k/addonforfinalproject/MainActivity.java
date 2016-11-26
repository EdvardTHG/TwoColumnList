package eu.edvard.marko.a16.a2k.addonforfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Subject> subjectsList = new ArrayList<Subject>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subjectsList.add(new Subject("Математика", "4.5"));
        subjectsList.add(new Subject("Физика", "2.7"));
        subjectsList.add(new Subject("Химия", "3.5"));


        String[] from=new String[] { Subject.NAME, Subject.AVG_MARK };
        int[] to=new int[] {R.id.subjectNameView, R.id.avgMarkView };

        ListView subjectsListView = (ListView) findViewById(R.id.subjectsListView);

        ListAdapter adapter = new SimpleAdapter(this, subjectsList, R.layout.subjects_list_item,from,to);
        subjectsListView.setAdapter(adapter);








//      Toolbar start
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAddSubject();
            }
        });
    }

    public void goToAddSubject() {

      startActivity(new Intent(this,SubjectAddActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
