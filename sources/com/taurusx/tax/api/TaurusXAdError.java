package com.taurusx.tax.api;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXAdError {
    public static final int ERROR_CODE_DOWNLOAD_ERROR = 9;
    public static final int ERROR_CODE_INTERNAL_ERROR = 7;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_CONTENT = 6;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_PARSE_ERROR = 8;
    public static final int ERROR_CODE_SHOW = 5;
    public static final int ERROR_CODE_TIMEOUT = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f65784w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f65785z;

    public TaurusXAdError(int i10, String str) {
        this.f65785z = i10;
        this.f65784w = str;
    }

    public static TaurusXAdError downloadError(String str) {
        return new TaurusXAdError(9, str);
    }

    public static TaurusXAdError internalError(String str) {
        return new TaurusXAdError(7, str);
    }

    public static TaurusXAdError invalidRequest(String str) {
        return new TaurusXAdError(1, str);
    }

    public static TaurusXAdError networkError(String str) {
        return new TaurusXAdError(2, str);
    }

    public static TaurusXAdError noContent(String str) {
        return new TaurusXAdError(6, str);
    }

    public static TaurusXAdError noFill(String str) {
        return new TaurusXAdError(3, str);
    }

    public static TaurusXAdError parseError(String str) {
        return new TaurusXAdError(8, str);
    }

    public static TaurusXAdError showFailedError(String str) {
        return new TaurusXAdError(5, str);
    }

    public static TaurusXAdError timeOut(String str) {
        return new TaurusXAdError(4, str);
    }

    public int getCode() {
        return this.f65785z;
    }

    public String getMessage() {
        return this.f65784w;
    }

    public String toString() {
        return "ErrorCode is " + this.f65785z + ", Messsage is " + getMessage();
    }
}
