package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Eh extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f36803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ab f36804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f36805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eh(Gh gh2, Ab ab2, JSONObject jSONObject, Continuation continuation) {
        super(1, continuation);
        this.f36803a = gh2;
        this.f36804b = ab2;
        this.f36805c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Eh(this.f36803a, this.f36804b, this.f36805c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Eh) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0047 A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0006, B:11:0x0025, B:16:0x002c, B:17:0x0031, B:18:0x0032, B:20:0x0036, B:23:0x003b, B:25:0x003f, B:27:0x0043, B:29:0x0047), top: B:34:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            pf.b.g()
            kotlin.d.b(r3)
            com.inmobi.media.Gh r3 = r2.f36803a     // Catch: java.lang.Exception -> L2a
            com.inmobi.media.Cb r3 = r3.f36946e     // Catch: java.lang.Exception -> L2a
            com.inmobi.media.Ab r0 = r2.f36804b     // Catch: java.lang.Exception -> L2a
            r3.getClass()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "eventLogLevel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)     // Catch: java.lang.Exception -> L2a
            com.inmobi.media.Ab r3 = r3.f36668a     // Catch: java.lang.Exception -> L2a
            int r3 = r3.ordinal()     // Catch: java.lang.Exception -> L2a
            if (r3 == 0) goto L47
            r1 = 1
            if (r3 == r1) goto L3b
            r1 = 2
            if (r3 == r1) goto L32
            r1 = 3
            if (r3 != r1) goto L2c
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f36564d     // Catch: java.lang.Exception -> L2a
            if (r0 != r3) goto L5b
            goto L47
        L2a:
            r3 = move-exception
            goto L51
        L2c:
            lf.m r3 = new lf.m     // Catch: java.lang.Exception -> L2a
            r3.<init>()     // Catch: java.lang.Exception -> L2a
            throw r3     // Catch: java.lang.Exception -> L2a
        L32:
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f36563c     // Catch: java.lang.Exception -> L2a
            if (r0 == r3) goto L47
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f36564d     // Catch: java.lang.Exception -> L2a
            if (r0 != r3) goto L5b
            goto L47
        L3b:
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f36562b     // Catch: java.lang.Exception -> L2a
            if (r0 == r3) goto L47
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f36563c     // Catch: java.lang.Exception -> L2a
            if (r0 == r3) goto L47
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f36564d     // Catch: java.lang.Exception -> L2a
            if (r0 != r3) goto L5b
        L47:
            com.inmobi.media.Gh r3 = r2.f36803a     // Catch: java.lang.Exception -> L2a
            java.util.List r3 = r3.f36948g     // Catch: java.lang.Exception -> L2a
            org.json.JSONObject r0 = r2.f36805c     // Catch: java.lang.Exception -> L2a
            r3.add(r0)     // Catch: java.lang.Exception -> L2a
            goto L5b
        L51:
            com.inmobi.media.Gh r0 = r2.f36803a
            r0.getClass()
            kotlin.Lazy r0 = com.inmobi.media.P9.f37527a
            com.inmobi.media.AbstractC3779i9.a(r3)
        L5b:
            kotlin.Unit r3 = kotlin.Unit.f93236a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Eh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
