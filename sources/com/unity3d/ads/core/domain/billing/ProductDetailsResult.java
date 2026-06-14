package com.unity3d.ads.core.domain.billing;

import com.inmobi.unification.sdk.InitializationStatus;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "", "()V", "Failure", "NotFound", InitializationStatus.SUCCESS, "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Failure;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$NotFound;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ProductDetailsResult {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Failure;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;)V", "getBillingResult", "()Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends ProductDetailsResult {

        @NotNull
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull BillingResultBridge billingResult) {
            super(null);
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        @NotNull
        public final Failure copy(@NotNull BillingResultBridge billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            return new Failure(billingResult);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.billingResult, ((Failure) other).billingResult);
        }

        @NotNull
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$NotFound;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends ProductDetailsResult {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult$Success;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "productDetailsJson", "", "(Ljava/lang/String;)V", "getProductDetailsJson", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends ProductDetailsResult {

        @NotNull
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String productDetailsJson) {
            super(null);
            Intrinsics.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            this.productDetailsJson = productDetailsJson;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        @NotNull
        public final Success copy(@NotNull String productDetailsJson) {
            Intrinsics.checkNotNullParameter(productDetailsJson, "productDetailsJson");
            return new Success(productDetailsJson);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.productDetailsJson, ((Success) other).productDetailsJson);
        }

        @NotNull
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }
    }

    public /* synthetic */ ProductDetailsResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProductDetailsResult() {
    }
}
