package contactorganizer.interacode.org.memorygame;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button btn_image1;
    Button btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_image1 = (Button)findViewById(R.id.image1);
        btn_image1.setOnClickListener(this);
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
    @Override
    public void onClick(View v) {


        boolean isPressed = false;
        btn_image1.setOnClickListener(this);

        OnClickListener buttonListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPressed) {
                    button.setBackgroundResource(R.drawable.icon1);
                } else {
                    button.setBackgroundResource(R.drawable.icon2);
                }
                isPressed = !isPressed;
            }
        };
    }
}
