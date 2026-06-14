package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class CommonPattern {
    CommonPattern() {
    }

    public static CommonPattern compile(String str) {
        return Platform.a(str);
    }

    public static boolean isPcreLike() {
        return Platform.g();
    }

    public abstract int flags();

    public abstract CommonMatcher matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
