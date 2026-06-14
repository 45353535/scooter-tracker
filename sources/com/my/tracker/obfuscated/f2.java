package com.my.tracker.obfuscated;

/* JADX INFO: loaded from: classes11.dex */
public final class f2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f61502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f61503c;

    public f2(int i10, long j10, long j11) {
        this.f61501a = i10;
        this.f61502b = j10;
        this.f61503c = j11;
    }

    @Override // com.my.tracker.obfuscated.n2, com.my.tracker.obfuscated.e2
    public int a() {
        return this.f61501a;
    }

    @Override // com.my.tracker.obfuscated.d2, com.my.tracker.obfuscated.e2
    public long b() {
        return this.f61502b;
    }

    @Override // com.my.tracker.obfuscated.d2
    public void c(long j10) {
        this.f61502b += j10;
    }

    @Override // com.my.tracker.obfuscated.d2
    public void g() {
        this.f61502b = 0L;
        this.f61503c = 0L;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "total time = " + (this.f61502b + this.f61503c) + " ms : ";
        String str4 = "foreground = " + this.f61502b;
        if (this.f61501a == 0) {
            str = "[App Time   TS] id = " + this.f61501a;
            str2 = "useful background = " + this.f61503c;
        } else {
            str = "[Time Based TS] id = " + this.f61501a;
            str2 = "background = " + this.f61503c;
        }
        return str + ", " + str3 + str4 + ", " + str2;
    }

    @Override // com.my.tracker.obfuscated.d2
    public void a(long j10) {
        this.f61503c += j10;
    }

    @Override // com.my.tracker.obfuscated.d2, com.my.tracker.obfuscated.e2
    public long c() {
        return this.f61503c;
    }

    @Override // com.my.tracker.obfuscated.d2
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f2 m7436clone() {
        try {
            f2 f2Var = (f2) super.clone();
            f2Var.g();
            f2Var.a(this.f61503c);
            f2Var.c(this.f61502b);
            return f2Var;
        } catch (CloneNotSupportedException unused) {
            return new f2(this.f61501a, this.f61502b, this.f61503c);
        }
    }

    public f2(int i10) {
        this(i10, 0L, 0L);
    }
}
