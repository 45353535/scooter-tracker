package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class Defaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Double f28867a = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Float f28868b = Float.valueOf(0.0f);

    public static <T> T defaultValue(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f28868b;
        }
        if (cls == Double.TYPE) {
            return (T) f28867a;
        }
        return null;
    }
}
