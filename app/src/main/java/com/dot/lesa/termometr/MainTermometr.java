package com.dot.lesa.termometr;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainTermometr extends Activity {//extends AppCompatActivity {
final String TAG = "MAIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_termometr);
        if(getActionBar() == null) Log.e(TAG,"getActionBar() == null");
    //---
        ActionBar actionBar = getActionBar();//getSupportActionBar();??--это решалось в другом методе(getDelegate().getSupportActionBar();)
        if (actionBar != null) {
      //      actionBar.setTitle(R.string.title_devices);//getActionBar().setTitle(R.string.title_devices);
            // Show the Up button in the action bar.
            //устанавливает надпись и иконку как кнопку домой(не требуется метод - actionBar.setDisplayHomeAsUpEnabled(true);)
            actionBar.setDisplayHomeAsUpEnabled(true);
            //вместо ЗНачка по умолчанию, назначаемого выше, подставляет свой
            actionBar.setHomeAsUpIndicator(R.drawable.ic_chevron_left_black_24dp);
//-- срабатывают только если вместе, отменяют ИКОНКУ, если заменить- достаточно одного
            actionBar.setIcon(null);//actionBar.setIcon(R.drawable.ic_language_black_24dp);
            actionBar.setDisplayUseLogoEnabled(false);
//-------------------------
          //  actionBar.setLogo(R.drawable.ic_attach_money_black_24dp);//-это вообще непонятно что и где устанавливает
            //------------------------------
            //  actionBar.setHomeButtonEnabled(true);   //--- все ниже както не работет или для другого предназаначена
            //actionBar.setIcon(null);
            //actionBar.setCustomView(null);
            //
            //
        }




    }

}
