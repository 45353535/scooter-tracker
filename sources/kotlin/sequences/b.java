package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93400b;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93402c;

        a(b bVar) {
            this.f93401b = bVar.f93399a.iterator();
            this.f93402c = bVar.f93400b;
        }

        private final void a() {
            while (this.f93402c > 0 && this.f93401b.hasNext()) {
                this.f93401b.next();
                this.f93402c--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f93401b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f93401b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f93399a = sequence;
        this.f93400b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public Sequence a(int i10) {
        int i11 = this.f93400b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f93399a, i11);
    }

    @Override // kotlin.sequences.c
    public Sequence b(int i10) {
        int i11 = this.f93400b;
        int i12 = i11 + i10;
        return i12 < 0 ? new z(this, i10) : new y(this.f93399a, i11, i12);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
