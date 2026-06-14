package yads;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rj0 {
    @DoNotInline
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof MediaDrmResetException;
    }
}
