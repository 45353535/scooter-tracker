package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ew extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jj2 f110480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(jj2 jj2Var) {
        super(2);
        this.f110480b = jj2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        this.f110480b.a((String) obj, (String) obj2);
        return Unit.f93236a;
    }
}
