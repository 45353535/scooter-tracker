package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static boolean a(Context context, String str) {
        io.sentry.util.w.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
