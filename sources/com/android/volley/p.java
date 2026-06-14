package com.android.volley;

import com.android.volley.b;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f7542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f7543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7544d;

    public interface a {
        void onErrorResponse(u uVar);
    }

    public interface b {
        void onResponse(Object obj);
    }

    private p(Object obj, b.a aVar) {
        this.f7544d = false;
        this.f7541a = obj;
        this.f7542b = aVar;
        this.f7543c = null;
    }

    public static p a(u uVar) {
        return new p(uVar);
    }

    public static p c(Object obj, b.a aVar) {
        return new p(obj, aVar);
    }

    public boolean b() {
        return this.f7543c == null;
    }

    private p(u uVar) {
        this.f7544d = false;
        this.f7541a = null;
        this.f7542b = null;
        this.f7543c = uVar;
    }
}
