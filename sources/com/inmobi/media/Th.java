package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Th implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f37785b;

    public Th(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, Context context) {
        this.f37784a = gestureDetectorOnGestureListenerC3635ci;
        this.f37785b = context;
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        this.f37784a.getListener().a();
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
        this.f37784a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f37784a.a(str, message, str2);
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("creativeId", this.f37784a.getCreativeId());
        intent.putExtra("impressionId", this.f37784a.getImpressionId());
        intent.putExtra("placementId", this.f37784a.getPlacementId());
        SparseArray sparseArray = InMobiAdActivity.f36523k;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37784a;
        InMobiAdActivity.f36524l = gestureDetectorOnGestureListenerC3635ci;
        if (gestureDetectorOnGestureListenerC3635ci.getPlacementType() == 0) {
            Context context = Ji.f37157a;
            Activity context2 = this.f37784a.getBannerHolderActivity().get();
            if (context2 == null) {
                context2 = this.f37785b;
            }
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context2 instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context2.startActivity(intent);
            return;
        }
        Context context3 = Ji.f37157a;
        Context context4 = this.f37784a.getContainerContext();
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context4 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context4.startActivity(intent);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37784a;
        if (gestureDetectorOnGestureListenerC3635ci.f38360e) {
            return;
        }
        gestureDetectorOnGestureListenerC3635ci.b(trackerName, macros);
    }
}
