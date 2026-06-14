package com.my.target;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.hls.DefaultHlsDataSourceFactory;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x6 {
    public static MediaSource a(Uri uri, Context context) {
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context, new DefaultHttpDataSource.Factory().setUserAgent(Util.getUserAgent(context, "myTarget")));
        return Util.inferContentType(uri) == 2 ? new HlsMediaSource.Factory(new DefaultHlsDataSourceFactory(factory)).createMediaSource(MediaItem.fromUri(uri)) : new ProgressiveMediaSource.Factory(factory).createMediaSource(MediaItem.fromUri(uri));
    }
}
