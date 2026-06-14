package androidx.test.internal.platform;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ThreadChecker {
    void checkMainThread();

    void checkNotMainThread();
}
