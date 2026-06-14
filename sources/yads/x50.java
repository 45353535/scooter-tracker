package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class x50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z60 f117709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(z60 z60Var) {
        super(0);
        this.f117709b = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new rx0((d80) this.f117709b.C.getValue());
    }
}
