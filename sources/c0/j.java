package c0;

import hh.b0;
import java.io.IOException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes5.dex */
final class j implements hh.f, Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hh.e f6439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CancellableContinuation f6440c;

    public j(hh.e eVar, CancellableContinuation cancellableContinuation) {
        this.f6439b = eVar;
        this.f6440c = cancellableContinuation;
    }

    public void a(Throwable th2) {
        try {
            this.f6439b.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.f93236a;
    }

    @Override // hh.f
    public void onFailure(hh.e eVar, IOException iOException) {
        if (eVar.isCanceled()) {
            return;
        }
        CancellableContinuation cancellableContinuation = this.f6440c;
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(kotlin.d.a(iOException)));
    }

    @Override // hh.f
    public void onResponse(hh.e eVar, b0 b0Var) {
        this.f6440c.resumeWith(Result.b(b0Var));
    }
}
