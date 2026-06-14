package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class TimerController$ticker$4 extends y implements Function1<Long, Unit> {
    TimerController$ticker$4(Object obj) {
        super(1, obj, TimerController.class, "onTick", "onTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
        invoke(l10.longValue());
        return Unit.f93236a;
    }

    public final void invoke(long j10) {
        ((TimerController) this.receiver).onTick(j10);
    }
}
