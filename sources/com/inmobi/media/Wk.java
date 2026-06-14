package com.inmobi.media;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Wk extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f37969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wk(Context context, Continuation continuation) {
        super(2, continuation);
        this.f37969b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Wk(this.f37969b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Wk(this.f37969b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (com.inmobi.media.Wj.b(r18) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
