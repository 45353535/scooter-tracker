package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "", "block", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "-initializepayload", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payload", "Dsl", "PayloadKt", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UniversalResponseKt {

    @NotNull
    public static final UniversalResponseKt INSTANCE = new UniversalResponseKt();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0001J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u0004\u0018\u00010\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;)V", "value", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableData", "getMutableData", "()Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "setMutableData", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payload", "getPayload", "()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;)V", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "mutableDataOrNull", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseKt$Dsl;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "_build", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "clearError", "", "clearMutableData", "clearPayload", "hasError", "", "hasMutableData", "hasPayload", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final UniversalResponseOuterClass.UniversalResponse.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse _build() {
            UniversalResponseOuterClass.UniversalResponse universalResponseBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(universalResponseBuild, "_builder.build()");
            return universalResponseBuild;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearMutableData() {
            this._builder.clearMutableData();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        @NotNull
        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            Intrinsics.checkNotNullExpressionValue(error, "_builder.getError()");
            return error;
        }

        @Nullable
        public final ErrorOuterClass.Error getErrorOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return UniversalResponseKtKt.getErrorOrNull(dsl._builder);
        }

        @NotNull
        public final MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData = this._builder.getMutableData();
            Intrinsics.checkNotNullExpressionValue(mutableData, "_builder.getMutableData()");
            return mutableData;
        }

        @Nullable
        public final MutableDataOuterClass.MutableData getMutableDataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return UniversalResponseKtKt.getMutableDataOrNull(dsl._builder);
        }

        @NotNull
        public final UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
            UniversalResponseOuterClass.UniversalResponse.Payload payload = this._builder.getPayload();
            Intrinsics.checkNotNullExpressionValue(payload, "_builder.getPayload()");
            return payload;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasMutableData() {
            return this._builder.hasMutableData();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final void setError(@NotNull ErrorOuterClass.Error value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        public final void setMutableData(@NotNull MutableDataOuterClass.MutableData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMutableData(value);
        }

        public final void setPayload(@NotNull UniversalResponseOuterClass.UniversalResponse.Payload value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPayload(value);
        }

        private Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
            this._builder = builder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayloadKt {

        @NotNull
        public static final PayloadKt INSTANCE = new PayloadKt();

        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020/H\u0001J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000201J\u0006\u00103\u001a\u000201J\u0006\u00104\u001a\u000201J\u0006\u00105\u001a\u000201J\u0006\u00106\u001a\u000201J\u0006\u00107\u001a\u000201J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\u0006\u0010;\u001a\u000209J\u0006\u0010<\u001a\u000209J\u0006\u0010=\u001a\u000209J\u0006\u0010>\u001a\u000209R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;)V", "value", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponse", "getAdDataRefreshResponse", "()Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "setAdDataRefreshResponse", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;)V", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponse", "getAdPlayerConfigResponse", "()Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "setAdPlayerConfigResponse", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;)V", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponse", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "audienceManagementResponse", "getAudienceManagementResponse", "()Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "setAudienceManagementResponse", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;)V", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "initializationResponse", "getInitializationResponse", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "setInitializationResponse", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;)V", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateResponse", "getPrivacyUpdateResponse", "()Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "setPrivacyUpdateResponse", "(Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;)V", "valueCase", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase;", "_build", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "clearAdDataRefreshResponse", "", "clearAdPlayerConfigResponse", "clearAdResponse", "clearAudienceManagementResponse", "clearInitializationResponse", "clearPrivacyUpdateResponse", "clearValue", "hasAdDataRefreshResponse", "", "hasAdPlayerConfigResponse", "hasAdResponse", "hasAudienceManagementResponse", "hasInitializationResponse", "hasPrivacyUpdateResponse", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final UniversalResponseOuterClass.UniversalResponse.Payload.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse.Payload _build() {
                UniversalResponseOuterClass.UniversalResponse.Payload payloadBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final void clearAdDataRefreshResponse() {
                this._builder.clearAdDataRefreshResponse();
            }

            public final void clearAdPlayerConfigResponse() {
                this._builder.clearAdPlayerConfigResponse();
            }

            public final void clearAdResponse() {
                this._builder.clearAdResponse();
            }

            public final void clearAudienceManagementResponse() {
                this._builder.clearAudienceManagementResponse();
            }

            public final void clearInitializationResponse() {
                this._builder.clearInitializationResponse();
            }

            public final void clearPrivacyUpdateResponse() {
                this._builder.clearPrivacyUpdateResponse();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            @NotNull
            public final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = this._builder.getAdDataRefreshResponse();
                Intrinsics.checkNotNullExpressionValue(adDataRefreshResponse, "_builder.getAdDataRefreshResponse()");
                return adDataRefreshResponse;
            }

            @NotNull
            public final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = this._builder.getAdPlayerConfigResponse();
                Intrinsics.checkNotNullExpressionValue(adPlayerConfigResponse, "_builder.getAdPlayerConfigResponse()");
                return adPlayerConfigResponse;
            }

            @NotNull
            public final AdResponseOuterClass.AdResponse getAdResponse() {
                AdResponseOuterClass.AdResponse adResponse = this._builder.getAdResponse();
                Intrinsics.checkNotNullExpressionValue(adResponse, "_builder.getAdResponse()");
                return adResponse;
            }

            @NotNull
            public final AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse = this._builder.getAudienceManagementResponse();
                Intrinsics.checkNotNullExpressionValue(audienceManagementResponse, "_builder.getAudienceManagementResponse()");
                return audienceManagementResponse;
            }

            @NotNull
            public final InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                InitializationResponseOuterClass.InitializationResponse initializationResponse = this._builder.getInitializationResponse();
                Intrinsics.checkNotNullExpressionValue(initializationResponse, "_builder.getInitializationResponse()");
                return initializationResponse;
            }

            @NotNull
            public final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = this._builder.getPrivacyUpdateResponse();
                Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse, "_builder.getPrivacyUpdateResponse()");
                return privacyUpdateResponse;
            }

            @NotNull
            public final UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase valueCase = this._builder.getValueCase();
                Intrinsics.checkNotNullExpressionValue(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final boolean hasAdDataRefreshResponse() {
                return this._builder.hasAdDataRefreshResponse();
            }

            public final boolean hasAdPlayerConfigResponse() {
                return this._builder.hasAdPlayerConfigResponse();
            }

            public final boolean hasAdResponse() {
                return this._builder.hasAdResponse();
            }

            public final boolean hasAudienceManagementResponse() {
                return this._builder.hasAudienceManagementResponse();
            }

            public final boolean hasInitializationResponse() {
                return this._builder.hasInitializationResponse();
            }

            public final boolean hasPrivacyUpdateResponse() {
                return this._builder.hasPrivacyUpdateResponse();
            }

            public final void setAdDataRefreshResponse(@NotNull AdDataRefreshResponseOuterClass.AdDataRefreshResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdDataRefreshResponse(value);
            }

            public final void setAdPlayerConfigResponse(@NotNull AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdPlayerConfigResponse(value);
            }

            public final void setAdResponse(@NotNull AdResponseOuterClass.AdResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdResponse(value);
            }

            public final void setAudienceManagementResponse(@NotNull AudienceManagementResponseOuterClass.AudienceManagementResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAudienceManagementResponse(value);
            }

            public final void setInitializationResponse(@NotNull InitializationResponseOuterClass.InitializationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInitializationResponse(value);
            }

            public final void setPrivacyUpdateResponse(@NotNull PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPrivacyUpdateResponse(value);
            }

            private Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                this._builder = builder;
            }
        }

        private PayloadKt() {
        }
    }

    private UniversalResponseKt() {
    }

    @NotNull
    /* JADX INFO: renamed from: -initializepayload, reason: not valid java name */
    public final UniversalResponseOuterClass.UniversalResponse.Payload m7742initializepayload(@NotNull Function1<? super PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Payload.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
