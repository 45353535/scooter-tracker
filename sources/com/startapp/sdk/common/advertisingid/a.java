package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f64163a;

    public a(b bVar) {
        this.f64163a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        l0 l0VarB;
        try {
            this.f64163a.f64167d.lock();
            try {
                b bVar2 = this.f64163a;
                AtomicReference atomicReference = bVar2.f64169f;
                Context context = bVar2.f64164a;
                try {
                    try {
                        l0VarB = b.a(context);
                    } catch (AdvertisingIdResolver$InternalException e10) {
                        bVar2.b(e10.infoEventFlags);
                        try {
                            try {
                                l0VarB = b.b(context);
                            } catch (Throwable th2) {
                                if (bVar2.a(256)) {
                                    g9.a(th2);
                                }
                                l0VarB = l0.f64841d;
                                atomicReference.set(l0VarB);
                                bVar = this.f64163a;
                                bVar.f64171h = 2;
                                this.f64163a.f64168e.signalAll();
                                this.f64163a.f64167d.unlock();
                            }
                        } catch (AdvertisingIdResolver$InternalException e11) {
                            bVar2.b(e11.infoEventFlags);
                            l0VarB = l0.f64841d;
                            atomicReference.set(l0VarB);
                            bVar = this.f64163a;
                            bVar.f64171h = 2;
                            this.f64163a.f64168e.signalAll();
                            this.f64163a.f64167d.unlock();
                        }
                        atomicReference.set(l0VarB);
                        bVar = this.f64163a;
                        bVar.f64171h = 2;
                        this.f64163a.f64168e.signalAll();
                        this.f64163a.f64167d.unlock();
                    }
                } catch (Throwable th3) {
                    if (bVar2.a(128)) {
                        g9.a(th3);
                    }
                    l0VarB = b.b(context);
                    atomicReference.set(l0VarB);
                    bVar = this.f64163a;
                    bVar.f64171h = 2;
                    this.f64163a.f64168e.signalAll();
                    this.f64163a.f64167d.unlock();
                }
                atomicReference.set(l0VarB);
                bVar = this.f64163a;
            } catch (Throwable th4) {
                try {
                    if (this.f64163a.a(64)) {
                        g9.a(th4);
                    }
                    bVar = this.f64163a;
                } catch (Throwable th5) {
                    this.f64163a.f64171h = 2;
                    this.f64163a.f64168e.signalAll();
                    this.f64163a.f64167d.unlock();
                    throw th5;
                }
            }
            bVar.f64171h = 2;
            this.f64163a.f64168e.signalAll();
            this.f64163a.f64167d.unlock();
        } catch (Throwable th6) {
            this.f64163a.f64171h = 2;
            if (this.f64163a.a(16384)) {
                g9.a(th6);
            }
        }
    }
}
