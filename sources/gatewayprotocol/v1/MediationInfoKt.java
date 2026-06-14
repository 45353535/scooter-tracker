package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C4574uf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.taurusx.tax.f.y;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediationInfoKt {

    @NotNull
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0001J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\u0006\u0010(\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b¨\u0006*"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;)V", "value", "", C4574uf.f45563b, "getAdapterVersion", "()Ljava/lang/String;", "setAdapterVersion", "(Ljava/lang/String;)V", "customName", "getCustomName", "setCustomName", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", IronSourceConstants.EVENTS_PROVIDER, "getProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "", "providerValue", "getProviderValue", "()I", "setProviderValue", "(I)V", "version", "getVersion", "setVersion", "_build", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "clearAdapterVersion", "", "clearCustomName", "clearProvider", "clearVersion", "hasAdapterVersion", "", "hasCustomName", "hasVersion", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            MediationInfoOuterClass.MediationInfo mediationInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(mediationInfoBuild, "_builder.build()");
            return mediationInfoBuild;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @NotNull
        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            Intrinsics.checkNotNullExpressionValue(adapterVersion, "_builder.getAdapterVersion()");
            return adapterVersion;
        }

        @NotNull
        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            Intrinsics.checkNotNullExpressionValue(customName, "_builder.getCustomName()");
            return customName;
        }

        @NotNull
        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider, "_builder.getProvider()");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        @NotNull
        public final String getVersion() {
            String version = this._builder.getVersion();
            Intrinsics.checkNotNullExpressionValue(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdapterVersion(value);
        }

        public final void setCustomName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomName(value);
        }

        public final void setProvider(@NotNull ClientInfoOuterClass.MediationProvider value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProvider(value);
        }

        public final void setProviderValue(int i10) {
            this._builder.setProviderValue(i10);
        }

        public final void setVersion(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setVersion(value);
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private MediationInfoKt() {
    }
}
