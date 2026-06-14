package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class T2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f41773p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private G1 f41774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<C4324g3> f41778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4324g3 f41779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4460o2 f41782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f41784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f41788o;

    public T2() {
        this.f41774a = new G1();
        this.f41778e = new ArrayList<>();
    }

    public int a() {
        return this.f41775b;
    }

    public long b() {
        return this.f41776c;
    }

    public boolean c() {
        return this.f41777d;
    }

    public C4460o2 d() {
        return this.f41782i;
    }

    public long e() {
        return this.f41784k;
    }

    public int f() {
        return this.f41781h;
    }

    public G1 g() {
        return this.f41774a;
    }

    public int h() {
        return this.f41780g;
    }

    @NotNull
    public C4324g3 i() {
        for (C4324g3 c4324g3 : this.f41778e) {
            if (c4324g3.d()) {
                return c4324g3;
            }
        }
        C4324g3 c4324g32 = this.f41779f;
        return c4324g32 != null ? c4324g32 : new C4410l5();
    }

    public long j() {
        return this.f41788o;
    }

    public boolean k() {
        return this.f41783j;
    }

    public boolean l() {
        return this.f41785l;
    }

    public boolean m() {
        return this.f41787n;
    }

    public boolean n() {
        return this.f41786m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f41775b + ", bidderExclusive=" + this.f41777d + '}';
    }

    public void a(C4324g3 c4324g3) {
        if (c4324g3 != null) {
            this.f41778e.add(c4324g3);
            if (this.f41779f == null) {
                this.f41779f = c4324g3;
            } else if (c4324g3.a(0)) {
                this.f41779f = c4324g3;
            }
        }
    }

    public T2(int i10, long j10, boolean z10, G1 g12, int i11, C4460o2 c4460o2, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14, long j12) {
        this.f41778e = new ArrayList<>();
        this.f41775b = i10;
        this.f41776c = j10;
        this.f41777d = z10;
        this.f41774a = g12;
        this.f41780g = i11;
        this.f41781h = i12;
        this.f41782i = c4460o2;
        this.f41783j = z11;
        this.f41784k = j11;
        this.f41785l = z12;
        this.f41786m = z13;
        this.f41787n = z14;
        this.f41788o = j12;
    }

    public C4324g3 a(String str) {
        for (C4324g3 c4324g3 : this.f41778e) {
            if (c4324g3.c().equals(str)) {
                return c4324g3;
            }
        }
        return null;
    }
}
