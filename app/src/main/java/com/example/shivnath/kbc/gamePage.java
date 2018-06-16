package com.example.shivnath.kbc;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;

public class gamePage extends AppCompatActivity {

    Button option_1,option_2,option_3,option_4;
    TextView score, question;

    private String answer;
    private int Scores=0;
    private String[] answer_key= {"Sep 8","Malayalam","Prayag. Haridwar, Ujjain,. Nasik","Jainism","Oct 14"};

    private String[] mQuestion = {
            "1:The International Literacy Day is observed on" ,
            "2:The language of Lakshadweep. a Union Territory of India, is",
            "3:In which group of places the Kumbha Mela is held every twelve years?" ,
            "4:Bahubali festival is related to" ,
            "5:Which day is observed as the World Standards  Day?"};

    private String Options[][]={
            {"Sep 8","Nov 28","May 2","Sep 22"},
            {"Tamil","Hindi","Malayalam","Telugu"},
            {"Ujjain. Purl; Prayag. Haridwar","Prayag. Haridwar, Ujjain,. Nasik","Rameshwaram. Purl, Badrinath. Dwarika","Chittakoot, Ujjain, Prayag,'Haridwar"},
            {"Islam","Hinduism","Buddhism","Jainism",},
            {"June 26","Oct 14","Nov 15","Dec 2"}
    };
    String ans;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_game_page );

        score = (TextView) findViewById ( R.id.score );
        question = (TextView) findViewById ( R.id.question );
    }

}
