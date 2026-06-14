package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Yh implements InterfaceC3607bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f38061a;

    public Yh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f38061a = gestureDetectorOnGestureListenerC3635ci;
    }

    public final void a(String id2, int i10, String str, long j10, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullExpressionValue(GestureDetectorOnGestureListenerC3635ci.f38347g1, "access$getTAG$cp(...)");
        JSONObject jSONObjectA = Xh.a("code", i10);
        if (str != null) {
            jSONObjectA.put(NotificationCompat.CATEGORY_MESSAGE, str);
        }
        jSONObjectA.put("retryCount", i11);
        String string = jSONObjectA.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f38061a.g("window.imraidview.broadcastEvent('onPingComplete', '" + id2 + "', " + j10 + ", '" + string + "');");
    }
}
