package yads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class wk2 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f117505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk2(kotlinx.coroutines.e eVar) {
        super(1);
        this.f117505b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws oj3 {
        oj3 oj3Var = (oj3) obj;
        if (oj3Var.getCause() instanceof ug.m) {
            throw oj3Var;
        }
        CancellableContinuation cancellableContinuation = this.f117505b;
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(Result.a(Result.b(kotlin.d.a(oj3Var)))));
        return Unit.f93236a;
    }
}
