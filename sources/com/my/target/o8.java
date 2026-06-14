package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public final class o8 extends ac {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f60458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f60459h;

    public o8(String str, String str2, int i10, int i11) {
        super(str, str2, i10, i11);
        this.f60458g = -1.0f;
        this.f60459h = -1.0f;
    }

    public static o8 a(String str, int i10, int i11) {
        return new o8("ovvStat", str, i10, i11);
    }

    public void b(boolean z10) {
        this.f60457f = z10;
    }

    public float e() {
        return this.f60459h;
    }

    public float f() {
        return this.f60458g;
    }

    public boolean g() {
        return this.f60457f;
    }

    public void a(float f10) {
        this.f60459h = f10;
    }

    public void b(float f10) {
        this.f60458g = f10;
    }
}
