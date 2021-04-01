package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.UserMethods;
import com.example.myapplication.activities.company.CompanyBranchesActivity;
import com.google.firebase.auth.FirebaseAuth;


public class MainLoadingPage extends AppCompatActivity {

    //final variables
    public final static String COMPANY = "Company";
    public final static String CUSTOMER = "Customer";
    public final static String ADMINE = "Admine";
    public final static String ADMINP = "Adminep";
    public final static String BRANCH = "Branch";
    public final static String QUEUE = "Queue";
    public final static String QUEUE1 = "queue1";
    public final static String QUEUE2 = "queue2";
    public final static String CUSTOMER_ID_LIST = "customerListUpdates";
    public final static String USER_TYPE = "UserType";
    public final static String USER_ID = "userId";
    public final static String BRANCH_CLASS = "branchClass";
    public final static String Company_Control = "companyClass";
    public final static String PANEL = "Panel";

    public final static String LATITUDE = "latitude";
    public final static String LONGITUDE = "longitude";
    public final static String RADIUS = "radius";
    public final static String COMPANY_ID = "companyID";
    public final static String HOME_FRAGMENT = "homeFragment";
    public final static String BRANCH_NAME = "branchName";



    private final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_loading_page);
     // startActivity(new Intent(getApplicationContext(), CompanyBranchesActivity.class));

        getSupportActionBar().hide();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(firebaseAuth.getCurrentUser() != null)
            UserMethods.determineUserTypeAndMoveToCorrectPage(this);
        else{
            finish();
            startActivity(new Intent(getApplicationContext(), LoginPageActivity.class));
        }

    }



}