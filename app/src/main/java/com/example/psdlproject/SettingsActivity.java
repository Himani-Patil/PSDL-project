package com.example.psdlproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.psdlproject.databinding.ActivitySettingsBinding;
import com.example.psdlproject.databinding.ActivitySignInBinding;

public class SettingsActivity extends AppCompatActivity {

    ActivitySettingsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
    }
}