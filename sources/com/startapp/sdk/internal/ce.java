package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ce extends k6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f64370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb f64371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f64372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f64373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final be f64374i;

    public ce(Context context, lb lbVar, lb lbVar2, String str, String str2) {
        super(context, 1000L);
        this.f64374i = new be(this);
        this.f64370e = lbVar;
        this.f64371f = lbVar2;
        this.f64372g = str;
        this.f64373h = str2;
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object a() {
        Object objA;
        if (!f()) {
            return null;
        }
        synchronized (this) {
            objA = a(((vf) this.f64370e.a()).getString(this.f64372g, null));
        }
        return objA;
    }

    public abstract Object a(String str);

    public final synchronized void b(Object obj) {
        if (obj != null) {
            try {
                uf ufVarEdit = ((vf) this.f64370e.a()).edit();
                String str = this.f64372g;
                String strC = c(obj);
                ufVarEdit.a(str, strC);
                ufVarEdit.f65346a.putString(str, strC);
                String str2 = this.f64373h;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ufVarEdit.a(str2, Long.valueOf(jCurrentTimeMillis));
                ufVarEdit.f65346a.putLong(str2, jCurrentTimeMillis);
                ufVarEdit.apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(Math.max(60000L, d()));
    }

    public String c(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public abstract long d();

    public final synchronized void e() {
        a(Math.max(0L, (Math.max(60000L, d()) + ((vf) this.f64370e.a()).getLong(this.f64373h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j10) {
        if (f()) {
            m8 m8Var = (m8) this.f64371f.a();
            m8Var.f64912a.removeCallbacks(this.f64374i);
            m8 m8Var2 = (m8) this.f64371f.a();
            m8Var2.f64912a.postDelayed(this.f64374i, j10);
        }
    }
}
