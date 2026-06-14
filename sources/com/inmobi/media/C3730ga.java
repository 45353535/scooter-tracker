package com.inmobi.media;

import hh.b0;
import hh.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3730ga implements hh.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3730ga f38626a = new C3730ga();

    @Override // hh.v
    public final hh.b0 intercept(v.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        EnumC3571a6 enumC3571a6A = Re.a();
        if (enumC3571a6A != null) {
            new b0.a().r(chain.request()).p(hh.y.HTTP_1_1).g(enumC3571a6A.f38169a).m(enumC3571a6A.toString()).b(hh.c0.create((hh.w) null, "")).c();
        }
        hh.b0 b0VarA = chain.a(chain.request());
        Intrinsics.checkNotNullExpressionValue(b0VarA, "proceed(...)");
        return b0VarA;
    }
}
