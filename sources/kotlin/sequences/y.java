package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f93456c;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93458c;

        a() {
            this.f93457b = y.this.f93454a.iterator();
        }

        private final void a() {
            while (this.f93458c < y.this.f93455b && this.f93457b.hasNext()) {
                this.f93457b.next();
                this.f93458c++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f93458c < y.this.f93456c && this.f93457b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (this.f93458c >= y.this.f93456c) {
                throw new NoSuchElementException();
            }
            this.f93458c++;
            return this.f93457b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(Sequence sequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f93454a = sequence;
        this.f93455b = i10;
        this.f93456c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f93456c - this.f93455b;
    }

    @Override // kotlin.sequences.c
    public Sequence a(int i10) {
        return i10 >= f() ? s.j() : new y(this.f93454a, this.f93455b + i10, this.f93456c);
    }

    @Override // kotlin.sequences.c
    public Sequence b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        Sequence sequence = this.f93454a;
        int i11 = this.f93455b;
        return new y(sequence, i11, i10 + i11);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
