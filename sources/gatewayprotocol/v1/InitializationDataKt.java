package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializationDataKt {

    @NotNull
    public static final InitializationDataKt INSTANCE = new InitializationDataKt();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lgatewayprotocol/v1/InitializationDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData$Builder;", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData$Builder;)V", "value", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequest", "getInitializationRequest", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "setInitializationRequest", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "getSharedData", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "setSharedData", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;)V", "initializationRequestOrNull", "getInitializationRequestOrNull", "(Lgatewayprotocol/v1/InitializationDataKt$Dsl;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "sharedDataOrNull", "getSharedDataOrNull", "(Lgatewayprotocol/v1/InitializationDataKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "_build", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "clearInitializationRequest", "", "clearSharedData", "hasInitializationRequest", "", "hasSharedData", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationDataOuterClass.InitializationData.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationDataOuterClass.InitializationData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationDataOuterClass.InitializationData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ InitializationDataOuterClass.InitializationData _build() {
            InitializationDataOuterClass.InitializationData initializationDataBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(initializationDataBuild, "_builder.build()");
            return initializationDataBuild;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        @NotNull
        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
            Intrinsics.checkNotNullExpressionValue(initializationRequest, "_builder.getInitializationRequest()");
            return initializationRequest;
        }

        @Nullable
        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(dsl._builder);
        }

        @NotNull
        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            Intrinsics.checkNotNullExpressionValue(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        @Nullable
        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(dsl._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setInitializationRequest(@NotNull InitializationRequestOuterClass.InitializationRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitializationRequest(value);
        }

        public final void setSharedData(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSharedData(value);
        }

        private Dsl(InitializationDataOuterClass.InitializationData.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDataKt() {
    }
}
