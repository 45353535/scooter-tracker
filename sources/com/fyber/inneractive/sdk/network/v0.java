package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class v0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f21412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f21413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d0 f21414r;

    public v0(f0 f0Var, Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        super(f0Var, g0.f21317c.a(), null);
        this.f21412p = context;
        this.f21413q = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public o0 a(l lVar, Map map, int i10) throws Exception {
        o0 o0Var = new o0();
        try {
            String string = com.fyber.inneractive.sdk.util.v.b(lVar.f21330c).toString();
            o0Var.f21352a = this.f21413q.a(string);
            o0Var.f21353b = string;
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse cacheable network request", e10, new Object[0]);
            if (e10 instanceof InvalidAppIdException) {
                throw e10;
            }
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String h() {
        return this.f21413q.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public a i() throws Throwable {
        d0 d0Var = new d0(this.f21412p, this.f21413q);
        this.f21414r = d0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = d0Var.a();
        String str = mVarA.f20229b;
        Object obj = mVarA.f20228a;
        this.f21413q.c();
        return new a(obj, str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f21413q.a();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.f21414r;
        if (d0Var != null) {
            d0Var.b(str2);
            if (o0Var == null || o0Var.f21353b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.f21414r.a(str, o0Var.f21353b)) {
                IAlog.b("Failed to cache file", new Object[0]);
            } else {
                this.f21413q.a(o0Var.f21352a);
            }
        }
    }
}
