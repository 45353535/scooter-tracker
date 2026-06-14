package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBError {
    public static final int AD_ALREADY_SHOWN = 2001;
    public static final int AD_EXPIRED = 1011;
    public static final int AD_NOT_READY = 2002;
    public static final int AD_REQUEST_NOT_ALLOWED = 1012;
    public static final int CLIENT_SIDE_AUCTION_LOST = 3001;
    public static final int INTERNAL_ERROR = 1006;
    public static final int INVALID_CONFIG = 1013;
    public static final int INVALID_REQUEST = 1001;
    public static final int INVALID_RESPONSE = 1007;
    public static final int INVALID_REWARD_SELECTED = 5001;
    public static final int NETWORK_ERROR = 1003;
    public static final int NO_ADS_AVAILABLE = 1002;
    public static final int OPENWRAP_SIGNALING_ERROR = 1010;
    public static final int RENDER_ERROR = 1009;
    public static final int REQUEST_CANCELLED = 1008;
    public static final int REWARD_NOT_SELECTED = 5002;
    public static final int SERVER_ERROR = 1004;
    public static final int TIMEOUT_ERROR = 1005;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f62213c;

    public POBError(int i10, @NonNull String str) {
        this.f62211a = i10;
        if (i10 == 2001) {
            this.f62212b = "ALREADY_SHOWN: " + str;
            return;
        }
        if (i10 == 2002) {
            this.f62212b = "NOT_READY: " + str;
            return;
        }
        if (i10 == 3001) {
            this.f62212b = "CLIENT_SIDE_AUCTION_LOST: " + str;
            return;
        }
        if (i10 == 5001) {
            this.f62212b = "INVALID_REWARD_SELECTED: " + str;
            return;
        }
        if (i10 == 5002) {
            this.f62212b = "REWARD_NOT_SELECTED: " + str;
            return;
        }
        switch (i10) {
            case 1001:
                this.f62212b = "INVALID_REQUEST: " + str;
                break;
            case 1002:
                this.f62212b = "NO_ADS_AVAILABLE: " + str;
                break;
            case 1003:
                this.f62212b = "NETWORK_ERROR: " + str;
                break;
            case 1004:
                this.f62212b = "SERVER_ERROR: " + str;
                break;
            case 1005:
                this.f62212b = "TIMEOUT_ERROR: " + str;
                break;
            case 1006:
                this.f62212b = "INTERNAL_ERROR: " + str;
                break;
            case 1007:
                this.f62212b = "INVALID_RESPONSE: " + str;
                break;
            case 1008:
                this.f62212b = "REQUEST_CANCELLED: " + str;
                break;
            case 1009:
                this.f62212b = "RENDER_ERROR: " + str;
                break;
            case 1010:
                this.f62212b = "OPENWRAP_SIGNALING_ERROR: " + str;
                break;
            case 1011:
                this.f62212b = "AD_EXPIRED: " + str;
                break;
            case 1012:
                this.f62212b = "AD_REQUEST_NOT_ALLOWED: " + str;
                break;
            default:
                this.f62212b = str;
                break;
        }
    }

    public void addExtraInfo(String str, Object obj) {
        if (this.f62213c == null) {
            this.f62213c = new HashMap();
        }
        this.f62213c.put(str, obj);
    }

    public int getErrorCode() {
        return this.f62211a;
    }

    @NonNull
    public String getErrorMessage() {
        return this.f62212b;
    }

    @Nullable
    public Map<String, Object> getExtraInfo() {
        return this.f62213c;
    }

    @Deprecated
    public void setErrorCode(int i10) {
        this.f62211a = i10;
    }

    @Deprecated
    public void setErrorMessage(@NonNull String str) {
        this.f62212b = str;
    }

    public void setExtraInfo(@Nullable Map<String, Object> map) {
        this.f62213c = map;
    }

    @NonNull
    public String toString() {
        return "POBError{errorCode=" + this.f62211a + ", errorMessage='" + this.f62212b + "'}";
    }

    @Nullable
    public Object getExtraInfo(@Nullable String str) {
        Map map = this.f62213c;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
