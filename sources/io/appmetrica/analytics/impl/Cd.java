package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes12.dex */
public final class Cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ra f75613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E9 f75614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ge f75615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ro f75616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f75617f;

    public Cd(Context context, Ra ra2) {
        this(context, ra2, Dd.a(context), new Ge(context), new ro());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult a() {
        /*
            r5 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f75617f
            if (r0 == 0) goto L18
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = r0.status
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK
            if (r1 != r2) goto L18
            io.appmetrica.analytics.impl.ro r1 = r5.f75616e
            java.lang.String r2 = r0.f78675id
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.ro.a(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            io.appmetrica.analytics.impl.E9 r2 = r5.f75614c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r3 = r2.f75732a     // Catch: java.lang.Throwable -> L79
            r3.lock()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.fa r2 = r2.f75733b     // Catch: java.lang.Throwable -> L79
            r2.a()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f75617f     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3d
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = r0.status     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            if (r2 != r3) goto L3d
            io.appmetrica.analytics.impl.ro r2 = r5.f75616e     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.f78675id     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r2 = io.appmetrica.analytics.impl.ro.a(r3)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3d
            goto L79
        L3d:
            io.appmetrica.analytics.impl.Ge r2 = r5.f75615d     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = r2.f75820a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "uuid.dat"
            java.io.File r2 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(r2, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = io.appmetrica.analytics.impl.Qa.a(r2)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.ro r3 = r5.f75616e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.ro.a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L64
            io.appmetrica.analytics.impl.Ra r2 = r5.f75613b     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r5.f75612a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Ge r3 = r5.f75615d     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L79
        L64:
            io.appmetrica.analytics.impl.ro r3 = r5.f75616e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.ro.a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L79
            io.appmetrica.analytics.internal.IdentifiersResult r3 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r4 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L79
            r5.f75617f = r3     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = r3
        L79:
            io.appmetrica.analytics.impl.E9 r2 = r5.f75614c
            io.appmetrica.analytics.impl.fa r3 = r2.f75733b
            r3.b()
            java.util.concurrent.locks.ReentrantLock r2 = r2.f75732a
            r2.unlock()
            if (r0 == 0) goto L88
            goto L91
        L88:
            io.appmetrica.analytics.internal.IdentifiersResult r0 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r3 = "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)"
            r0.<init>(r1, r2, r3)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Cd.a():io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public Cd(Context context, Ra ra2, E9 e92, Ge ge2, ro roVar) {
        this.f75612a = context;
        this.f75613b = ra2;
        this.f75614c = e92;
        this.f75615d = ge2;
        this.f75616e = roVar;
        try {
            e92.a();
            ge2.a();
            e92.b();
        } catch (Throwable unused) {
            this.f75614c.b();
        }
    }
}
