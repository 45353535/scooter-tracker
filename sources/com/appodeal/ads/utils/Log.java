package com.appodeal.ads.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.Appodeal;
import com.ironsource.C4240b4;
import java.net.UnknownHostException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class Log {

    public enum LogLevel {
        none(0),
        debug(1),
        verbose(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14956a;

        LogLevel(int i10) {
            this.f14956a = i10;
        }

        public static String[] names() {
            LogLevel[] logLevelArrValues = values();
            String[] strArr = new String[logLevelArrValues.length];
            for (int i10 = 0; i10 < logLevelArrValues.length; i10++) {
                strArr[i10] = logLevelArrValues[i10].name();
            }
            return strArr;
        }

        public int getValue() {
            return this.f14956a;
        }
    }

    public static void a(String str, LogLevel logLevel) {
        if (Appodeal.getLogLevel().getValue() >= logLevel.getValue()) {
            if (str.length() <= 1000) {
                android.util.Log.d("Appodeal", str);
                return;
            }
            int length = (str.length() + 999) / 1000;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1000;
                android.util.Log.d("Appodeal", str.substring(i11, Math.min(str.length(), i12)));
                i10++;
                i11 = i12;
            }
        }
    }

    public static void debug(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        log(str, str2, str3, LogLevel.debug);
    }

    public static void log(@Nullable Throwable throwable) {
        if (throwable != null) {
            com.appodeal.ads.analytics.breadcrumbs.n nVar = com.appodeal.ads.analytics.breadcrumbs.n.f12678b;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            com.appodeal.ads.analytics.breadcrumbs.m mVar = nVar.f12679a;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            eg.i.d(mVar.f12676a, null, null, new com.appodeal.ads.analytics.breadcrumbs.l(mVar, throwable, null), 3, null);
            if (Appodeal.getLogLevel().getValue() >= LogLevel.debug.getValue()) {
                if (throwable instanceof UnknownHostException) {
                    android.util.Log.d("Appodeal", throwable.toString());
                } else {
                    android.util.Log.d("Appodeal", "Exception", throwable);
                }
            }
        }
    }

    public static void logObject(@NonNull String str, @NonNull String str2, @Nullable Object obj, @NonNull LogLevel logLevel) {
        if (Appodeal.getLogLevel() == LogLevel.none) {
            return;
        }
        log(str, str2, obj != null ? obj.toString() : null, logLevel);
    }

    public static /* synthetic */ com.appodeal.ads.analytics.breadcrumbs.e a(String str, String str2, String str3) {
        return new com.appodeal.ads.analytics.breadcrumbs.a(str, str2, str3);
    }

    public static void log(@NonNull String str, @NonNull String str2) {
        log(str, str2, (String) null);
    }

    public static void log(@NonNull String str, @NonNull String str2, @NonNull LogLevel logLevel) {
        log(str, str2, null, logLevel);
    }

    public static void log(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        log(str, str2, str3, LogLevel.debug);
    }

    public static void log(@NonNull final String str, @NonNull final String str2, @Nullable final String str3, @NonNull LogLevel logLevel) {
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.utils.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Log.a(str, str2, str3);
            }
        });
        if (Appodeal.getLogLevel() == LogLevel.none) {
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            a(str + " [" + str2 + C4240b4.j.f42674e, logLevel);
            return;
        }
        a(str + " [" + str2 + "]: " + str3, logLevel);
    }
}
