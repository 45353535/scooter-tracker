package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f93481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f93483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f93484d;

    public static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f93485b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f93487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IntRange f93488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f93489f;

        a() {
            int iN = kotlin.ranges.g.n(b.this.f93482b, 0, b.this.f93481a.length());
            this.f93486c = iN;
            this.f93487d = iN;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f93487d
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f93485b = r1
                r0 = 0
                r6.f93488e = r0
                return
            Lb:
                kotlin.text.b r0 = kotlin.text.b.this
                int r0 = kotlin.text.b.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f93489f
                int r0 = r0 + r3
                r6.f93489f = r0
                kotlin.text.b r4 = kotlin.text.b.this
                int r4 = kotlin.text.b.e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f93487d
                kotlin.text.b r4 = kotlin.text.b.this
                java.lang.CharSequence r4 = kotlin.text.b.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f93486c
                kotlin.text.b r4 = kotlin.text.b.this
                java.lang.CharSequence r4 = kotlin.text.b.d(r4)
                int r4 = kotlin.text.StringsKt__StringsKt.p0(r4)
                r0.<init>(r1, r4)
                r6.f93488e = r0
                r6.f93487d = r2
                goto L9b
            L46:
                kotlin.text.b r0 = kotlin.text.b.this
                kotlin.jvm.functions.Function2 r0 = kotlin.text.b.c(r0)
                kotlin.text.b r4 = kotlin.text.b.this
                java.lang.CharSequence r4 = kotlin.text.b.d(r4)
                int r5 = r6.f93487d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f93486c
                kotlin.text.b r4 = kotlin.text.b.this
                java.lang.CharSequence r4 = kotlin.text.b.d(r4)
                int r4 = kotlin.text.StringsKt__StringsKt.p0(r4)
                r0.<init>(r1, r4)
                r6.f93488e = r0
                r6.f93487d = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f93486c
                kotlin.ranges.IntRange r4 = kotlin.ranges.g.v(r4, r2)
                r6.f93488e = r4
                int r2 = r2 + r0
                r6.f93486c = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f93487d = r2
            L9b:
                r6.f93485b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.a.a():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f93485b == -1) {
                a();
            }
            if (this.f93485b == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f93488e;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f93488e = null;
            this.f93485b = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f93485b == -1) {
                a();
            }
            return this.f93485b == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f93481a = input;
        this.f93482b = i10;
        this.f93483c = i11;
        this.f93484d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
