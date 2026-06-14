package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.f.s;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class VideoClicks {

    @Tag
    private ClickThrough clickThrough;

    @Tag(s.f66026s)
    private List<ClickTracking> clickTrackingList;

    @Tag("CustomClick")
    private List<CustomClick> customClickList;

    public ClickThrough getClickThrough() {
        return this.clickThrough;
    }

    public List<ClickTracking> getClickTrackingList() {
        return this.clickTrackingList;
    }

    public List<CustomClick> getCustomClickList() {
        return this.customClickList;
    }
}
