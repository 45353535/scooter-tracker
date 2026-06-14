package com.appodeal.ads.storage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14830t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f14831u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f14832v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, String str, String str2, String str3, long j10, String str4, int i10, Continuation continuation) {
        super(2, continuation);
        this.f14828r = a0Var;
        this.f14829s = str;
        this.f14830t = str2;
        this.f14831u = str3;
        this.f14832v = j10;
        this.f14833w = str4;
        this.f14834x = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f14828r, this.f14829s, this.f14830t, this.f14831u, this.f14832v, this.f14833w, this.f14834x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14828r.c(d.f14788c).edit().putString(this.f14829s, this.f14830t).putLong(this.f14831u, this.f14832v).putInt(this.f14833w, this.f14834x).apply();
        return Unit.f93236a;
    }
}
