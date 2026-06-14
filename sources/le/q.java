package le;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Job f94202b;

    public q(Job job) {
        this.f94202b = job;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            return;
        }
        this.f94202b.cancel(new CancellationException(th2.getMessage()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.f93236a;
    }
}
