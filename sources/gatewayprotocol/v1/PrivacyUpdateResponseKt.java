package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateResponseKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrivacyUpdateResponseKt {

    @NotNull
    public static final PrivacyUpdateResponseKt INSTANCE = new PrivacyUpdateResponseKt();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder;", "(Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "content", "getContent", "()Lcom/google/protobuf/ByteString;", "setContent", "(Lcom/google/protobuf/ByteString;)V", "", "version", "getVersion", "()I", "setVersion", "(I)V", "_build", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "clearContent", "", "clearVersion", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/PrivacyUpdateResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/PrivacyUpdateResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse _build() {
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponseBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(privacyUpdateResponseBuild, "_builder.build()");
            return privacyUpdateResponseBuild;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @NotNull
        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "_builder.getContent()");
            return content;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void setVersion(int i10) {
            this._builder.setVersion(i10);
        }

        private Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private PrivacyUpdateResponseKt() {
    }
}
