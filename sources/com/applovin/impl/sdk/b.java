package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f10576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f10577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g7 f10578d;

    private b(com.applovin.impl.t1 t1Var, a.InterfaceC0179a interfaceC0179a, k kVar) {
        this.f10576b = new WeakReference(t1Var);
        this.f10577c = new WeakReference(interfaceC0179a);
        this.f10575a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f10575a.f().a(this);
    }

    public com.applovin.impl.t1 b() {
        return (com.applovin.impl.t1) this.f10576b.get();
    }

    public void d() {
        a();
        com.applovin.impl.t1 t1VarB = b();
        if (t1VarB == null) {
            return;
        }
        t1VarB.setExpired();
        a.InterfaceC0179a interfaceC0179a = (a.InterfaceC0179a) this.f10577c.get();
        if (interfaceC0179a == null) {
            return;
        }
        interfaceC0179a.onAdExpired(t1VarB);
    }

    public static b a(com.applovin.impl.t1 t1Var, a.InterfaceC0179a interfaceC0179a, k kVar) {
        b bVar = new b(t1Var, interfaceC0179a, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f10575a.a(x4.f11270b1)).booleanValue() || !this.f10575a.m0().isApplicationPaused()) {
            this.f10578d = g7.a(j10, this.f10575a, new Runnable() { // from class: com.applovin.impl.sdk.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10972b.c();
                }
            });
        }
    }

    public void a() {
        g7 g7Var = this.f10578d;
        if (g7Var != null) {
            g7Var.a();
            this.f10578d = null;
        }
    }
}
