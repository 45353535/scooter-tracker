package io.sentry.android.core.cache;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.performance.i;
import io.sentry.cache.f;
import io.sentry.g7;
import io.sentry.i0;
import io.sentry.transport.p;
import io.sentry.u5;
import io.sentry.util.m;
import io.sentry.util.runtime.a;
import io.sentry.util.w;
import io.sentry.v7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p f82396k;

    public d(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, h.a());
    }

    public static /* synthetic */ void H(d dVar, SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar) {
        dVar.getClass();
        Long lB = bVar.b();
        sentryAndroidOptions.getLogger().c(g7.DEBUG, "Writing last reported ANR marker with timestamp %d", lB);
        dVar.M(lB);
    }

    public static boolean J(v7 v7Var) {
        String outboxPath = v7Var.getOutboxPath();
        if (outboxPath == null) {
            v7Var.getLogger().c(g7.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        final File file = new File(outboxPath, "startup_crash");
        try {
            boolean zBooleanValue = ((Boolean) v7Var.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.cache.a
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return Boolean.valueOf(file.exists());
                }
            })).booleanValue();
            if (!zBooleanValue || ((Boolean) v7Var.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.cache.b
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return Boolean.valueOf(file.delete());
                }
            })).booleanValue()) {
                return zBooleanValue;
            }
            v7Var.getLogger().c(g7.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zBooleanValue;
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    public static Long K(v7 v7Var) {
        File file = new File((String) w.c(v7Var.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
            String strC = io.sentry.util.h.c(file);
            if (strC.equals("null")) {
                return null;
            }
            return Long.valueOf(Long.parseLong(strC.trim()));
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                v7Var.getLogger().c(g7.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
            } else {
                v7Var.getLogger().a(g7.ERROR, "Error reading last ANR marker", th2);
            }
            return null;
        }
    }

    private boolean L(u5 u5Var, i0 i0Var) {
        boolean zH = super.h(u5Var, i0Var);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f83314b;
        i iVarQ = io.sentry.android.core.performance.h.p().q();
        if (m.h(i0Var, UncaughtExceptionHandlerIntegration.a.class) && iVarQ.m()) {
            long currentTimeMillis = this.f82396k.getCurrentTimeMillis() - iVarQ.j();
            if (currentTimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(g7.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(currentTimeMillis));
                N();
            }
        }
        m.k(i0Var, AnrV2Integration.b.class, new m.a() { // from class: io.sentry.android.core.cache.c
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                d.H(this.f82394a, sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
        return zH;
    }

    private void M(Long l10) {
        String cacheDirPath = this.f83314b.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f83314b.getLogger().c(g7.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(f83313f));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().a(g7.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }

    private void N() {
        String outboxPath = this.f83314b.getOutboxPath();
        if (outboxPath == null) {
            this.f83314b.getLogger().c(g7.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th2) {
            this.f83314b.getLogger().a(g7.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean h(u5 u5Var, i0 i0Var) {
        return L(u5Var, i0Var);
    }

    d(SentryAndroidOptions sentryAndroidOptions, p pVar) {
        super(sentryAndroidOptions, (String) w.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f82396k = pVar;
    }
}
