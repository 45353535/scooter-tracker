package kotlinx.coroutines;

import eg.b1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
final class f0 extends b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Continuation f93612f;

    public f0(Continuation continuation) {
        this.f93612f = continuation;
    }

    @Override // eg.b1
    public boolean u() {
        return false;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        Continuation continuation = this.f93612f;
        Result.Companion companion = Result.f93230c;
        continuation.resumeWith(Result.b(Unit.f93236a));
    }
}
