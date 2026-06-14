package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class t42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f116050a;

    public t42(kotlinx.coroutines.e eVar) {
        this.f116050a = eVar;
    }

    public final void a() {
        CancellableContinuation cancellableContinuation = this.f116050a;
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
    }
}
