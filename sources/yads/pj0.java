package yads;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pj0 {
    @DoNotInline
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    @DoNotInline
    public static boolean b(@Nullable Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
