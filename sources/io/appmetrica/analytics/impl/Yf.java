package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class Yf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f76706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f76707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f76708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer f76709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5115ga f76710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC5074el f76711f;

    public Yf(File file, Function function, Consumer consumer, Consumer consumer2, C5115ga c5115ga, InterfaceC5074el interfaceC5074el) {
        this.f76706a = file;
        this.f76707b = function;
        this.f76708c = consumer;
        this.f76709d = consumer2;
        this.f76710e = c5115ga;
        this.f76711f = interfaceC5074el;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f76706a.exists()) {
            E9 e9B = this.f76710e.b(this.f76706a.getName());
            Consumer consumer = this.f76708c;
            try {
                e9B.f75732a.lock();
                e9B.f75733b.a();
                if (!this.f76706a.exists()) {
                    consumer.consume(this.f76706a);
                    e9B.c();
                    C5115ga c5115ga = this.f76710e;
                    String name = this.f76706a.getName();
                    synchronized (c5115ga) {
                        c5115ga.f77249b.remove(name);
                    }
                    return;
                }
                Object objApply = this.f76707b.apply(this.f76706a);
                if (objApply != null) {
                    if (this.f76711f.a(objApply)) {
                        this.f76709d.consume(objApply);
                    } else {
                        consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.xp
                            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                            public final void consume(Object obj) {
                                Yf.a((File) obj);
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
            consumer.consume(this.f76706a);
            e9B.c();
            this.f76710e.a(this.f76706a.getName());
        }
    }
}
