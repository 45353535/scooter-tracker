package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ValueHolder f28907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ValueHolder f28908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f28910e;

        private static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
            }
        }

        static class ValueHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f28911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f28912b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            ValueHolder f28913c;

            ValueHolder() {
            }
        }

        private ValueHolder a() {
            ValueHolder valueHolder = new ValueHolder();
            this.f28908c.f28913c = valueHolder;
            this.f28908c = valueHolder;
            return valueHolder;
        }

        private ToStringHelper b(Object obj) {
            a().f28912b = obj;
            return this;
        }

        private ToStringHelper c(String str, Object obj) {
            ValueHolder valueHolderA = a();
            valueHolderA.f28912b = obj;
            valueHolderA.f28911a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        private UnconditionalValueHolder d() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.f28908c.f28913c = unconditionalValueHolder;
            this.f28908c = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        private ToStringHelper e(Object obj) {
            d().f28912b = obj;
            return this;
        }

        private ToStringHelper f(String str, Object obj) {
            UnconditionalValueHolder unconditionalValueHolderD = d();
            unconditionalValueHolderD.f28912b = obj;
            unconditionalValueHolderD.f28911a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        private static boolean g(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Optional ? !((Optional) obj).isPresent() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, Object obj) {
            return c(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(Object obj) {
            return b(obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.f28909d = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f28909d
                boolean r2 = r8.f28910e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.f28906a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r4 = r8.f28907b
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r4 = r4.f28913c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L66
                java.lang.Object r6 = r4.f28912b
                boolean r7 = r4 instanceof com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder
                if (r7 != 0) goto L31
                if (r6 != 0) goto L29
                if (r1 != 0) goto L63
                goto L31
            L29:
                if (r2 == 0) goto L31
                boolean r7 = g(r6)
                if (r7 != 0) goto L63
            L31:
                r3.append(r5)
                java.lang.String r5 = r4.f28911a
                if (r5 == 0) goto L40
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L40:
                if (r6 == 0) goto L5e
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5e
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L61
            L5e:
                r3.append(r6)
            L61:
                java.lang.String r5 = ", "
            L63:
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r4 = r4.f28913c
                goto L1c
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.MoreObjects.ToStringHelper.toString():java.lang.String");
        }

        private ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f28907b = valueHolder;
            this.f28908c = valueHolder;
            this.f28909d = false;
            this.f28910e = false;
            this.f28906a = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z10) {
            return f(str, String.valueOf(z10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z10) {
            return e(String.valueOf(z10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c10) {
            return f(str, String.valueOf(c10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c10) {
            return e(String.valueOf(c10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d10) {
            return f(str, String.valueOf(d10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d10) {
            return e(String.valueOf(d10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f10) {
            return f(str, String.valueOf(f10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f10) {
            return e(String.valueOf(f10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i10) {
            return f(str, String.valueOf(i10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i10) {
            return e(String.valueOf(i10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j10) {
            return f(str, String.valueOf(j10));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j10) {
            return e(String.valueOf(j10));
        }
    }

    public static <T> T firstNonNull(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
