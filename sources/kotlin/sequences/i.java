package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class i extends j implements Iterator, Continuation, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f93433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f93434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Iterator f93435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Continuation f93436e;

    private final Throwable e() {
        int i10 = this.f93433b;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f93433b);
    }

    private final Object f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.j
    public Object b(Object obj, Continuation continuation) {
        this.f93434c = obj;
        this.f93433b = 3;
        this.f93436e = continuation;
        Object objG = pf.b.g();
        if (objG == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // kotlin.sequences.j
    public Object c(Iterator it, Continuation continuation) {
        if (!it.hasNext()) {
            return Unit.f93236a;
        }
        this.f93435d = it;
        this.f93433b = 2;
        this.f93436e = continuation;
        Object objG = pf.b.g();
        if (objG == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final void g(Continuation continuation) {
        this.f93436e = continuation;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f93267b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f93433b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator it = this.f93435d;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f93433b = 2;
                    return true;
                }
                this.f93435d = null;
            }
            this.f93433b = 5;
            Continuation continuation = this.f93436e;
            Intrinsics.checkNotNull(continuation);
            this.f93436e = null;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f93433b;
        if (i10 == 0 || i10 == 1) {
            return f();
        }
        if (i10 == 2) {
            this.f93433b = 1;
            Iterator it = this.f93435d;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i10 != 3) {
            throw e();
        }
        this.f93433b = 0;
        Object obj = this.f93434c;
        this.f93434c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        kotlin.d.b(obj);
        this.f93433b = 4;
    }
}
