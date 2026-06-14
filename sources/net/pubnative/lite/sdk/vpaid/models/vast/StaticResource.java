package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
public class StaticResource {

    @Attribute
    private String creativeType;

    @Text
    private String text;

    public String getCreativeType() {
        return this.creativeType;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}
