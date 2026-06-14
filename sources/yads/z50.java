package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class z50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z60 f118548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(z60 z60Var) {
        super(0);
        this.f118548b = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ux0((b80) this.f118548b.D.getValue());
    }
}
