package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class pe1 extends IOException {
    public pe1(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}
