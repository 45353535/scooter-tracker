package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class af0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f108668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f108669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(z1 z1Var, long j10) {
        super(1);
        this.f108668b = z1Var;
        this.f108669c = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f108668b.a(this.f108669c);
        return Unit.f93236a;
    }
}
