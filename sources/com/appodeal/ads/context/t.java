package com.appodeal.ads.context;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements ContextProvider, ContextProvider.Synchronizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityProvider f13213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f13214b;

    public t() {
        i activityProvider = new i();
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.f13213a = activityProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object awaitResumedActivity(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.appodeal.ads.context.r
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.ads.context.r r0 = (com.appodeal.ads.context.r) r0
            int r1 = r0.f13211u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13211u = r1
            goto L18
        L13:
            com.appodeal.ads.context.r r0 = new com.appodeal.ads.context.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f13209s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13211u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.d.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            com.appodeal.ads.context.t r2 = r0.f13208r
            kotlin.d.b(r7)
            goto L55
        L3b:
            kotlin.d.b(r7)
            com.appodeal.ads.modules.common.internal.context.ActivityProvider r7 = r6.f13213a
            kotlinx.coroutines.flow.Flow r7 = r7.getResumedActivityFlow()
            com.appodeal.ads.context.s r2 = new com.appodeal.ads.context.s
            r2.<init>(r3)
            r0.f13208r = r6
            r0.f13211u = r5
            java.lang.Object r7 = hg.i.y(r7, r2, r0)
            if (r7 != r1) goto L54
            goto L69
        L54:
            r2 = r6
        L55:
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r7 = r7.get()
            android.app.Activity r7 = (android.app.Activity) r7
            if (r7 != 0) goto L6a
            r0.f13208r = r3
            r0.f13211u = r4
            java.lang.Object r7 = r2.awaitResumedActivity(r0)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.context.t.awaitResumedActivity(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Flow getActivityFlow() {
        return this.f13213a.getActivityFlow();
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Context getApplicationContext() {
        Context context = this.f13214b;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Context is not provided");
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Context getApplicationContextOrNull() {
        return this.f13214b;
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Activity getResumedActivity() {
        return this.f13213a.getResumedActivity();
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider.Synchronizer
    public final void setApplicationContext(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (this.f13214b == null) {
            this.f13214b = applicationContext;
            this.f13213a.observe(applicationContext);
        }
    }
}
