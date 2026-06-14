package com.appodeal.ads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.appodeal.ads.networking.k f13121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f13123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l4 f13124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f13125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f13126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(l4 l4Var, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f13124u = l4Var;
        this.f13125v = context;
        this.f13126w = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        b4 b4Var = new b4(this.f13124u, this.f13125v, this.f13126w, continuation);
        b4Var.f13123t = obj;
        return b4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[PHI: r1 r11
  0x0056: PHI (r1v12 kotlinx.coroutines.CoroutineScope) = (r1v9 kotlinx.coroutines.CoroutineScope), (r1v24 kotlinx.coroutines.CoroutineScope) binds: [B:32:0x0131, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r11v17 java.lang.Object) = (r11v16 java.lang.Object), (r11v26 java.lang.Object) binds: [B:32:0x0131, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113 A[PHI: r1
  0x0113: PHI (r1v6 kotlinx.coroutines.CoroutineScope) = (r1v3 kotlinx.coroutines.CoroutineScope), (r1v8 kotlinx.coroutines.CoroutineScope) binds: [B:26:0x010f, B:14:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124 A[PHI: r1
  0x0124: PHI (r1v9 kotlinx.coroutines.CoroutineScope) = (r1v6 kotlinx.coroutines.CoroutineScope), (r1v11 kotlinx.coroutines.CoroutineScope) binds: [B:29:0x0120, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176 A[PHI: r1 r3
  0x0176: PHI (r1v27 com.appodeal.ads.networking.k) = (r1v25 com.appodeal.ads.networking.k), (r1v29 com.appodeal.ads.networking.k) binds: [B:41:0x0173, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r3v16 kotlinx.coroutines.CoroutineScope) = (r3v13 kotlinx.coroutines.CoroutineScope), (r3v18 kotlinx.coroutines.CoroutineScope) binds: [B:41:0x0173, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.b4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
