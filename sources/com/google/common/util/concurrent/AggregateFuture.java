package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final LazyLogger f31332p = new LazyLogger(AggregateFuture.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImmutableCollection f31333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f31334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f31335o;

    enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    AggregateFuture(ImmutableCollection immutableCollection, boolean z10, boolean z11) {
        super(immutableCollection.size());
        this.f31333m = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.f31334n = z10;
        this.f31335o = z11;
    }

    private static boolean M(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    private void O(int i10, Future future) {
        try {
            N(i10, Uninterruptibles.getUninterruptibly(future));
        } catch (ExecutionException e10) {
            R(e10.getCause());
        } catch (Throwable th2) {
            R(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(ImmutableCollection immutableCollection) {
        int I = I();
        Preconditions.checkState(I >= 0, "Less than 0 remaining futures");
        if (I == 0) {
            V(immutableCollection);
        }
    }

    private void R(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (this.f31334n && !setException(th2) && M(J(), th2)) {
            T(th2);
        } else if (th2 instanceof Error) {
            T(th2);
        }
    }

    private static void T(Throwable th2) {
        f31332p.a().log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i10, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f31333m = null;
                cancel(false);
            } else {
                O(i10, listenableFuture);
            }
            P(null);
        } catch (Throwable th2) {
            P(null);
            throw th2;
        }
    }

    private void V(ImmutableCollection immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator it = immutableCollection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future future = (Future) it.next();
                if (!future.isCancelled()) {
                    O(i10, future);
                }
                i10++;
            }
        }
        H();
        Q();
        W(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    final void G(Set set) {
        Preconditions.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        Objects.requireNonNull(thA);
        M(set, thA);
    }

    abstract void N(int i10, Object obj);

    abstract void Q();

    final void S() {
        Objects.requireNonNull(this.f31333m);
        if (this.f31333m.isEmpty()) {
            Q();
            return;
        }
        if (!this.f31334n) {
            final ImmutableCollection immutableCollection = this.f31335o ? this.f31333m : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31650b.P(immutableCollection);
                }
            };
            UnmodifiableIterator it = this.f31333m.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    P(immutableCollection);
                } else {
                    listenableFuture.addListener(runnable, MoreExecutors.directExecutor());
                }
            }
            return;
        }
        UnmodifiableIterator it2 = this.f31333m.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i11 = i10 + 1;
            if (listenableFuture2.isDone()) {
                U(i10, listenableFuture2);
            } else {
                listenableFuture2.addListener(new Runnable() { // from class: com.google.common.util.concurrent.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31647b.U(i10, listenableFuture2);
                    }
                }, MoreExecutors.directExecutor());
            }
            i10 = i11;
        }
    }

    void W(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.f31333m = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void n() {
        super.n();
        ImmutableCollection immutableCollection = this.f31333m;
        W(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zC = C();
            UnmodifiableIterator it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zC);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final String z() {
        ImmutableCollection immutableCollection = this.f31333m;
        if (immutableCollection == null) {
            return super.z();
        }
        return "futures=" + immutableCollection;
    }
}
