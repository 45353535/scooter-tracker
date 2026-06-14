package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class InvalidationTracker$implementation$1 extends kotlin.jvm.internal.y implements Function1<Set<? extends Integer>, Unit> {
    InvalidationTracker$implementation$1(Object obj) {
        super(1, obj, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Integer> set) {
        invoke2((Set<Integer>) set);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Set<Integer> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((InvalidationTracker) this.receiver).notifyInvalidatedObservers(p02);
    }
}
