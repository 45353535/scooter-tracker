package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class so3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ to3 f115890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so3(to3 to3Var) {
        super(0);
        this.f115890b = to3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f115890b.f116312a.onInitializationCompleted();
        return Unit.f93236a;
    }
}
