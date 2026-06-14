package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/PiiKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PiiKt {

    @NotNull
    public static final PiiKt INSTANCE = new PiiKt();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000b¨\u0006'"}, d2 = {"Lgatewayprotocol/v1/PiiKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "(Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "advertisingId", "getAdvertisingId", "()Lcom/google/protobuf/ByteString;", "setAdvertisingId", "(Lcom/google/protobuf/ByteString;)V", "", "appsetId", "getAppsetId", "()Ljava/lang/String;", "setAppsetId", "(Ljava/lang/String;)V", "fid", "getFid", "setFid", "openAdvertisingTrackingId", "getOpenAdvertisingTrackingId", "setOpenAdvertisingTrackingId", "vendorId", "getVendorId", "setVendorId", "_build", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "clearAdvertisingId", "", "clearAppsetId", "clearFid", "clearOpenAdvertisingTrackingId", "clearVendorId", "hasAppsetId", "", "hasFid", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PiiOuterClass.Pii.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/PiiKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/PiiKt$Dsl;", "builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii piiBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        @NotNull
        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            Intrinsics.checkNotNullExpressionValue(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        @NotNull
        public final String getAppsetId() {
            String appsetId = this._builder.getAppsetId();
            Intrinsics.checkNotNullExpressionValue(appsetId, "_builder.getAppsetId()");
            return appsetId;
        }

        @NotNull
        public final String getFid() {
            String fid = this._builder.getFid();
            Intrinsics.checkNotNullExpressionValue(fid, "_builder.getFid()");
            return fid;
        }

        @NotNull
        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            Intrinsics.checkNotNullExpressionValue(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        @NotNull
        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            Intrinsics.checkNotNullExpressionValue(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        public final void setAdvertisingId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void setAppsetId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAppsetId(value);
        }

        public final void setFid(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFid(value);
        }

        public final void setOpenAdvertisingTrackingId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void setVendorId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setVendorId(value);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }
    }

    private PiiKt() {
    }
}
