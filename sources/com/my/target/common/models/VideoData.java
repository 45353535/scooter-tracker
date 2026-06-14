package com.my.target.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.gb;
import com.my.target.t5;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoData extends t5 {
    public static final String M3U8 = ".m3u8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f59434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59435f;

    public VideoData(String str, int i10, int i11) {
        super(str);
        this.f60835b = i10;
        this.f60836c = i11;
        this.f59434e = !this.f60834a.endsWith(M3U8);
    }

    @Nullable
    public static VideoData chooseBest(@NonNull List<VideoData> list, int i10) {
        VideoData videoData = null;
        int i11 = 0;
        for (VideoData videoData2 : list) {
            int height = videoData2.getHeight();
            if (videoData == null || ((height <= i10 && i11 > i10) || ((height <= i10 && height > i11) || (height > i10 && height < i11)))) {
                videoData = videoData2;
                i11 = height;
            }
        }
        gb.a("VideoData: Accepted videoData quality = " + i11 + "p");
        return videoData;
    }

    @NonNull
    public static VideoData newVideoData(@NonNull String str, int i10, int i11) {
        return new VideoData(str, i10, i11);
    }

    public int getBitrate() {
        return this.f59435f;
    }

    public boolean isCacheable() {
        return this.f59434e;
    }

    public void setBitrate(int i10) {
        this.f59435f = i10;
    }
}
