package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class NonLinear {

    @Tag
    private AdParameters adParameters;

    @Attribute
    private String apiFramework;

    @Attribute
    private String expandedHeight;

    @Attribute
    private String expandedWidth;

    @Attribute
    private String height;

    @Tag(VastResourceXmlManager.HTML_RESOURCE)
    private List<HTMLResource> htmlResources;

    @Tag(VastResourceXmlManager.IFRAME_RESOURCE)
    private List<IFrameResource> iFrameResources;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Attribute
    private String f96085id;

    @Attribute
    private String maintainAspectRatio;

    @Attribute
    private String minSuggestedDuration;

    @Tag
    private NonLinearClickThrough nonLinearClickThrough;

    @Tag("NonLinearClickTracking")
    private List<NonLinearClickTracking> nonLinearClickTrackingList;

    @Attribute
    private String scalable;

    @Tag(VastResourceXmlManager.STATIC_RESOURCE)
    private List<StaticResource> staticResources;

    @Attribute
    private String width;

    public AdParameters getAdParameters() {
        return this.adParameters;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getExpandedHeight() {
        return this.expandedHeight;
    }

    public String getExpandedWidth() {
        return this.expandedWidth;
    }

    public String getHeight() {
        return this.height;
    }

    public List<HTMLResource> getHtmlResources() {
        return this.htmlResources;
    }

    public String getId() {
        return this.f96085id;
    }

    public String getMinSuggestedDuration() {
        return this.minSuggestedDuration;
    }

    public NonLinearClickThrough getNonLinearClickThrough() {
        return this.nonLinearClickThrough;
    }

    public List<NonLinearClickTracking> getNonLinearClickTrackingList() {
        return this.nonLinearClickTrackingList;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public String getWidth() {
        return this.width;
    }

    public List<IFrameResource> getiFrameResources() {
        return this.iFrameResources;
    }

    public String isMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    public String isScalable() {
        return this.scalable;
    }
}
