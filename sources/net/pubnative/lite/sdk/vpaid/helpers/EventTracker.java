package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.pubnative.lite.sdk.vpaid.macros.MacroHelper;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;

/* JADX INFO: loaded from: classes3.dex */
public class EventTracker {
    private static final Set<String> sUsedEvents = new HashSet();

    private EventTracker() {
    }

    public static void clear() {
        sUsedEvents.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0005, B:10:0x0011, B:15:0x001b, B:17:0x0022, B:19:0x0035, B:20:0x003a), top: B:25:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void post(android.content.Context r8, java.lang.String r9, net.pubnative.lite.sdk.vpaid.macros.MacroHelper r10, boolean r11) {
        /*
            java.lang.Class<net.pubnative.lite.sdk.vpaid.helpers.EventTracker> r1 = net.pubnative.lite.sdk.vpaid.helpers.EventTracker.class
            monitor-enter(r1)
            if (r11 == 0) goto L11
            java.util.Set<java.lang.String> r11 = net.pubnative.lite.sdk.vpaid.helpers.EventTracker.sUsedEvents     // Catch: java.lang.Throwable -> Le
            boolean r11 = r11.contains(r9)     // Catch: java.lang.Throwable -> Le
            if (r11 == 0) goto L11
            goto L17
        Le:
            r0 = move-exception
            r8 = r0
            goto L4c
        L11:
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Le
            if (r11 == 0) goto L19
        L17:
            monitor-exit(r1)
            return
        L19:
            if (r10 == 0) goto L21
            java.lang.String r10 = r10.processUrl(r9)     // Catch: java.lang.Throwable -> Le
            r3 = r10
            goto L22
        L21:
            r3 = r9
        L22:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            net.pubnative.lite.sdk.DeviceInfo r10 = net.pubnative.lite.sdk.HyBid.getDeviceInfo()     // Catch: java.lang.Throwable -> Le
            java.lang.String r10 = r10.getUserAgent()     // Catch: java.lang.Throwable -> Le
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Le
            if (r11 != 0) goto L3a
            java.lang.String r11 = "User-Agent"
            r4.put(r11, r10)     // Catch: java.lang.Throwable -> Le
        L3a:
            net.pubnative.lite.sdk.vpaid.helpers.EventTracker$2 r7 = new net.pubnative.lite.sdk.vpaid.helpers.EventTracker$2     // Catch: java.lang.Throwable -> Le
            r7.<init>()     // Catch: java.lang.Throwable -> Le
            r5 = 0
            r6 = 0
            r2 = r8
            net.pubnative.lite.sdk.network.PNHttpClient.makeRequest(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le
            java.util.Set<java.lang.String> r8 = net.pubnative.lite.sdk.vpaid.helpers.EventTracker.sUsedEvents     // Catch: java.lang.Throwable -> Le
            r8.add(r9)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L4c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.helpers.EventTracker.post(android.content.Context, java.lang.String, net.pubnative.lite.sdk.vpaid.macros.MacroHelper, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0005, B:10:0x0011, B:17:0x001f, B:19:0x0026, B:21:0x0039, B:22:0x003e), top: B:27:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void postEvent(android.content.Context r8, java.lang.String r9, final java.lang.String r10, net.pubnative.lite.sdk.vpaid.macros.MacroHelper r11, boolean r12) {
        /*
            java.lang.Class<net.pubnative.lite.sdk.vpaid.helpers.EventTracker> r1 = net.pubnative.lite.sdk.vpaid.helpers.EventTracker.class
            monitor-enter(r1)
            if (r12 == 0) goto L11
            java.util.Set<java.lang.String> r12 = net.pubnative.lite.sdk.vpaid.helpers.EventTracker.sUsedEvents     // Catch: java.lang.Throwable -> Le
            boolean r12 = r12.contains(r9)     // Catch: java.lang.Throwable -> Le
            if (r12 == 0) goto L11
            goto L17
        Le:
            r0 = move-exception
            r8 = r0
            goto L50
        L11:
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Le
            if (r12 == 0) goto L19
        L17:
            monitor-exit(r1)
            return
        L19:
            if (r10 != 0) goto L1d
            java.lang.String r10 = ""
        L1d:
            if (r11 == 0) goto L25
            java.lang.String r11 = r11.processUrl(r9)     // Catch: java.lang.Throwable -> Le
            r3 = r11
            goto L26
        L25:
            r3 = r9
        L26:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            net.pubnative.lite.sdk.DeviceInfo r11 = net.pubnative.lite.sdk.HyBid.getDeviceInfo()     // Catch: java.lang.Throwable -> Le
            java.lang.String r11 = r11.getUserAgent()     // Catch: java.lang.Throwable -> Le
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Le
            if (r12 != 0) goto L3e
            java.lang.String r12 = "User-Agent"
            r4.put(r12, r11)     // Catch: java.lang.Throwable -> Le
        L3e:
            net.pubnative.lite.sdk.vpaid.helpers.EventTracker$1 r7 = new net.pubnative.lite.sdk.vpaid.helpers.EventTracker$1     // Catch: java.lang.Throwable -> Le
            r7.<init>()     // Catch: java.lang.Throwable -> Le
            r5 = 0
            r6 = 0
            r2 = r8
            net.pubnative.lite.sdk.network.PNHttpClient.makeRequest(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le
            java.util.Set<java.lang.String> r8 = net.pubnative.lite.sdk.vpaid.helpers.EventTracker.sUsedEvents     // Catch: java.lang.Throwable -> Le
            r8.add(r9)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.helpers.EventTracker.postEvent(android.content.Context, java.lang.String, java.lang.String, net.pubnative.lite.sdk.vpaid.macros.MacroHelper, boolean):void");
    }

    public static synchronized void postEventByType(Context context, List<Tracking> list, String str, MacroHelper macroHelper, boolean z10) {
        if (list != null) {
            for (Tracking tracking : list) {
                if (tracking.getEvent().equalsIgnoreCase(str)) {
                    postEvent(context, tracking.getText(), tracking.getEvent(), macroHelper, z10);
                }
            }
        }
    }
}
