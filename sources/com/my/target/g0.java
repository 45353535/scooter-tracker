package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ShareButtonData;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class g0 extends h1 {
    public g0(u uVar, j jVar, Context context) {
        super(uVar, jVar, 1, context);
    }

    public static g0 a(u uVar, j jVar, Context context) {
        return new g0(uVar, jVar, context);
    }

    public boolean b(JSONObject jSONObject, s5 s5Var) {
        if (f(jSONObject, s5Var)) {
            return true;
        }
        float fOptDouble = (float) jSONObject.optDouble("duration", 0.0d);
        if (fOptDouble <= 0.0f) {
            a("Required field", "unable to set duration " + fOptDouble, s5Var.r());
            return false;
        }
        s5Var.l(jSONObject.optBoolean("autoplay", s5Var.h0()));
        s5Var.m(jSONObject.optBoolean("hasCtaButton", s5Var.i0()));
        s5Var.t(jSONObject.optString("adText", s5Var.L()));
        a(jSONObject, s5Var);
        c(jSONObject, (k0) s5Var);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("shareButtons");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    ShareButtonData shareButtonDataNewData = ShareButtonData.newData();
                    shareButtonDataNewData.setName(jSONObjectOptJSONObject.optString("name"));
                    shareButtonDataNewData.setUrl(jSONObjectOptJSONObject.optString("url"));
                    shareButtonDataNewData.setImageUrl(jSONObjectOptJSONObject.optString("imageUrl"));
                    s5Var.a(shareButtonDataNewData);
                }
            }
        }
        return c(jSONObject, s5Var);
    }

    public final boolean c(JSONObject jSONObject, s5 s5Var) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediafiles");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            gb.a("AudioBannerParser: Mediafiles array is empty");
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("src");
                if (!TextUtils.isEmpty(strOptString)) {
                    AudioData audioDataNewAudioData = AudioData.newAudioData(strOptString);
                    audioDataNewAudioData.setBitrate(jSONObjectOptJSONObject.optInt(com.taurusx.tax.f.a.f65992s));
                    s5Var.a(audioDataNewAudioData);
                    return true;
                }
                a("Bad value", "bad mediafile object, src = " + strOptString, s5Var.r());
            }
        }
        return false;
    }

    public final void a(JSONObject jSONObject, s5 s5Var) {
        a(jSONObject, (k0) s5Var);
        Boolean boolH = this.f59792a.h();
        s5Var.h(boolH != null ? boolH.booleanValue() : jSONObject.optBoolean("allowSeek", s5Var.d0()));
        Boolean boolI = this.f59792a.i();
        s5Var.i(boolI != null ? boolI.booleanValue() : jSONObject.optBoolean("allowSkip", s5Var.e0()));
        Boolean boolJ = this.f59792a.j();
        s5Var.j(boolJ != null ? boolJ.booleanValue() : jSONObject.optBoolean("allowTrackChange", s5Var.f0()));
    }
}
