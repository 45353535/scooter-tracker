package com.unity3d.ads.core.domain;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheWebViewAssets;", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "url", "type", "getFilename", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "webviewConfiguration", "", "invoke", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "j$/util/concurrent/ConcurrentHashMap", "Ljava/io/File;", "_cached", "Lj$/util/concurrent/ConcurrentHashMap;", "", "getCached", "()Ljava/util/Map;", "cached", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {

    @NotNull
    private final ConcurrentHashMap<String, File> _cached;

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", f = "AndroidCacheWebViewAssets.kt", l = {35, 45}, m = "invoke")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheWebViewAssets.this.invoke(null, this);
        }
    }

    public AndroidCacheWebViewAssets(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    private final String getFilename(String url, String type) {
        return type + IOUtils.DIR_SEPARATOR_UNIX + StringsKt.k1(StringsKt.o1(url, '?', null, 2, null), IOUtils.DIR_SEPARATOR_UNIX, null, 2, null);
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @NotNull
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e9 -> B:40:0x00ec). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.WebViewConfiguration r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets.invoke(com.unity3d.ads.core.data.model.WebViewConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
