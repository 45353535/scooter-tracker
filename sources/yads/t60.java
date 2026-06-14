package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class t60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z60 f116082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(z60 z60Var) {
        super(0);
        this.f116082b = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new qa1(new u13(), (kotlinx.serialization.json.b) this.f116082b.f118574s.getValue(), new sj3());
    }
}
