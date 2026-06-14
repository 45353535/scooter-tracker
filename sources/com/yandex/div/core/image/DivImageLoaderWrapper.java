package com.yandex.div.core.image;

import android.content.Context;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import f7.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/image/DivImageLoaderWrapper;", "Lcom/yandex/div/core/images/DivImageLoader;", "providedImageLoader", "Landroid/content/Context;", "divContext", "<init>", "(Lcom/yandex/div/core/images/DivImageLoader;Landroid/content/Context;)V", "", "initialUrl", "getModifiedUrl", "(Ljava/lang/String;)Ljava/lang/String;", "imageUrl", "getProperLoader", "(Ljava/lang/String;)Lcom/yandex/div/core/images/DivImageLoader;", "", "isSvg", "(Ljava/lang/String;)Z", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "callback", "Lcom/yandex/div/core/images/LoadReference;", "loadImage", "(Ljava/lang/String;Lcom/yandex/div/core/images/DivImageDownloadCallback;)Lcom/yandex/div/core/images/LoadReference;", "loadImageBytes", "Lcom/yandex/div/core/images/DivImageLoader;", "", "Lcom/yandex/div/core/image/DivImageUrlModifier;", "modifiers", "Ljava/util/List;", "Lcom/yandex/div/svg/SvgDivImageLoader;", "svgImageLoader", "Lcom/yandex/div/svg/SvgDivImageLoader;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivImageLoaderWrapper implements DivImageLoader {

    @NotNull
    private final List<DivImageUrlModifier> modifiers = CollectionsKt.listOf(new DivImageAssetUrlModifier());

    @NotNull
    private final DivImageLoader providedImageLoader;

    @Nullable
    private final SvgDivImageLoader svgImageLoader;

    public DivImageLoaderWrapper(@NotNull DivImageLoader divImageLoader, @NotNull Context context) {
        this.providedImageLoader = divImageLoader;
        this.svgImageLoader = !divImageLoader.hasSvgSupport().booleanValue() ? new SvgDivImageLoader(context) : null;
    }

    private final String getModifiedUrl(String initialUrl) {
        Iterator<T> it = this.modifiers.iterator();
        while (it.hasNext()) {
            initialUrl = ((DivImageUrlModifier) it.next()).modifyImageUrl(initialUrl);
        }
        return initialUrl;
    }

    private final DivImageLoader getProperLoader(String imageUrl) {
        return (this.svgImageLoader == null || !isSvg(imageUrl)) ? this.providedImageLoader : this.svgImageLoader;
    }

    private final boolean isSvg(String imageUrl) {
        int iU0 = StringsKt.u0(imageUrl, '?', 0, false, 6, null);
        if (iU0 < 0) {
            iU0 = imageUrl.length();
        }
        String strSubstring = imageUrl.substring(0, iU0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt.M(strSubstring, ".svg", false, 2, null);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ Boolean hasSvgSupport() {
        return a.a(this);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return a.b(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return a.c(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        String modifiedUrl = getModifiedUrl(imageUrl);
        return getProperLoader(modifiedUrl).loadImage(modifiedUrl, callback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        String modifiedUrl = getModifiedUrl(imageUrl);
        return getProperLoader(modifiedUrl).loadImageBytes(modifiedUrl, callback);
    }
}
