package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public class N0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41344e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41348d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public N0(a aVar, long j10, long j11, long j12) {
        this.f41345a = aVar;
        this.f41346b = j10;
        this.f41347c = j11;
        this.f41348d = j12;
    }

    public a a() {
        return this.f41345a;
    }

    public long b() {
        return this.f41348d;
    }

    public long c() {
        return this.f41347c;
    }

    public long d() {
        return this.f41346b;
    }

    public boolean e() {
        a aVar = this.f41345a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f41345a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
