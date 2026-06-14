package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37672a;

    public Rh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f37672a = gestureDetectorOnGestureListenerC3635ci;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC3878m9 interfaceC3878m9 = this.f37672a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "onCCTLifeCycleEvent");
        }
        this.f37672a.c(jsonObject);
    }
}
