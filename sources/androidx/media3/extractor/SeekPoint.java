package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j10, long j11) {
        this.timeUs = j10;
        this.position = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public String toString() {
        return "[timeUs=" + this.timeUs + ", position=" + this.position + C4240b4.j.f42674e;
    }
}
