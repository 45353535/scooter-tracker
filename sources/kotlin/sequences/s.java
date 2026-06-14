package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class s extends m {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f93440a;

        public a(Iterator it) {
            this.f93440a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return this.f93440a;
        }
    }

    public static Sequence h(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return i(new a(it));
    }

    public static Sequence i(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof kotlin.sequences.a ? sequence : new kotlin.sequences.a(sequence);
    }

    public static Sequence j() {
        return d.f93407a;
    }

    public static final Sequence k(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return l(sequence, new Function1() { // from class: kotlin.sequences.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.m((Sequence) obj);
            }
        });
    }

    private static final Sequence l(Sequence sequence, Function1 function1) {
        return sequence instanceof b0 ? ((b0) sequence).e(function1) : new f(sequence, new Function1() { // from class: kotlin.sequences.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.o(obj);
            }
        }, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator m(Sequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator n(Iterable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Object obj) {
        return obj;
    }

    public static Sequence p(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return l(sequence, new Function1() { // from class: kotlin.sequences.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.n((Iterable) obj);
            }
        });
    }

    public static Sequence q(final Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? d.f93407a : new g(new Function0() { // from class: kotlin.sequences.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.t(obj);
            }
        }, nextFunction);
    }

    public static Sequence r(final Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return i(new g(nextFunction, new Function1() { // from class: kotlin.sequences.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.s(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t(Object obj) {
        return obj;
    }

    public static Sequence u(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt.asSequence(elements);
    }
}
