package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f15672d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f15673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IN f15674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OUT f15675c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f15676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f15677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15678g;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    protected void a(Object... objArr) {
    }

    public final long b() {
        return this.f15678g;
    }

    final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f15676e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f15677f, this);
    }

    final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f15676e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f15677f, this);
    }

    final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f15676e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f15677f, this);
    }

    public final OUT f() {
        return this.f15675c;
    }

    final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f15677f = new m(bVar);
        this.f15673a = dVar;
        this.f15674b = in;
        this.f15676e = aVar;
        if (dVar != null) {
            this.f15678g = dVar.f15678g;
        } else {
            long andIncrement = f15672d.getAndIncrement();
            this.f15678g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f15676e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f15677f, this, th2);
    }

    final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f15676e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f15677f, this, th2);
    }

    protected final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f15676e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f15677f, this, th2);
    }
}
