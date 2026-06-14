package com.taurusx.tax.g;

import android.media.MediaMetadataRetriever;
import com.taurusx.tax.log.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class k {

    public static class z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f66144c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f66145w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f66146y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public long f66147z;
    }

    public static z z(String str) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        z zVar = new z();
        try {
            try {
                zVar.f66147z = new File(str).length();
                mediaMetadataRetriever.setDataSource(str);
                zVar.f66145w = x.z(mediaMetadataRetriever.extractMetadata(18), 0);
                zVar.f66146y = x.z(mediaMetadataRetriever.extractMetadata(19), 0);
                zVar.f66144c = x.z(mediaMetadataRetriever.extractMetadata(9), 0L);
            } catch (Exception e10) {
                LogUtil.e("taurusx", "get video info exception: " + e10);
            }
            return zVar;
        } finally {
            mediaMetadataRetriever.release();
        }
    }
}
