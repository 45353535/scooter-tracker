package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public class O0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41472e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41476d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public O0(a aVar, long j10, long j11, long j12) {
        this.f41473a = aVar;
        this.f41474b = j10;
        this.f41475c = j11;
        this.f41476d = j12;
    }

    public a a() {
        return this.f41473a;
    }

    public long b() {
        return this.f41476d;
    }

    public long c() {
        return this.f41475c;
    }

    public long d() {
        return this.f41474b;
    }

    public boolean e() {
        a aVar = this.f41473a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f41473a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
