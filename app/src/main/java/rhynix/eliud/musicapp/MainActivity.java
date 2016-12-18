package rhynix.eliud.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import co.mobiwise.library.InteractivePlayerView;
import co.mobiwise.library.OnActionClickedListener;

public class MainActivity extends AppCompatActivity  implements OnActionClickedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final InteractivePlayerView mInteractivePlayerView = (InteractivePlayerView)findViewById(R.id.interactivePlayerView);
        mInteractivePlayerView.setMax(144);
        mInteractivePlayerView.setProgress(50);
        mInteractivePlayerView.setOnActionClickedListener(this);

        final ImageView imageView = (ImageView)findViewById(R.id.control);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mInteractivePlayerView.isPlaying()){
                    mInteractivePlayerView.start();
                    imageView.setBackgroundResource(R.drawable.ic_action_pause);
                }
            }
        });


    }

    @Override
    public void onActionClicked(int i) {
        switch (i){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }

    }
}
