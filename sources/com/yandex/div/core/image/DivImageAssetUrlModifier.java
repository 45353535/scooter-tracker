package com.yandex.div.core.image;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/image/DivImageAssetUrlModifier;", "Lcom/yandex/div/core/image/DivImageUrlModifier;", "()V", "modifyImageUrl", "", "imageUrl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivImageAssetUrlModifier implements DivImageUrlModifier {
    @Override // com.yandex.div.core.image.DivImageUrlModifier
    @NotNull
    public String modifyImageUrl(@NotNull String imageUrl) {
        if (!StringsKt.a0(imageUrl, "divkit-asset", false, 2, null)) {
            return imageUrl;
        }
        return "file:///android_asset/divkit/" + StringsKt.P0(imageUrl, "divkit-asset://");
    }
}
