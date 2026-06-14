package com.my.target;

import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f60445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f60446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageData f60447f;

    public o1(String str, String str2, String str3, Integer num, Integer num2, ImageData imageData) {
        this.f60442a = str;
        this.f60443b = str2;
        this.f60444c = str3;
        this.f60445d = num;
        this.f60446e = num2;
        this.f60447f = imageData;
    }

    public static o1 a(String str, String str2, String str3, Integer num, Integer num2, ImageData imageData) {
        return new o1(str, str2, str3, num, num2, imageData);
    }

    public Integer b() {
        return this.f60445d;
    }

    public String c() {
        return this.f60444c;
    }

    public Integer d() {
        return this.f60446e;
    }

    public ImageData e() {
        return this.f60447f;
    }

    public String f() {
        return this.f60443b;
    }

    public String a() {
        return this.f60442a;
    }
}
