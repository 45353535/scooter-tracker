package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3986qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mutex f39392a = ng.f.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f39393b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39394c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3936oh
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.oh r0 = (com.inmobi.media.C3936oh) r0
            int r1 = r0.f39207d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39207d = r1
            goto L18
        L13:
            com.inmobi.media.oh r0 = new com.inmobi.media.oh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f39205b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39207d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.coroutines.CoroutineContext r0 = r0.f39204a
            kotlin.d.b(r6)
            goto L66
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.d.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            java.io.PrintStream r4 = java.lang.System.out
            r4.println(r2)
            java.lang.ref.WeakReference r2 = r5.f39393b
            java.lang.Object r2 = r2.get()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r2 == 0) goto L57
            int r6 = r5.f39394c
            int r6 = r6 + r3
            r5.f39394c = r6
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L57:
            kotlinx.coroutines.sync.Mutex r2 = r5.f39392a
            r0.f39204a = r6
            r0.f39207d = r3
            r4 = 0
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.a.a(r2, r4, r0, r3, r4)
            if (r0 != r1) goto L65
            return r1
        L65:
            r0 = r6
        L66:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r0)
            r5.f39393b = r6
            r5.f39394c = r3
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3986qh.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Unit a(C3961ph c3961ph) {
        CoroutineContext context = c3961ph.getContext();
        System.out.println(c3961ph.getContext());
        if (Intrinsics.areEqual(this.f39393b.get(), context)) {
            int i10 = this.f39394c - 1;
            this.f39394c = i10;
            if (i10 == 0) {
                this.f39393b = new WeakReference(null);
                Mutex.a.c(this.f39392a, null, 1, null);
            }
            return Unit.f93236a;
        }
        throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.E3 r8, kotlin.coroutines.jvm.internal.d r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3961ph
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ph r0 = (com.inmobi.media.C3961ph) r0
            int r1 = r0.f39290d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39290d = r1
            goto L18
        L13:
            com.inmobi.media.ph r0 = new com.inmobi.media.ph
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f39288b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39290d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3e
            if (r2 == r3) goto L36
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f39287a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.d.b(r9)
            goto L83
        L3e:
            java.lang.Object r8 = r0.f39287a
            kotlin.d.b(r9)
            return r8
        L44:
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L48
            goto L6c
        L48:
            r8 = move-exception
            goto L78
        L4a:
            java.lang.Object r8 = r0.f39287a
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            kotlin.d.b(r9)
            goto L60
        L52:
            kotlin.d.b(r9)
            r0.f39287a = r8
            r0.f39290d = r6
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r1) goto L60
            goto L82
        L60:
            r9 = 0
            r0.f39287a = r9     // Catch: java.lang.Throwable -> L48
            r0.f39290d = r5     // Catch: java.lang.Throwable -> L48
            java.lang.Object r9 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L48
            if (r9 != r1) goto L6c
            goto L82
        L6c:
            r0.f39287a = r9
            r0.f39290d = r4
            kotlin.Unit r8 = r7.a(r0)
            if (r8 != r1) goto L77
            goto L82
        L77:
            return r9
        L78:
            r0.f39287a = r8
            r0.f39290d = r3
            kotlin.Unit r9 = r7.a(r0)
            if (r9 != r1) goto L83
        L82:
            return r1
        L83:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3986qh.a(com.inmobi.media.E3, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
