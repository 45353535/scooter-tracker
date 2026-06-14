package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class IconClickFallbackImage {

    @Tag
    private AltText altText;

    @Attribute
    private String height;

    @Tag(VastResourceXmlManager.STATIC_RESOURCE)
    private List<StaticResource> staticResources;

    @Attribute
    private String width;

    public AltText getAltText() {
        return this.altText;
    }

    public String getHeight() {
        return this.height;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public String getWidth() {
        return this.width;
    }
}
