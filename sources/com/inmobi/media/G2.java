package com.inmobi.media;

import hh.v;
import j$.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class G2 implements hh.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G2 f36921a = new G2();

    @Override // hh.v
    public final hh.b0 intercept(v.a chain) throws Exception {
        Intrinsics.checkNotNullParameter(chain, "chain");
        hh.z request = chain.request();
        String str = H2.f36975a;
        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
        Objects.toString(request);
        try {
            hh.b0 b0VarA = chain.a(request);
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Objects.toString(b0VarA);
            Intrinsics.checkNotNull(request);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Objects.toString(request);
            Objects.toString(b0VarA);
            Intrinsics.checkNotNull(b0VarA);
            return b0VarA;
        } catch (Exception e10) {
            String str2 = H2.f36975a;
            Objects.toString(request);
            Intrinsics.checkNotNull(request);
            Intrinsics.checkNotNullParameter(request, "request");
            throw e10;
        }
    }
}
