package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ef1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff1 f110363b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(ff1 ff1Var) {
        super(0);
        this.f110363b = ff1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ff1 ff1Var = this.f110363b;
        return bw2.a(ff1Var.f110704b, ff1Var.f110705c, ff1Var.f110703a);
    }
}
