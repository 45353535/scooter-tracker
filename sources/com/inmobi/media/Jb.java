package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f37128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f37129g;

    public Jb(Context context, String url, long j10, long j11, int i10, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f37123a = url;
        this.f37124b = j10;
        this.f37125c = j11;
        this.f37126d = i10;
        this.f37127e = i11;
        WeakReference weakReference = new WeakReference(context);
        this.f37128f = weakReference;
        this.f37129g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            CoroutineScope coroutineScope = Sb.f37702a;
            Rb.a(new Ib(this, context2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Fb
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Fb r0 = (com.inmobi.media.Fb) r0
            int r1 = r0.f36843e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36843e = r1
            goto L18
        L13:
            com.inmobi.media.Fb r0 = new com.inmobi.media.Fb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f36841c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36843e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r6 = r0.f36840b
            android.content.Context r2 = r0.f36839a
            kotlin.d.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            android.content.Context r6 = r0.f36839a
            kotlin.d.b(r7)
            goto L5f
        L3e:
            kotlin.d.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f37129g
            boolean r7 = r7.get()
            if (r7 == 0) goto L4c
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L4c:
            kotlin.Lazy r7 = com.inmobi.media.AbstractC4179yb.f39987a
            java.lang.Object r7 = r7.getValue()
            com.inmobi.media.xb r7 = (com.inmobi.media.C4154xb) r7
            r0.f36839a = r6
            r0.f36843e = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5f
            goto L81
        L5f:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L67:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            com.inmobi.media.qb r7 = (com.inmobi.media.C3980qb) r7
            java.lang.String r4 = r5.f37123a
            r0.f36839a = r2
            r0.f36840b = r6
            r0.f36843e = r3
            java.lang.Object r7 = r5.b(r4, r7, r0)
            if (r7 != r1) goto L67
        L81:
            return r1
        L82:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0115 -> B:55:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r25, com.inmobi.media.C3980qb r26, kotlin.coroutines.jvm.internal.d r27) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.b(java.lang.String, com.inmobi.media.qb, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r12, com.inmobi.media.C3980qb r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.inmobi.media.Gb
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.Gb r0 = (com.inmobi.media.Gb) r0
            int r1 = r0.f36936c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36936c = r1
            goto L18
        L13:
            com.inmobi.media.Gb r0 = new com.inmobi.media.Gb
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f36934a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36936c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r14)     // Catch: java.lang.IllegalStateException -> L69
            return r14
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.d.b(r14)
            kotlin.Lazy r14 = com.inmobi.media.He.f37023h     // Catch: java.lang.IllegalStateException -> L69
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.IllegalStateException -> L69
            com.inmobi.media.u9 r14 = (com.inmobi.media.C4077u9) r14     // Catch: java.lang.IllegalStateException -> L69
            java.lang.String r2 = "loggingUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)     // Catch: java.lang.IllegalStateException -> L69
            java.lang.String r2 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)     // Catch: java.lang.IllegalStateException -> L69
            java.lang.String r2 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)     // Catch: java.lang.IllegalStateException -> L69
            com.inmobi.media.Le r4 = new com.inmobi.media.Le     // Catch: java.lang.IllegalStateException -> L69
            com.inmobi.media.S6 r8 = new com.inmobi.media.S6     // Catch: java.lang.IllegalStateException -> L69
            java.lang.String r13 = r13.f39367a     // Catch: java.lang.IllegalStateException -> L69
            r8.<init>(r13)     // Catch: java.lang.IllegalStateException -> L69
            r9 = 0
            r10 = 54
            r6 = 0
            r7 = 0
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalStateException -> L69
            r0.f36936c = r3     // Catch: java.lang.IllegalStateException -> L69
            com.inmobi.media.x4 r12 = r14.f39655a     // Catch: java.lang.IllegalStateException -> L69
            java.lang.Object r12 = r12.a(r4, r0)     // Catch: java.lang.IllegalStateException -> L69
            if (r12 != r1) goto L68
            return r1
        L68:
            return r12
        L69:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(java.lang.String, com.inmobi.media.qb, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:38:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.C3980qb r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jb.a(com.inmobi.media.qb, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
