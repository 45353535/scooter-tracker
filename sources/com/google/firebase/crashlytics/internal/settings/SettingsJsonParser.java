package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class SettingsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CurrentTimeProvider f32713a;

    SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.f32713a = currentTimeProvider;
    }

    private static SettingsJsonTransform a(int i10) {
        if (i10 == 3) {
            return new SettingsV3JsonTransform();
        }
        Logger.getLogger().e("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new DefaultSettingsJsonTransform();
    }

    public Settings parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).buildFromJson(this.f32713a, jSONObject);
    }
}
