package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class E9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f40682n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<J9> f40683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private G1 f40684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4460o2 f40689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f40693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private J9 f40695m;

    public E9() {
        this.f40683a = new ArrayList<>();
        this.f40684b = new G1();
        this.f40689g = new C4460o2();
    }

    public void a(J9 j92) {
        if (j92 != null) {
            this.f40683a.add(j92);
            if (this.f40695m == null) {
                this.f40695m = j92;
            } else if (j92.a(0)) {
                this.f40695m = j92;
            }
        }
    }

    public int b() {
        return this.f40688f;
    }

    public int c() {
        return this.f40685c;
    }

    public int d() {
        return this.f40687e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f40687e);
    }

    public boolean f() {
        return this.f40686d;
    }

    public C4460o2 g() {
        return this.f40689g;
    }

    public long h() {
        return this.f40691i;
    }

    public G1 i() {
        return this.f40684b;
    }

    public boolean j() {
        return this.f40690h;
    }

    public boolean k() {
        return this.f40692j;
    }

    public boolean l() {
        return this.f40694l;
    }

    public boolean m() {
        return this.f40693k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f40685c + ", bidderExclusive=" + this.f40686d + '}';
    }

    public E9(int i10, boolean z10, int i11, G1 g12, C4460o2 c4460o2, int i12, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f40683a = new ArrayList<>();
        this.f40685c = i10;
        this.f40686d = z10;
        this.f40687e = i11;
        this.f40684b = g12;
        this.f40689g = c4460o2;
        this.f40692j = z12;
        this.f40693k = z13;
        this.f40688f = i12;
        this.f40690h = z11;
        this.f40691i = j10;
        this.f40694l = z14;
    }

    public J9 a(String str) {
        for (J9 j92 : this.f40683a) {
            if (j92.c().equals(str)) {
                return j92;
            }
        }
        return null;
    }

    public J9 a() {
        for (J9 j92 : this.f40683a) {
            if (j92.d()) {
                return j92;
            }
        }
        return this.f40695m;
    }
}
