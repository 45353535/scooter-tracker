package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bi3 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci3 f109018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi3(ci3 ci3Var) {
        super(1);
        this.f109018b = ci3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f109018b.f109418a.invoke(new m80((String) obj));
        return Unit.f93236a;
    }
}
