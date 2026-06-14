package com.bykv.vk.openvk.qdl.qdl.ud;

import com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud;
import net.pubnative.lite.sdk.models.AdExperience;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static int lnr = 10;
    public static int mml = 10;
    private static ud mzz = null;
    public static int qdl = 10;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static int f15929ud = 10;

    public static int lnr() {
        return f15929ud;
    }

    public static int mml() {
        return lnr;
    }

    public static int mzz() {
        return mml;
    }

    public static void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            qdl = jSONObject.optInt("splash", 10);
            f15929ud = jSONObject.optInt("reward", 10);
            lnr = jSONObject.optInt(AdExperience.BRAND, 10);
            int iOptInt = jSONObject.optInt("other", 10);
            mml = iOptInt;
            if (qdl < 0) {
                qdl = 10;
            }
            if (f15929ud < 0) {
                f15929ud = 10;
            }
            if (lnr < 0) {
                lnr = 10;
            }
            if (iOptInt < 0) {
                mml = 10;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static int ud() {
        return qdl;
    }

    public static void qdl(ud udVar) {
        mzz = udVar;
    }

    public static void qdl() {
        ud udVar = mzz;
        if (udVar != null) {
            udVar.mml();
        }
    }
}
