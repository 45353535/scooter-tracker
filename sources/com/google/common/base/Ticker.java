package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Ticker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Ticker f28985a = new Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        public long read() {
            return System.nanoTime();
        }
    };

    protected Ticker() {
    }

    public static Ticker systemTicker() {
        return f28985a;
    }

    public abstract long read();
}
