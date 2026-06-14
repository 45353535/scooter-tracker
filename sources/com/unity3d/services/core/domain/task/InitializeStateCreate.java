package com.unity3d.services.core.domain.task;

import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;", "Lcom/unity3d/services/core/configuration/Configuration;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "Params", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeStateCreate extends MetricTask<Params, Configuration> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "webViewData", "", "(Lcom/unity3d/services/core/configuration/Configuration;Ljava/lang/String;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getWebViewData", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements BaseParams {

        @NotNull
        private final Configuration config;

        @NotNull
        private final String webViewData;

        public Params(@NotNull Configuration config, @NotNull String webViewData) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(webViewData, "webViewData");
            this.config = config;
            this.webViewData = webViewData;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            if ((i10 & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Configuration getConfig() {
            return this.config;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWebViewData() {
            return this.webViewData;
        }

        @NotNull
        public final Params copy(@NotNull Configuration config, @NotNull String webViewData) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(webViewData, "webViewData");
            return new Params(config, webViewData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.config, params.config) && Intrinsics.areEqual(this.webViewData, params.webViewData);
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        @NotNull
        public final String getWebViewData() {
            return this.webViewData;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewData.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ", webViewData=" + this.webViewData + ')';
        }
    }

    public InitializeStateCreate(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("create_web_view");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7465doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.InitializeStateCreate.Params r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1
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
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateCreate.mo7465doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateCreate$Params, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
