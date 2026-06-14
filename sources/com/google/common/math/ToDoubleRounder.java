package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class ToDoubleRounder<X extends Number & Comparable<X>> {

    /* JADX INFO: renamed from: com.google.common.math.ToDoubleRounder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31021a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f31021a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31021a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31021a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31021a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31021a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31021a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31021a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31021a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    ToDoubleRounder() {
    }

    abstract Number a(Number number, Number number2);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final double b(java.lang.Number r14, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.ToDoubleRounder.b(java.lang.Number, java.math.RoundingMode):double");
    }

    abstract double c(Number number);

    abstract int d(Number number);

    abstract Number e(double d10, RoundingMode roundingMode);
}
