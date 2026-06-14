package le;

import eg.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p0 f94201b;

    public p(p0 p0Var) {
        this.f94201b = p0Var;
    }

    public final void a(Throwable th2) {
        this.f94201b.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.f93236a;
    }
}
