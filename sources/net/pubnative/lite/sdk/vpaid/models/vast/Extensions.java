package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class Extensions {

    @Tag(VastExtensionParentXmlManager.f66980w)
    private List<Extension> extensionList;

    public List<Extension> getExtensions() {
        return this.extensionList;
    }
}
