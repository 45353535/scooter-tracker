package yads;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r7 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8 f115354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(d8 d8Var) {
        super(1);
        this.f115354b = d8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlinx.serialization.json.c0 c0Var = (kotlinx.serialization.json.c0) obj;
        for (Map.Entry entry : this.f115354b.f109829h.entrySet()) {
            kotlinx.serialization.json.i.f(c0Var, (String) entry.getKey(), new q7(entry));
        }
        return Unit.f93236a;
    }
}
