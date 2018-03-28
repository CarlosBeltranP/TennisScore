package com.example.charlie.tennis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int player1 = 0;
    int player2 = 0;
    int player1Set1Score=0;
    int player2Set1Score=0;

    int player1Set2Score=0;
    int player2Set2Score=0;

    int player2Set3Score = 0;
    int player1Set3Score=0;

    int cont1 =0;
    int cont2=0;


    String jugador1Ad = "Ad";
    String jugador2Ad = "Ad";
    String tieBreak = "Tiebreak";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Jugador 1
    * */
    public void player1Score(View view) {


        player1 = player1 + 15;
        displayForPlayer1(player1);
        if(player1 == 45) {
            player1 = 40;

            displayForPlayer1(player1);


        }

        if (player1 == 55 && (player2 !=40 && player2 !=55) ) {
            player1 = 0;
            displayForPlayer1(player1);
            player1Set1Score = player1Set1Score + 1;
            displaySet1Player1(player1Set1Score );
            player2=0;
            displayForPlayer2(player1);

        }
        if (player2 == 40 && player1 == 55) {
            displayForJugador1Ad(jugador1Ad);
        }

        if(player1 == 55 && player2 == 55){
            player2 = 40;
            displayForPlayer1(player2);
            player1 = 40;
            displayForPlayer2(player1);
        }


        if (player1 == 70 && player2 !=70) {
            player1 = 0;
            displayForPlayer1(player1);

            player1Set1Score = player1Set1Score + 1;
            displaySet1Player1(player1Set1Score -1);
            player2=0;
            displayForPlayer2(player2);

        }



        if(player1Set1Score == 6 && player2Set1Score <= 4){
            player1Set1Score =5;
            player1Set2Score = player1Set2Score +1;
            displaySet2Player1(player1Set2Score-1) ;
            player2=0;
            displayForPlayer2(player2);


        }

        if(player1Set1Score == 7 && player2Set1Score <= 5){
            player1Set1Score =6;
            player1Set2Score = player1Set2Score +1;
            displaySet2Player1(player1Set2Score - 1);
            player2=0;
            displayForPlayer2(player2);
        }

        if( player2Set1Score == 5 && (player1Set1Score ==0 || player1Set1Score==1 || player1Set1Score==2 ||player1Set1Score==3 ||player1Set1Score ==4 ) ){
            player1Set1Score = player1Set1Score -1;
            player1Set2Score = player1Set2Score +1;
            displaySet2Player1(player1Set2Score-1 );
            player2=0;
            displayForPlayer2(player2);
        }



        if(player1Set2Score == 7 && player2Set2Score <= 4){
            player1Set2Score =6;
            player1Set3Score = player1Set3Score +1;
            displaySet3Player1(player1Set3Score-1) ;
            player2=0;
            displayForPlayer2(player2);


        }

        if(player1Set2Score == 7 && player2Set2Score <= 5){
            player1Set2Score =6;
            player1Set3Score = player1Set3Score +1;
            displaySet3Player1(player1Set3Score - 1);
            player2=0;
            displayForPlayer2(player2);
        }

        if( player2Set2Score == 6 && (player1Set2Score ==0 || player1Set2Score==1 || player1Set2Score==2 ||player1Set2Score==3 ||player1Set2Score ==4 ) ){
            player1Set2Score = player1Set2Score -1;

            if(player1Set3Score != 6){
                player1Set3Score = player1Set3Score +1;
                displaySet3Player1(player1Set3Score-1 );
                player2=0;
                displayForPlayer2(player2);
            }else{
                player1Set3Score = 6;
                displaySet3Player1(player1Set3Score);
            }


        }


        if(player1Set3Score == 6 ){
            cont1=cont1+1;
            player1Set3Score = 6;
            displaySet3Player1(player1Set3Score);

        }

        if(player1Set3Score == 7 ){
           cont1=cont1+1;
            player1Set3Score = 7;
            displaySet3Player1(player1Set3Score);
        }




    }















    private void displayForJugador1Ad(String score) {
        TextView scoreView = (TextView) findViewById(R.id.PuntoPlayer1);
        scoreView.setText("" + score);
    }

    private void displayForJugador2Ad(String score) {
        TextView scoreView = (TextView) findViewById(R.id.PuntoPlayer2);
        scoreView.setText("" + score);
    }
    private void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PuntoPlayer1);
        scoreView.setText("" + score);
    }
    /*
    * Imprimiendo el puntaje del set 1 del jugador 1
    * */
    private void displaySet1Player1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1Set1);
        scoreView.setText("" + score);
    }

    private void displaySet2Player1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1Set2);
        scoreView.setText("" + score);
    }

    private void displaySet2Player2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2Set2);
        scoreView.setText("" + score);
    }

    private void displaySet3Player2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2Set3);
        scoreView.setText("" + score);
    }

    private void displaySet3Player1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1Set3);
        scoreView.setText("" + score);
    }

