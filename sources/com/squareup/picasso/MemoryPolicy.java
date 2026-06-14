package com.squareup.picasso;

/* JADX INFO: loaded from: classes11.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    MemoryPolicy(int i10) {
        this.index = i10;
    }

    static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
