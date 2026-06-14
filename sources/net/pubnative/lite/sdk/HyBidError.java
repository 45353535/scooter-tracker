package net.pubnative.lite.sdk;

import android.annotation.TargetApi;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidError extends Exception {
    private HyBidErrorCode errorCode;

    public HyBidError() {
        this.errorCode = HyBidErrorCode.INTERNAL_ERROR;
    }

    public HyBidErrorCode getErrorCode() {
        return this.errorCode;
    }

    public HyBidError(HyBidErrorCode hyBidErrorCode) {
        super(hyBidErrorCode.getMessage());
        HyBidErrorCode hyBidErrorCode2 = HyBidErrorCode.NO_FILL;
        this.errorCode = hyBidErrorCode;
    }

    public HyBidError(String str) {
        super(str);
        this.errorCode = HyBidErrorCode.INTERNAL_ERROR;
    }

    public HyBidError(HyBidErrorCode hyBidErrorCode, String str) {
        super(str);
        HyBidErrorCode hyBidErrorCode2 = HyBidErrorCode.NO_FILL;
        this.errorCode = hyBidErrorCode;
    }

    public HyBidError(HyBidErrorCode hyBidErrorCode, Throwable th2) {
        super(hyBidErrorCode.getMessage(), th2);
        HyBidErrorCode hyBidErrorCode2 = HyBidErrorCode.NO_FILL;
        this.errorCode = hyBidErrorCode;
    }

    public HyBidError(String str, Throwable th2) {
        super(str, th2);
        this.errorCode = HyBidErrorCode.INTERNAL_ERROR;
    }

    public HyBidError(Throwable th2) {
        super(th2);
        this.errorCode = HyBidErrorCode.INTERNAL_ERROR;
    }

    @TargetApi(24)
    public HyBidError(String str, Throwable th2, boolean z10, boolean z11) {
        super(str, th2, z10, z11);
        this.errorCode = HyBidErrorCode.INTERNAL_ERROR;
    }
}
