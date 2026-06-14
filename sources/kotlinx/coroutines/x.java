package kotlinx.coroutines;

import eg.b1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
final class x extends b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f93646f;

    public x(Function1 function1) {
        this.f93646f = function1;
    }

    @Override // eg.b1
    public boolean u() {
        return false;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        this.f93646f.invoke(th2);
    }
}
