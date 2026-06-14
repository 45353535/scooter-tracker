package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.f.y;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class CompanionAds {

    @Tag(y.f66058y)
    private List<Companion> companions;

    @Attribute
    private String required;

    public List<Companion> getCompanions() {
        return this.companions;
    }

    public String getRequired() {
        return this.required;
    }
}
