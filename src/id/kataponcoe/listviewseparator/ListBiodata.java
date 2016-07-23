package id.kataponcoe.listviewseparator;

import id.kataponcoe.listviewseparator.ListAdapter.ListAction;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListView;

public class ListBiodata extends Activity {

	private final String CONTOH1 = "Contoh Bapak";
	private final String CONTOH2 = "Contoh Ibu";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_biodata);
 	    
		ListView list = (ListView)findViewById(R.id.mainAct_list);
		ListAdapter adapter = new ListAdapter(getData());
		adapter.setOnListActionClicked(new ListAction() {
			
			@Override
			public void openMenu(String menuName) {
				startActivity(menuName);
			}
		});
		list.setAdapter(adapter);
	}
		
	// Biodata Data //
	
	private void contoh1(){
		new AlertDialog.Builder(this)
			.setTitle("Guru A")
			.setMessage("Ini adalah Guru a")
			.setPositiveButton("OK",new DialogInterface.OnClickListener(){	
				public void onClick(DialogInterface dialoginterface, int i){}
				}) .show();
			}
	
	private void contoh2(){
		new AlertDialog.Builder(this)
			.setTitle("Guru B")
			.setMessage("ini adalah guru B")
			.setPositiveButton("OK",new DialogInterface.OnClickListener(){	
				public void onClick(DialogInterface dialoginterface, int i){}
				}) .show();
			}
	
	// Epilogue Data //

	private void startActivity(String menuList)
	{   
		switch (menuList) {
		case CONTOH1: contoh1(); break;
		case CONTOH2:contoh2(); break;
		
		}
	}
  
  
  private List<String> getData() 
  {
    List<String> data = new ArrayList<String>();  
    data.add(CONTOH1);
    data.add(CONTOH2);

    
    return data;
  }

	@Override
	public void onBackPressed() {
	    // TODO Auto-generated method stub
	    ListBiodata.this.finish();
	}
}