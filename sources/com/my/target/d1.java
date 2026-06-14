package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class d1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d1 f59449p = new d1(4096);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d1 f59450q = new d1(64);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f59455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f59458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f59460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f59461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f59462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f59463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f59464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f59465o;

    public d1(int i10) {
        this.f59465o = i10;
        this.f59451a = (i10 & 1) == 1;
        this.f59452b = (i10 & 2) == 2;
        this.f59453c = (i10 & 4) == 4;
        this.f59454d = (i10 & 8) == 8;
        this.f59455e = (i10 & 16) == 16;
        this.f59456f = (i10 & 32) == 32;
        this.f59457g = (i10 & 64) == 64;
        this.f59458h = (i10 & 128) == 128;
        this.f59459i = (i10 & 256) == 256;
        this.f59460j = (i10 & 512) == 512;
        this.f59461k = (i10 & 1024) == 1024;
        this.f59462l = (i10 & 2048) == 2048;
        this.f59463m = (i10 & 4096) == 4096;
        this.f59464n = (i10 & 8192) == 8192;
    }

    public static d1 a(int i10) {
        return new d1(i10);
    }

    public int a() {
        return this.f59465o;
    }
}
