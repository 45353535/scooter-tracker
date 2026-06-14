package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq3 f113999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq3(pq3 pq3Var) {
        super(0);
        this.f113999b = pq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f113999b.f114749a.onLeftApplication();
        return Unit.f93236a;
    }
}
