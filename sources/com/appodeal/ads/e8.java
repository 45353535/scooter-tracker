package com.appodeal.ads;

import com.appodeal.ads.ext.LogExtKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f13274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u8 f13275s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(u8 u8Var, Continuation continuation) {
        super(2, continuation);
        this.f13275s = u8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        e8 e8Var = new e8(this.f13275s, continuation);
        e8Var.f13274r = ((Boolean) obj).booleanValue();
        return e8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        e8 e8Var = new e8(this.f13275s, (Continuation) obj2);
        e8Var.f13274r = bool.booleanValue();
        return e8Var.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        boolean z10 = this.f13274r;
        LogExtKt.logInternal$default("AdLifecycleTracker", "Application state changed: foreground=" + z10, null, 4, null);
        if (z10) {
            this.f13275s.a();
        } else {
            u8.b(this.f13275s);
        }
        return Unit.f93236a;
    }
}
