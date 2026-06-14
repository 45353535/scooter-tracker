package eg;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f69127b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred[] f69128a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    private final class a extends b1 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f69129i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final CancellableContinuation f69130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p0 f69131g;

        public a(CancellableContinuation cancellableContinuation) {
            this.f69130f = cancellableContinuation;
        }

        public final void A(b bVar) {
            f69129i.set(this, bVar);
        }

        public final void B(p0 p0Var) {
            this.f69131g = p0Var;
        }

        @Override // eg.b1
        public boolean u() {
            return false;
        }

        @Override // eg.b1
        public void v(Throwable th2) {
            if (th2 != null) {
                Object objX = this.f69130f.x(th2);
                if (objX != null) {
                    this.f69130f.u(objX);
                    b bVarX = x();
                    if (bVarX != null) {
                        bVarX.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c.d().decrementAndGet(c.this) == 0) {
                CancellableContinuation cancellableContinuation = this.f69130f;
                Deferred[] deferredArr = c.this.f69128a;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.o());
                }
                cancellableContinuation.resumeWith(Result.b(arrayList));
            }
        }

        public final b x() {
            return (b) f69129i.get(this);
        }

        public final p0 y() {
            p0 p0Var = this.f69131g;
            if (p0Var != null) {
                return p0Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }
    }

    private final class b implements kotlinx.coroutines.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a[] f69133b;

        public b(a[] aVarArr) {
            this.f69133b = aVarArr;
        }

        @Override // kotlinx.coroutines.d
        public void a(Throwable th2) {
            b();
        }

        public final void b() {
            for (a aVar : this.f69133b) {
                aVar.y().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f69133b + ']';
        }
    }

    public c(Deferred[] deferredArr) {
        this.f69128a = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f69127b;
    }

    public final Object c(Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        int length = this.f69128a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            Deferred deferred = this.f69128a[i10];
            deferred.start();
            a aVar = new a(eVar);
            aVar.B(kotlinx.coroutines.a0.q(deferred, false, aVar, 1, null));
            Unit unit = Unit.f93236a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].A(bVar);
        }
        if (eVar.n()) {
            bVar.b();
        } else {
            l.c(eVar, bVar);
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }
}
