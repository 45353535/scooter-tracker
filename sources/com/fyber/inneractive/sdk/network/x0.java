package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f21424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f21425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f21426r;

    public x0(e eVar, String str, String str2) {
        super(eVar, g0.f21317c.a(), null);
        this.f21426r = new AtomicInteger();
        this.f21425q = str;
        this.f21424p = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.f21352a = String.valueOf(i10);
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse event network request", e10, new Object[0]);
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        byte[] bArr = new byte[0];
        try {
            IAlog.a("NetworkRequestEvent: network request body %s", this.f21424p);
            return this.f21424p.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f21426r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f21425q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f21426r.getAndIncrement() < 4;
    }
}
