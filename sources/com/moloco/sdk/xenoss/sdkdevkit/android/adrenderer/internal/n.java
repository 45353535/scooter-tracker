package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {
    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final SimpleDateFormat b(String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
