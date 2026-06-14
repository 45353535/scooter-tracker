package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq3 f114393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq3(pq3 pq3Var) {
        super(0);
        this.f114393b = pq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f114393b.f114749a.onReturnedToApplication();
        return Unit.f93236a;
    }
}
