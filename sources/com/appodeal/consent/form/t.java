package com.appodeal.consent.form;

import android.content.Context;
import com.appodeal.consent.ConsentInformation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f15457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ConsentInformation f15459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f15460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.consent.cache.i f15461v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ConsentInformation consentInformation, Context context, com.appodeal.consent.cache.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15459t = consentInformation;
        this.f15460u = context;
        this.f15461v = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f15459t, this.f15460u, this.f15461v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.form.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
