package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.vast.VastIconXmlManager;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class IconClicks {

    @Tag
    private IconClickFallbackImages iconClickFallbackImages;

    @Tag
    private IconClickThrough iconClickThrough;

    @Tag(VastIconXmlManager.ICON_CLICK_TRACKING)
    private List<IconClickTracking> iconClickTrackingList;

    public IconClickFallbackImages getIconClickFallbackImages() {
        return this.iconClickFallbackImages;
    }

    public IconClickThrough getIconClickThrough() {
        return this.iconClickThrough;
    }

    public List<IconClickTracking> getIconClickTrackingList() {
        return this.iconClickTrackingList;
    }
}
