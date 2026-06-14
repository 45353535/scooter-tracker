package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes5.dex */
@UiThread
public abstract class JavaScriptReplyProxy {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public JavaScriptReplyProxy() {
    }

    public abstract void postMessage(@NonNull String str);

    public abstract void postMessage(@NonNull byte[] bArr);
}
