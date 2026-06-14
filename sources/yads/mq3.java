package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq3 f113584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ro3 f113585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq3(pq3 pq3Var, ro3 ro3Var) {
        super(0);
        this.f113584b = pq3Var;
        this.f113585c = ro3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f113584b.f114749a.onImpression(this.f113585c);
        return Unit.f93236a;
    }
}
