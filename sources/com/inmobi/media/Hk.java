package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Hk extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig f37028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hk(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, Continuation continuation) {
        super(1, continuation);
        this.f37028b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Hk(this.f37028b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Hk(this.f37028b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Hk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
