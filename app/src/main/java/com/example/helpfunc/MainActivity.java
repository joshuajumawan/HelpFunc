package com.example.helpfunc;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Dialog dialog_registeraccount, dialog_scanqrcode, dialog_view_events, dialog_view_help, dialog_view_portfolio, dialog_change_login_credentials;
    Button btn_help_registration_of_account, btn_help_viewEvents, btn_help_viewPortfolio, btn_help_scanQr, btn_help_viewHelp, btn_help_changeLoginCredentials;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_help_registration_of_account = (Button) findViewById(R.id.btn_help_registration_of_account);
        Button btn_help_changeLoginCredentials = (Button) findViewById(R.id.btn_help_changeLoginCredentials);
        Button btn_help_scanQr = (Button) findViewById(R.id.btn_help_scanQr);
        Button btn_help_viewEvents = (Button) findViewById(R.id.btn_help_viewEvents);
        Button btn_help_viewHelp = (Button) findViewById(R.id.btn_help_viewHelp);
        Button btn_help_viewPortfolio = (Button) findViewById(R.id.btn_help_viewPortfolio);
        Button back = (Button) findViewById(R.id.back);



        btn_help_registration_of_account.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog_registeraccount= new Dialog(MainActivity.this);
                dialog_registeraccount.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_registeraccount.setContentView(R.layout.dialog_registeraccount);
                dialog_registeraccount.setCancelable(false);
                dialog_registeraccount.show();
                final Button back = (Button) dialog_registeraccount.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_registeraccount.dismiss();
                    }
                });

            }
        });

        btn_help_scanQr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog_scanqrcode= new Dialog(MainActivity.this);
                dialog_scanqrcode.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_scanqrcode.setContentView(R.layout.dialog_scanqrcode);
                dialog_scanqrcode.setCancelable(false);
                dialog_scanqrcode.show();
                final Button back = (Button) dialog_scanqrcode.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_scanqrcode.dismiss();
                    }
                });

            }
        });

        btn_help_viewEvents.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog_view_events= new Dialog(MainActivity.this);
                dialog_view_events.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_view_events.setContentView(R.layout.dialog_view_events);
                dialog_view_events.setCancelable(false);
                dialog_view_events.show();
                final Button back = (Button) dialog_view_events.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_view_events.dismiss();
                    }
                });

            }
        });

        btn_help_viewHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog_view_help= new Dialog(MainActivity.this);
                dialog_view_help.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_view_help.setContentView(R.layout.dialog_view_help);
                dialog_view_help.setCancelable(false);
                dialog_view_help.show();
                final Button back = (Button) dialog_view_help.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_view_help.dismiss();
                    }
                });

            }
        });

        btn_help_viewPortfolio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog_view_portfolio= new Dialog(MainActivity.this);
                dialog_view_portfolio.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_view_portfolio.setContentView(R.layout.dialog_view_portfolio);
                dialog_view_portfolio.setCancelable(false);
                dialog_view_portfolio.show();
                final Button back = (Button) dialog_view_portfolio.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_view_portfolio.dismiss();
                    }
                });

            }
        });

        btn_help_changeLoginCredentials.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog_change_login_credentials= new Dialog(MainActivity.this);
                dialog_change_login_credentials.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_change_login_credentials.setContentView(R.layout.dialog_change_login_credentials);
                dialog_change_login_credentials.setCancelable(false);
                dialog_change_login_credentials.show();
                final Button back = (Button) dialog_change_login_credentials.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_change_login_credentials.dismiss();
                    }
                });

            }
        });
    }
}
