package com.bytedance.adsdk.qdl.ud.mzz.qdl;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static boolean qdl(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i10 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i10) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean qdl(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j10 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j10 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean qdl(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean qdl(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d10 == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static boolean qdl(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return qdl(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return qdl(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return qdl(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return qdl(number.intValue(), number2);
    }
}
