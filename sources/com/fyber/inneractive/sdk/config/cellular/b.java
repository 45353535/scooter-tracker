package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f20330a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f20331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TelephonyManager f20332c;

    public b(TelephonyManager telephonyManager, h hVar) {
        this.f20332c = telephonyManager;
        this.f20331b = hVar;
    }

    public final void a() {
        this.f20331b = null;
        TelephonyManager telephonyManager = this.f20332c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f20330a.shutdownNow();
    }

    public final void b() {
        TelephonyManager telephonyManager = this.f20332c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f20330a, this);
        }
    }

    public final void c() {
        TelephonyManager telephonyManager = this.f20332c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r4) {
        /*
            r3 = this;
            int r0 = n3.a.a(r4)
            int r4 = androidx.media3.common.util.h.a(r4)
            r1 = 2
            if (r4 == r1) goto L3a
            r1 = 3
            if (r4 == r1) goto L3a
            r2 = 5
            if (r4 == r2) goto L3a
            if (r0 == 0) goto L37
            if (r0 == r1) goto L34
            r4 = 18
            if (r0 == r4) goto L31
            r4 = 20
            if (r0 == r4) goto L2e
            if (r0 == r2) goto L34
            r4 = 6
            if (r0 == r4) goto L34
            switch(r0) {
                case 8: goto L34;
                case 9: goto L34;
                case 10: goto L34;
                default: goto L25;
            }
        L25:
            switch(r0) {
                case 12: goto L34;
                case 13: goto L2b;
                case 14: goto L34;
                case 15: goto L34;
                default: goto L28;
            }
        L28:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.CELLULAR
            goto L3c
        L2b:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.MOBILE_4G
            goto L3c
        L2e:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.MOBILE_5G
            goto L3c
        L31:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.WIFI
            goto L3c
        L34:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.MOBILE_3G
            goto L3c
        L37:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.UNKNOWN
            goto L3c
        L3a:
            com.fyber.inneractive.sdk.util.z0 r4 = com.fyber.inneractive.sdk.util.z0.MOBILE_5G
        L3c:
            com.fyber.inneractive.sdk.config.cellular.h r0 = r3.f20331b
            if (r0 == 0) goto L43
            r0.a(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.cellular.b.onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo):void");
    }
}
