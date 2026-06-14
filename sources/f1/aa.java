package f1;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aa {
    public static final int a(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Format videoFormat = exoPlayer.getVideoFormat();
        if (videoFormat != null) {
            return videoFormat.height;
        }
        return 1;
    }

    public static final int b(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Format videoFormat = exoPlayer.getVideoFormat();
        if (videoFormat != null) {
            return videoFormat.width;
        }
        return 1;
    }
}
