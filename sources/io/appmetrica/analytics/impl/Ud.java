package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class Ud extends kotlin.jvm.internal.y implements Function1 {
    public Ud(Object obj) {
        super(1, obj, Vd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Vd vd2 = (Vd) this.receiver;
        vd2.f76593a.markCrashCompleted((String) obj);
        vd2.f76593a.deleteCompletedCrashes();
        return Unit.f93236a;
    }
}
