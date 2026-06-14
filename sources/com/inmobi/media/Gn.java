package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3837ki;
import com.inmobi.media.Gn;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Gn extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f36971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gn(GestureDetectorOnGestureListenerC3635ci mRenderView) {
        super(mRenderView);
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.f36971d = mRenderView;
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
    }

    public final void b(final View view) {
        this.f36971d.getWebViewFactory().b(new Function1() { // from class: w3.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Gn.a(view, (C3837ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.f36894b = new WeakReference(this.f36971d);
        return this.f36971d;
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
    }

    public static final Unit b(View view, C3837ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final Unit a(View view, C3837ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return Unit.f93236a;
    }

    public final void c(final View view) {
        this.f36971d.getWebViewFactory().b(new Function1() { // from class: w3.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Gn.b(view, (C3837ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f36971d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.f36971d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
        b(childView);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f36971d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        U exposureTracker = this.f36971d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
        c(childView);
    }
}
