package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sequence f93428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f93429c;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator f93431c;

        a() {
            this.f93430b = h.this.f93427a.iterator();
            this.f93431c = h.this.f93428b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f93430b.hasNext() && this.f93431c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return h.this.f93429c.invoke(this.f93430b.next(), this.f93431c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(Sequence sequence1, Sequence sequence2, Function2 transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f93427a = sequence1;
        this.f93428b = sequence2;
        this.f93429c = transform;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
