package com.amazon.aps.ads;

import androidx.annotation.NonNull;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdRequestErrorCode;
import com.amazon.device.ads.AdError;

/* JADX INFO: loaded from: classes5.dex */
public class ApsAdError extends AdError {
    private ApsAdFormat apsAdFormatFromRequest;
    private ApsAdRequest apsAdRequest;
    private String slotUuid;

    public ApsAdError(@NonNull AdError adError, @NonNull String str, @NonNull ApsAdFormat apsAdFormat) {
        super(adError.getCode(), adError.getMessage(), adError.getAdLoader());
        this.slotUuid = str;
        this.apsAdFormatFromRequest = apsAdFormat;
    }

    public ApsAdRequest getAdRequest() {
        if (this.apsAdRequest == null && this.refreshLoader != null) {
            setApsAdRequest(new ApsAdRequest(this.refreshLoader, this.slotUuid, this.apsAdFormatFromRequest));
        }
        return this.apsAdRequest;
    }

    public ApsAdRequestErrorCode getErrorCode() {
        return ApsMigrationUtil.getApsAdRequestErrorCode(super.getCode());
    }

    public String getSlotUuid() {
        return this.slotUuid;
    }

    void setApsAdRequest(@NonNull ApsAdRequest apsAdRequest) {
        this.apsAdRequest = apsAdRequest;
        this.slotUuid = apsAdRequest.getSlotUuid();
    }
}
