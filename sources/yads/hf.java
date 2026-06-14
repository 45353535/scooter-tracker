package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f111567a = lf.i.a(gf.f111172b);

    public static String a(long j10) {
        if (j10 < 1024) {
            return j10 + "B";
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return (j10 / 1024) + "KB";
        }
        if (j10 >= 1073741824) {
            return (j10 / 1073741824) + "GB";
        }
        return (j10 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB";
    }
}
