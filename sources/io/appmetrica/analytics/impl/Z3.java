package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: loaded from: classes12.dex */
public final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3 f76733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile G9 f76734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile G9 f76735c;

    public Z3() {
        this(new Y3());
    }

    public final IHandlerExecutor a() {
        if (this.f76734b == null) {
            synchronized (this) {
                try {
                    if (this.f76734b == null) {
                        this.f76733a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-CDE");
                        this.f76734b = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f76734b;
    }

    public final ICommonExecutor b() {
        if (this.f76735c == null) {
            synchronized (this) {
                try {
                    if (this.f76735c == null) {
                        this.f76733a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-CRS");
                        this.f76735c = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f76735c;
    }

    public Z3(Y3 y32) {
        this.f76733a = y32;
    }
}
