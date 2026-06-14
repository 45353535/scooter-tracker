package androidx.work.impl.foreground;

import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ForegroundProcessor {
    void startForeground(String str, ForegroundInfo foregroundInfo);
}
