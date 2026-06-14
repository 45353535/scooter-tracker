package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.h2;
import com.appodeal.ads.modules.common.internal.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14842r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.f14842r = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f14842r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x(this.f14842r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SharedPreferences.Editor editorEdit = this.f14842r.c(d.f14788c).edit();
        boolean z10 = h2.f13367a;
        editorEdit.putString(Constants.APPODEAL_VERSION, Constants.SDK_VERSION).apply();
        return Unit.f93236a;
    }
}
