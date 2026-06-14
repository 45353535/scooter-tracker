package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBNonLinear extends POBVastCreative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63219g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f63220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f63221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f63222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f63223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f63224l;

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63213a = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f63214b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f63215c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("expandedWidth"));
        this.f63216d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("expandedHeight"));
        this.f63217e = pOBNodeBuilder.getAttributeValue("minSuggestedDuration");
        this.f63218f = POBUtils.getBooleanValue(pOBNodeBuilder.getAttributeValue("scalable"));
        String attributeValue = pOBNodeBuilder.getAttributeValue("maintainAspectRatio");
        if (attributeValue != null && !attributeValue.isEmpty()) {
            this.f63219g = POBUtils.getBooleanValue(attributeValue);
        }
        this.f63220h = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.f63221i = pOBNodeBuilder.getNodeValue("NonLinearClickThrough");
        this.f63222j = pOBNodeBuilder.getStringList("NonLinearClickTracking");
        this.f63223k = new ArrayList();
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.STATIC_RESOURCE, POBResource.class);
        if (pOBResource != null) {
            this.f63223k.add(pOBResource);
        }
        POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.HTML_RESOURCE, POBResource.class);
        if (pOBResource2 != null) {
            this.f63223k.add(pOBResource2);
        }
        POBResource pOBResource3 = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.IFRAME_RESOURCE, POBResource.class);
        if (pOBResource3 != null) {
            this.f63223k.add(pOBResource3);
        }
        this.f63224l = pOBNodeBuilder.getNodeValue("../../UniversalAdId");
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public String getClickThroughURL() {
        return this.f63221i;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.f63222j;
    }

    public int getExpandedHeight() {
        return this.f63216d;
    }

    public int getExpandedWidth() {
        return this.f63215c;
    }

    public int getHeight() {
        return this.f63214b;
    }

    public boolean getMaintainAspectRatio() {
        return this.f63219g;
    }

    @Nullable
    public String getMinSuggestedDuration() {
        return this.f63217e;
    }

    @Nullable
    public List<POBResource> getResource() {
        return this.f63223k;
    }

    public boolean getScalable() {
        return this.f63218f;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f63220h;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f63224l;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.NONLINEAR;
    }

    public int getWidth() {
        return this.f63213a;
    }
}
