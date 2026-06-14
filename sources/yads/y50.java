package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z60 f118090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(z60 z60Var) {
        super(0);
        this.f118090b = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new tx0((d80) this.f118090b.C.getValue());
    }
}
