package com.startapp.sdk.ads.external;

import android.graphics.Point;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.g;
import com.taurusx.tax.w.s.w;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006¨\u0006\""}, d2 = {"Lcom/startapp/sdk/ads/external/ExternalAdTracking;", "Lcom/startapp/sdk/adsbase/commontracking/TrackingParams;", "", JsonStorageKeyNames.SESSION_ID_KEY, "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sioPrice", "getSioPrice", "mappedPrice", "getMappedPrice", "Lcom/startapp/sdk/adsbase/model/AdPreferences$Placement;", "placement", "Lcom/startapp/sdk/adsbase/model/AdPreferences$Placement;", "getPlacement", "()Lcom/startapp/sdk/adsbase/model/AdPreferences$Placement;", "requestTimeStamp", "getRequestTimeStamp", "", "videoMode", "Ljava/lang/Boolean;", "getVideoMode", "()Ljava/lang/Boolean;", "video", "getVideo", "Landroid/graphics/Point;", "size", "Landroid/graphics/Point;", "getSize", "()Landroid/graphics/Point;", "newAdType", "getNewAdType", "dparam", "getDparam", "sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExternalAdTracking extends TrackingParams {
    private static final long serialVersionUID = 8119468204117511007L;

    @Nullable
    private final String dparam;

    @Nullable
    private final String mappedPrice;

    @Nullable
    private final String newAdType;

    @Nullable
    private final AdPreferences.Placement placement;

    @Nullable
    private final String requestTimeStamp;

    @NotNull
    private final String sessionId;

    @Nullable
    private final String sioPrice;

    @Nullable
    private final Point size;

    @Nullable
    private final String video;

    @Nullable
    private final Boolean videoMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalAdTracking(String sessionId, String str, String str2, String str3, AdPreferences.Placement placement, String str4, Boolean bool, String str5, Point point, String str6) {
        ExternalAdConfig googleads;
        super(str);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.sioPrice = str2;
        this.mappedPrice = str3;
        this.placement = placement;
        this.requestTimeStamp = str4;
        this.videoMode = bool;
        this.video = str5;
        this.size = point;
        this.newAdType = str6;
        ExternalConfig externalConfigU = MetaData.E().u();
        this.dparam = (externalConfigU == null || (googleads = externalConfigU.getGoogleads()) == null) ? null : googleads.getDparam();
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        String strE = super.e();
        Intrinsics.checkNotNullExpressionValue(strE, "getQueryString(...)");
        if (!StringsKt.g0(strE, "?", false, 2, null) || !StringsKt.a0(strE, "?", false, 2, null)) {
            if (StringsKt.g0(strE, C4240b4.j.f42670c, false, 2, null) && StringsKt.a0(strE, C4240b4.j.f42670c, false, 2, null)) {
                strE = strE.substring(1);
                Intrinsics.checkNotNullExpressionValue(strE, "substring(...)");
            }
            strE = "?" + strE;
        }
        String string = strE + "&sessionId=" + this.sessionId + '&' + g.f64534b + D5.T + g.a();
        String str = this.dparam;
        if (str != null) {
            string = string + "&d=" + str;
        }
        String str2 = this.sioPrice;
        if (str2 != null) {
            string = (string + "&supplyBidFloor=" + str2) + "&bidPrice=" + str2;
        }
        String str3 = this.mappedPrice;
        if (str3 != null) {
            string = ((string + "&originalPrice=" + str3) + "&price=" + str3) + "&cpmPred=" + str3;
        }
        AdPreferences.Placement placement = this.placement;
        if (placement != null) {
            string = string + "&placement=" + placement.name();
        }
        String str4 = this.requestTimeStamp;
        if (str4 != null) {
            string = string + "&requestTs=" + str4;
        }
        Boolean bool = this.videoMode;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("&videoMode=");
            sb2.append(zBooleanValue ? w.f67531f : "INTERSTITIAL");
            string = sb2.toString();
        }
        String str5 = this.video;
        if (str5 != null) {
            string = string + "&video=" + str5;
        }
        Point point = this.size;
        if (point != null) {
            string = string + "&formatWidth=" + point.x + "&formatHeight=" + point.y;
        }
        String str6 = this.newAdType;
        if (str6 == null) {
            return string;
        }
        return string + "&newAdType=" + str6;
    }
}
