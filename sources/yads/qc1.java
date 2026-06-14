package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qc1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qc1 f114941b = new qc1();

    public qc1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlinx.serialization.json.e eVar = (kotlinx.serialization.json.e) obj;
        eVar.e(false);
        eVar.f(true);
        return Unit.f93236a;
    }
}
