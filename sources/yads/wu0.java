package yads;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class wu0 implements on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f117593a;

    public wu0(kotlinx.coroutines.e eVar) {
        this.f117593a = eVar;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        boolean z10 = lb1.f113032a;
        this.f117593a.resumeWith(Result.b(null));
    }
}
