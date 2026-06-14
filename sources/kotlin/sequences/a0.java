package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f93394b;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93396c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f93397d;

        a() {
            this.f93395b = a0.this.f93393a.iterator();
        }

        private final void a() {
            if (this.f93395b.hasNext()) {
                Object next = this.f93395b.next();
                if (((Boolean) a0.this.f93394b.invoke(next)).booleanValue()) {
                    this.f93396c = 1;
                    this.f93397d = next;
                    return;
                }
            }
            this.f93396c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f93396c == -1) {
                a();
            }
            return this.f93396c == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f93396c == -1) {
                a();
            }
            if (this.f93396c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f93397d;
            this.f93397d = null;
            this.f93396c = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a0(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f93393a = sequence;
        this.f93394b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
