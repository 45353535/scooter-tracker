package io.sentry.internal.debugmeta;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.util.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f83626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f83627b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        InputStream inputStreamOpenStream;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f83627b.getResources(d.f84295a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    inputStreamOpenStream = urlNextElement.openStream();
                } catch (RuntimeException e10) {
                    this.f83626a.b(g7.ERROR, e10, "%s file is malformed.", urlNextElement);
                }
                try {
                    Properties properties = new Properties();
                    properties.load(inputStreamOpenStream);
                    arrayList.add(properties);
                    this.f83626a.c(g7.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                    if (inputStreamOpenStream != null) {
                        inputStreamOpenStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStreamOpenStream != null) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e11) {
            this.f83626a.b(g7.ERROR, e11, "Failed to load %s", d.f84295a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f83626a.c(g7.INFO, "No %s file was found.", d.f84295a);
        return null;
    }

    c(ILogger iLogger, ClassLoader classLoader) {
        this.f83626a = iLogger;
        this.f83627b = io.sentry.util.b.a(classLoader);
    }
}
