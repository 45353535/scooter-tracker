package com.appodeal.ads.networking;

import com.appodeal.ads.ed;
import com.appodeal.ads.network.HttpClient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HttpClient.ZipBase64 f14159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HttpClient.Method f14160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ed f14163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f14164w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ed f14165x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.processors.a f14166y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f14167z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ed edVar, long j10, ed edVar2, com.appodeal.ads.networking.processors.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f14163v = edVar;
        this.f14164w = j10;
        this.f14165x = edVar2;
        this.f14166y = aVar;
        this.f14167z = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f14163v, this.f14164w, this.f14165x, this.f14166y, this.f14167z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0132, code lost:
    
        if (r0 == r12) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
