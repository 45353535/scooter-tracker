package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5329ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5304nk f77921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile G9 f77922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile G9 f77923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile G9 f77924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile G9 f77925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile G9 f77926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile G9 f77927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ExecutorC5279mk f77928h;

    public C5329ok() {
        this(new C5304nk());
    }

    public final IHandlerExecutor a() {
        if (this.f77927g == null) {
            synchronized (this) {
                try {
                    if (this.f77927g == null) {
                        this.f77921a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-SDE");
                        this.f77927g = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f77927g;
    }

    public final IHandlerExecutor b() {
        if (this.f77922b == null) {
            synchronized (this) {
                try {
                    if (this.f77922b == null) {
                        this.f77921a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-SC");
                        this.f77922b = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f77922b;
    }

    public final IHandlerExecutor c() {
        if (this.f77924d == null) {
            synchronized (this) {
                try {
                    if (this.f77924d == null) {
                        this.f77921a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-SMH-1");
                        this.f77924d = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f77924d;
    }

    public final IHandlerExecutor d() {
        if (this.f77925e == null) {
            synchronized (this) {
                try {
                    if (this.f77925e == null) {
                        this.f77921a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-SNTPE");
                        this.f77925e = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f77925e;
    }

    public final IHandlerExecutor e() {
        if (this.f77923c == null) {
            synchronized (this) {
                try {
                    if (this.f77923c == null) {
                        this.f77921a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-STE");
                        this.f77923c = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f77923c;
    }

    public C5329ok(C5304nk c5304nk) {
        new HashMap();
        this.f77921a = c5304nk;
    }
}
