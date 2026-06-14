package io.sentry.android.replay.util;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final Context a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
