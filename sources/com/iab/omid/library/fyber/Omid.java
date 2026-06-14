package com.iab.omid.library.fyber;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class Omid {
    private static b INSTANCE = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34991a = 0;

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }

    public static void updateLastActivity() {
        INSTANCE.c();
    }
}
