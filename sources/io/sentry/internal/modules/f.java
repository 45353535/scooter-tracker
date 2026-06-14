package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.g7;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f83644e;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        InputStream resourceAsStream;
        TreeMap treeMap = new TreeMap();
        try {
            resourceAsStream = this.f83644e.getResourceAsStream("sentry-external-modules.txt");
        } catch (IOException e10) {
            this.f83640a.a(g7.INFO, "Access to resources failed.", e10);
        } catch (SecurityException e11) {
            this.f83640a.a(g7.INFO, "Access to resources denied.", e11);
        }
        try {
            if (resourceAsStream != null) {
                Map mapC = c(resourceAsStream);
                resourceAsStream.close();
                return mapC;
            }
            this.f83640a.c(g7.INFO, "%s file was not found.", "sentry-external-modules.txt");
            if (resourceAsStream != null) {
                resourceAsStream.close();
                return treeMap;
            }
            return treeMap;
        } catch (Throwable th2) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f83644e = io.sentry.util.b.a(classLoader);
    }
}
