package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Mg extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f37374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f37376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.PublisherConfig f37377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mg(Map map, SignalsConfig.PublisherConfig publisherConfig, Continuation continuation) {
        super(2, continuation);
        this.f37376c = map;
        this.f37377d = publisherConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Mg(this.f37376c, this.f37377d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Mg(this.f37376c, this.f37377d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (com.inmobi.media.Og.b(r13, r2, r0, r12) == r1) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
