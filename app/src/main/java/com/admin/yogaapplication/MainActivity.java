package com.admin.yogaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.admin.yogaapplication.activities.EditClassActivity;
import com.admin.yogaapplication.activities.EditCourseActivity;
import com.admin.yogaapplication.activities.ViewClassActivity;
import com.admin.yogaapplication.activities.ViewCourseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView card_course = findViewById(R.id.view_courses_card);
        CardView card_class = findViewById(R.id.view_classes_card);
        CardView card_add_course = findViewById(R.id.add_course_card);
        CardView card_add_class = findViewById(R.id.add_class_card);


        card_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewCourseActivity.class);
                startActivity(intent);
            }
        });

        card_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewClassActivity.class);
                startActivity(intent);
            }
        });


        card_add_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditCourseActivity.class);
                startActivity(intent);
            }
        });

        card_add_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditClassActivity.class);
                startActivity(intent);
            }
        });


    }
}