package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.adjust.sdk.Constants;
import com.inmobi.media.A8;
import com.inmobi.media.Gg;
import com.inmobi.media.Hg;
import com.inmobi.media.O0;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R*\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u00168\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001bR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001bR\u001a\u0010-\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001bR\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010?\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b?\u0010\u0019\u001a\u0004\b@\u0010\u001bR\u0019\u0010B\u001a\u0004\u0018\u00010A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010P\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010\u0019\u001a\u0004\bQ\u0010\u001bR\"\u0010R\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0019\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u0010UR \u0010W\u001a\b\u0012\u0004\u0012\u00020V0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u00102\u001a\u0004\bX\u00104R \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u00102\u001a\u0004\b[\u00104R\u0014\u0010\\\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0016\u0010]\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0013\u0010`\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/Ad;", "", "<init>", "()V", "Lcom/inmobi/media/Gg;", "getPubContent", "()Lcom/inmobi/media/Gg;", "Lcom/inmobi/media/O0;", "_features", "Lcom/inmobi/media/O0;", "_pubContent", "Lcom/inmobi/media/Gg;", "", "insertionTimestampInMillis", "J", "getInsertionTimestampInMillis", "()J", "setInsertionTimestampInMillis", "(J)V", "expiryTimestampInMillis", "getExpiryTimestampInMillis", "setExpiryTimestampInMillis", "", "value", "markupType", "Ljava/lang/String;", "getMarkupType", "()Ljava/lang/String;", "getMarkupType$annotations", "tracking", "getTracking", "getTracking$annotations", "expiry", "Ljava/lang/Long;", "getExpiry", "()Ljava/lang/Long;", "", "allowAutoRedirection", "Z", "getAllowAutoRedirection", "()Z", "creativeId", "getCreativeId", "impressionId", "getImpressionId", "telemetryMetadataBlob", "getTelemetryMetadataBlob", "", "Lcom/inmobi/media/ads/network/common/model/Viewability;", "viewability", "Ljava/util/List;", "getViewability", "()Ljava/util/List;", "Lorg/json/JSONObject;", "transaction", "Lorg/json/JSONObject;", "getTransaction", "()Lorg/json/JSONObject;", "", "rewards", "Ljava/util/Map;", "getRewards", "()Ljava/util/Map;", "baseEventUrl", "getBaseEventUrl", "Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "metaInfo", "Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "getMetaInfo", "()Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "Lcom/inmobi/media/ads/network/common/model/ContextData;", "contextData", "Lcom/inmobi/media/ads/network/common/model/ContextData;", "getContextData", "()Lcom/inmobi/media/ads/network/common/model/ContextData;", "Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "adQualityControl", "Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "getAdQualityControl", "()Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "bidBundle", "getBidBundle", "webVast", "getWebVast", "setWebVast", "(Ljava/lang/String;)V", "Lcom/inmobi/media/ads/network/common/model/Trackers;", Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "getTrackers$media_release", "Lcom/inmobi/media/ads/network/common/model/TrackingInfo;", "trackingInfo", "getTrackingInfo$media_release", "pubContent", CmcdConfiguration.KEY_STREAMING_FORMAT, "getFeatures", "()Lcom/inmobi/media/O0;", AdaptiveRenderingConfig.NATIVE_FEATURES_KEY, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Ad {

    @A8
    @Nullable
    private O0 _features;

    @A8
    @Nullable
    private Gg _pubContent;

    @Nullable
    private final AdQualityControl adQualityControl;
    private final boolean allowAutoRedirection;

    @Nullable
    private final String baseEventUrl;

    @Nullable
    private final String bidBundle;

    @Nullable
    private final ContextData contextData;

    @A8
    private long expiryTimestampInMillis;

    @Nullable
    private final MetaInfo metaInfo;

    @Nullable
    private final String sf;

    @A8
    private long insertionTimestampInMillis = System.currentTimeMillis();

    @NotNull
    private String markupType = "unknown";

    @NotNull
    private final String tracking = "unknown";

    @Nullable
    private Long expiry = -1L;

    @NotNull
    private final String creativeId = "";

    @NotNull
    private final String impressionId = "";

    @NotNull
    private final String telemetryMetadataBlob = "";

    @NotNull
    private final List<Viewability> viewability = new ArrayList();

    @NotNull
    private final JSONObject transaction = new JSONObject();

    @NotNull
    private final Map<String, String> rewards = new HashMap();

    @NotNull
    private String webVast = "";

    @NotNull
    private final List<Trackers> trackers = new ArrayList();

    @NotNull
    private final List<TrackingInfo> trackingInfo = new ArrayList();

    @NotNull
    private final String pubContent = "";

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getTracking$annotations() {
    }

    @Nullable
    public final AdQualityControl getAdQualityControl() {
        return this.adQualityControl;
    }

    public final boolean getAllowAutoRedirection() {
        return this.allowAutoRedirection;
    }

    @Nullable
    public final String getBaseEventUrl() {
        return this.baseEventUrl;
    }

    @Nullable
    public final String getBidBundle() {
        return this.bidBundle;
    }

    @Nullable
    public final ContextData getContextData() {
        return this.contextData;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    @Nullable
    public final Long getExpiry() {
        return this.expiry;
    }

    public final long getExpiryTimestampInMillis() {
        return this.expiryTimestampInMillis;
    }

    @Nullable
    public final O0 getFeatures() {
        O0 o02 = this._features;
        if (o02 != null) {
            return o02;
        }
        String str = this.sf;
        if (str == null) {
            return null;
        }
        O0 o03 = new O0(str);
        this._features = o03;
        return o03;
    }

    @NotNull
    public final String getImpressionId() {
        return this.impressionId;
    }

    public final long getInsertionTimestampInMillis() {
        return this.insertionTimestampInMillis;
    }

    @NotNull
    public final String getMarkupType() {
        return this.markupType;
    }

    @Nullable
    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    @NotNull
    public final Gg getPubContent() throws IllegalStateException {
        Gg gg2 = this._pubContent;
        if (gg2 != null) {
            return gg2;
        }
        Gg ggA = Hg.a(this.pubContent, this.markupType);
        this._pubContent = ggA;
        return ggA;
    }

    @NotNull
    public final Map<String, String> getRewards() {
        return this.rewards;
    }

    @NotNull
    public final String getTelemetryMetadataBlob() {
        return this.telemetryMetadataBlob;
    }

    @NotNull
    public final List<Trackers> getTrackers$media_release() {
        return this.trackers;
    }

    @NotNull
    public final String getTracking() {
        return this.tracking;
    }

    @NotNull
    public final List<TrackingInfo> getTrackingInfo$media_release() {
        return this.trackingInfo;
    }

    @NotNull
    public final JSONObject getTransaction() {
        return this.transaction;
    }

    @NotNull
    public final List<Viewability> getViewability() {
        return this.viewability;
    }

    @NotNull
    public final String getWebVast() {
        return this.webVast;
    }

    public final void setExpiryTimestampInMillis(long j10) {
        this.expiryTimestampInMillis = j10;
    }

    public final void setInsertionTimestampInMillis(long j10) {
        this.insertionTimestampInMillis = j10;
    }

    public final void setWebVast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.webVast = str;
    }
}
