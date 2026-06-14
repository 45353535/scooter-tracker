package io.sentry.internal;

import io.sentry.e7;
import io.sentry.g1;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f83618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.util.a f83619e = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f83620a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1009a f83621b = new C1009a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.util.a f83622c = new io.sentry.util.a();

    /* JADX INFO: renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C1009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile String f83623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile String f83624b;
    }

    private a() {
    }

    public static a a() {
        if (f83618d == null) {
            g1 g1VarD = f83619e.d();
            try {
                if (f83618d == null) {
                    f83618d = new a();
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f83618d;
    }

    public void b() {
        g1 g1VarD;
        if (this.f83620a) {
            return;
        }
        try {
            g1VarD = this.f83622c.d();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.f83620a = true;
            throw th2;
        }
        try {
            if (this.f83620a) {
                if (g1VarD != null) {
                    g1VarD.close();
                }
                this.f83620a = true;
                return;
            }
            Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                try {
                    Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                    if (mainAttributes != null) {
                        String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                        String value2 = mainAttributes.getValue("Implementation-Version");
                        String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                        String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                        if (value != null && value2 != null) {
                            this.f83621b.f83623a = value;
                            this.f83621b.f83624b = value2;
                            String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                            if (value5 != null) {
                                e7.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                e7.d().a("OpenTelemetry");
                            }
                            String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                            if (value6 != null) {
                                e7.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                e7.d().a("OpenTelemetry-Agent");
                            }
                            if (value.equals("sentry.java.opentelemetry.agentless")) {
                                e7.d().a("OpenTelemetry-Agentless");
                            }
                            if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                e7.d().a("OpenTelemetry-Agentless-Spring");
                            }
                        }
                        if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                            e7.d().b(value4, value2);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            this.f83620a = true;
            this.f83620a = true;
        } finally {
        }
    }
}
