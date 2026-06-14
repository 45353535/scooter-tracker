package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10099c;

    p4(String str, String str2, Context context) {
        this.f10097a = str.replace("android.permission.", "");
        this.f10098b = str2;
        this.f10099c = o0.a(str, context);
    }

    public String a() {
        return this.f10098b;
    }

    public String b() {
        return this.f10097a;
    }

    public boolean c() {
        return this.f10099c;
    }
}
