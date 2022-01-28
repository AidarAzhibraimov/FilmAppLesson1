package kg.geektech.filmapplesson1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kg.geektech.filmapplesson1.R;
import kg.geektech.filmapplesson1.databinding.ActivityMainBinding;
import kg.geektech.filmapplesson1.databinding.FragmentFilmsBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}