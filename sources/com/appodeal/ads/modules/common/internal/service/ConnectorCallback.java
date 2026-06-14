package com.appodeal.ads.modules.common.internal.service;

import com.appodeal.ads.modules.common.internal.service.model.PartnerParams;
import com.appodeal.ads.service.ServiceError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\"\u0010\u000b\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e0\rH&J.\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e\u0018\u00010\rH&¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "", "getPartnerParams", "Lcom/appodeal/ads/modules/common/internal/service/model/PartnerParams;", "onServiceDataUpdated", "", "serviceData", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "onServiceDataError", "serviceError", "Lcom/appodeal/ads/service/ServiceError;", "onInAppReceived", "successPurchases", "", "", "", "onInAppFailed", "error", "", "failedPurchases", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConnectorCallback {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onInAppFailed$default(ConnectorCallback connectorCallback, Throwable th2, List list, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInAppFailed");
            }
            if ((i10 & 2) != 0) {
                list = null;
            }
            connectorCallback.onInAppFailed(th2, list);
        }
    }

    PartnerParams getPartnerParams();

    void onInAppFailed(Throwable error, List<? extends Map<String, ? extends Object>> failedPurchases);

    void onInAppReceived(List<? extends Map<String, ? extends Object>> successPurchases);

    void onServiceDataError(ServiceError serviceError);

    void onServiceDataUpdated(ServiceData serviceData);
}
