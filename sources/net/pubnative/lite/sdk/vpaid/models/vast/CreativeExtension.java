package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
public class CreativeExtension {

    @Text
    private String text;

    @Attribute
    private String type;

    @Tag
    private VerveCTAButton verveCTAButton;

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }

    public String getType() {
        return this.type;
    }

    public VerveCTAButton getVerveCTAButton() {
        return this.verveCTAButton;
    }
}
