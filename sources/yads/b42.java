package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class b42 implements za3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f108907a;

    public b42(kotlinx.coroutines.e eVar) {
        this.f108907a = eVar;
    }

    @Override // yads.za3
    public final void a() {
        CancellableContinuation cancellableContinuation = this.f108907a;
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
    }
}
