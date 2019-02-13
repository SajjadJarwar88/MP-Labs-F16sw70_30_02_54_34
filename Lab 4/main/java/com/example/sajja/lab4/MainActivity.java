package com.example.sajja.lab4;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter <String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        listView = findViewById(R.id.list);
        setSupportActionBar(toolbar);
        arrayList.add("My Name");
        arrayList.add("Sajjad AhMED");
        arrayList.add("Student of");
        arrayList.add("Software Engineering");
        arrayList.add("MUET");
        arrayList.add("jamshoro");
        arrayList.add("Pakistan");
        arrayList.add("Best University");
        arrayList.add("In Pakistan");
        arrayList.add("jgftdez");
        arrayList.add("Information");
        arrayList.add("Security");
        arrayList.add("My Name");
        arrayList.add("Sajjad AhMED");
        arrayList.add("Student of");
        arrayList.add("Software Engineering");
        arrayList.add("MUET");
        arrayList.add("jamshoro");
        arrayList.add("Pakistan");
        arrayList.add("Best University");
        arrayList.add("In Pakistan");
        arrayList.add("jgftdez");
        arrayList.add("Information");
        arrayList.add("Security");
        arrayList.add("My Name");
        arrayList.add("Sajjad AhMED");
        arrayList.add("Student of");
        arrayList.add("Software Engineering");
        arrayList.add("MUET");
        arrayList.add("jamshoro");
        arrayList.add("Pakistan");
        arrayList.add("Best University");
        arrayList.add("In Pakistan");
        arrayList.add("jgftdez");
        arrayList.add("Information");
        arrayList.add("Security");
        arrayList.add("My Name");
        arrayList.add("Sajjad AhMED");
        arrayList.add("Student of");
        arrayList.add("Software Engineering");
        arrayList.add("MUET");
        arrayList.add("jamshoro");
        arrayList.add("Pakistan");
        arrayList.add("Best University");
        arrayList.add("In Pakistan");
        arrayList.add("jgftdez");
        arrayList.add("Information");
        arrayList.add("Security");
        arrayList.add("Security");
        arrayList.add("Security");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);

    }

      @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo)
      {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
      }

      @Override
      public boolean onContextItemSelected( MenuItem item)
      {
          final AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
          switch (item.getItemId())
          {
              case R.id.item2_Deleted:
                  AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                  alertDialog.setTitle("Confirmation");
                  alertDialog.setMessage("Are you sure you want delete this?");
                  alertDialog.setPositiveButton("Delete", new DialogInterface.OnClickListener()
                  {
                      @Override
                      public void onClick(DialogInterface dialog, int i)
                      {
                          arrayList.remove(info.position);
                          arrayAdapter.notifyDataSetChanged();

                      }
                  });
                  alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
                  {
                      public void onClick(DialogInterface dialog, int i)
                      {
                       dialog.cancel();
                      }
                       });
                  alertDialog.show();

      } return true;}
          public boolean onCreateOptionsMenu (Menu menu)
          {
              MenuInflater inflater = getMenuInflater();
              inflater.inflate(R.menu.main_menu, menu);
              return true;

          }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item1_Shared:
                Toast.makeText(getApplicationContext(), "Items Shared", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2_Deleted:
                Toast.makeText(getApplicationContext(), "Items Deleted", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3_Settings:
                Toast.makeText(getApplicationContext(), "Setting Selected", Toast.LENGTH_LONG).show();
                        return true;
        }

        return true;
    }}


