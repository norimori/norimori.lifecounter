package edu.washington.norimori.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private boolean gameStart = false; //Is the game over?
    private int life1 = 20; //Player 1's life
    private int life2 = 20;
    private int life3 = 20;
    private int life4 = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView loseP1 = (TextView) findViewById(R.id.loseMessageP1);
        loseP1.setVisibility(View.GONE);
        final TextView loseP2 = (TextView) findViewById(R.id.loseMessageP2);
        loseP2.setVisibility(View.GONE);
        final TextView loseP3 = (TextView) findViewById(R.id.loseMessageP3);
        loseP3.setVisibility(View.GONE);
        final TextView loseP4 = (TextView) findViewById(R.id.loseMessageP4);
        loseP4.setVisibility(View.GONE);

        final Button plus1Button = (Button) findViewById(R.id.plus1ButtonP1);
        final Button minus1Button = (Button) findViewById(R.id.minus1ButtonP1);
        final Button plus5Button = (Button) findViewById(R.id.plus5ButtonP1);
        final Button minus5Button = (Button) findViewById(R.id.minus5ButtonP1);
        final TextView player1Life = (TextView) findViewById(R.id.player1Life);

        final Button plus1ButtonP2 = (Button) findViewById(R.id.plus1ButtonP2);
        final Button minus1ButtonP2 = (Button) findViewById(R.id.minus1ButtonP2);
        final Button plus5ButtonP2 = (Button) findViewById(R.id.plus5ButtonP2);
        final Button minus5ButtonP2 = (Button) findViewById(R.id.minus5ButtonP2);
        final TextView player2Life = (TextView) findViewById(R.id.player2Life);

        final Button plus1ButtonP3 = (Button) findViewById(R.id.plus1ButtonP3);
        final Button minus1ButtonP3 = (Button) findViewById(R.id.minus1ButtonP3);
        final Button plus5ButtonP3 = (Button) findViewById(R.id.plus5ButtonP3);
        final Button minus5ButtonP3 = (Button) findViewById(R.id.minus5ButtonP3);
        final TextView player3Life = (TextView) findViewById(R.id.player3Life);

        final Button plus1ButtonP4 = (Button) findViewById(R.id.plus1ButtonP4);
        final Button minus1ButtonP4 = (Button) findViewById(R.id.minus1ButtonP4);
        final Button plus5ButtonP4 = (Button) findViewById(R.id.plus5ButtonP4);
        final Button minus5ButtonP4 = (Button) findViewById(R.id.minus5ButtonP4);
        final TextView player4Life = (TextView) findViewById(R.id.player4Life);


        Log.d("MainActivity", "before onClick > gameStart: " + gameStart);

        plus1Button.setOnClickListener(new View.OnClickListener() { //listen for plus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life1 > 0) { //life will never be added when 0 anyways
                    life1++;
                    Log.d("MainActivity", "Player 1; +1; Current: " + life1);
                    player1Life.setText("P1: " + life1);
                }
                if (gameStart && (life1 <= 0)) { //Game has already started && your life is 0
                    loseP1.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus1Button.setOnClickListener(new View.OnClickListener() { //listen for minus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life1 > 0) { //life will never be added when 0 anyways
                    life1--;
                    Log.d("MainActivity", "Player 1; +1; Current: " + life1);
                    player1Life.setText("P1: " + life1);
                }
                if (gameStart && (life1 <= 0)) { //Game has already started && your life is 0
                    loseP1.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        plus5Button.setOnClickListener(new View.OnClickListener() { //listen for plus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life1 > 0) { //life will never be added when 0 anyways
                    life1 = life1 + 5;
                    Log.d("MainActivity", "Player 1; +1; Current: " + life1);
                    player1Life.setText("P1: " + life1);
                }
                if (gameStart && (life1 <= 0)) { //Game has already started && your life is 0
                    loseP1.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus5Button.setOnClickListener(new View.OnClickListener() { //listen for minus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life1 > 0) { //life will never be added when 0 anyways
                    life1 = life1 - 5;
                    Log.d("MainActivity", "Player 1; +1; Current: " + life1);
                    player1Life.setText("P1: " + life1);
                }
                if (gameStart && (life1 <= 0)) { //Game has already started && your life is 0
                    loseP1.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        //Player 2
        plus1ButtonP2.setOnClickListener(new View.OnClickListener() { //listen for plus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life2 > 0) { //life will never be added when 0 anyways
                    life2++;
                    Log.d("MainActivity", "Player 2; +1; Current: " + life2);
                    player2Life.setText("P2: " + life2);
                }
                if (gameStart && (life2 <= 0)) { //Game has already started && your life is 0
                    loseP2.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus1ButtonP2.setOnClickListener(new View.OnClickListener() { //listen for minus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life2 > 0) { //life will never be added when 0 anyways
                    life2--;
                    Log.d("MainActivity", "Player 2; -1; Current: " + life2);
                    player2Life.setText("P2: " + life2);
                }
                if (gameStart && (life2 <= 0)) { //Game has already started && your life is 0
                    loseP2.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        plus5ButtonP2.setOnClickListener(new View.OnClickListener() { //listen for plus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life2 > 0) { //life will never be added when 0 anyways
                    life2 = life2 + 5;
                    Log.d("MainActivity", "Player 2; +5; Current: " + life2);
                    player2Life.setText("P2: " + life2);
                }
                if (gameStart && (life2 <= 0)) { //Game has already started && your life is 0
                    loseP2.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus5ButtonP2.setOnClickListener(new View.OnClickListener() { //listen for minus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life2 > 0) { //life will never be added when 0 anyways
                    life2 = life2 - 5;
                    Log.d("MainActivity", "Player 2; -5; Current: " + life2);
                    player2Life.setText("P2: " + life2);
                }
                if (gameStart && (life2 <= 0)) { //Game has already started && your life is 0
                    loseP2.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        //Player 3
        plus1ButtonP3.setOnClickListener(new View.OnClickListener() { //listen for plus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life3 > 0) { //life will never be added when 0 anyways
                    life3++;
                    Log.d("MainActivity", "Player 3; +1; Current: " + life3);
                    player3Life.setText("P3: " + life3);
                }
                if (gameStart && (life3 <= 0)) { //Game has already started && your life is 0
                    loseP3.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus1ButtonP3.setOnClickListener(new View.OnClickListener() { //listen for minus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life3 > 0) { //life will never be added when 0 anyways
                    life3--;
                    Log.d("MainActivity", "Player 3; -1; Current: " + life3);
                    player3Life.setText("P3: " + life3);
                }
                if (gameStart && (life3 <= 0)) { //Game has already started && your life is 0
                    loseP3.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        plus5ButtonP3.setOnClickListener(new View.OnClickListener() { //listen for plus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life3 > 0) { //life will never be added when 0 anyways
                    life3 = life3 + 5;
                    Log.d("MainActivity", "Player 3; +5; Current: " + life3);
                    player3Life.setText("P3: " + life3);
                }
                if (gameStart && (life3 <= 0)) { //Game has already started && your life is 0
                    loseP3.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus5ButtonP3.setOnClickListener(new View.OnClickListener() { //listen for minus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life3 > 0) { //life will never be added when 0 anyways
                    life3 = life3 - 5;
                    Log.d("MainActivity", "Player 3; +5; Current: " + life3);
                    player3Life.setText("P3: " + life3);
                }
                if (gameStart && (life3 <= 0)) { //Game has already started && your life is 0
                    loseP3.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        //Player 4
        plus1ButtonP4.setOnClickListener(new View.OnClickListener() { //listen for plus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life4 > 0) { //life will never be added when 0 anyways
                    life4++;
                    Log.d("MainActivity", "Player 4; +1; Current: " + life4);
                    player4Life.setText("P4: " + life4);
                }
                if (gameStart && (life4 <= 0)) { //Game has already started && your life is 0
                    loseP4.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus1ButtonP4.setOnClickListener(new View.OnClickListener() { //listen for minus1
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life4 > 0) { //life will never be added when 0 anyways
                    life4--;
                    Log.d("MainActivity", "Player 4; -1; Current: " + life4);
                    player4Life.setText("P4: " + life4);
                }
                if (gameStart && (life4 <= 0)) { //Game has already started && your life is 0
                    loseP4.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        plus5ButtonP4.setOnClickListener(new View.OnClickListener() { //listen for plus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life4 > 0) { //life will never be added when 0 anyways
                    life4 = life4 + 5;
                    Log.d("MainActivity", "Player 4; +5; Current: " + life4);
                    player4Life.setText("P4: " + life4);
                }
                if (gameStart && (life4 <= 0)) { //Game has already started && your life is 0
                    loseP4.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

        minus5ButtonP4.setOnClickListener(new View.OnClickListener() { //listen for minus5
            //@Override
            public void onClick(View v) {
                if (!gameStart) {
                    gameStart = true;
                }
                if (life4 > 0) { //life will never be added when 0 anyways
                    life4 = life4 - 5;
                    Log.d("MainActivity", "Player 4; -5; Current: " + life4);
                    player4Life.setText("P4: " + life4);
                }
                if (gameStart && (life4 <= 0)) { //Game has already started && your life is 0
                    loseP4.setVisibility(View.VISIBLE); //You've lost!
                }
                Log.d("MainActivity", "" + gameStart);
            }
        });

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
}