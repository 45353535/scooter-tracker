package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.g7;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f83390b;

    public e(String str, ILogger iLogger) {
        this.f83389a = str;
        this.f83390b = iLogger;
    }

    public Properties a() {
        try {
            File file = new File(this.f83389a.trim());
            if (!file.isFile() || !file.canRead()) {
                if (!file.isFile()) {
                    this.f83390b.c(g7.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.f83389a);
                } else if (!file.canRead()) {
                    this.f83390b.c(g7.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.f83389a);
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } finally {
            }
        } catch (Throwable th2) {
            this.f83390b.b(g7.ERROR, th2, "Failed to load Sentry configuration from file: %s", this.f83389a);
            return null;
        }
    }
}
