package a5.calendar;

//import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EventDetailsActivity extends AppCompatActivity {

    /**
     * Entry point for the “second activity” view as specified in the assignment details.
     *
     * @param savedInstanceState the bundle containing the activity’s previously saved state,
     *                           or null if this is a fresh launch
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Set layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_detail_layout);

        // Set the shortened description for each calendar event
        TextView detailsTextView = findViewById(R.id.details_text_view);
        TextView dateTextView = findViewById((R.id.date_text_view));
        TextView categoryTextView = findViewById((R.id.category_text_view));
        TextView locationTextView = findViewById((R.id.address_text_view));
        TextView admissionTextView = findViewById((R.id.admission_text_view));
        TextView nameTextView = findViewById((R.id.name_text_view));





         //Set Extras
        String description = getIntent().getStringExtra("event_description");
        int month = getIntent().getIntExtra("event_month", 0);
        int day   = getIntent().getIntExtra("event_day",   0);
        String category = getIntent().getStringExtra("event_category");
        String location = getIntent().getStringExtra("event_location");
        String admission = getIntent().getStringExtra("event_admission");
        String name = getIntent().getStringExtra("event_name");







        dateTextView.setText(getString(R.string.label_date,month,day));
        categoryTextView.setText(getString(R.string.label_category,category));
        nameTextView.setText(getString(R.string.label_name,name));
        locationTextView.setText(getString(R.string.label_location,location));
        admissionTextView.setText(getString(R.string.label_admission, admission));
        detailsTextView.setText(description);

    }
    }



