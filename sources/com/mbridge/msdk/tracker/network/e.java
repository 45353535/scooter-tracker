package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes10.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51870d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f51868b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f51867a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f51869c;
    }

    public e(int i10, int i11) {
        this(i10, 60000L, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f51869c + 1;
        this.f51869c = i10;
        return i10 <= this.f51870d;
    }

    public e(int i10, long j10, int i11) {
        this.f51868b = j10;
        this.f51867a = i10;
        this.f51870d = i11;
    }
}
