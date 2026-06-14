package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DateFormat f7948a;

    public static DateFormat a() {
        if (f7948a == null) {
            f7948a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f7948a;
    }
}
