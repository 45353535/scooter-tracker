package sg.bigo.ads.ad.interstitial.f;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    @IntRange(from = 0, to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    int I();

    @IntRange(from = -1, to = PlaybackStateCompat.ACTION_REWIND)
    int J();

    boolean K();

    boolean L();

    void a(int i10, int i11, int i12, int i13);
}
