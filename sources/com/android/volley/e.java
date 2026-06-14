package com.android.volley;

/* JADX INFO: loaded from: classes5.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f7511d;

    public e() {
        this(2500, 1, 1.0f);
    }

    @Override // com.android.volley.r
    public int a() {
        return this.f7509b;
    }

    @Override // com.android.volley.r
    public void b(u uVar) throws u {
        this.f7509b++;
        int i10 = this.f7508a;
        this.f7508a = i10 + ((int) (i10 * this.f7511d));
        if (!d()) {
            throw uVar;
        }
    }

    @Override // com.android.volley.r
    public int c() {
        return this.f7508a;
    }

    protected boolean d() {
        return this.f7509b <= this.f7510c;
    }

    public e(int i10, int i11, float f10) {
        this.f7508a = i10;
        this.f7510c = i11;
        this.f7511d = f10;
    }
}
