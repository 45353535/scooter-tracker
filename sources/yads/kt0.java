package yads;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kt0 {
    /* JADX INFO: Access modifiers changed from: private */
    @DoNotInline
    public static boolean a(@Nullable Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
