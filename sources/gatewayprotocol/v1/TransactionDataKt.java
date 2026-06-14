package gatewayprotocol.v1;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionDataKt {

    @NotNull
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00106\u001a\u000207H\u0001J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\u0006\u0010;\u001a\u000209J\u0006\u0010<\u001a\u000209J\u0006\u0010=\u001a\u000209J\u0006\u0010>\u001a\u000209J\u0006\u0010?\u001a\u000209J\u0006\u0010@\u001a\u000209J\u0006\u0010A\u001a\u000209J\u0006\u0010B\u001a\u000209J\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020DJ\u0006\u0010F\u001a\u00020DJ\u0006\u0010G\u001a\u00020DR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006I"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", "eventId", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "", "jwsRepresentation", "getJwsRepresentation", "()Ljava/lang/String;", "setJwsRepresentation", "(Ljava/lang/String;)V", AppLovinEventTypes.USER_VIEWED_PRODUCT, "getProduct", "setProduct", InAppPurchaseMetaData.KEY_PRODUCT_ID, "getProductId", "setProductId", "receipt", "getReceipt", "setReceipt", InAppPurchaseMetaData.KEY_SIGNATURE, "getSignature", "setSignature", "Lcom/google/protobuf/Timestamp;", "timestamp", "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "transaction", "getTransaction", "setTransaction", "transactionId", "getTransactionId", "setTransactionId", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "transactionState", "getTransactionState", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "setTransactionState", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;)V", "", "transactionStateValue", "getTransactionStateValue", "()I", "setTransactionStateValue", "(I)V", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "clearEventId", "", "clearJwsRepresentation", "clearProduct", "clearProductId", "clearReceipt", "clearSignature", "clearTimestamp", "clearTransaction", "clearTransactionId", "clearTransactionState", "hasJwsRepresentation", "", "hasReceipt", "hasSignature", "hasTimestamp", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData transactionDataBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(transactionDataBuild, "_builder.build()");
            return transactionDataBuild;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        @NotNull
        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            Intrinsics.checkNotNullExpressionValue(eventId, "_builder.getEventId()");
            return eventId;
        }

        @NotNull
        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            Intrinsics.checkNotNullExpressionValue(jwsRepresentation, "_builder.getJwsRepresentation()");
            return jwsRepresentation;
        }

        @NotNull
        public final String getProduct() {
            String product = this._builder.getProduct();
            Intrinsics.checkNotNullExpressionValue(product, "_builder.getProduct()");
            return product;
        }

        @NotNull
        public final String getProductId() {
            String productId = this._builder.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "_builder.getProductId()");
            return productId;
        }

        @NotNull
        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            Intrinsics.checkNotNullExpressionValue(receipt, "_builder.getReceipt()");
            return receipt;
        }

        @NotNull
        public final String getSignature() {
            String signature = this._builder.getSignature();
            Intrinsics.checkNotNullExpressionValue(signature, "_builder.getSignature()");
            return signature;
        }

        @NotNull
        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            Intrinsics.checkNotNullExpressionValue(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        @NotNull
        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            Intrinsics.checkNotNullExpressionValue(transaction, "_builder.getTransaction()");
            return transaction;
        }

        @NotNull
        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            Intrinsics.checkNotNullExpressionValue(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        @NotNull
        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            Intrinsics.checkNotNullExpressionValue(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventId(value);
        }

        public final void setJwsRepresentation(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setJwsRepresentation(value);
        }

        public final void setProduct(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProduct(value);
        }

        public final void setProductId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setProductId(value);
        }

        public final void setReceipt(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReceipt(value);
        }

        public final void setSignature(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSignature(value);
        }

        public final void setTimestamp(@NotNull Timestamp value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void setTransaction(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransaction(value);
        }

        public final void setTransactionId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionId(value);
        }

        public final void setTransactionState(@NotNull TransactionEventRequestOuterClass.TransactionState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionState(value);
        }

        public final void setTransactionStateValue(int i10) {
            this._builder.setTransactionStateValue(i10);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionDataKt() {
    }
}
