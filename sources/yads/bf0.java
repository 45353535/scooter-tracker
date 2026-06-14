package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class bf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f108984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(kotlinx.coroutines.e eVar) {
        super(0);
        this.f108984b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f108984b.isActive()) {
            CancellableContinuation cancellableContinuation = this.f108984b;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Result.a(Result.b(Unit.f93236a))));
        }
        return Unit.f93236a;
    }
}
