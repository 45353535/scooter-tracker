package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;", "", "<init>", "()V", "assetsObject", "Lcom/inmobi/media/ads/network/inmobiJson/model/JsonAssetObject;", "getAssetsObject", "()Lcom/inmobi/media/ads/network/inmobiJson/model/JsonAssetObject;", "mainLink", "Lcom/inmobi/media/ads/network/inmobiJson/model/MainLink;", "getMainLink", "()Lcom/inmobi/media/ads/network/inmobiJson/model/MainLink;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiJsonResponse {

    @Nullable
    private final JsonAssetObject assetsObject;

    @Nullable
    private final MainLink mainLink;

    @Nullable
    public final JsonAssetObject getAssetsObject() {
        return this.assetsObject;
    }

    @Nullable
    public final MainLink getMainLink() {
        return this.mainLink;
    }
}
