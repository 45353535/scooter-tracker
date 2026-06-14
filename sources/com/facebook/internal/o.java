package com.facebook.internal;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f19958a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f19959b;

    private o() {
    }

    public static final String a() {
        return f19959b;
    }

    public static final boolean b() {
        String str = f19959b;
        return str != null && StringsKt.a0(str, "Unity.", false, 2, null);
    }
}
