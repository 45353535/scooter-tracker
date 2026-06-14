package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC5672b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C f85060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f85061k;

    public J(C c10, boolean z10, AbstractC5667a abstractC5667a, Spliterator spliterator) {
        super(abstractC5667a, spliterator);
        this.f85061k = z10;
        this.f85060j = c10;
    }

    public J(J j10, Spliterator spliterator) {
        super(j10, spliterator);
        this.f85061k = j10.f85061k;
        this.f85060j = j10.f85060j;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        return new J(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5672b
    public final Object h() {
        return this.f85060j.f84998b;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final Object a() {
        AbstractC5667a abstractC5667a = this.f85241a;
        H3 h32 = (H3) this.f85060j.f85000d.get();
        abstractC5667a.O(this.f85242b, h32);
        Object obj = h32.get();
        if (this.f85061k) {
            if (obj != null) {
                AbstractC5682d abstractC5682d = this;
                while (abstractC5682d != null) {
                    AbstractC5682d abstractC5682d2 = (AbstractC5682d) abstractC5682d.getCompleter();
                    if (abstractC5682d2 != null && abstractC5682d2.f85244d != abstractC5682d) {
                        g();
                        return obj;
                    }
                    abstractC5682d = abstractC5682d2;
                }
                AtomicReference atomicReference = this.f85220h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f85220h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f85061k) {
            J j10 = (J) this.f85244d;
            J j11 = null;
            while (true) {
                if (j10 != j11) {
                    Object objI = j10.i();
                    if (objI != null && this.f85060j.f84999c.test(objI)) {
                        d(objI);
                        AbstractC5682d abstractC5682d = this;
                        while (true) {
                            if (abstractC5682d != null) {
                                AbstractC5682d abstractC5682d2 = (AbstractC5682d) abstractC5682d.getCompleter();
                                if (abstractC5682d2 != null && abstractC5682d2.f85244d != abstractC5682d) {
                                    g();
                                    break;
                                }
                                abstractC5682d = abstractC5682d2;
                            } else {
                                AtomicReference atomicReference = this.f85220h;
                                while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        j11 = j10;
                        j10 = (J) this.f85245e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
