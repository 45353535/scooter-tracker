package com.inmobi.media;

import hh.b0;
import hh.v;
import j$.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class X6 implements hh.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X6 f37989a = new X6();

    @Override // hh.v
    public final hh.b0 intercept(v.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        W6.a();
        Objects.toString(chain.request());
        if (W6.a()) {
            hh.b0 b0VarA = chain.a(chain.request());
            Intrinsics.checkNotNull(b0VarA);
            return b0VarA;
        }
        b0.a aVarP = new b0.a().r(chain.request()).p(hh.y.HTTP_1_1);
        Y5 y52 = EnumC3571a6.f38152b;
        hh.b0 b0VarC = aVarP.g(192).m("GDPR_COMPLIANCE_ENFORCED").b(hh.c0.create((hh.w) null, "")).c();
        Intrinsics.checkNotNull(b0VarC);
        return b0VarC;
    }
}
