package com.mobilefuse.sdk;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0007"}, d2 = {"logDebug", "", "", NotificationCompat.CATEGORY_MESSAGE, "", s.z.f67720z, "logError", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class DebuggingKt {
    public static final void logDebug(@NotNull Object logDebug, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logDebug, "$this$logDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (str == null) {
            str = logDebug.getClass().getSimpleName();
        }
        Log.d(str, msg);
    }

    public static /* synthetic */ void logDebug$default(Object obj, String str, String str2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        logDebug(obj, str, str2);
    }

    public static final void logError(@NotNull Object logError, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logError, "$this$logError");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (str == null) {
            str = logError.getClass().getSimpleName();
        }
        Log.e(str, msg);
    }

    public static /* synthetic */ void logError$default(Object obj, String str, String str2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        logError(obj, str, str2);
    }
}
