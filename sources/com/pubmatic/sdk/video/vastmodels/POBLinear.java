package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.taurusx.tax.f.s;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBLinear extends POBVastCreative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f63197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f63198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f63200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f63201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f63203g = -1.0d;

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63202f = pOBNodeBuilder.getNodeValue("../UniversalAdId");
        String nodeValue = pOBNodeBuilder.getNodeValue("Duration");
        if (nodeValue != null) {
            this.f63197a = POBUtils.getSeconds(nodeValue);
        }
        this.f63198b = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.mClickThroughURL = pOBNodeBuilder.getNodeValue("VideoClicks/ClickThrough");
        this.mClickTrackers = pOBNodeBuilder.getStringList("VideoClicks/ClickTracking");
        this.f63199c = pOBNodeBuilder.getNodeValue("VideoClicks/CustomClick");
        this.f63200d = pOBNodeBuilder.getObjectList("MediaFiles/MediaFile", POBMediaFile.class);
        this.f63201e = pOBNodeBuilder.getObjectList("Icons/Icon", POBIcon.class);
        String attributeValue = pOBNodeBuilder.getAttributeValue(s.f66023p);
        if (attributeValue == null) {
            this.f63203g = -1.0d;
            return;
        }
        double dConvertToSeconds = POBUtils.convertToSeconds(nodeValue, attributeValue);
        this.f63203g = dConvertToSeconds;
        this.f63203g = Math.max(0.0d, dConvertToSeconds);
    }

    @Nullable
    public String getCustomClick() {
        return this.f63199c;
    }

    public double getDuration() {
        return this.f63197a;
    }

    @Nullable
    public List<POBIcon> getIconList() {
        return this.f63201e;
    }

    @Nullable
    public List<POBMediaFile> getMediaFiles() {
        return this.f63200d;
    }

    public double getSkipOffset() {
        return this.f63203g;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f63198b;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f63202f;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.LINEAR;
    }
}
