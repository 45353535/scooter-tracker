package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f93422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f93423b;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f93424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93425c = -2;

        a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f93425c == -2) {
                objInvoke = g.this.f93422a.invoke();
            } else {
                Function1 function1 = g.this.f93423b;
                Object obj = this.f93424b;
                Intrinsics.checkNotNull(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f93424b = objInvoke;
            this.f93425c = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f93425c < 0) {
                a();
            }
            return this.f93425c == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f93425c < 0) {
                a();
            }
            if (this.f93425c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f93424b;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f93425c = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f93422a = getInitialValue;
        this.f93423b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
