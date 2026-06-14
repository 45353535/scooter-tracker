package kotlin.sequences;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class x extends u {

    public static final class a implements Iterable, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Sequence f93442b;

        public a(Sequence sequence) {
            this.f93442b = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f93442b.iterator();
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f93443b = new b();

        b() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Iterable p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.iterator();
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f93444b = new c();

        c() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Sequence p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.iterator();
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f93445r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f93446s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f93447t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f93448u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f93449v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Sequence f93450w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Function2 f93451x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Sequence sequence, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f93449v = obj;
            this.f93450w = sequence;
            this.f93451x = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f93449v, this.f93450w, this.f93451x, continuation);
            dVar.f93448u = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            if (r1.b(r7, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        
            if (r4.b(r3, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f93447t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.f93446s
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.f93445r
                java.lang.Object r4 = r6.f93448u
                kotlin.sequences.j r4 = (kotlin.sequences.j) r4
                kotlin.d.b(r7)
            L1b:
                r7 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.f93448u
                kotlin.sequences.j r1 = (kotlin.sequences.j) r1
                kotlin.d.b(r7)
                goto L42
            L2d:
                kotlin.d.b(r7)
                java.lang.Object r7 = r6.f93448u
                r1 = r7
                kotlin.sequences.j r1 = (kotlin.sequences.j) r1
                java.lang.Object r7 = r6.f93449v
                r6.f93448u = r1
                r6.f93447t = r3
                java.lang.Object r7 = r1.b(r7, r6)
                if (r7 != r0) goto L42
                goto L6a
            L42:
                java.lang.Object r7 = r6.f93449v
                kotlin.sequences.Sequence r3 = r6.f93450w
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                kotlin.jvm.functions.Function2 r5 = r6.f93451x
                java.lang.Object r3 = r5.invoke(r7, r3)
                r6.f93448u = r4
                r6.f93445r = r3
                r6.f93446s = r1
                r6.f93447t = r2
                java.lang.Object r7 = r4.b(r3, r6)
                if (r7 != r0) goto L1b
            L6a:
                return r0
            L6b:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.x.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j jVar, Continuation continuation) {
            return ((d) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final class e implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence f93452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f93453b;

        e(Sequence sequence, Comparator comparator) {
            this.f93452a = sequence;
            this.f93453b = comparator;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            List listD0 = x.d0(this.f93452a);
            CollectionsKt.sortWith(listD0, this.f93453b);
            return listD0.iterator();
        }
    }

    public static Iterable A(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new a(sequence);
    }

    public static boolean B(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return L(sequence, obj) >= 0;
    }

    public static int C(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    public static Sequence D(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? sequence : sequence instanceof kotlin.sequences.c ? ((kotlin.sequences.c) sequence).a(i10) : new kotlin.sequences.b(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static Sequence E(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.e(sequence, true, predicate);
    }

    public static Sequence F(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.e(sequence, false, predicate);
    }

    public static Sequence G(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence sequenceF = F(sequence, new Function1() { // from class: kotlin.sequences.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.H(obj));
            }
        });
        Intrinsics.checkNotNull(sequenceF, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequenceF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(Object obj) {
        return obj == null;
    }

    public static Object I(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Sequence J(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new f(sequence, transform, c.f93444b);
    }

    public static Sequence K(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new f(sequence, transform, b.f93443b);
    }

    public static final int L(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = 0;
        for (Object obj2 : sequence) {
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable M(Sequence sequence, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : sequence) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String N(Sequence sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) M(sequence, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String O(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return N(sequence, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object P(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Sequence Q(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new b0(sequence, transform);
    }

    public static Sequence R(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return G(new b0(sequence, transform));
    }

    public static Comparable S(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object T(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Sequence U(Sequence sequence, Iterable elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return s.k(s.u(sequence, CollectionsKt.asSequence(elements)));
    }

    public static Sequence V(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return s.k(s.u(sequence, s.u(obj)));
    }

    public static Sequence W(Sequence sequence, Sequence elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return s.k(s.u(sequence, elements));
    }

    public static Sequence X(Sequence sequence, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return l.b(new d(obj, sequence, operation, null));
    }

    public static Sequence Y(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new e(sequence, comparator);
    }

    public static Sequence Z(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? s.j() : sequence instanceof kotlin.sequences.c ? ((kotlin.sequences.c) sequence).b(i10) : new z(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static Sequence a0(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new a0(sequence, predicate);
    }

    public static final Collection b0(Sequence sequence, Collection destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List c0(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List d0(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (List) b0(sequence, new ArrayList());
    }

    public static Set e0(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return SetsKt.emptySet();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return SetsKt.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static Sequence f0(Sequence sequence, Sequence other) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new h(sequence, other, new Function2() { // from class: kotlin.sequences.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x.g0(obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair g0(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }
}
