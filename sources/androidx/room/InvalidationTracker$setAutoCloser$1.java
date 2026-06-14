package androidx.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class InvalidationTracker$setAutoCloser$1 extends kotlin.jvm.internal.y implements Function0<Unit> {
    InvalidationTracker$setAutoCloser$1(Object obj) {
        super(0, obj, InvalidationTracker.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InvalidationTracker) this.receiver).onAutoCloseCallback();
    }
}
