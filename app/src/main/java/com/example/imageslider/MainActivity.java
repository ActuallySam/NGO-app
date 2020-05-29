package com.example.imageslider;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Slider Layout (starting here -->>>>>>>>

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(2);
        setSliderViews();

        //Slider Layout  (Ending here.........................)

        //Buttons OnClickListeners (Starting here  --->>>>>>>>>>>>>

        Button button = (Button) findViewById(R.id.button);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button6 = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)   {
                openMainActivity2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)   {
                openMainActivity3();
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)   {
                openMainActivity4();
            }
        });

        //Buttons OnClickListeners (Ending here ........................)
    }

    private void setSliderViews()  {

        for(int i = 0 ; i <= 5 ; i++){

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch(i)  {

                case 1:
                    sliderView.setDescription("3rd Batch - SCMS");
                    sliderView.setImageDrawable(R.drawable.scms);
                    break;

                case 2:
                    sliderView.setDescription("2nd Batch - SIMS");
                    sliderView.setImageDrawable(R.drawable.sims);
                    break;

                case 3:
                    sliderView.setDescription("3rd Batch - SCMS");
                    sliderView.setImageDrawable(R.drawable.scms);
                    break;

                case 4:
                    sliderView.setDescription("4th Batch - SIHS");
                    sliderView.setImageDrawable(R.drawable.sihs);
                    break;

                case 5:
                    sliderView.setDescription("5th Batch - SIT");
                    sliderView.setImageDrawable(R.drawable.sit2);
                    break;

                case 6:
                    sliderView.setDescription("6th Batch - BJ Medical College");
                    sliderView.setImageDrawable(R.drawable.bjmc);
                    break;

            }

            //This is for the Toast and the  Slider Image Description of the Image Slider

            /*sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView)  {
                    Toast.makeText(MainActivity.this, "This is a slider" + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });  */

            sliderLayout.addSliderView(sliderView);
        }
    }

    public void openMainActivity2(){
        Intent intent = new Intent(this , MainActivity2.class);
        startActivity(intent);
    }

    public void openMainActivity3(){
        Intent intent = new Intent(this , MainActivity3.class);
        startActivity(intent);
    }

    public void openMainActivity4(){
        Intent intent = new Intent(this , MainActivity4.class);
        startActivity(intent);
    }

    public void browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.igiftlife.com"));
        startActivity(browserIntent);
    }

    public void browser5(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://console.dialogflow.com/api-client/demo/embedded/igiftlife"));
        startActivity(browserIntent);
    }

    public void browser4(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igiftlife.com/register-for-organ-donation"));
        startActivity(browserIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
                if (item.getItemId() == R.id.item1) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/igiftlife/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if (item.getItemId() == R.id.item2) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/igiftlife/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if(item.getItemId() == R.id.item3){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://igiftlife.com/frequently-asked-questions/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if(item.getItemId() == R.id.item4){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://igiftlife.com/blog/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if(item.getItemId() == R.id.item5){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://igiftlife.com/volunteer/"));
                    startActivity(browserIntent);
                    return true;
                }

                return super.onOptionsItemSelected(item);

    }

}
