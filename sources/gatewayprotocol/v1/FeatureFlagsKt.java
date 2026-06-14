package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.configuration.ExperimentsBase;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FeatureFlagsKt {

    @NotNull
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0001J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020!J\u0006\u0010'\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b¨\u0006)"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;)V", "value", "", "appSheetBugCheckEnabled", "getAppSheetBugCheckEnabled", "()Z", "setAppSheetBugCheckEnabled", "(Z)V", ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION, "getBoldSdkNextSessionEnabled", "setBoldSdkNextSessionEnabled", "openglGpuEnabled", "getOpenglGpuEnabled", "setOpenglGpuEnabled", "opportunityIdPlacementValidation", "getOpportunityIdPlacementValidation", "setOpportunityIdPlacementValidation", "recoverTerminatedWebviews", "getRecoverTerminatedWebviews", "setRecoverTerminatedWebviews", "shouldHandleWebviewCaching", "getShouldHandleWebviewCaching", "setShouldHandleWebviewCaching", "shouldSendIapHistory", "getShouldSendIapHistory", "setShouldSendIapHistory", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "clearAppSheetBugCheckEnabled", "", "clearBoldSdkNextSessionEnabled", "clearOpenglGpuEnabled", "clearOpportunityIdPlacementValidation", "clearRecoverTerminatedWebviews", "clearShouldHandleWebviewCaching", "clearShouldSendIapHistory", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            NativeConfigurationOuterClass.FeatureFlags featureFlagsBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(featureFlagsBuild, "_builder.build()");
            return featureFlagsBuild;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        public final void clearShouldHandleWebviewCaching() {
            this._builder.clearShouldHandleWebviewCaching();
        }

        public final void clearShouldSendIapHistory() {
            this._builder.clearShouldSendIapHistory();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        public final boolean getShouldHandleWebviewCaching() {
            return this._builder.getShouldHandleWebviewCaching();
        }

        public final boolean getShouldSendIapHistory() {
            return this._builder.getShouldSendIapHistory();
        }

        public final void setAppSheetBugCheckEnabled(boolean z10) {
            this._builder.setAppSheetBugCheckEnabled(z10);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z10) {
            this._builder.setBoldSdkNextSessionEnabled(z10);
        }

        public final void setOpenglGpuEnabled(boolean z10) {
            this._builder.setOpenglGpuEnabled(z10);
        }

        public final void setOpportunityIdPlacementValidation(boolean z10) {
            this._builder.setOpportunityIdPlacementValidation(z10);
        }

        public final void setRecoverTerminatedWebviews(boolean z10) {
            this._builder.setRecoverTerminatedWebviews(z10);
        }

        public final void setShouldHandleWebviewCaching(boolean z10) {
            this._builder.setShouldHandleWebviewCaching(z10);
        }

        public final void setShouldSendIapHistory(boolean z10) {
            this._builder.setShouldSendIapHistory(z10);
        }

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }
    }

    private FeatureFlagsKt() {
    }
}
