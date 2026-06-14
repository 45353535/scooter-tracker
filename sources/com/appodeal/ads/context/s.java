package com.appodeal.ads.context;

import com.appodeal.ads.ext.LogExtKt;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13212r;

    public s(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        s sVar = new s(continuation);
        sVar.f13212r = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        s sVar = new s((Continuation) obj2);
        sVar.f13212r = (WeakReference) obj;
        return sVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        WeakReference weakReference = (WeakReference) this.f13212r;
        LogExtKt.logInternal$default("ContextProvider", "AwaitResumedActivity: " + weakReference.get(), null, 4, null);
        return kotlin.coroutines.jvm.internal.b.a(weakReference.get() != null);
    }
}
