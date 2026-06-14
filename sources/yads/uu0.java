package yads;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class uu0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0 f116780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f116781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(yu0 yu0Var, UUID uuid) {
        super(1);
        this.f116780b = yu0Var;
        this.f116781c = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xm2 xm2Var = (xm2) this.f116780b.f118384b.getValue();
        UUID uuid = this.f116781c;
        xm2Var.getClass();
        if (uuid == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        xm2Var.a(new um2(uuid));
        return Unit.f93236a;
    }
}
