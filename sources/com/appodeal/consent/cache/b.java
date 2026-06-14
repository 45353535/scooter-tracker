package com.appodeal.consent.cache;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f15375r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15375r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f15375r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f15375r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SharedPreferences sharedPreferences = null;
        com.appodeal.consent.logger.a.b("[PrivacyPreferences] - clearCmpPreferences", null);
        SharedPreferences sharedPreferences2 = this.f15375r.f15391a;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cmpPreferences");
        } else {
            sharedPreferences = sharedPreferences2;
        }
        sharedPreferences.edit().clear().apply();
        return Unit.f93236a;
    }
}
