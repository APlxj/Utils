package ap.com.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.blankj.utilcode.util.HandWrite;
import com.blankj.utilcode.util.ImageUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView roundImage;
    private HandWrite handWrite;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roundImage = (ImageView) findViewById(R.id.img);
        handWrite = (HandWrite) findViewById(R.id.hw);
        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img);
        roundImage.setImageBitmap(ImageUtils.oldRemeber(bitmap));
    }

    @Override
    public void onClick(View view) {
        handWrite.clear();
    }
}
