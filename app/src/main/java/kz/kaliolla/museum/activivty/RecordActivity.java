package kz.kaliolla.museum.activivty;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.kaliolla.museum.DataManager;
import kz.kaliolla.museum.R;
import kz.kaliolla.museum.model.Record;

public class RecordActivity extends AppCompatActivity {
    @BindView(R.id.slider)
    SliderLayout sliderShow;
    private static final String PARAM_QR_CODE = "qr_code";

    public static final Intent getIntent(@NonNull Context context, @NonNull String qr){
        return new Intent(context, RecordActivity.class).putExtra(PARAM_QR_CODE, qr);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        ButterKnife.bind(this);
        Record record = DataManager.getRecored(getIntent().getStringExtra(PARAM_QR_CODE));
        String imgUrl = record.getImageUrls().get(0);

        TextSliderView textSliderView = new TextSliderView(this);
        textSliderView
                .description("Game of Thrones")
                .image(imgUrl);
        sliderShow.addSlider(textSliderView);
        textSliderView = new TextSliderView(this);
        textSliderView
                .description("Game of Thrones")
                .image(imgUrl);
        sliderShow.addSlider(textSliderView);
    }

    @Override
    protected void onResume() {
        sliderShow.startAutoCycle();
        super.onResume();
    }

    @Override
    protected void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }
}
