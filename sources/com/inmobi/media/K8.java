package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class K8 implements S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M8 f37212a;

    public K8(M8 m82) {
        this.f37212a = m82;
    }

    public final void a(String expandInput, R5 inputType, float f10, boolean z10, long j10, Ya ya2) {
        String adType;
        String str;
        String str2;
        R5 r52;
        boolean z11;
        Ya ya3;
        long j11;
        String creativeId;
        String impressionId;
        Q5 q52;
        Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        M8 m82 = this.f37212a;
        Activity activity = (Activity) m82.f37347a.get();
        if (activity == null) {
            return;
        }
        if (m82.f37351e == null) {
            Q5 q53 = new Q5(activity);
            InterfaceC3878m9 interfaceC3878m9 = m82.f37354h;
            if (interfaceC3878m9 != null) {
                q53.setLogger(interfaceC3878m9);
            }
            q53.setId(65518);
            q53.setEmbeddedBrowserUpdateListener(m82.f37355i);
            m82.f37351e = q53;
        }
        C c10 = m82.f37348b;
        if ((c10 instanceof GestureDetectorOnGestureListenerC3635ci) && (q52 = m82.f37351e) != null) {
            q52.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3635ci) c10).getListener());
        }
        Q5 q54 = m82.f37351e;
        if (q54 != null) {
            C c11 = m82.f37348b;
            if (c11 == null || (adType = ((GestureDetectorOnGestureListenerC3635ci) c11).getAdType()) == null) {
                adType = "banner";
            }
            String str3 = adType;
            C c12 = m82.f37348b;
            String str4 = (c12 == null || (impressionId = ((GestureDetectorOnGestureListenerC3635ci) c12).getImpressionId()) == null) ? "" : impressionId;
            C c13 = m82.f37348b;
            if (c13 == null || (creativeId = ((GestureDetectorOnGestureListenerC3635ci) c13).getCreativeId()) == null) {
                str = "";
                str2 = expandInput;
                r52 = inputType;
                z11 = z10;
                ya3 = ya2;
                j11 = j10;
            } else {
                str = creativeId;
                str2 = expandInput;
                r52 = inputType;
                j11 = j10;
                ya3 = ya2;
                z11 = z10;
            }
            q54.a(str2, r52, z11, j11, str3, str4, str, ya3);
        }
        float f11 = 1 - f10;
        m82.f37353g = f11;
        C4000r7 c4000r7 = m82.f37349c;
        if (c4000r7 != null) {
            c4000r7.f39448c = f11;
            c4000r7.c();
        }
        m82.b();
    }
}
