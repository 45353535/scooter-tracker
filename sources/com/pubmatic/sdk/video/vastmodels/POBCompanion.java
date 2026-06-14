package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBResource;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.taurusx.tax.f.c;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBCompanion extends POBVastCreative implements POBAdDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f63182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f63183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f63184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBResource f63185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f63186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f63187k;

    private String a() {
        POBResource pOBResource = this.f63185i;
        if (pOBResource == null) {
            return null;
        }
        if (pOBResource.getResourceType() == POBResource.a.HTML) {
            return this.f63185i.getResource();
        }
        if (this.f63185i.getResourceType() != POBResource.a.STATIC) {
            return String.format("<iframe src =\"%s\" width = \"100%%\" height = \"100%%\" frameBorder=\"0\" style = \"display: inline;max-height:100%%; max-width: 100%%;\" />", this.f63185i.getResource());
        }
        return String.format("<a href = \"%s\">%s</a>", POBUtils.isNullOrEmpty(this.f63183g) ? "https://obplaceholder.click.com/" : this.f63183g, String.format("<img src = \"%s\" style = \"display: block; width:100%%; height: 100%%; object-fit:scale-down; background-color:black;\"/>", this.f63185i.getResource()));
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63177a = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f63178b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f63179c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("assetWidth"));
        this.f63180d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("assetHeight"));
        this.f63181e = pOBNodeBuilder.getAttributeValue("apiFramework");
        this.f63182f = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.f63183g = pOBNodeBuilder.getNodeValue(c.f66001o);
        this.f63184h = pOBNodeBuilder.getStringList(c.f66002s);
        this.f63187k = pOBNodeBuilder.getAttributeValue("renderingMode");
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.HTML_RESOURCE, POBResource.class);
        this.f63185i = pOBResource;
        if (pOBResource == null) {
            POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.STATIC_RESOURCE, POBResource.class);
            this.f63185i = pOBResource2;
            if (pOBResource2 == null) {
                this.f63185i = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.IFRAME_RESOURCE, POBResource.class);
            }
        }
        this.f63186j = pOBNodeBuilder.getNodeValue("../../UniversalAdId");
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i10, int i11) {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean enableDsaInfoIcon() {
        return false;
    }

    @Nullable
    public String getApiFramework() {
        return this.f63181e;
    }

    public int getAssetHeight() {
        return this.f63180d;
    }

    public int getAssetWidth() {
        return this.f63179c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBCTAOverlayData getCTAOverlayData() {
        return null;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public String getClickThroughURL() {
        return this.f63183g;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.f63184h;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.f63178b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.f63177a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return POBVastCreative.CreativeType.COMPANION.name();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return null;
    }

    public int getHeight() {
        return this.f63178b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getId() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @NonNull
    public POBImpressionCountingMethod getImpressionCountingMethod() {
        return POBImpressionCountingMethod.ON_LOAD;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getRawBid() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getRefreshInterval() {
        return 0;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getRenderableContent() {
        return a();
    }

    @Nullable
    public String getRenderingMode() {
        return this.f63187k;
    }

    @Nullable
    public POBResource getResource() {
        return this.f63185i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getStatus() {
        return 0;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public Map<String, String> getTargetingInfo() {
        return null;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f63182f;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return null;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f63186j;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.COMPANION;
    }

    public int getWidth() {
        return this.f63177a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return true;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return false;
    }

    public void setRenderingMode(@Nullable String str) {
        this.f63187k = str;
    }

    @NonNull
    public String toString() {
        return "POBCompanion{width=" + this.f63177a + ", height=" + this.f63178b + ", renderingMode='" + this.f63187k + "'}";
    }
}
