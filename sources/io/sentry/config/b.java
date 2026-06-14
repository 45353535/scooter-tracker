package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.g7;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f83386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f83387c;

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f83385a = str;
        this.f83386b = io.sentry.util.b.a(classLoader);
        this.f83387c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f83386b.getResourceAsStream(this.f83385a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            this.f83387c.b(g7.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.f83385a);
            return null;
        }
    }

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
