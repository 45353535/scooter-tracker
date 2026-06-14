package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k8 extends y7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jj f64821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb f64822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f64823h;

    static {
        Intrinsics.checkNotNullExpressionValue(k8.class.getSimpleName(), "getSimpleName(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(Context context, jj videoEnabledAd, AdEventListener adEventListener, lb webViewFactory, lb networkApiExecutor, lb eventTracer, lb webViewCacheLoader, String adm, lb httpClient) {
        super(context, videoEnabledAd, adEventListener, networkApiExecutor, eventTracer, webViewCacheLoader, adm);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoEnabledAd, "videoEnabledAd");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(networkApiExecutor, "networkApiExecutor");
        Intrinsics.checkNotNullParameter(eventTracer, "eventTracer");
        Intrinsics.checkNotNullParameter(webViewCacheLoader, "webViewCacheLoader");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f64821f = videoEnabledAd;
        this.f64822g = webViewFactory;
        this.f64823h = httpClient;
    }

    public static final void a(k8 this$0, List errorTrackersUrls, VASTErrorCodes errorCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorTrackersUrls, "errorTrackersUrls");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        l8.a(this$0.f64043c, this$0.f64821f.f64799r, errorTrackersUrls, errorCode);
    }

    @Override // com.startapp.sdk.internal.y7, com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        yi yiVar;
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            VideoConfig videoConfigF = AdsCommonMetaData.k().F();
            Intrinsics.checkNotNullExpressionValue(videoConfigF, "getVideoConfig(...)");
            MetaData metaDataE = MetaData.E();
            Intrinsics.checkNotNullExpressionValue(metaDataE, "getInstance(...)");
            aj ajVar = (aj) JsonParser.fromJson(adm, aj.class);
            if (ajVar != null && ajVar.getVastTag() != null) {
                String strD0 = metaDataE.d0();
                if (!ajVar.isRecordHops() || TextUtils.isEmpty(strD0)) {
                    yiVar = null;
                } else {
                    lb lbVar = this.f64823h;
                    Intrinsics.checkNotNull(strD0);
                    yiVar = new yi(lbVar, strD0, ajVar.getPartnerResponse(), ajVar.getPartnerName(), ajVar.isSkipFailed());
                }
                com.startapp.sdk.ads.video.vast.a aVar = new com.startapp.sdk.ads.video.vast.a(this.f64043c, ((tk) this.f64822g.a()).a());
                aVar.f63921f = videoConfigF.f();
                aVar.f63918c = new cj() { // from class: com.startapp.sdk.internal.im
                    @Override // com.startapp.sdk.internal.cj
                    public final void a(List list, VASTErrorCodes vASTErrorCodes) {
                        k8.a(this.f64736a, list, vASTErrorCodes);
                    }
                };
                xi xiVarA = aVar.a(ajVar.getVastTag(), yiVar);
                if (xiVarA != null) {
                    Ad ad2 = this.f64041a;
                    ej ejVar = (ad2 != null ? ad2.getType() : null) != Ad.AdType.REWARDED_VIDEO ? new ej(ajVar.getSkipafter(), ajVar.getSkipmin()) : null;
                    Ad ad3 = this.f64041a;
                    jj jjVar = ad3 instanceof jj ? (jj) ad3 : null;
                    if (jjVar != null) {
                        jjVar.f64799r = new VideoAdDetails(xiVarA, videoConfigF, ejVar);
                        Integer num = xiVarA.f65573q;
                        if (num != null && xiVarA.f65574r != null) {
                            if (num.intValue() > xiVarA.f65574r.intValue()) {
                                if (Orientation.LANDSCAPE == Orientation.PORTRAIT) {
                                    jjVar.f65000e = 1;
                                } else {
                                    jjVar.f65000e = 2;
                                }
                            } else {
                                Orientation orientation = Orientation.PORTRAIT;
                                jjVar.f65000e = 1;
                            }
                        }
                        String ttlSec = ajVar.getTtlSec();
                        if (ttlSec != null) {
                            jjVar.c(ttlSec);
                        }
                    }
                    String admTag = ajVar.getAdmTag();
                    Intrinsics.checkNotNullExpressionValue(admTag, "getAdmTag(...)");
                    return super.a(admTag);
                }
                throw new RuntimeException("Vast config error");
            }
            return super.a(adm);
        } catch (Throwable th2) {
            Ad ad4 = this.f64041a;
            jj jjVar2 = ad4 instanceof jj ? (jj) ad4 : null;
            if (jjVar2 != null) {
                jjVar2.setErrorMessage(th2.getMessage());
            }
            return null;
        }
    }
}
