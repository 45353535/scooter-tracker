package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import j$.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Yn extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Le f38079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yn(Le networkRequest, C3903n9 c3903n9) {
        super(c3903n9);
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        this.f38079b = networkRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.inmobi.media.Xn
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.Xn r0 = (com.inmobi.media.Xn) r0
            int r1 = r0.f38016c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38016c = r1
            goto L1a
        L13:
            com.inmobi.media.Xn r0 = new com.inmobi.media.Xn
            kotlin.coroutines.jvm.internal.d r5 = (kotlin.coroutines.jvm.internal.d) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.f38014a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38016c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.d.b(r5)
            com.inmobi.media.s0 r5 = com.inmobi.media.C4018s0.f39493a
            com.inmobi.media.Le r2 = r4.f38079b
            r0.f38016c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.inmobi.media.Ne r5 = (com.inmobi.media.Ne) r5
            kotlin.ranges.IntRange r0 = com.inmobi.media.Se.f37724a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            vh.h r5 = r5.d()
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.lang.String r5 = r5.M(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yn.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.inmobi.media.R0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        Objects.toString(adResponse);
        V0.a(adResponse, this.f37625a, function1);
        return Unit.f93236a;
    }
}
