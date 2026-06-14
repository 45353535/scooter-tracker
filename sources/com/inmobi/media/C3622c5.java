package com.inmobi.media;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3622c5 extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3673e5 f38319a;

    public C3622c5(C3673e5 c3673e5) {
        this.f38319a = c3673e5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f38319a.f38498a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCustomTabsServiceConnected(android.content.ComponentName r4, androidx.browser.customtabs.CustomTabsClient r5) {
        /*
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r4 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            com.inmobi.media.e5 r4 = r3.f38319a
            r4.f38498a = r5
            com.inmobi.media.R2 r4 = r4.f38500c
            if (r4 == 0) goto La2
            com.inmobi.media.e5 r5 = r4.f37631e     // Catch: java.lang.Throwable -> L3b
            androidx.browser.customtabs.CustomTabsSession r0 = r5.f38501d     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L29
            androidx.browser.customtabs.CustomTabsClient r0 = r5.f38498a     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L26
            com.inmobi.media.d5 r1 = new com.inmobi.media.d5     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            androidx.browser.customtabs.CustomTabsSession r0 = r0.newSession(r1)     // Catch: java.lang.Throwable -> L3b
            goto L27
        L26:
            r0 = 0
        L27:
            r5.f38501d = r0     // Catch: java.lang.Throwable -> L3b
        L29:
            if (r0 == 0) goto L3b
            android.os.Bundle r5 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r0.isEngagementSignalsApiAvailable(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            com.inmobi.media.Q2 r1 = new com.inmobi.media.Q2     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            r0.setEngagementSignalsCallback(r1, r5)     // Catch: java.lang.Throwable -> L3b
        L3b:
            java.lang.String r5 = r4.f37627a     // Catch: java.lang.Throwable -> L4a
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = "Uri.parse(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Throwable -> L4a
            r4.a(r5)     // Catch: java.lang.Throwable -> L4a
            goto La2
        L4a:
            android.content.Context r5 = r4.f37632f     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r4.f37627a     // Catch: java.lang.Exception -> L60
            java.lang.ref.WeakReference r1 = r4.f37636j     // Catch: java.lang.Exception -> L60
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L60
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> L60
            com.inmobi.media.nh r1 = (com.inmobi.media.InterfaceC3911nh) r1     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = r4.f37630d     // Catch: java.lang.Exception -> L60
            int r5 = com.inmobi.media.AbstractC4146x3.a(r5, r0, r1, r2)     // Catch: java.lang.Exception -> L60
            goto L62
        L60:
            r5 = 9
        L62:
            com.inmobi.media.Ya r0 = r4.f37629c
            if (r0 == 0) goto L6a
            java.lang.String r1 = "EX_NATIVE"
            r0.f38042f = r1
        L6a:
            if (r5 == 0) goto L91
            r0 = 1
            if (r5 != r0) goto L70
            goto L91
        L70:
            java.lang.ref.WeakReference r0 = r4.f37635i
            java.lang.Object r0 = r0.get()
            com.inmobi.media.Rh r0 = (com.inmobi.media.Rh) r0
            if (r0 == 0) goto La2
            com.inmobi.media.Na r1 = com.inmobi.media.Na.f37433g
            com.inmobi.media.Ya r4 = r4.f37629c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "landingPageFunnelState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.inmobi.media.ci r0 = r0.f37672a
            com.inmobi.media.Ua r0 = r0.getLandingPageHandler()
            r0.a(r1, r4, r5)
            goto La2
        L91:
            java.lang.ref.WeakReference r5 = r4.f37635i
            java.lang.Object r5 = r5.get()
            com.inmobi.media.Rh r5 = (com.inmobi.media.Rh) r5
            if (r5 == 0) goto La2
            com.inmobi.media.Na r0 = com.inmobi.media.Na.f37432f
            com.inmobi.media.Ya r4 = r4.f37629c
            com.inmobi.media.J2.a(r5, r0, r4)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3622c5.onCustomTabsServiceConnected(android.content.ComponentName, androidx.browser.customtabs.CustomTabsClient):void");
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C3673e5 c3673e5 = this.f38319a;
        c3673e5.f38498a = null;
        R2 r22 = c3673e5.f38500c;
        if (r22 != null) {
            Ya ya2 = r22.f37629c;
            if (ya2 != null) {
                ya2.f38042f = "IN_NATIVE";
            }
            Rh rh2 = (Rh) r22.f37635i.get();
            if (rh2 != null) {
                Na landingPageFunnelState = Na.f37433g;
                Ya ya3 = r22.f37629c;
                Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                rh2.f37672a.getLandingPageHandler().a(landingPageFunnelState, ya3, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f38319a.f38498a = null;
    }
}
