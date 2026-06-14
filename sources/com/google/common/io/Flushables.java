package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Flushables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f30937a = Logger.getLogger(Flushables.class.getName());

    public static void flush(Flushable flushable, boolean z10) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f30937a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e10);
        }
    }

    @Beta
    public static void flushQuietly(Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (IOException e10) {
            f30937a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e10);
        }
    }
}
