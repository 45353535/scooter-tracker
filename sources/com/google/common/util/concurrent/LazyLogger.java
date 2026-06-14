package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class LazyLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31507a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f31509c;

    LazyLogger(Class cls) {
        this.f31508b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f31509c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f31507a) {
            try {
                Logger logger2 = this.f31509c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f31508b);
                this.f31509c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
