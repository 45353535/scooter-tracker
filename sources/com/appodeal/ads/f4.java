package com.appodeal.ads;

import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class f4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f13311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l4 f13313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Application f13314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f13315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n7 f13316w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(l4 l4Var, Application application, String str, n7 n7Var, Continuation continuation) {
        super(2, continuation);
        this.f13313t = l4Var;
        this.f13314u = application;
        this.f13315v = str;
        this.f13316w = n7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f4(this.f13313t, this.f13314u, this.f13315v, this.f13316w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109 A[Catch: Exception -> 0x0019, TRY_ENTER, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0014, B:24:0x008c, B:28:0x00df, B:30:0x00f9, B:32:0x00ff, B:35:0x0109, B:36:0x0136, B:37:0x0156, B:14:0x0026, B:20:0x0061, B:17:0x002e), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0014, B:24:0x008c, B:28:0x00df, B:30:0x00f9, B:32:0x00ff, B:35:0x0109, B:36:0x0136, B:37:0x0156, B:14:0x0026, B:20:0x0061, B:17:0x002e), top: B:45:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
