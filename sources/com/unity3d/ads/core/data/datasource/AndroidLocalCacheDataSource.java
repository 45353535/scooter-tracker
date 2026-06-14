package com.unity3d.ads.core.data.datasource;

import com.ironsource.V5;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J5\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLocalCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "(Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;)V", "getCreateFile", "()Lcom/unity3d/ads/core/domain/CreateFile;", "getGetFileExtensionFromUrl", "()Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachePath", "Ljava/io/File;", V5.c.f41892b, "", "url", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLocalCacheDataSource implements CacheDataSource {

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(@NotNull CreateFile createFile, @NotNull GetFileExtensionFromUrl getFileExtensionFromUrl) {
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    @NotNull
    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    @Nullable
    public Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull Continuation continuation) {
        File fileInvoke = this.createFile.invoke(file, str);
        if (fileInvoke.exists()) {
            String name = fileInvoke.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            String strInvoke = null;
            if (!StringsKt.M(name, ".part", false, 2, null)) {
                if (str2 != null && str2.length() != 0) {
                    strInvoke = this.getFileExtensionFromUrl.invoke(str2);
                }
                return new CacheResult.Success(new CachedFile(str2 == null ? "" : str2, str, fileInvoke, strInvoke == null ? "" : strInvoke, fileInvoke.length(), null, num != null ? num.intValue() : Integer.MAX_VALUE, 32, null), CacheSource.LOCAL);
            }
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL, null, 4, null);
    }

    @NotNull
    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
