package com.example.kc2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button record_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        record_btn=findViewById(R.id.btrecordlaunch);
        record_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, AudioRecordTest.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                System.out.println("Success");
                MediaRecorder myAudioRecorder = new MediaRecorder();
                myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                myAudioRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
               // myAudioRecorder.setOutputFile(outputFile);
               // myAudioRecorder.prepare();

               myAudioRecorder.start();
                //MediaPlayer mp=new MediaPlayer();

                //try{
                    // mp.setDataSource("/sdcard/Music/maine.mp3");//Write your location here
                    //mp.prepare();
                  //  mp.start();

               // }catch(Exception e){e.printStackTrace();}

            }
        });




    }

}