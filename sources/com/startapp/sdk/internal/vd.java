package com.startapp.sdk.internal;

import android.content.Context;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdSession f65397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdEvents f65398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaEvents f65399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f65400d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f65401e = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vd(android.webkit.WebView r8) {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r7.f65400d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r7.f65401e = r0
            r0 = 0
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L42
            boolean r2 = com.iab.omid.library.startio.Omid.isActive()     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            com.iab.omid.library.startio.Omid.activate(r1)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r1 = move-exception
            goto L44
        L22:
            java.lang.String r1 = "Startio"
            java.lang.String r2 = "5.2.4"
            com.iab.omid.library.startio.adsession.Partner r1 = com.iab.omid.library.startio.adsession.Partner.createPartner(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = ""
            com.iab.omid.library.startio.adsession.AdSessionContext r1 = com.iab.omid.library.startio.adsession.AdSessionContext.createHtmlAdSessionContext(r1, r8, r0, r2)     // Catch: java.lang.Throwable -> L42
            com.iab.omid.library.startio.adsession.CreativeType r2 = com.iab.omid.library.startio.adsession.CreativeType.HTML_DISPLAY     // Catch: java.lang.Throwable -> L42
            com.iab.omid.library.startio.adsession.ImpressionType r3 = com.iab.omid.library.startio.adsession.ImpressionType.VIEWABLE     // Catch: java.lang.Throwable -> L42
            com.iab.omid.library.startio.adsession.Owner r4 = com.iab.omid.library.startio.adsession.Owner.NATIVE     // Catch: java.lang.Throwable -> L42
            com.iab.omid.library.startio.adsession.Owner r5 = com.iab.omid.library.startio.adsession.Owner.NONE     // Catch: java.lang.Throwable -> L42
            r6 = 0
            com.iab.omid.library.startio.adsession.AdSessionConfiguration r2 = com.iab.omid.library.startio.adsession.AdSessionConfiguration.createAdSessionConfiguration(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L42
            com.iab.omid.library.startio.adsession.AdSession r1 = com.iab.omid.library.startio.adsession.AdSession.createAdSession(r2, r1)     // Catch: java.lang.Throwable -> L42
            goto L4d
        L42:
            r1 = move-exception
            goto L49
        L44:
            com.startapp.sdk.internal.g9.a(r1)     // Catch: java.lang.Throwable -> L42
        L47:
            r1 = r0
            goto L4d
        L49:
            com.startapp.sdk.internal.g9.a(r1)
            goto L47
        L4d:
            r7.f65397a = r1
            r8.getContext()
            if (r1 == 0) goto L5d
            com.iab.omid.library.startio.adsession.AdEvents r8 = com.iab.omid.library.startio.adsession.AdEvents.createAdEvents(r1)     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r8 = move-exception
            com.startapp.sdk.internal.g9.a(r8)
        L5d:
            r8 = r0
        L5e:
            r7.f65398b = r8
            r7.f65399c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.vd.<init>(android.webkit.WebView):void");
    }

    public final void a() {
        if (this.f65398b == null || !this.f65400d.compareAndSet(false, true)) {
            return;
        }
        this.f65398b.impressionOccurred();
    }

    public vd(Context context, List list, boolean z10) {
        AdSession adSessionA;
        AdEvents adEventsCreateAdEvents;
        MediaEvents mediaEventsCreateMediaEvents = null;
        try {
            adSessionA = e0.a(context, list, z10);
        } catch (Throwable th2) {
            g9.a(th2);
            adSessionA = null;
        }
        this.f65397a = adSessionA;
        if (adSessionA != null) {
            try {
                adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionA);
            } catch (Throwable th3) {
                g9.a(th3);
                adEventsCreateAdEvents = null;
            }
        } else {
            adEventsCreateAdEvents = null;
        }
        this.f65398b = adEventsCreateAdEvents;
        if (z10 && adSessionA != null) {
            try {
                mediaEventsCreateMediaEvents = MediaEvents.createMediaEvents(adSessionA);
            } catch (Throwable th4) {
                g9.a(th4);
            }
        }
        this.f65399c = mediaEventsCreateMediaEvents;
    }
}
