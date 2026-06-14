package com.appodeal.consent.networking;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15524l;

    public l(String idfa, boolean z10, String type, String locale, int i10, int i11, float f10, String model, String make, String osv, String colorTheme) {
        Intrinsics.checkNotNullParameter(idfa, "idfa");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter("Android", "os");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        this.f15513a = idfa;
        this.f15514b = z10;
        this.f15515c = null;
        this.f15516d = type;
        this.f15517e = locale;
        this.f15518f = i10;
        this.f15519g = i11;
        this.f15520h = f10;
        this.f15521i = model;
        this.f15522j = make;
        this.f15523k = osv;
        this.f15524l = colorTheme;
    }
}
