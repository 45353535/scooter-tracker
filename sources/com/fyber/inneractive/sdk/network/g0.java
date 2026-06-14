package com.fyber.inneractive.sdk.network;

import hh.x;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f21317c = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21318a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1 f21319b;

    public final h a() {
        String property;
        if (this.f21319b == null) {
            try {
                property = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                property = "hurl";
            }
            if (property != null && property.equals("okhttp")) {
                try {
                    x.b bVar = hh.x.F;
                    this.f21319b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.f21319b;
        return p1Var != null ? p1Var : this.f21318a;
    }
}
