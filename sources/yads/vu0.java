package yads;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class vu0 implements pn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f117205a;

    public vu0(kotlinx.coroutines.e eVar) {
        this.f117205a = eVar;
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        this.f117205a.resumeWith(Result.b((byte[]) obj));
    }
}
