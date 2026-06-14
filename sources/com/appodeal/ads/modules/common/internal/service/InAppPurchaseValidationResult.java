package com.appodeal.ads.modules.common.internal.service;

import com.appodeal.ads.service.ServiceError;
import com.inmobi.unification.sdk.InitializationStatus;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult;", "", InitializationStatus.SUCCESS, "Failure", "Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult$Failure;", "Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult$Success;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InAppPurchaseValidationResult {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult$Failure;", "Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult;", "Lcom/appodeal/ads/service/ServiceError;", "error", "<init>", "(Lcom/appodeal/ads/service/ServiceError;)V", "a", "Lcom/appodeal/ads/service/ServiceError;", "getError", "()Lcom/appodeal/ads/service/ServiceError;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failure implements InAppPurchaseValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final ServiceError error;

        public Failure(ServiceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final ServiceError getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult$Success;", "Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/String;)Lcom/appodeal/ads/modules/common/internal/service/InAppPurchaseValidationResult$Success;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDescription", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements InAppPurchaseValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String description;

        public Success(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.description;
            }
            return success.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Success copy(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new Success(description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.description, ((Success) other).description);
        }

        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return "Success(description=" + this.description + ")";
        }
    }
}
