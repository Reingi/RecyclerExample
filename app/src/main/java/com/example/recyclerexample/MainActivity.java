package com.example.recyclerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //create a list of contacts
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla","9851214572",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","9851421541",R.drawable.rajesh));
        contactsList.add(new Contacts("Dayahang Rai","9801245121",R.drawable.daya));
        contactsList.add(new Contacts("Bhuwan Kc","9841526458",R.drawable.bhuwan));

        //pass list to the adapter class
        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
