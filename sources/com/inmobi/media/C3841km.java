package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3841km extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3941om f38908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3841km(C3941om c3941om, Continuation continuation) {
        super(2, continuation);
        this.f38908c = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3841km c3841km = new C3841km(this.f38908c, continuation);
        c3841km.f38907b = obj;
        return c3841km;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3841km c3841km = new C3841km(this.f38908c, (Continuation) obj2);
        c3841km.f38907b = (Rl) obj;
        return c3841km.invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3841km.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
