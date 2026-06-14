package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22454e;

    public e0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f22450a = str;
        this.f22451b = i11;
        this.f22452c = i12;
        this.f22453d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i10 = this.f22453d;
        this.f22453d = i10 == Integer.MIN_VALUE ? this.f22451b : i10 + this.f22452c;
        this.f22454e = this.f22450a + this.f22453d;
    }

    public final void b() {
        if (this.f22453d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
