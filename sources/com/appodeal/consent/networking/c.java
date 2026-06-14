package com.appodeal.consent.networking;

import com.appodeal.ads.network.HttpClient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HttpClient.File f15484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HttpClient.Method f15485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f15486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f15488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f15490x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f15488v = aVar;
        this.f15489w = str;
        this.f15490x = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f15488v, this.f15489w, this.f15490x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        if (r0 == r14) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.networking.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
