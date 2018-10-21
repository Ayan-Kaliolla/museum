package kz.kaliolla.museum.activivty;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import kz.kaliolla.museum.R;

public class RecordHistoryActivity extends AppCompatActivity {

    private static final int CALL_PHONE_PERMISSIONS_REQUEST = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_history);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.call)
    public void call() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, CALL_PHONE_PERMISSIONS_REQUEST);
        } else {
            sendCallIntent();
        }
    }

    @SuppressLint("MissingPermission")
    private void sendCallIntent() {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+7 705 747 31 21"));
        startActivity(callIntent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (requestCode == CALL_PHONE_PERMISSIONS_REQUEST && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            sendCallIntent();
        }
    }
}
