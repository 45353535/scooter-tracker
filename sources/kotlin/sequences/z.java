package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93461b;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f93462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator f93463c;

        a(z zVar) {
            this.f93462b = zVar.f93461b;
            this.f93463c = zVar.f93460a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f93462b > 0 && this.f93463c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f93462b;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f93462b = i10 - 1;
            return this.f93463c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f93460a = sequence;
        this.f93461b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public Sequence a(int i10) {
        int i11 = this.f93461b;
        return i10 >= i11 ? s.j() : new y(this.f93460a, i10, i11);
    }

    @Override // kotlin.sequences.c
    public Sequence b(int i10) {
        return i10 >= this.f93461b ? this : new z(this.f93460a, i10);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
