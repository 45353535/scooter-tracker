package org.bidon.sdk.logs.logging.impl;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.logs.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u000e\u0010\b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"logInfo", "", s.z.f67720z, "", PglCryptUtils.KEY_MESSAGE, "logError", "error", "", "DefaultTag", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LogExtKt {

    @NotNull
    private static final String DefaultTag = "BidonLog";

    public static final void logError(@NotNull String tag, @NotNull String message, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (ArraysKt.contains(new Logger.Level[]{Logger.Level.Error, Logger.Level.Verbose}, BidonSdk.getLoggerLevel())) {
            Log.e(DefaultTag, C4240b4.j.f42672d + tag + "] " + message, th2);
        }
    }

    public static final void logInfo(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (BidonSdk.getLoggerLevel() == Logger.Level.Verbose) {
            Log.d(DefaultTag, C4240b4.j.f42672d + tag + "] " + message);
        }
    }
}
