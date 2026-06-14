package hg;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class m0 extends ig.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f73274a = new AtomicReference(null);

    @Override // ig.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(k0 k0Var) {
        if (jg.d.a(this.f73274a) != null) {
            return false;
        }
        jg.d.b(this.f73274a, l0.f73272a);
        return true;
    }

    public final Object e(Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        if (!androidx.compose.animation.core.c.a(this.f73274a, l0.f73272a, eVar)) {
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // ig.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation[] b(k0 k0Var) {
        jg.d.b(this.f73274a, null);
        return ig.c.f74753a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f73274a;
        while (true) {
            Object objA = jg.d.a(atomicReference);
            if (objA == null || objA == l0.f73273b) {
                return;
            }
            if (objA == l0.f73272a) {
                if (androidx.compose.animation.core.c.a(this.f73274a, objA, l0.f73273b)) {
                    return;
                }
            } else if (androidx.compose.animation.core.c.a(this.f73274a, objA, l0.f73272a)) {
                Result.Companion companion = Result.f93230c;
                ((kotlinx.coroutines.e) objA).resumeWith(Result.b(Unit.f93236a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f73274a.getAndSet(l0.f73272a);
        Intrinsics.checkNotNull(andSet);
        return andSet == l0.f73273b;
    }
}
