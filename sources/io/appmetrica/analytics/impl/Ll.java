package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5518wa f76094a = new C5518wa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f76095b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5204jm f76096c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jl f76097d = new Jl(this);

    public static final Ll a() {
        return Kl.f76037a;
    }

    public final Em a(Context context, X4 x42, C5050dm c5050dm) {
        Em em = (Em) this.f76095b.get(x42.f76662a);
        boolean z10 = true;
        if (em == null) {
            synchronized (this.f76095b) {
                try {
                    em = (Em) this.f76095b.get(x42.f76662a);
                    if (em == null) {
                        em = new Em(new Fm(context, x42.f76662a, c5050dm, this.f76097d));
                        em.f();
                        this.f76095b.put(x42.f76662a, em);
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            em.a(c5050dm);
        }
        return em;
    }

    public final void a(X4 x42, Ul ul) {
        synchronized (this.f76095b) {
            try {
                this.f76094a.a(x42.f76662a, ul);
                C5204jm c5204jm = this.f76096c;
                if (c5204jm != null) {
                    ul.a(c5204jm);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
