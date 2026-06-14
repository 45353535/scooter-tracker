package com.mobilefuse.sdk;

import com.vungle.ads.internal.NativeAdInternal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/NativeAssetId;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "AD_TITLE", "ICON_IMAGE", NativeAdInternal.TOKEN_MAIN_IMAGE, "VIDEO", "SPONSORED_TEXT", "DESCRIPTION_TEXT", "DISPLAY_URL", NativeAdInternal.TOKEN_CTA_BUTTON_TEXT, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public enum NativeAssetId {
    AD_TITLE(100),
    ICON_IMAGE(200),
    MAIN_IMAGE(201),
    VIDEO(300),
    SPONSORED_TEXT(400),
    DESCRIPTION_TEXT(401),
    DISPLAY_URL(402),
    CTA_BUTTON_TEXT(403);

    private final int id;

    NativeAssetId(int i10) {
        this.id = i10;
    }

    public final int getId() {
        return this.id;
    }
}
