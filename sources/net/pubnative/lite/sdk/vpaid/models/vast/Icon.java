package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.vast.VastIconXmlManager;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class Icon {

    @Attribute
    private String altText;

    @Attribute
    private String apiFramework;

    @Attribute
    private String duration;

    @Attribute
    private String height;

    @Attribute
    private String hoverText;

    @Tag(VastResourceXmlManager.HTML_RESOURCE)
    private List<HTMLResource> htmlResources;

    @Tag(VastResourceXmlManager.IFRAME_RESOURCE)
    private List<IFrameResource> iFrameResources;

    @Tag
    private IconClicks iconClicks;

    @Tag(VastIconXmlManager.ICON_VIEW_TRACKING)
    private List<IconViewTracking> iconViewTrackingList;

    @Attribute
    private String offset;

    @Attribute
    private String program;

    @Attribute
    private String pxratio;

    @Tag(VastResourceXmlManager.STATIC_RESOURCE)
    private List<StaticResource> staticResources;

    @Attribute
    private String width;

    @Attribute
    private String xPosition;

    @Attribute
    private String yPosition;

    public String getAltText() {
        return this.altText;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getHeight() {
        return this.height;
    }

    public String getHoverText() {
        return this.hoverText;
    }

    public List<HTMLResource> getHtmlResources() {
        return this.htmlResources;
    }

    public List<IFrameResource> getIFrameResources() {
        return this.iFrameResources;
    }

    public IconClicks getIconClicks() {
        return this.iconClicks;
    }

    public List<IconViewTracking> getIconViewTrackingList() {
        return this.iconViewTrackingList;
    }

    public String getOffset() {
        return this.offset;
    }

    public String getProgram() {
        return this.program;
    }

    public String getPxratio() {
        return this.pxratio;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public String getWidth() {
        return this.width;
    }

    public String getXPosition() {
        return this.xPosition;
    }

    public String getYPosition() {
        return this.yPosition;
    }
}
