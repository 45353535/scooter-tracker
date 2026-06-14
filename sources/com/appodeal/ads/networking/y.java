package com.appodeal.ads.networking;

import com.appodeal.ads.a6;
import com.appodeal.ads.network.HttpClient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HttpClient.Proto f14184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HttpClient.Method f14185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a6 f14188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a6 f14189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.processors.a f14190x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a6 a6Var, a6 a6Var2, com.appodeal.ads.networking.processors.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f14188v = a6Var;
        this.f14189w = a6Var2;
        this.f14190x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new y(this.f14188v, this.f14189w, this.f14190x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
    
        if (r0 == r14) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
