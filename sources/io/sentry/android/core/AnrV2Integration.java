package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.v7;
import io.sentry.w6;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements io.sentry.r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f82267e = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.transport.p f82269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f82270d;

    static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f82271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.b1 f82272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SentryAndroidOptions f82273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f82274e;

        a(Context context, io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.p pVar) {
            this.f82271b = context;
            this.f82272c = b1Var;
            this.f82273d = sentryAndroidOptions;
            this.f82274e = pVar.getCurrentTimeMillis() - AnrV2Integration.f82267e;
        }

        private byte[] a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 1024);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        private c b(ApplicationExitInfo applicationExitInfo, boolean z10) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] bArrA = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrA)));
                        try {
                            io.sentry.android.core.internal.threaddump.b bVarC = io.sentry.android.core.internal.threaddump.b.c(bufferedReader);
                            io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(this.f82273d, z10);
                            cVar2.i(bVarC);
                            List listF = cVar2.f();
                            List listC = cVar2.c();
                            if (listF.isEmpty()) {
                                c cVar3 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar3;
                            }
                            c cVar4 = new c(c.a.DUMP, bArrA, listF, listC);
                            bufferedReader.close();
                            return cVar4;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.f82273d.getLogger().a(g7.WARNING, "Failed to parse ANR thread dump", th2);
                        return new c(c.a.ERROR, bArrA);
                    }
                } finally {
                }
            } catch (Throwable th3) {
                this.f82273d.getLogger().a(g7.WARNING, "Failed to read ANR thread dump", th3);
                return new c(c.a.NO_DUMP);
            }
        }

        private void d(ApplicationExitInfo applicationExitInfo, boolean z10) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z11 = applicationExitInfo.getImportance() != 100;
            c cVarB = b(applicationExitInfo, z11);
            if (cVarB.f82278a == c.a.NO_DUMP) {
                this.f82273d.getLogger().c(g7.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.f82273d.getFlushTimeoutMillis(), this.f82273d.getLogger(), timestamp, z10, z11);
            io.sentry.i0 i0VarE = io.sentry.util.m.e(bVar);
            w6 w6Var = new w6();
            c.a aVar = cVarB.f82278a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                mVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                w6Var.F0(mVar);
            } else if (aVar == c.a.DUMP) {
                w6Var.H0(cVarB.f82280c);
                if (cVarB.f82281d != null) {
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    dVar.e(cVarB.f82281d);
                    w6Var.U(dVar);
                }
            }
            w6Var.E0(g7.FATAL);
            w6Var.I0(io.sentry.l.e(timestamp));
            if (this.f82273d.isAttachAnrThreadDump() && (bArr = cVarB.f82279b) != null) {
                i0VarE.n(io.sentry.b.b(bArr));
            }
            if (this.f82272c.I(w6Var, i0VarE).equals(io.sentry.protocol.x.f84062c) || bVar.h()) {
                return;
            }
            this.f82273d.getLogger().c(g7.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", w6Var.G());
        }

        private void e(List list, Long l10) {
            Collections.reverse(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.j.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    if (applicationExitInfoA.getTimestamp() < this.f82274e) {
                        this.f82273d.getLogger().c(g7.DEBUG, "ANR happened too long ago %s.", applicationExitInfoA);
                    } else if (l10 == null || applicationExitInfoA.getTimestamp() > l10.longValue()) {
                        d(applicationExitInfoA, false);
                    } else {
                        this.f82273d.getLogger().c(g7.DEBUG, "ANR has already been reported %s.", applicationExitInfoA);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List historicalProcessExitReasons = ((ActivityManager) this.f82271b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f82273d.getLogger().c(g7.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.g envelopeDiskCache = this.f82273d.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f82273d.isEnableAutoSessionTracking()) {
                io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
                if (!fVar.C()) {
                    this.f82273d.getLogger().c(g7.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    fVar.u();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lK = io.sentry.android.core.cache.d.K(this.f82273d);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.j.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    arrayList.remove(applicationExitInfoA);
                    applicationExitInfo = applicationExitInfoA;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f82273d.getLogger().c(g7.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f82274e) {
                this.f82273d.getLogger().c(g7.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lK != null && applicationExitInfo.getTimestamp() <= lK.longValue()) {
                this.f82273d.getLogger().c(g7.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f82273d.isReportHistoricalAnrs()) {
                e(arrayList, lK);
            }
            d(applicationExitInfo, true);
        }
    }

    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f82275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f82276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f82277f;

        public b(long j10, ILogger iLogger, long j11, boolean z10, boolean z11) {
            super(j10, iLogger);
            this.f82275d = j11;
            this.f82276e = z10;
            this.f82277f = z11;
        }

        @Override // io.sentry.hints.a
        public Long b() {
            return Long.valueOf(this.f82275d);
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f82277f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.c
        public boolean e() {
            return this.f82276e;
        }

        @Override // io.sentry.hints.f
        public boolean f(io.sentry.protocol.x xVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void g(io.sentry.protocol.x xVar) {
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.n.a());
    }

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82270d = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(g7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f82270d.isAnrEnabled()));
        if (this.f82270d.getCacheDirPath() == null) {
            this.f82270d.getLogger().c(g7.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f82270d.isAnrEnabled()) {
            try {
                v7Var.getExecutorService().submit(new a(this.f82268b, b1Var, this.f82270d, this.f82269c));
            } catch (Throwable th2) {
                v7Var.getLogger().a(g7.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            v7Var.getLogger().c(g7.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.o.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f82270d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(g7.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    AnrV2Integration(Context context, io.sentry.transport.p pVar) {
        this.f82268b = c1.f(context);
        this.f82269c = pVar;
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f82278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f82279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f82280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List f82281d;

        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(a aVar) {
            this.f82278a = aVar;
            this.f82279b = null;
            this.f82280c = null;
            this.f82281d = null;
        }

        c(a aVar, byte[] bArr) {
            this.f82278a = aVar;
            this.f82279b = bArr;
            this.f82280c = null;
            this.f82281d = null;
        }

        c(a aVar, byte[] bArr, List list, List list2) {
            this.f82278a = aVar;
            this.f82279b = bArr;
            this.f82280c = list;
            this.f82281d = list2;
        }
    }
}
