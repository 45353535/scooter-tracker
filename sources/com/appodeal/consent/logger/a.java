package com.appodeal.consent.logger;

import android.util.Log;
import com.amazon.aps.shared.util.APSSharedUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final void b(String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() > 200) {
            message = StringsKt.J1(message, 100) + APSSharedUtil.TRUNCATE_SEPARATOR + StringsKt.K1(message, 20);
        }
        Log.d("ConsentManager", message + ", thread " + Thread.currentThread(), th2);
    }
}
