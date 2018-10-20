package kz.kaliolla.museum.activivty;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kz.kaliolla.museum.DataManager;
import kz.kaliolla.museum.R;
import kz.kaliolla.museum.model.Record;

public class RecordActivity extends AppCompatActivity {
    private static final String PARAM_QR_CODE = "qr_code";

    public static final Intent getIntent(@NonNull Context context, @NonNull String qr){
        return new Intent(context, RecordActivity.class).putExtra(PARAM_QR_CODE, qr);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        Record record = DataManager.getRecored(getIntent().getStringExtra(PARAM_QR_CODE));

    }
}
