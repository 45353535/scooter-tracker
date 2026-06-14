package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.o.g;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import eg.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\nH\u0003J\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0087\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;)V", "getBundledAsset", "Landroid/webkit/WebResourceResponse;", g.f66428y, "Landroid/net/Uri;", "getCachedAsset", "getNotFoundResponse", "invoke", "webviewType", "", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCachedAsset {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final Context context;

    public GetCachedAsset(@NotNull CacheRepository cacheRepository, @NotNull Context context, @NotNull CacheWebViewAssets cacheWebViewAssets) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    @RequiresApi(21)
    private final WebResourceResponse getBundledAsset(Uri uri) {
        String strH1 = StringsKt.h1(String.valueOf(uri.getPath()), "/", null, 2, null);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strH1);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strH1), null, inputStreamOpen);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    @RequiresApi(21)
    private final WebResourceResponse getCachedAsset(Uri uri) {
        Object objB;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) h.b(null, new GetCachedAsset$getCachedAsset$result$1(this, StringsKt.l1(string, "/", null, 2, null), null), 1, null);
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new FileInputStream(file));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objB;
        if (fileInputStream == null) {
            return null;
        }
        String filePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
    }

    @RequiresApi(21)
    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", D5.N, 404, "Not Found", MapsKt.emptyMap(), new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String webviewType) {
        Object objB;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(webviewType);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        sb2.append(StringsKt.l1(StringsKt.p1(string, "?", null, 2, null), "/", null, 2, null));
        String string2 = sb2.toString();
        File file = this.cacheWebViewAssets.getCached().get(string2);
        if (file == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new FileInputStream(file));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objB;
        if (fileInputStream == null) {
            return null;
        }
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(string2), null, fileInputStream);
    }

    @RequiresApi(21)
    @Nullable
    public final WebResourceResponse invoke(@NotNull Uri uri, @NotNull String webviewType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
