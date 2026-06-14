package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import j$.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Pf implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.Pf r6, android.app.Activity r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r0 = 1
            boolean r1 = r8 instanceof com.inmobi.media.Nf
            if (r1 == 0) goto L14
            r1 = r8
            com.inmobi.media.Nf r1 = (com.inmobi.media.Nf) r1
            int r2 = r1.f37450e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f37450e = r2
            goto L19
        L14:
            com.inmobi.media.Nf r1 = new com.inmobi.media.Nf
            r1.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r1.f37448c
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.f37450e
            r4 = 0
            if (r3 == 0) goto L36
            if (r3 != r0) goto L2e
            kotlinx.coroutines.sync.Mutex r7 = r1.f37447b
            android.app.Activity r1 = r1.f37446a
            kotlin.d.b(r8)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.d.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = com.inmobi.media.Qf.f37594b
            r1.f37446a = r7
            r1.f37447b = r8
            r1.f37450e = r0
            java.lang.Object r1 = r8.lock(r4, r1)
            if (r1 != r2) goto L48
            return r2
        L48:
            r1 = r7
            r7 = r8
        L4a:
            com.squareup.picasso.Picasso r8 = com.inmobi.media.Qf.f37593a     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L89
            java.util.ArrayList r8 = com.inmobi.media.Qf.f37595c     // Catch: java.lang.Throwable -> L72
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L72
            r2 = 0
        L55:
            if (r2 >= r8) goto L76
            java.util.ArrayList r3 = com.inmobi.media.Qf.f37595c     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r3.get(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L72
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L72
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L74
            java.lang.Object r8 = r3.get(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8     // Catch: java.lang.Throwable -> L72
            goto L77
        L72:
            r6 = move-exception
            goto L8f
        L74:
            int r2 = r2 + r0
            goto L55
        L76:
            r8 = r4
        L77:
            if (r8 == 0) goto L89
            java.util.ArrayList r0 = com.inmobi.media.Qf.f37595c     // Catch: java.lang.Throwable -> L72
            r0.remove(r8)     // Catch: java.lang.Throwable -> L72
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L87
            r6.a(r1)     // Catch: java.lang.Throwable -> L72
        L87:
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L72
        L89:
            r7.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L8f:
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pf.a(com.inmobi.media.Pf, android.app.Activity, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        eg.h.b(null, new Of(this, activity, null), 1, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void a(Activity activity) {
        Picasso picasso = Qf.f37593a;
        Intrinsics.checkNotNullExpressionValue("Qf", "access$getTAG$p(...)");
        Objects.toString(Qf.f37593a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = Qf.f37593a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        Qf.f37593a = null;
    }
}
