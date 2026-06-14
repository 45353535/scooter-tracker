package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Ad extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Nc f36567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd f36570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(Dd dd2, Continuation continuation) {
        super(2, continuation);
        this.f36570d = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Ad ad2 = new Ad(this.f36570d, continuation);
        ad2.f36569c = obj;
        return ad2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Ad ad2 = new Ad(this.f36570d, (Continuation) obj2);
        ad2.f36569c = (CoroutineScope) obj;
        return ad2.invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ad.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
