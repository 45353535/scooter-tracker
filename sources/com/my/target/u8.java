package com.my.target;

import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f60900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f60902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageData f60903e;

    public u8(String str, double d10, boolean z10, Integer num, ImageData imageData) {
        this.f60899a = str;
        this.f60900b = d10;
        this.f60901c = z10;
        this.f60902d = num;
        this.f60903e = imageData;
    }

    public static u8 a(String str, double d10, boolean z10, Integer num, ImageData imageData) {
        return new u8(str, d10, z10, num, imageData);
    }

    public double b() {
        return this.f60900b;
    }

    public Integer c() {
        return this.f60902d;
    }

    public boolean d() {
        return this.f60901c;
    }

    public String e() {
        return this.f60899a;
    }

    public ImageData a() {
        return this.f60903e;
    }
}
