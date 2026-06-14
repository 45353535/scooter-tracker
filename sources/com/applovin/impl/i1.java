package com.applovin.impl;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f9050a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f9050a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public static synchronized String a(long j10) {
        return f9050a.format(new Date(j10));
    }
}
