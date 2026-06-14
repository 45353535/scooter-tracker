package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
public class AdSystem {

    @Text
    private String text;

    @Attribute
    private String version;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String getVersion() {
        return this.version;
    }
}
