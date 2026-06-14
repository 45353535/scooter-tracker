package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class RolloutsStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConfigCacheClient f33157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConfigCacheClient f33158b;

    RolloutsStateFactory(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f33157a = configCacheClient;
        this.f33158b = configCacheClient2;
    }

    private String b(String str) {
        String strC = c(this.f33157a, str);
        if (strC != null) {
            return strC;
        }
        String strC2 = c(this.f33158b, str);
        return strC2 != null ? strC2 : "";
    }

    private static String c(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer blocking = configCacheClient.getBlocking();
        if (blocking == null) {
            return null;
        }
        try {
            return blocking.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    public static RolloutsStateFactory create(@NonNull ConfigCacheClient configCacheClient, @NonNull ConfigCacheClient configCacheClient2) {
        return new RolloutsStateFactory(configCacheClient, configCacheClient2);
    }

    RolloutsState a(ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < rolloutMetadata.length(); i10++) {
            try {
                JSONObject jSONObject = rolloutMetadata.getJSONObject(i10);
                String string = jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID);
                JSONArray jSONArray = jSONObject.getJSONArray(ConfigContainer.ROLLOUT_METADATA_AFFECTED_KEYS);
                if (jSONArray.length() > 1) {
                    Log.w(FirebaseRemoteConfig.TAG, String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(strOptString).setParameterValue(b(strOptString)).setTemplateVersion(templateVersionNumber).build());
            } catch (JSONException e10) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return RolloutsState.create(hashSet);
    }
}
