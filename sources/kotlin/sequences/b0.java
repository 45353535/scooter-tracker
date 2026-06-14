package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f93404b;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93405b;

        a() {
            this.f93405b = b0.this.f93403a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f93405b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return b0.this.f93404b.invoke(this.f93405b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b0(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f93403a = sequence;
        this.f93404b = transformer;
    }

    public final Sequence e(Function1 iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new f(this.f93403a, this.f93404b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
