package com.appodeal.ads.adapters.iab.utils;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements UnifiedAdCallbackClickTrackListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f12314c;

    public c(e eVar, d dVar, Context context) {
        this.f12314c = eVar;
        this.f12312a = dVar;
        this.f12313b = context;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener
    public final void onTrackError() {
        this.f12312a.a();
    }

    @Override // com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener
    public final void onTrackSuccess(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.getString("status").equals("ok")) {
                    JSONArray jSONArray = jSONObject.has("urls") ? jSONObject.getJSONArray("urls") : null;
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    if (jSONObject.has("url")) {
                        jSONArray.put(jSONObject.getString("url"));
                    }
                    if (jSONArray.length() > 0) {
                        this.f12314c.f12316a = n.b(this.f12313b, jSONArray, new b(this.f12312a));
                        return;
                    } else {
                        this.f12312a.a();
                        return;
                    }
                }
            } catch (JSONException e10) {
                Log.log(e10);
                this.f12312a.a();
                return;
            }
        }
        this.f12312a.a();
    }
}
