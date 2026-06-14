package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f93409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f93410c;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93412c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f93413d;

        a() {
            this.f93411b = e.this.f93408a.iterator();
        }

        private final void a() {
            while (this.f93411b.hasNext()) {
                Object next = this.f93411b.next();
                if (((Boolean) e.this.f93410c.invoke(next)).booleanValue() == e.this.f93409b) {
                    this.f93413d = next;
                    this.f93412c = 1;
                    return;
                }
            }
            this.f93412c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f93412c == -1) {
                a();
            }
            return this.f93412c == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f93412c == -1) {
                a();
            }
            if (this.f93412c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f93413d;
            this.f93413d = null;
            this.f93412c = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(Sequence sequence, boolean z10, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f93408a = sequence;
        this.f93409b = z10;
        this.f93410c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
