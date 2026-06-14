package com.appodeal.ads.ext;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", s.z.f67720z, PglCryptUtils.KEY_MESSAGE, "", "error", "", "logInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "a", "Z", "isLogEnable", "()Z", "setLogEnable", "(Z)V", "ext_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LogExtKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13298a;

    public static final boolean isLogEnable() {
        return f13298a;
    }

    public static final void logInternal(String tag, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f13298a) {
            if (!Intrinsics.areEqual(tag, "InternalLogs")) {
                message = tag + ": " + message;
            }
            if (th2 != null) {
                Log.e("InternalLogs", message, th2);
            } else {
                Log.d("InternalLogs", message);
            }
        }
    }

    public static /* synthetic */ void logInternal$default(String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "InternalLogs";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        logInternal(str, str2, th2);
    }

    public static final void setLogEnable(boolean z10) {
        f13298a = z10;
    }
}
