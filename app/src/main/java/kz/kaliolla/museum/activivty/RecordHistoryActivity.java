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
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import kz.kaliolla.museum.DataManager;
import kz.kaliolla.museum.R;
import kz.kaliolla.museum.model.Record;

public class RecordHistoryActivity extends AppCompatActivity implements RecordsHistoryAdpter.RefreshView{
    private static final int CALL_PHONE_PERMISSIONS_REQUEST = 102;

    @BindView(R.id.history)
    RecyclerView history;
    @BindView(R.id.no_data)
    TextView noData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_history);
        ButterKnife.bind(this);
        refreshView();
        initRecords();
    }

    private void initRecords() {
        history.setLayoutManager(new LinearLayoutManager(this));
        history.setAdapter(new RecordsHistoryAdpter(this, DataManager.getHistory(), this));
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

    @Override
    public void refreshView() {
        List<Record> records = DataManager.getHistory();
        if (records != null && records.size() > 0) {
            noData.setVisibility(View.GONE);
            history.setVisibility(View.VISIBLE);
        } else {
            noData.setVisibility(View.VISIBLE);
            history.setVisibility(View.GONE);
        }
    }
}
