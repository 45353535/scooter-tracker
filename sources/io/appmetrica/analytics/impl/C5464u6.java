package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5464u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5141ha f78325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5265m6 f78326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f78327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5115ga f78328d;

    public C5464u6(Context context) {
        this(context, new C5141ha(), new C5265m6(), C5115ga.a(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.appmetrica.analytics.impl.Ah r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f78327c
            java.io.File r0 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getCrashesDirectory(r0)
            io.appmetrica.analytics.impl.m6 r1 = r6.f78326b
            r1.getClass()
            if (r0 != 0) goto Lf
            goto Laf
        Lf:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L27
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1c
            goto L2d
        L1c:
            boolean r1 = r0.delete()
            if (r1 == 0) goto Laf
            boolean r1 = r0.mkdir()
            goto L2b
        L27:
            boolean r1 = r0.mkdir()
        L2b:
            if (r1 == 0) goto Laf
        L2d:
            io.appmetrica.analytics.impl.Kh r1 = r7.f75527e
            io.appmetrica.analytics.impl.Gf r1 = r1.f76217a
            android.content.ContentValues r2 = r1.f75824a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_ID"
            java.lang.Integer r2 = r2.getAsInteger(r3)
            android.content.ContentValues r1 = r1.f75824a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_SESSION_ID"
            java.lang.String r1 = r1.getAsString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "-"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            io.appmetrica.analytics.impl.ga r2 = r6.f78328d
            io.appmetrica.analytics.impl.E9 r2 = r2.b(r1)
            java.util.concurrent.locks.ReentrantLock r3 = r2.f75732a     // Catch: java.lang.Throwable -> La3
            r3.lock()     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.fa r3 = r2.f75733b     // Catch: java.lang.Throwable -> La3
            r3.a()     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.ha r3 = r6.f78325a     // Catch: java.lang.Throwable -> La3
            r3.getClass()     // Catch: java.lang.Throwable -> La3
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La3
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> La3
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> La3
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> La3
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La3
            r5.<init>(r3)     // Catch: java.lang.Throwable -> La3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La3
            r0.<init>(r4)     // Catch: java.lang.Throwable -> La3
            io.appmetrica.analytics.impl.qb r3 = new io.appmetrica.analytics.impl.qb     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.W5 r4 = r7.f75523a     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.Kh r5 = r7.f75527e     // Catch: java.lang.Throwable -> La4
            java.util.HashMap r7 = r7.f75526d     // Catch: java.lang.Throwable -> La4
            r3.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = r3.k()     // Catch: java.lang.Throwable -> La4
            r0.write(r7)     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.no.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.ga r7 = r6.f78328d
            monitor-enter(r7)
            java.util.HashMap r0 = r7.f77249b     // Catch: java.lang.Throwable -> La0
            r0.remove(r1)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r7)
            return
        La0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        La3:
            r0 = 0
        La4:
            io.appmetrica.analytics.impl.no.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.ga r7 = r6.f78328d
            r7.a(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5464u6.a(io.appmetrica.analytics.impl.Ah):void");
    }

    public C5464u6(Context context, C5141ha c5141ha, C5265m6 c5265m6, C5115ga c5115ga) {
        this.f78327c = context;
        this.f78325a = c5141ha;
        this.f78326b = c5265m6;
        this.f78328d = c5115ga;
    }
}
