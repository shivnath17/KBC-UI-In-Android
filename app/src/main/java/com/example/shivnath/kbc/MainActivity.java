package com.example.shivnath.kbc;

        import android.app.ActivityOptions;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        Button button=(Button)findViewById ( R.id.nextActivity );
        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( MainActivity.this, gamePage.class );
                startActivity ( intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        } );
    }
}
