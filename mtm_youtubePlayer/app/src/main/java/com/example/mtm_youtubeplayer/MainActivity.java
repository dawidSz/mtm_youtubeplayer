package com.example.mtm_youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity
{
    String api_key = "AIzaSyCw28toKQnFiHpbXQusjR-sdOvaQLFaj50";

    @Override
    protected void
    onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView ytPlayer = (YouTubePlayerView)findViewById(R.id.ytPlayer);

        ytPlayer.initialize(
                api_key,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(
                            YouTubePlayer.Provider provider,
                            YouTubePlayer youTubePlayer, boolean b)
                    {
                        List<String> videoList = new ArrayList<>();
                        videoList.add("3dHpEfmegOA");
                        videoList.add("LkZlS6tDerY");
                        videoList.add("i56rOjRJOLQ");
                        videoList.add("vm5d42E_01I");
                        youTubePlayer.loadVideos(videoList);
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult
                                                                youTubeInitializationResult)
                    {
                        Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}