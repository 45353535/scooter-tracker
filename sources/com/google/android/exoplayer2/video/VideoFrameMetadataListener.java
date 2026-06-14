package com.google.android.exoplayer2.video;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes7.dex */
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j10, long j11, Format format, @Nullable MediaFormat mediaFormat);
}
