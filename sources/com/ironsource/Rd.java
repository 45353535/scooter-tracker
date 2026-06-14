package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class Rd {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f41667o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<C4283dd> f41668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private G1 f41669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4283dd f41679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4460o2 f41680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41681n;

    public Rd() {
        this.f41668a = new ArrayList<>();
        this.f41669b = new G1();
    }

    public void a(C4283dd c4283dd) {
        if (c4283dd != null) {
            this.f41668a.add(c4283dd);
            if (this.f41679l == null) {
                this.f41679l = c4283dd;
            } else if (c4283dd.a(0)) {
                this.f41679l = c4283dd;
            }
        }
    }

    public int b() {
        return this.f41674g;
    }

    public int c() {
        return this.f41673f;
    }

    public boolean d() {
        return this.f41681n;
    }

    public ArrayList<C4283dd> e() {
        return this.f41668a;
    }

    public boolean f() {
        return this.f41676i;
    }

    public int g() {
        return this.f41670c;
    }

    public int h() {
        return this.f41672e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f41672e);
    }

    public boolean j() {
        return this.f41671d;
    }

    public C4460o2 k() {
        return this.f41680m;
    }

    public long l() {
        return this.f41675h;
    }

    public G1 m() {
        return this.f41669b;
    }

    public boolean n() {
        return this.f41678k;
    }

    public boolean o() {
        return this.f41677j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f41670c + ", bidderExclusive=" + this.f41671d + '}';
    }

    public Rd(int i10, boolean z10, int i11, int i12, G1 g12, C4460o2 c4460o2, int i13, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f41668a = new ArrayList<>();
        this.f41670c = i10;
        this.f41671d = z10;
        this.f41672e = i11;
        this.f41669b = g12;
        this.f41673f = i12;
        this.f41680m = c4460o2;
        this.f41674g = i13;
        this.f41681n = z11;
        this.f41675h = j10;
        this.f41676i = z12;
        this.f41677j = z13;
        this.f41678k = z14;
    }

    public C4283dd a(String str) {
        for (C4283dd c4283dd : this.f41668a) {
            if (c4283dd.c().equals(str)) {
                return c4283dd;
            }
        }
        return null;
    }

    public C4283dd a() {
        for (C4283dd c4283dd : this.f41668a) {
            if (c4283dd.d()) {
                return c4283dd;
            }
        }
        return this.f41679l;
    }
}
