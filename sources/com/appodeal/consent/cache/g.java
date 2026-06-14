package com.appodeal.consent.cache;

import android.content.Context;
import android.preference.PreferenceManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f15385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f15386s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f15385r = iVar;
        this.f15386s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f15385r, this.f15386s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f15385r, this.f15386s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        if (!this.f15385r.f15393c.getAndSet(true)) {
            com.appodeal.consent.logger.a.b("[PrivacyPreferences] - init", null);
            this.f15385r.f15391a = this.f15386s.getSharedPreferences("stack_consent_file", 0);
            this.f15385r.f15392b = PreferenceManager.getDefaultSharedPreferences(this.f15386s);
        }
        return Unit.f93236a;
    }
}
