package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class CommonMatcher {
    CommonMatcher() {
    }

    public abstract int end();

    public abstract boolean find();

    public abstract boolean find(int i10);

    public abstract boolean matches();

    public abstract String replaceAll(String str);

    public abstract int start();
}