/*
* Jugador 1 finish
* */

    /*
    * Jugador 2
    * */
    public void player2Score(View view) {

        player2 = player2 + 15;
        displayForPlayer2(player2);
        if(player2 == 45) {
            player2 = 40;

            displayForPlayer2(player2);


        }

        if (player2 == 55 && (player1 !=40 && player1 !=55) ) {
            player2 = 0;
            displayForPlayer2(player2);
            player2Set1Score = player2Set1Score + 1;
            displaySet1Player2(player2Set1Score );
            player1=0;
            displayForPlayer1(player1);

        }
        if (player1 == 40 && player2 == 55) {
            displayForJugador2Ad(jugador2Ad);
        }

        if(player2 == 55 && player1 == 55){
            player1 = 40;
            displayForPlayer1(player1);
            player2 = 40;
            displayForPlayer2(player2);
        }


        if (player2 == 70 && player1 !=70) {
            player2 = 0;
            displayForPlayer2(player2);
            player2Set1Score = player2Set1Score + 1;
            displaySet1Player2(player2Set1Score);
            player1=0;
            displayForPlayer1(player1);

        }

        if(player2Set1Score == 6 && player1Set1Score <= 4){
            player2Set1Score =5;
            player2Set2Score = player2Set2Score +1;
            displaySet2Player2(player2Set2Score - 1);
            player1=0;
            displayForPlayer1(player1);


        }

        if(player2Set1Score == 7 && player1Set1Score <= 5){
            player2Set1Score =6;
            player2Set2Score = player2Set2Score +1;
            displaySet2Player2(player2Set2Score - 1);
            player1=0;
            displayForPlayer1(player1);
        }

        if( player1Set1Score == 5 && (player2Set1Score ==0 || player2Set1Score==1 || player2Set1Score==2 ||player2Set1Score==3 ||player2Set1Score ==4 ) ){
            player2Set1Score = player2Set1Score -1;
            player2Set2Score = player2Set2Score +1;
            displaySet2Player2(player2Set2Score-1 );
            player1=0;
            displayForPlayer1(player1);
        }



        if(player2Set2Score == 7 && player1Set2Score <= 4){
            player2Set2Score =6;
            player2Set3Score = player2Set3Score +1;
            displaySet3Player2(player2Set3Score - 1);
            player1=0;
            displayForPlayer1(player1);


        }

        if(player2Set2Score == 7 && player1Set2Score <= 5){
            player2Set2Score =6;
            player2Set3Score = player2Set3Score +1;
            displaySet3Player2(player2Set3Score - 1);
            player1=0;
            displayForPlayer1(player1);
        }

        if( player1Set2Score == 6 && (player2Set2Score ==0 || player2Set2Score==1 || player2Set2Score==2 ||player2Set2Score==3 ||player2Set2Score ==4 ) ){

            player2Set2Score = player2Set2Score-1;
            player2Set3Score = player2Set3Score +1;
            displaySet3Player2(player2Set3Score-1 );
            player1=0;
            displayForPlayer1(player1);
        }



        if(player2Set3Score == 6 && player1Set3Score <= 4){
           cont2=cont2+1;
            player2Set3Score = 6;
            displaySet3Player2(player2Set3Score );


        }

        if(player2Set3Score == 7 && player1Set3Score <= 5){
            cont2=cont2+1;
            player2Set3Score = 7;
            displaySet3Player2(player2Set3Score );

        }




    }



    private void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PuntoPlayer2);
        scoreView.setText("" + score);
    }

    private void displaySet1Player2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2Set1);
        scoreView.setText("" + score);
    }
     /*
    * Jugador 2 finish
    * */

    //Reset button code
    public void resetButton(View view) {
        player1 = 0;
        player2 = 0;
        displayForPlayer1(player1);
        displayForPlayer2(player2);

    }

    private void displayReset(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reset);
        scoreView.setText("" + score);
    }


    private void displayTieBreak(String score) {
        TextView scoreView = (TextView) findViewById(R.id.tiebreak);
        scoreView.setText("" + score);
    }



}

