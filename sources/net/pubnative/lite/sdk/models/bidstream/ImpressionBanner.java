package net.pubnative.lite.sdk.models.bidstream;

import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ImpressionBanner extends Signal {

    @BidParam(name = "expdir")
    public final List<Integer> expdir;

    @BidParam(name = POBCoreNativeConstants.NATIVE_MIMES)
    public final List<String> mimes;

    @BidParam(name = POBCTAOverlayData.KEY_CTA_POS)
    public final int pos;

    @BidParam(name = "topframe")
    public final int topframe;

    public ImpressionBanner() {
        this(0);
    }

    public ImpressionBanner(int i10) {
        this(i10, new ArrayList());
    }

    public ImpressionBanner(int i10, List<Integer> list) {
        this.topframe = 1;
        this.pos = i10;
        this.expdir = list;
        ArrayList arrayList = new ArrayList();
        this.mimes = arrayList;
        arrayList.add("text/html");
        arrayList.add("text/javascript");
    }
}
