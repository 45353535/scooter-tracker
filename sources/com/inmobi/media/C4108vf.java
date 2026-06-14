package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4108vf extends En {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f39776g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f39777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3695f1 f39778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3878m9 f39779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4108vf(GestureDetectorOnGestureListenerC3635ci adContainer, Fn mViewableAd, InterfaceC3695f1 interfaceC3695f1, InterfaceC3878m9 interfaceC3878m9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.f39777d = mViewableAd;
        this.f39778e = interfaceC3695f1;
        this.f39779f = interfaceC3878m9;
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        InterfaceC3878m9 interfaceC3878m9 = this.f39779f;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "addFriendlyView with obstruction code: " + obstructionCode);
        }
        InterfaceC3695f1 interfaceC3695f1 = this.f39778e;
        if (interfaceC3695f1 != null) {
            C3809jf c3809jf = (C3809jf) interfaceC3695f1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
            if (C3809jf.a(c3809jf.f38818e) && (adSession = c3809jf.f38819f) != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
            }
        }
        this.f39777d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f39777d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3878m9 interfaceC3878m9 = this.f39779f;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "inflateView called");
        }
        return this.f39777d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        try {
            try {
                InterfaceC3878m9 interfaceC3878m9 = this.f39779f;
                if (interfaceC3878m9 != null) {
                    Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
                    ((C3903n9) interfaceC3878m9).a(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "stopTrackingForImpression");
                }
                InterfaceC3695f1 interfaceC3695f1 = this.f39778e;
                if (interfaceC3695f1 != null) {
                    C3809jf c3809jf = (C3809jf) interfaceC3695f1;
                    if (C3809jf.a(c3809jf.f38818e, (byte) 2)) {
                        AdSession adSession = c3809jf.f38819f;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        c3809jf.f38819f = null;
                        c3809jf.f38818e = (byte) 3;
                    }
                }
                this.f39777d.d();
            } catch (Exception e10) {
                InterfaceC3878m9 interfaceC3878m92 = this.f39779f;
                if (interfaceC3878m92 != null) {
                    Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
                    ((C3903n9) interfaceC3878m92).b(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
                this.f39777d.d();
            }
        } catch (Throwable th2) {
            this.f39777d.d();
            throw th2;
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        InterfaceC3695f1 interfaceC3695f1 = this.f39778e;
        if (interfaceC3695f1 != null) {
            C3809jf c3809jf = (C3809jf) interfaceC3695f1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (C3809jf.a(c3809jf.f38818e) && (adSession = c3809jf.f38819f) != null) {
                adSession.removeFriendlyObstruction(childView);
            }
        }
        this.f39777d.a(childView);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39779f;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "startTrackingForImpression");
        }
        try {
            try {
                if (this.f36895c.getViewability().getOmidConfig().isOmidEnabled()) {
                    Bf.f36629a.getClass();
                    if (Omid.isActive()) {
                        View viewB = this.f39777d.b();
                        WebView webView = viewB instanceof WebView ? (WebView) viewB : null;
                        if (webView != null) {
                            InterfaceC3878m9 interfaceC3878m92 = this.f39779f;
                            if (interfaceC3878m92 != null) {
                                Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
                                ((C3903n9) interfaceC3878m92).a(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "creating OMSDK session");
                            }
                            InterfaceC3695f1 interfaceC3695f1 = this.f39778e;
                            if (interfaceC3695f1 != null) {
                                ((C3809jf) interfaceC3695f1).a(webView, map);
                            }
                        }
                    }
                }
                this.f39777d.a(map);
            } catch (Exception e10) {
                InterfaceC3878m9 interfaceC3878m93 = this.f39779f;
                if (interfaceC3878m93 != null) {
                    Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
                    ((C3903n9) interfaceC3878m93).b(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
                this.f39777d.a(map);
            }
        } catch (Throwable th2) {
            this.f39777d.a(map);
            throw th2;
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39777d.a(context, b10);
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f39779f;
        if (interfaceC3878m9 != null) {
            Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "destroy");
        }
        WeakReference weakReference = this.f36894b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.f39778e = null;
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39779f;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "TAG");
                ((C3903n9) interfaceC3878m92).a(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "Exception in destroy with message", e10);
            }
        } finally {
            this.f39777d.a();
        }
    }
}
