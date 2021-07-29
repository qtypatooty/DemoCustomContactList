package sg.edu.rp.c346.id20006949.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<Contact> al;
CustomAdapter ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        al = new ArrayList<>();
        Contact item1 = new Contact('F',"Mary", 65,1234567);
        Contact item2 = new Contact('M',"Ken", 65,7654321);
        al.add(item1);
        al.add(item2);
        ca = new CustomAdapter(this,R.layout.row, al);
        lv.setAdapter(ca);
    }
}