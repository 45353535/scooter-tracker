package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f30514a = new ThreadLocal<char[]>() { // from class: com.google.common.escape.Platform.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    static char[] a() {
        char[] cArr = (char[]) f30514a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
