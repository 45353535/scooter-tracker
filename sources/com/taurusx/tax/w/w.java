package com.taurusx.tax.w;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.inmobi.unification.sdk.InitializationStatus;
import com.taurusx.tax.api.TaurusXAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes11.dex */
public enum w {
    SUCCESS(0, InitializationStatus.SUCCESS),
    INTERNAL_ERROR(10000, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR),
    EMPTY_URL(Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "Empty url"),
    TASK_EXECUTE_FAILED(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Task execute failed"),
    TASK_CANCELED(10003, "Task cancelled"),
    TASK_RESULT_EMPTY(10004, "Task execute with empty result"),
    NETWORK_RESP_NOT_SUCCESS(10005, "Network response not success"),
    NETWORK_RESP_EMPTY(10006, "Network response empty"),
    NETWORK_RESP_SERVER_ERROR(10007, "Network response server error"),
    NETWORK_FILE_NOT_FOUNT(10008, "Network download file not found"),
    NETWORK_SSL_EXCEPTION(10009, "Network ssl exception"),
    NETWORK_CONNECTION_EXCEPTION(10010, "Network connection exception"),
    NETWORK_CONNECTION_TIMEOUT(10011, "Network connection timeout"),
    AD_CONTENT_PARSE_FAILED(10012, "Ad content parse failed"),
    AD_CONTENT_ADM_NOT_SUPPORT(10013, "Not support type"),
    AD_CONTENT_EMPTY(10014, "Ad content is empty"),
    AD_NO_FILL(10015, "Ad no fill"),
    AD_SHOW_WITH_NOT_READY(10016, "Ad show without ready status"),
    AD_START_WITH_NOT_SHOW(10017, "Ad in-stream start without show status"),
    AD_START_WITH_ALREADY_START(10018, "Ad in-stream start with already start status"),
    AD_REGISTER_WITH_NULL_VIEW_GROUP(10019, "Ad native register with null view group"),
    AD_VIDEO_WITH_NO_MEDIA(10020, "Ad content without valid media"),
    AD_HTML_LOAD_ERROR(10021, "Ad content load html failed"),
    CACHE_PUT_FAILED(10023, "Download file put cache failed"),
    VIDEO_FILE_TOO_LARGE(10024, "Download video file too large"),
    UNZIP_FAILED(10025, "Download file unzip failed"),
    MP4_URL_FAILED(10026, "Video file error"),
    UNKNOWN_ERROR(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE, "Unknown error");


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f67578w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f67579y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f67580z;

    w(int i10, String str) {
        this.f67580z = i10;
        this.f67578w = str;
    }

    public static w convertFromRequestStatus(int i10, int i11, String str, String str2) {
        if (i10 >= 200 && i10 < 300) {
            return i11 == 204 ? AD_NO_FILL : i11 == 0 ? SUCCESS : TextUtils.isEmpty(str2) ? NETWORK_RESP_EMPTY : UNKNOWN_ERROR.setMessage(str);
        }
        if (i10 == 2) {
            return NETWORK_CONNECTION_EXCEPTION.setMessage(str);
        }
        if (i10 == 4 || i10 == 408 || i10 == 504) {
            return NETWORK_CONNECTION_TIMEOUT;
        }
        if (i10 == 6) {
            return NETWORK_RESP_EMPTY;
        }
        if (i10 == 7) {
            return INTERNAL_ERROR.setMessage(str);
        }
        if (i10 >= 500) {
            return NETWORK_RESP_SERVER_ERROR.setMessage("Http response server error: " + i11 + ", " + str);
        }
        return INTERNAL_ERROR.setMessage("Http Status Code is " + i11 + ",msg is " + str);
    }

    public TaurusXAdError convertToTaurusXAdError() {
        if (this == AD_NO_FILL) {
            return TaurusXAdError.noFill(getSummary());
        }
        if (this == NETWORK_RESP_NOT_SUCCESS || this == NETWORK_RESP_EMPTY || this == NETWORK_RESP_SERVER_ERROR || this == NETWORK_SSL_EXCEPTION || this == NETWORK_CONNECTION_EXCEPTION) {
            return TaurusXAdError.networkError(getSummary());
        }
        if (this == NETWORK_FILE_NOT_FOUNT || this == EMPTY_URL || this == TASK_EXECUTE_FAILED || this == TASK_CANCELED || this == TASK_RESULT_EMPTY) {
            return TaurusXAdError.downloadError(getSummary());
        }
        if (this == NETWORK_CONNECTION_TIMEOUT) {
            return TaurusXAdError.timeOut(getSummary());
        }
        if (this == AD_HTML_LOAD_ERROR || this == AD_SHOW_WITH_NOT_READY || this == AD_START_WITH_NOT_SHOW || this == AD_START_WITH_ALREADY_START || this == AD_REGISTER_WITH_NULL_VIEW_GROUP) {
            return TaurusXAdError.showFailedError(getSummary());
        }
        if (this == AD_CONTENT_EMPTY || this == AD_VIDEO_WITH_NO_MEDIA) {
            return TaurusXAdError.noContent(getSummary());
        }
        if (this == AD_CONTENT_ADM_NOT_SUPPORT || this == AD_CONTENT_PARSE_FAILED || this == MP4_URL_FAILED) {
            return TaurusXAdError.parseError(getSummary());
        }
        return TaurusXAdError.internalError("error: " + getCode() + " message: " + getSummary());
    }

    public int getCode() {
        return this.f67580z;
    }

    public String getMessageCompatibility() {
        return TextUtils.isEmpty(this.f67579y) ? this.f67579y : this.f67578w;
    }

    public String getSummary() {
        return this.f67578w;
    }

    public w setMessage(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f67579y = str;
        }
        return this;
    }
}
