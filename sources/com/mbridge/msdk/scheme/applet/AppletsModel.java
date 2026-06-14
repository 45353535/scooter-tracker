package com.mbridge.msdk.scheme.applet;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.same.net.exception.a;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    private static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(aVar);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(e<JSONObject> eVar) {
            super.onSuccess(eVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (eVar == null || eVar.f48688c == null) {
                this.appletsModel.handlerRequestNetworkError();
                return;
            }
            try {
                this.appletsModel.handlerSchemeRequestResult(eVar);
            } catch (SchemeRequestException e10) {
                this.appletsModel.handlerSchemeRequestFailed(-2, e10.getMessage());
            }
        }
    }

    private static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z10) {
        this.isRequesting = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #3 {Exception -> 0x0078, blocks: (B:5:0x0017, B:7:0x0021, B:10:0x0028, B:11:0x0037, B:14:0x0045, B:16:0x0054, B:21:0x0067, B:23:0x006f, B:34:0x00aa, B:36:0x00bd, B:31:0x0087, B:33:0x008b, B:48:0x00e4, B:57:0x00fd, B:66:0x0116, B:67:0x0119, B:75:0x0133, B:77:0x0141, B:78:0x0157, B:72:0x0129, B:74:0x012d, B:63:0x010c, B:65:0x0110, B:54:0x00f3, B:56:0x00f7, B:45:0x00da, B:47:0x00de, B:58:0x0100, B:40:0x00ce, B:28:0x007d, B:49:0x00e7), top: B:94:0x0017, inners: #0, #1, #2, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx r20) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.scheme.applet.AppletsModel.getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler request network error exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i10, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, String.format("handlerSchemeRequestFailed network error by code %s and %s", String.valueOf(i10), str));
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i10, str, this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme failed exception  ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), String.format("network error by code %s and %s", String.valueOf(i10), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i10;
        String message;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i10 = aVar.f48689a;
            message = aVar.getMessage();
            if (i10 == 10) {
                message = "request timeout";
            }
        } else {
            i10 = -1;
            message = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, String.format("handlerSchemeRequestNetworkError network error by code %s and %s", String.valueOf(i10), message));
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i10, "network error: " + message, this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme network error exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), String.format("network error by code %s and %s", String.valueOf(i10), message), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(e<JSONObject> eVar) throws SchemeRequestException {
        JSONObject jSONObject = eVar.f48688c;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String strOptString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(strOptString);
            return;
        }
        int iOptInt = jSONObject.optInt("error_code", -1);
        String strOptString2 = jSONObject.optString("error_msg", "");
        if (iOptInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(iOptInt, strOptString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme start exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestSuccess: " + str);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme success exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(c1.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "query wx_miniprogram from click url exception ", e10);
            }
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.j())) {
                return TextUtils.equals(c1.a(rewardTemplateMode.j(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "query reqwxurl from template url exception ", e10);
            }
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return d.h().f48724b + "?" + str;
    }

    public boolean can(int i10) {
        if (isRequesting() || !canRequestWxScheme(i10)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i11 = this.lastRequestType;
        return (i11 == 0 && i10 == 1) || (i11 == 1 && i10 == 1 && this.isUserClick);
    }

    public boolean canRequestWxScheme(int i10) {
        if (isSupportWxScheme()) {
            return i10 != 0 ? i10 == 1 : isCanRequestByTemplateUrl("2");
        }
        return false;
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        if (!this.isSupportWxScheme) {
            this.isSupportWxScheme = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i10, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.n().d());
        if (this.params == null) {
            this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
        }
        if (this.params == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i10;
            appletSchemeRequest.get(1, d.h().f48724b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", 60000L);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z10) {
        this.isUserClick = z10;
    }
}
