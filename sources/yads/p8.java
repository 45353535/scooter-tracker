package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class p8 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r8 f114578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(r8 r8Var) {
        super(0);
        this.f114578b = r8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new z8(new n8(), new o8(), new x8()).a(this.f114578b.f115360b.getApplicationContext());
    }
}
