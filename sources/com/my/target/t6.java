package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class t6 extends ac {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f60838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f60839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f60840h;

    public t6(String str, String str2, float f10, int i10, boolean z10, int i11) {
        super(str, str2, i10, i11);
        this.f60840h = 0.0f;
        this.f60838f = f10;
        this.f60839g = z10;
    }

    public static t6 a(String str, float f10, int i10, boolean z10, int i11) {
        return new t6("mrcStat", str, f10, i10, z10, i11);
    }

    public float e() {
        return this.f60840h;
    }

    public void a(float f10) {
        this.f60840h = f10;
    }
}
