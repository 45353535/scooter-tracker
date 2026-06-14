package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MraidOpenCommand extends MraidCommand {
    static final String ADDITIONAL_ARGUMENT_KEY = "options";
    static final String AD_EXTRAS = "extras";
    static final String IN_APP_NATIVE_BROWSER_KEY = "inAppNativeBrowser";
    static final String NAME = "open";
    static final String URL_KEY = "url";

    static String getMraidName() {
        return "open";
    }

    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        if (jSONObject.has(ADDITIONAL_ARGUMENT_KEY) && jSONObject.getJSONObject(ADDITIONAL_ARGUMENT_KEY).has("extras")) {
            dTBAdMRAIDController.openUrl(jSONObject.getString("url"), jSONObject.getJSONObject(ADDITIONAL_ARGUMENT_KEY).getJSONObject("extras").optBoolean(IN_APP_NATIVE_BROWSER_KEY, false));
        } else {
            dTBAdMRAIDController.openUrl(jSONObject.getString("url"));
        }
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return "open";
    }
}
