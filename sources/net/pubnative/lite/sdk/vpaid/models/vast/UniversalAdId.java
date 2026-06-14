package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
public class UniversalAdId {

    @Attribute
    private String idRegistry;

    @Attribute
    private String idValue;

    @Text
    private String text;

    public String getIdRegistry() {
        return this.idRegistry;
    }

    public String getIdValue() {
        return this.idValue;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}
