package com.mbridge.msdk.out.strategy;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface IBaseVideoAdStrategy {
    void clearVideoCache();

    String getCreativeIdWithUnitId();

    String getRequestId();

    void loadFormSelfFilling();

    void playVideoMute(int i10);

    void setAlertDialogText(String str, String str2, String str3, String str4);

    void setExtraInfo(JSONObject jSONObject);

    void setRewardPlus(boolean z10);
}
