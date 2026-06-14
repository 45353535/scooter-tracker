package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Ka extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f37215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q9 f37216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ka(La la2, Q9 q92, Continuation continuation) {
        super(1, continuation);
        this.f37215b = la2;
        this.f37216c = q92;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ka(this.f37215b, this.f37216c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ka(this.f37215b, this.f37216c, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (com.inmobi.media.La.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (com.inmobi.media.La.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (com.inmobi.media.La.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ka.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
