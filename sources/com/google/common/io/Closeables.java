package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Closeables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f30914a = Logger.getLogger(Closeables.class.getName());

    public static void close(Closeable closeable, boolean z10) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f30914a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void closeQuietly(Reader reader) {
        try {
            close(reader, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
