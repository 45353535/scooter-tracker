package com.unity3d.services.core.domain.task;

import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$Params;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "getWebViewData", "", "LoadCacheResult", "Params", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeStateLoadCache extends MetricTask<Params, LoadCacheResult> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "", "hasHashMismatch", "", "webViewData", "", "(ZLjava/lang/String;)V", "getHasHashMismatch", "()Z", "getWebViewData", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoadCacheResult {
        private final boolean hasHashMismatch;

        @Nullable
        private final String webViewData;

        public LoadCacheResult(boolean z10, @Nullable String str) {
            this.hasHashMismatch = z10;
            this.webViewData = str;
        }

        public static /* synthetic */ LoadCacheResult copy$default(LoadCacheResult loadCacheResult, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = loadCacheResult.hasHashMismatch;
            }
            if ((i10 & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z10, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWebViewData() {
            return this.webViewData;
        }

        @NotNull
        public final LoadCacheResult copy(boolean hasHashMismatch, @Nullable String webViewData) {
            return new LoadCacheResult(hasHashMismatch, webViewData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadCacheResult)) {
                return false;
            }
            LoadCacheResult loadCacheResult = (LoadCacheResult) other;
            return this.hasHashMismatch == loadCacheResult.hasHashMismatch && Intrinsics.areEqual(this.webViewData, loadCacheResult.webViewData);
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        @Nullable
        public final String getWebViewData() {
            return this.webViewData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.hasHashMismatch;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.webViewData;
            return i10 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }

        public /* synthetic */ LoadCacheResult(boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, (i10 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements BaseParams {

        @NotNull
        private final Configuration config;

        public Params(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Configuration getConfig() {
            return this.config;
        }

        @NotNull
        public final Params copy(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Params(config);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && Intrinsics.areEqual(this.config, ((Params) other).config);
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadCache(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
        } catch (Exception e10) {
            DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e10.getMessage());
            return null;
        }
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_webview");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7465doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadCache.mo7465doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
