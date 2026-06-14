package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class zu1 implements ru1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ev1 f118836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ai1 f118837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final av1 f118838c;

    public zu1(ev1 ev1Var, ai1 ai1Var, av1 av1Var) {
        this.f118836a = ev1Var;
        this.f118837b = ai1Var;
        this.f118838c = av1Var;
    }

    @Override // yads.ru1
    public final void a() {
        ev1 ev1Var = this.f118836a;
        av1 av1Var = this.f118838c;
        if (av1Var.f108833a && av1Var.f108834b.isActive()) {
            CancellableContinuation cancellableContinuation = av1Var.f108834b;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // yads.ru1
    public final void b() {
        av1 av1Var = this.f118838c;
        if (av1Var.f108833a && av1Var.f108834b.isActive()) {
            CancellableContinuation cancellableContinuation = av1Var.f108834b;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
        }
    }
}
