package yads;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class q7 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f114884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(Map.Entry entry) {
        super(1);
        this.f114884b = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlinx.serialization.json.c0 c0Var = (kotlinx.serialization.json.c0) obj;
        kotlinx.serialization.json.i.c(c0Var, "usagePercent", Integer.valueOf(((f8) this.f114884b.getValue()).f110636a));
        kotlinx.serialization.json.i.b(c0Var, "isDisabled", Boolean.valueOf(((f8) this.f114884b.getValue()).f110637b));
        return Unit.f93236a;
    }
}
