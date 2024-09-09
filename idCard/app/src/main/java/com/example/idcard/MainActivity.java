package com.example.idcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get references to the TextView components
        TextView emailTextView = findViewById(R.id.email);
        TextView mobileTextView = findViewById(R.id.mobile);
        TextView githubTextView = findViewById(R.id.github);
        TextView linkedinTextView = findViewById(R.id.linkedin);
    }

    // Method to open email
    public void openEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:abrarhameem398@outlook.com"));
        startActivity(Intent.createChooser(emailIntent, "Send email via..."));
    }

    // Method to open dialer with the number
    public void openDialer(View view) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse("tel:01521102764"));
        startActivity(dialIntent);
    }

    // Method to open GitHub profile
    public void openGithub(View view) {
        Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/abrarCSE29"));
        startActivity(githubIntent);
    }

    // Method to open LinkedIn profile
    public void openLinkedIn(View view) {
        Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bd.linkedin.com/in/abrar-hameem-jucse49"));
        startActivity(linkedinIntent);
    }
    public void openJunivPIS(View view) {
        Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pis.juniv.edu/find_student.php"));
        startActivity(linkedinIntent);
    }
}
