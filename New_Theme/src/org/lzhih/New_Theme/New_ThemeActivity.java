package org.lzhih.New_Theme;

import android.app.Activity; 
import android.os.Bundle; 
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class New_ThemeActivity extends Activity implements OnClickListener{ 
  /** Called when the activity is first created. */ 
  Button button = null;
  @Override 
  public void onCreate(Bundle savedInstanceState) {
    
    Utils.onActivityCreateSetTheme(this);
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.main); 
    
    findViewById(R.id.button1).setOnClickListener(this);
    findViewById(R.id.button2).setOnClickListener(this);
  
    
  }

  public void onClick(View v)
  {
    System.out.println("单击按钮");
    switch (v.getId())
    {
    case R.id.button1:
      System.out.println("主题1");
      Utils.changeToTheme(this, 1);
      break;
    case R.id.button2:
      System.out.println("主题2");
      Utils.changeToTheme(this, 2);
      break;
    }
    
  }
}