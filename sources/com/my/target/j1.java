package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class j1 extends h1 {
    public j1(u uVar, j jVar, Context context) {
        super(uVar, jVar, 2, context);
    }

    public static j1 a(u uVar, j jVar, Context context) {
        return new j1(uVar, jVar, context);
    }

    public boolean a(JSONObject jSONObject, s5 s5Var, i0 i0Var) {
        if (f(jSONObject, s5Var)) {
            return true;
        }
        float fO = s5Var.o();
        if (fO <= 0.0f) {
            a("Bad value", "wrong videoBanner duration " + fO, s5Var.r());
            i0Var.a(3007, "wrong parsed getDuration()=" + fO);
            return false;
        }
        s5Var.u(jSONObject.optString("closeActionText", "Close"));
        s5Var.w(jSONObject.optString("replayActionText", s5Var.W()));
        s5Var.v(jSONObject.optString("closeDelayActionText", s5Var.O()));
        Boolean boolK = this.f59792a.k();
        s5Var.k(boolK != null ? boolK.booleanValue() : jSONObject.optBoolean("automute", s5Var.g0()));
        s5Var.n(jSONObject.optBoolean("showPlayerControls", s5Var.j0()));
        Boolean boolL = this.f59792a.l();
        s5Var.l(boolL != null ? boolL.booleanValue() : jSONObject.optBoolean("autoplay", s5Var.h0()));
        s5Var.m(jSONObject.optBoolean("hasCtaButton", s5Var.i0()));
        a(jSONObject, s5Var);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shoppable");
        if (jSONObjectOptJSONObject != null) {
            s5Var.a(h(jSONObjectOptJSONObject, s5Var));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("shoppableAdsData");
        if (jSONObjectOptJSONObject2 != null) {
            s5Var.a(ea.a(this.f59792a, this.f59793b, this.f59794c).a(jSONObjectOptJSONObject2, s5Var.r()));
        }
        c(jSONObject, s5Var);
        String strOptString = jSONObject.optString("previewLink");
        if (!TextUtils.isEmpty(strOptString)) {
            s5Var.c(ImageData.newImageData(strOptString, jSONObject.optInt("previewWidth"), jSONObject.optInt("previewHeight")));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("cta");
        if (jSONObjectOptJSONObject3 != null) {
            s5Var.a(d(jSONObjectOptJSONObject3, s5Var));
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("postView");
        if (jSONObjectOptJSONObject4 != null) {
            s5Var.a(g(jSONObjectOptJSONObject4, s5Var));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediafiles");
        i0 i0VarA = i0Var.a("mediafiles");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            gb.a("CommonVideoParser: Mediafiles array is empty");
            a("Required field", "unable to find mediaFiles in MediaBanner", s5Var.r());
            i0VarA.a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, "unable to find mediaFiles in MediaBanner");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i10);
            i0 i0VarB = i0VarA.b(i10);
            if (jSONObjectOptJSONObject5 != null) {
                VideoData videoDataA = a(jSONObjectOptJSONObject5, s5Var.r(), i0VarB);
                if (videoDataA != null) {
                    arrayList.add(videoDataA);
                }
            } else {
                i0VarB.c(3007);
            }
        }
        if (arrayList.size() > 0) {
            VideoData videoDataChooseBest = VideoData.chooseBest(arrayList, this.f59793b.j());
            if (videoDataChooseBest != null) {
                s5Var.a(videoDataChooseBest);
                return true;
            }
            i0Var.b(3007, "Unable to find best video data for q=" + this.f59793b.j());
        }
        i0Var.b(3008, "no video data parsed");
        return false;
    }

    public final VideoData a(JSONObject jSONObject, String str, i0 i0Var) {
        String strOptString = jSONObject.optString("src");
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        if (!TextUtils.isEmpty(strOptString) && iOptInt > 0 && iOptInt2 > 0) {
            VideoData videoDataNewVideoData = VideoData.newVideoData(strOptString, iOptInt, iOptInt2);
            videoDataNewVideoData.setBitrate(jSONObject.optInt(com.taurusx.tax.f.a.f65992s));
            if (!videoDataNewVideoData.getUrl().endsWith(VideoData.M3U8) || w5.b()) {
                return videoDataNewVideoData;
            }
            gb.a("CommonVideoParser: HLS Video does not supported, add 'androidx.media3:media3-exoplayer-hls' dependency to play HLS video ");
            i0Var.a(3009, "HLS Video does not supported, add...");
            return null;
        }
        a("Bad value", "bad mediafile object, src = " + strOptString + ", width = " + iOptInt + ", height = " + iOptInt2, str);
        i0Var.a(3007, "bad mediafile object, src = " + strOptString + ", width = " + iOptInt + ", height = " + iOptInt2);
        return null;
    }
}
