package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBResource;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.taurusx.tax.vast.VastIconXmlManager;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBIcon implements POBXMLNodeListener, POBAdDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f63195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBResource f63196i;

    @Nullable
    protected String mClickThroughURL;

    @Nullable
    protected List<String> mClickTrackers;

    @Nullable
    protected List<String> mViewTrackers;

    private String a() {
        POBResource pOBResource = this.f63196i;
        if (pOBResource == null) {
            return null;
        }
        if (pOBResource.getResourceType() == POBResource.a.HTML) {
            return this.f63196i.getResource();
        }
        if (this.f63196i.getResourceType() != POBResource.a.STATIC) {
            return String.format("<iframe src =\"%s\" width = \"100%%\" height = \"100%%\" frameBorder=\"0\" style = \"display: inline;max-height:100%%; max-width: 100%%;\" />", this.f63196i.getResource());
        }
        return String.format("<a href = \"%s\">%s</a>", POBUtils.isNullOrEmpty(this.mClickThroughURL) ? "https://obplaceholder.click.com/" : this.mClickThroughURL, String.format("<img src = \"%s\" style = \"display: block; width:100%%; height: 100%%;\"/>", this.f63196i.getResource()));
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63188a = pOBNodeBuilder.getAttributeValue("program");
        this.f63189b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f63190c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f63191d = pOBNodeBuilder.getAttributeValue("xPosition");
        this.f63192e = pOBNodeBuilder.getAttributeValue("yPosition");
        String attributeValue = pOBNodeBuilder.getAttributeValue("duration");
        if (attributeValue != null) {
            this.f63193f = (int) POBUtils.getSeconds(attributeValue);
        }
        String attributeValue2 = pOBNodeBuilder.getAttributeValue("offset");
        if (attributeValue2 != null) {
            this.f63194g = (int) POBUtils.getSeconds(attributeValue2);
        }
        this.f63195h = pOBNodeBuilder.getAttributeValue("apiFramework");
        this.mClickThroughURL = pOBNodeBuilder.getNodeValue("IconClicks/IconClickThrough");
        this.mClickTrackers = pOBNodeBuilder.getStringList("IconClicks/IconClickTracking");
        this.mViewTrackers = pOBNodeBuilder.getStringList(VastIconXmlManager.ICON_VIEW_TRACKING);
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.STATIC_RESOURCE, POBResource.class);
        this.f63196i = pOBResource;
        if (pOBResource == null) {
            POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.HTML_RESOURCE, POBResource.class);
            this.f63196i = pOBResource2;
            if (pOBResource2 == null) {
                this.f63196i = (POBResource) pOBNodeBuilder.getNodeObject(VastResourceXmlManager.IFRAME_RESOURCE, POBResource.class);
            }
        }
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
        return this.f63195h;
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

    @Nullable
    public String getClickThroughURL() {
        return this.mClickThroughURL;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.mClickTrackers;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.f63190c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.f63189b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return null;
    }

    public int getDuration() {
        return this.f63193f;
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

    public int getOffset() {
        return this.f63194g;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return null;
    }

    @Nullable
    public String getProgram() {
        return this.f63188a;
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
    public POBResource getResource() {
        return this.f63196i;
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

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return null;
    }

    @Nullable
    public List<String> getViewTrackers() {
        return this.mViewTrackers;
    }

    @Nullable
    public String getXPosition() {
        return this.f63191d;
    }

    @Nullable
    public String getYPosition() {
        return this.f63192e;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return false;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return false;
    }
}
