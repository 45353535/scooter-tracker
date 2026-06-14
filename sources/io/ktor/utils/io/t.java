package io.ktor.utils.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class t extends IOException {
    public t(Throwable th2) {
        super(th2 != null ? th2.getMessage() : null, th2);
    }
}
