package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
public class ClickTracking {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Attribute
    private String f96076id;

    @Text
    private String text;

    public String getId() {
        return this.f96076id;
    }

    public String getText() {
        return TextUtils.isEmpty(this.text) ? "" : this.text.trim();
    }
}
