package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4123w5 extends kotlin.coroutines.jvm.internal.k implements Function2 {
    public C4123w5(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4123w5(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4123w5((Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        pf.b.g();
        kotlin.d.b(obj);
        try {
            context = Ji.f37157a;
        } catch (Exception e10) {
            C4148x5 c4148x5 = C4148x5.f39893a;
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        if (context == null) {
            return Unit.f93236a;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return Unit.f93236a;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        C4148x5 c4148x52 = C4148x5.f39893a;
        C4148x5.f39905m = memoryInfo.lowMemory;
        return Unit.f93236a;
    }
}
