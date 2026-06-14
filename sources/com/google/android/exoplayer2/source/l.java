package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class l {
    public static Timeline a(MediaSource mediaSource) {
        return null;
    }

    public static boolean b(MediaSource mediaSource) {
        return true;
    }

    public static void c(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener) {
        mediaSource.prepareSource(mediaSourceCaller, transferListener, PlayerId.UNSET);
    }
}
