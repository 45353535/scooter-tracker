package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.ironsource.V5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import eg.e0;
import eg.g;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import pf.b;
import uf.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0011\u0010!\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ+\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J3\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fJ!\u0010/\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u001fH\u0002J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0016J\u0019\u00107\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCacheDirectory", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "localCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "remoteCacheDataSource", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "cleanupDirectory", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "downloadPriorityQueue", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;Lcom/unity3d/ads/core/domain/CreateFile;)V", "cacheDir", "Ljava/io/File;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "webviewCacheDir", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doesFileExist", "", V5.c.f41892b, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "headers", "Lorg/json/JSONArray;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileInternal", "cacheDirectory", "(Ljava/io/File;Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilename", "getWebviewFile", "type", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initCacheDir", "dirName", "removeFile", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "retrieveFile", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidCacheRepository implements CacheRepository {

    @NotNull
    private final File cacheDir;

    @NotNull
    private final CleanupDirectory cleanupDirectory;

    @NotNull
    private final Context context;

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final DownloadPriorityQueue downloadPriorityQueue;

    @NotNull
    private final GetCacheDirectory getCacheDirectory;

    @NotNull
    private final CacheDataSource localCacheDataSource;

    @NotNull
    private final CacheDataSource remoteCacheDataSource;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final File webviewCacheDir;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidCacheRepository.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            boolean cleanCache = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            if (cleanCache || !AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                File[] fileArrListFiles = AndroidCacheRepository.this.cacheDir.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
            } else {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
            }
            if (!cleanCache && AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                return Unit.f93236a;
            }
            File[] fileArrListFiles2 = AndroidCacheRepository.this.webviewCacheDir.listFiles();
            if (fileArrListFiles2 == null) {
                return null;
            }
            for (File file2 : fileArrListFiles2) {
                file2.delete();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {100}, m = "doesFileExist")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    static final class C47782 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass1 extends y implements Function1<File, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull File p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return Boolean.valueOf(p02.isFile());
            }
        }

        C47782(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidCacheRepository.this.new C47782(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            Iterator it = kotlin.sequences.k.E(i.s(AndroidCacheRepository.this.cacheDir, null, 1, null), AnonymousClass1.INSTANCE).iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((File) it.next()).length();
            }
            return kotlin.coroutines.jvm.internal.b.e(length);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47782) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {70, 77, 89}, m = "invokeSuspend")
    static final class C47792 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {79, 85}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function1<Continuation, Object> {
            final /* synthetic */ File $cacheDirectory;
            final /* synthetic */ MutableStateFlow $fileResult;
            final /* synthetic */ String $filename;
            final /* synthetic */ int $priority;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i10, MutableStateFlow mutableStateFlow, Continuation continuation) {
                super(1, continuation);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i10;
                this.$fileResult = mutableStateFlow;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
            
                if (r11 == r0) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r10.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.d.b(r11)
                    r8 = r10
                    goto L73
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    kotlin.d.b(r11)
                    r8 = r10
                    goto L40
                L20:
                    kotlin.d.b(r11)
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = r10.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r4 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r11)
                    java.io.File r5 = r10.$cacheDirectory
                    java.lang.String r6 = r10.$filename
                    java.lang.String r7 = r10.$url
                    int r11 = r10.$priority
                    java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.d(r11)
                    r10.label = r3
                    r9 = r10
                    java.lang.Object r11 = r4.getFile(r5, r6, r7, r8, r9)
                    r8 = r9
                    if (r11 != r0) goto L40
                    goto L72
                L40:
                    com.unity3d.ads.core.data.model.CacheResult r11 = (com.unity3d.ads.core.data.model.CacheResult) r11
                    boolean r1 = r11 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                    if (r1 == 0) goto L58
                    kotlinx.coroutines.flow.MutableStateFlow r1 = r8.$fileResult
                L48:
                    java.lang.Object r0 = r1.getValue()
                    r2 = r0
                    com.unity3d.ads.core.data.model.CacheResult r2 = (com.unity3d.ads.core.data.model.CacheResult) r2
                    boolean r0 = r1.b(r0, r11)
                    if (r0 == 0) goto L48
                    kotlin.Unit r11 = kotlin.Unit.f93236a
                    return r11
                L58:
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = r8.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r3 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r11)
                    java.io.File r4 = r8.$cacheDirectory
                    java.lang.String r5 = r8.$filename
                    java.lang.String r6 = r8.$url
                    int r11 = r8.$priority
                    java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.d(r11)
                    r8.label = r2
                    java.lang.Object r11 = r3.getFile(r4, r5, r6, r7, r8)
                    if (r11 != r0) goto L73
                L72:
                    return r0
                L73:
                    com.unity3d.ads.core.data.model.CacheResult r11 = (com.unity3d.ads.core.data.model.CacheResult) r11
                    kotlinx.coroutines.flow.MutableStateFlow r0 = r8.$fileResult
                L77:
                    java.lang.Object r1 = r0.getValue()
                    r2 = r1
                    com.unity3d.ads.core.data.model.CacheResult r2 = (com.unity3d.ads.core.data.model.CacheResult) r2
                    boolean r1 = r0.b(r1, r11)
                    if (r1 == 0) goto L77
                    kotlin.Unit r11 = kotlin.Unit.f93236a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C47792.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47792(String str, File file, int i10, Continuation continuation) {
            super(2, continuation);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidCacheRepository.this.new C47792(this.$url, this.$cacheDirectory, this.$priority, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
            /*
                r18 = this;
                r5 = r18
                java.lang.Object r6 = pf.b.g()
                int r0 = r5.label
                r7 = 0
                r8 = 3
                r9 = 2
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 == r1) goto L28
                if (r0 == r9) goto L20
                if (r0 != r8) goto L18
                kotlin.d.b(r19)
                return r19
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
                kotlin.d.b(r19)
                goto L8b
            L28:
                java.lang.Object r0 = r5.L$0
                java.lang.String r0 = (java.lang.String) r0
                kotlin.d.b(r19)
                r13 = r0
                r0 = r19
                goto L5d
            L33:
                kotlin.d.b(r19)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.lang.String r2 = r5.$url
                java.lang.String r2 = r0.getFilename(r2)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r3 = r5.$cacheDirectory
                r4 = r3
                java.lang.String r3 = r5.$url
                int r10 = r5.$priority
                java.lang.Integer r10 = kotlin.coroutines.jvm.internal.b.d(r10)
                r5.L$0 = r2
                r5.label = r1
                r1 = r4
                r4 = r10
                java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
                if (r0 != r6) goto L5c
                goto L99
            L5c:
                r13 = r2
            L5d:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.MutableStateFlow r16 = hg.l0.a(r7)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.domain.work.DownloadPriorityQueue r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r0)
                int r15 = r5.$priority
                com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r10 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.io.File r12 = r5.$cacheDirectory
                java.lang.String r14 = r5.$url
                r17 = 0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                r1 = r16
                r5.L$0 = r1
                r5.label = r9
                java.lang.Object r0 = r0.invoke(r15, r10, r5)
                if (r0 != r6) goto L8a
                goto L99
            L8a:
                r0 = r1
            L8b:
                kotlinx.coroutines.flow.Flow r0 = hg.i.w(r0)
                r5.L$0 = r7
                r5.label = r8
                java.lang.Object r0 = hg.i.x(r0, r5)
                if (r0 != r6) goto L9a
            L99:
                return r6
            L9a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C47792.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47792) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidCacheRepository(@NotNull CoroutineDispatcher ioDispatcher, @NotNull GetCacheDirectory getCacheDirectory, @NotNull CacheDataSource localCacheDataSource, @NotNull CacheDataSource remoteCacheDataSource, @NotNull Context context, @NotNull SessionRepository sessionRepository, @NotNull CleanupDirectory cleanupDirectory, @NotNull DownloadPriorityQueue downloadPriorityQueue, @NotNull CreateFile createFile) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(getCacheDirectory, "getCacheDirectory");
        Intrinsics.checkNotNullParameter(localCacheDataSource, "localCacheDataSource");
        Intrinsics.checkNotNullParameter(remoteCacheDataSource, "remoteCacheDataSource");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(cleanupDirectory, "cleanupDirectory");
        Intrinsics.checkNotNullParameter(downloadPriorityQueue, "downloadPriorityQueue");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = kotlinx.coroutines.i.j(kotlinx.coroutines.i.j(kotlinx.coroutines.i.a(ioDispatcher), new e0("CacheRepository")), d0.f93604b);
        this.cacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i10, Continuation continuation) {
        return g.g(this.scope.getCoroutineContext(), new C47792(str, file, i10, null), continuation);
    }

    private final File initCacheDir(String dirName) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        File fileInvoke = getCacheDirectory.invoke(cacheDir, dirName);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object clearCache(@NotNull Continuation continuation) {
        return g.g(this.scope.getCoroutineContext(), new AnonymousClass2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doesFileExist(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            r0.label = r3
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getCacheSize(@NotNull Continuation continuation) {
        return g.g(this.scope.getCoroutineContext(), new C47782(null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i10, @NotNull Continuation continuation) {
        return getFileInternal(this.cacheDir, str, jSONArray, i10, continuation);
    }

    @NotNull
    public final String getFilename(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strI1 = StringsKt.i1(StringsKt.k1(StringsKt.o1(url, '?', null, 2, null), IOUtils.DIR_SEPARATOR_UNIX, null, 2, null), '.', "");
        if (StringsKt.y0(strI1)) {
            return StringExtensionsKt.getSHA256Hash(url);
        }
        return StringExtensionsKt.getSHA256Hash(url) + '.' + strI1;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull Continuation continuation) {
        File fileInvoke = this.createFile.invoke(this.webviewCacheDir, str2);
        fileInvoke.mkdirs();
        return getFileInternal(fileInvoke, str, null, 0, continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(@NotNull CachedFile cachedFile) {
        Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object retrieveFile(@NotNull String str, @NotNull Continuation continuation) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, continuation, 12, null);
    }
}
