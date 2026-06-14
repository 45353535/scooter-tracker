package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f93415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f93416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f93417c;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f93418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f93419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f93420d;

        a() {
            this.f93418b = f.this.f93415a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f93419c;
            if (it != null && it.hasNext()) {
                this.f93420d = 1;
                return true;
            }
            while (this.f93418b.hasNext()) {
                Iterator it2 = (Iterator) f.this.f93417c.invoke(f.this.f93416b.invoke(this.f93418b.next()));
                if (it2.hasNext()) {
                    this.f93419c = it2;
                    this.f93420d = 1;
                    return true;
                }
            }
            this.f93420d = 2;
            this.f93419c = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f93420d;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f93420d;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f93420d = 0;
            Iterator it = this.f93419c;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f93415a = sequence;
        this.f93416b = transformer;
        this.f93417c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
