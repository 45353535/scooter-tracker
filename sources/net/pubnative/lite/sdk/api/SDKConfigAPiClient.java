package net.pubnative.lite.sdk.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.models.RemoteConfigResponse;
import net.pubnative.lite.sdk.models.SdkConfig;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SDKConfigAPiClient {
    Context mContext;
    final String production_url = "https://sdkc.vervegroupinc.net/config";
    private final Boolean ATOM_DEFAULT_VALUE = Boolean.FALSE;
    private String mAppToken = "";
    private String url = "https://sdkc.vervegroupinc.net/config";
    private ConfigType configType = ConfigType.PRODUCTION;

    public interface AtomConfigListener {
        void onAtomValueFetched(Boolean bool);
    }

    public enum ConfigType {
        PRODUCTION,
        TESTING
    }

    public SDKConfigAPiClient(Context context) {
        this.mContext = context;
    }

    private String buildUrl() {
        if (this.configType != ConfigType.PRODUCTION) {
            return this.url.trim();
        }
        Uri.Builder builderBuildUpon = Uri.parse(this.url).buildUpon();
        if (!TextUtils.isEmpty(this.mAppToken)) {
            builderBuildUpon.appendQueryParameter("app_token", this.mAppToken);
        }
        return builderBuildUpon.build().toString();
    }

    private void fetchAtomConfigValue(RemoteConfigResponse remoteConfigResponse, AtomConfigListener atomConfigListener) {
        if (atomConfigListener != null) {
            atomConfigListener.onAtomValueFetched(remoteConfigResponse.configs.isAtomEnabled());
        }
    }

    public void fetchConfig(final AtomConfigListener atomConfigListener) {
        PNHttpClient.makeRequest(this.mContext, buildUrl(), null, null, false, true, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.SDKConfigAPiClient.1
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th2) {
                AtomConfigListener atomConfigListener2 = atomConfigListener;
                if (atomConfigListener2 != null) {
                    atomConfigListener2.onAtomValueFetched(SDKConfigAPiClient.this.ATOM_DEFAULT_VALUE);
                }
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public /* synthetic */ void onFinally(String str, int i10) {
                e.a(this, str, i10);
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str, Map<String, List<String>> map) {
                SDKConfigAPiClient.this.processStream(str, atomConfigListener);
            }
        });
    }

    public ConfigType getConfigType() {
        return this.configType;
    }

    public String getUrl() {
        return this.url;
    }

    public void processStream(String str, AtomConfigListener atomConfigListener) {
        try {
            processStream(new RemoteConfigResponse(new JSONObject(str)), atomConfigListener);
        } catch (Error | Exception unused) {
            if (atomConfigListener != null) {
                atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
            }
        }
    }

    public void setAppToken(String str) {
        this.mAppToken = str;
    }

    public void setURL(String str, ConfigType configType) {
        if (TextUtils.isEmpty(str)) {
            this.url = "https://sdkc.vervegroupinc.net/config";
            this.configType = ConfigType.PRODUCTION;
        } else {
            this.url = str;
            this.configType = configType;
        }
    }

    public void processStream(RemoteConfigResponse remoteConfigResponse, AtomConfigListener atomConfigListener) {
        SdkConfig sdkConfig;
        if (remoteConfigResponse != null && (sdkConfig = remoteConfigResponse.configs) != null && sdkConfig.app_level != null) {
            if ("ok".equals(remoteConfigResponse.status)) {
                fetchAtomConfigValue(remoteConfigResponse, atomConfigListener);
                return;
            } else {
                if (atomConfigListener != null) {
                    atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
                    return;
                }
                return;
            }
        }
        atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
    }
}
