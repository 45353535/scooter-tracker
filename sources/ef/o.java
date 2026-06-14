package ef;

import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f69117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Continuation f69118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f69119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Continuation[] f69120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69122h;

    public static final class a implements Continuation, CoroutineStackFrame {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69123b = Integer.MIN_VALUE;

        a() {
        }

        private final Continuation b() {
            if (this.f69123b == Integer.MIN_VALUE) {
                this.f69123b = o.this.f69121g;
            }
            if (this.f69123b < 0) {
                this.f69123b = Integer.MIN_VALUE;
                return null;
            }
            try {
                Continuation[] continuationArr = o.this.f69120f;
                int i10 = this.f69123b;
                Continuation continuation = continuationArr[i10];
                if (continuation == null) {
                    return n.f69116b;
                }
                this.f69123b = i10 - 1;
                return continuation;
            } catch (Throwable unused) {
                return n.f69116b;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            Continuation continuationB = b();
            if (continuationB instanceof CoroutineStackFrame) {
                return (CoroutineStackFrame) continuationB;
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            Continuation continuation = o.this.f69120f[o.this.f69121g];
            if (continuation != this && continuation != null) {
                return continuation.getContext();
            }
            int i10 = o.this.f69121g - 1;
            while (i10 >= 0) {
                int i11 = i10 - 1;
                Continuation continuation2 = o.this.f69120f[i10];
                if (continuation2 != this && continuation2 != null) {
                    return continuation2.getContext();
                }
                i10 = i11;
            }
            throw new IllegalStateException("Not started");
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            if (!Result.i(obj)) {
                o.this.n(false);
                return;
            }
            o oVar = o.this;
            Throwable thG = Result.g(obj);
            Intrinsics.checkNotNull(thG);
            oVar.o(Result.b(kotlin.d.a(thG)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object initial, Object context, List blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f69117c = blocks;
        this.f69118d = new a();
        this.f69119e = initial;
        this.f69120f = new Continuation[blocks.size()];
        this.f69121g = -1;
    }

    private final void l() {
        int i10 = this.f69121g;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation[] continuationArr = this.f69120f;
        this.f69121g = i10 - 1;
        continuationArr[i10] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(boolean z10) {
        int i10;
        do {
            i10 = this.f69122h;
            if (i10 == this.f69117c.size()) {
                if (z10) {
                    return true;
                }
                Result.Companion companion = Result.f93230c;
                o(Result.b(c()));
                return false;
            }
            this.f69122h = i10 + 1;
            try {
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                o(Result.b(kotlin.d.a(th2)));
                return false;
            }
        } while (h.a((Function3) this.f69117c.get(i10), this, c(), this.f69118d) != pf.b.g());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Object obj) {
        int i10 = this.f69121g;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation continuation = this.f69120f[i10];
        Intrinsics.checkNotNull(continuation);
        Continuation[] continuationArr = this.f69120f;
        int i11 = this.f69121g;
        this.f69121g = i11 - 1;
        continuationArr[i11] = null;
        if (!Result.i(obj)) {
            continuation.resumeWith(obj);
            return;
        }
        Throwable thG = Result.g(obj);
        Intrinsics.checkNotNull(thG);
        continuation.resumeWith(Result.b(kotlin.d.a(l.a(thG, continuation))));
    }

    @Override // ef.e
    public Object a(Object obj, Continuation continuation) {
        this.f69122h = 0;
        if (this.f69117c.size() == 0) {
            return obj;
        }
        q(obj);
        if (this.f69121g < 0) {
            return d(continuation);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // ef.e
    public Object c() {
        return this.f69119e;
    }

    @Override // ef.e
    public Object d(Continuation continuation) {
        Object objG;
        if (this.f69122h == this.f69117c.size()) {
            objG = c();
        } else {
            k(pf.b.d(continuation));
            if (n(true)) {
                l();
                objG = c();
            } else {
                objG = pf.b.g();
            }
        }
        if (objG == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objG;
    }

    @Override // ef.e
    public Object e(Object obj, Continuation continuation) {
        q(obj);
        return d(continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f69118d.getContext();
    }

    public final void k(Continuation continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Continuation[] continuationArr = this.f69120f;
        int i10 = this.f69121g + 1;
        this.f69121g = i10;
        continuationArr[i10] = continuation;
    }

    public void q(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f69119e = obj;
    }
}
