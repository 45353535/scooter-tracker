package com.unity3d.ads.core.data.repository;

import com.ironsource.V5;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J/\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0019\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doesFileExist", "", V5.c.f41892b, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "headers", "Lorg/json/JSONArray;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebviewFile", "type", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFile", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "retrieveFile", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CacheRepository {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i10, continuation);
        }
    }

    @Nullable
    Object clearCache(@NotNull Continuation continuation);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull Continuation continuation);

    @Nullable
    Object getCacheSize(@NotNull Continuation continuation);

    @Nullable
    Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i10, @NotNull Continuation continuation);

    @Nullable
    Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull Continuation continuation);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @Nullable
    Object retrieveFile(@NotNull String str, @NotNull Continuation continuation);
}
