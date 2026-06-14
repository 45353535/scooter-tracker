package kotlin.jvm.internal;

import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final BooleanIterator a(boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new b(array);
    }

    public static final ByteIterator b(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new c(array);
    }

    public static final CharIterator c(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new d(array);
    }

    public static final DoubleIterator d(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new e(array);
    }

    public static final FloatIterator e(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new f(array);
    }

    public static final IntIterator f(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new g(array);
    }

    public static final LongIterator g(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new k(array);
    }

    public static final ShortIterator h(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new l(array);
    }
}
