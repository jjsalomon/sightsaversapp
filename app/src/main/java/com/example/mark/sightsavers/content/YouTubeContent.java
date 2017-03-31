package com.example.mark.sightsavers.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Helper class for providing mock data to the app.
 * In a real world scenario you would either hard code the video ID's in the strings file or
 * retrieve them from a web service.
 */
public class YouTubeContent {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("HWiKlx85K34", "Sightsavers - our work"));
        addItem(new YouTubeVideo("jUxR6F3-rY0", "Million Miracles: Winesi's Story"));
        addItem(new YouTubeVideo("nU4ngNFk5z8", "Million Miracles: Laurinda's Story"));
        addItem(new YouTubeVideo("jcoIMGF471Y", "What do you want to be when you grow up?"));
        addItem(new YouTubeVideo("h7A0T2LJHbk", "Million Miracles: Value of sight"));
        addItem(new YouTubeVideo("IVkqcWy-PCM", "Sightsavers - Saving Sight and Changing Lives"));
        addItem(new YouTubeVideo("f99FP7fIzWA", "Sightsavers: #SeeTheMiracle"));
        addItem(new YouTubeVideo("9iz3qFpQl1Q", "My husband left me when I went blind"));
        addItem(new YouTubeVideo("doC5XL-JFKQ", "Mario - Ireland"));
    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}