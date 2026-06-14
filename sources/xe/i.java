package xe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f108195a = c.f108177b.d(z.f106771b.a(), new Function1() { // from class: xe.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Integer.valueOf(i.c((z) obj));
        }
    }, new Function2() { // from class: xe.h
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Character.valueOf(i.d((z) obj, ((Integer) obj2).intValue()));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long[] f108196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f108197c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r6
  0x0056: PHI (r6v2 long) = (r6v1 long), (r6v0 long) binds: [B:18:0x0064, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            xe.c$a r0 = xe.c.f108177b
            ve.z$a r1 = ve.z.f106771b
            java.util.List r1 = r1.a()
            xe.g r2 = new xe.g
            r2.<init>()
            xe.h r3 = new xe.h
            r3.<init>()
            xe.c r0 = r0.d(r1, r2, r3)
            xe.i.f108195a = r0
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            r0.<init>(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L71
            r4 = r0
            kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4
            int r4 = r4.nextInt()
            r5 = 48
            if (r5 > r4) goto L49
            r5 = 58
            if (r4 >= r5) goto L49
            long r4 = (long) r4
            r6 = 48
            long r4 = r4 - r6
            goto L69
        L49:
            long r4 = (long) r4
            r6 = 97
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L5a
            r8 = 102(0x66, double:5.04E-322)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L5a
        L56:
            long r4 = r4 - r6
            long r6 = (long) r3
            long r4 = r4 + r6
            goto L69
        L5a:
            r6 = 65
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L67
            r8 = 70
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L67
            goto L56
        L67:
            r4 = -1
        L69:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
            goto L2f
        L71:
            long[] r0 = kotlin.collections.CollectionsKt.toLongArray(r1)
            xe.i.f108196b = r0
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 15
            r0.<init>(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lac
            r2 = r0
            kotlin.collections.IntIterator r2 = (kotlin.collections.IntIterator) r2
            int r2 = r2.nextInt()
            if (r2 >= r3) goto L9e
            int r2 = r2 + 48
        L9c:
            byte r2 = (byte) r2
            goto La4
        L9e:
            int r2 = r2 + 97
            char r2 = (char) r2
            int r2 = r2 - r3
            char r2 = (char) r2
            goto L9c
        La4:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r1.add(r2)
            goto L8b
        Lac:
            byte[] r0 = kotlin.collections.CollectionsKt.toByteArray(r1)
            xe.i.f108197c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.i.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.f().length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char d(z m10, int i10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return m10.f().charAt(i10);
    }

    public static final boolean e(CharSequence charSequence, int i10, int i11, CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 - i10 != other.length()) {
            return false;
        }
        for (int i12 = i10; i12 < i11; i12++) {
            int iCharAt = charSequence.charAt(i12);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = other.charAt(i12 - i10);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public static final int f(CharSequence charSequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i12 = 0;
        while (i10 < i11) {
            int iCharAt = charSequence.charAt(i10);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i12 = (i12 * 31) + iCharAt;
            i10++;
        }
        return i12;
    }

    public static /* synthetic */ int g(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        return f(charSequence, i10, i11);
    }

    private static final void h(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }

    private static final void i(CharSequence charSequence, int i10) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i10) + " at position " + i10);
    }

    public static final long j(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 19) {
            h(charSequence);
        }
        if (length == 19) {
            return k(charSequence);
        }
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                i(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
        }
        return j10;
    }

    private static final long k(CharSequence charSequence) {
        int length = charSequence.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                i(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
            if (j10 < 0) {
                h(charSequence);
            }
        }
        return j10;
    }
}
