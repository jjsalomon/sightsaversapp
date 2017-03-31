package com.example.mark.sightsavers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import com.example.mark.sightsavers.content.YouTubeContent;
import com.example.mark.sightsavers.fragment.YouTubeFragment;

public class VideoListFragment extends ListFragment {

    /**
     * Empty constructor
     */
    public VideoListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new VideoListAdapter(getActivity()));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        final Context context = getActivity();
        final String DEVELOPER_KEY = getString(R.string.DEVELOPER_KEY);
        final YouTubeContent.YouTubeVideo video = YouTubeContent.ITEMS.get(position);

        //Opens in the YouTubePlayerView
        final Intent actIntent = new Intent(context, YouTubeActivity.class);
        actIntent.putExtra(YouTubeActivity.KEY_VIDEO_ID, video.id);
        startActivity(actIntent);
    }

}
