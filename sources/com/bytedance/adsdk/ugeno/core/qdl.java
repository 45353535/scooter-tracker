package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private List<C0206qdl> lnr;
    private long mml;
    private String mo;
    private long mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16152ud;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.qdl$qdl, reason: collision with other inner class name */
    public static class C0206qdl {
        private float[] jpc;
        private String lnr;
        private long mml;
        private float mo;
        private String mzz;
        private long qdl;
        private String to;
        private String tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private float f16153ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private float f16154wd;

        public float[] jpc() {
            return this.jpc;
        }

        public String lnr() {
            return this.lnr;
        }

        public long mml() {
            return this.mml;
        }

        public float mo() {
            return this.mo;
        }

        public String mzz() {
            return this.mzz;
        }

        public long qdl() {
            return this.qdl;
        }

        public String to() {
            return this.to;
        }

        public String tvp() {
            return this.tvp;
        }

        public float ud() {
            return this.f16153ud;
        }

        public float wd() {
            return this.f16154wd;
        }

        public void lnr(float f10) {
            this.f16154wd = f10;
        }

        public void mml(String str) {
            this.tvp = str;
        }

        public void qdl(long j10) {
            this.qdl = j10;
        }

        public void ud(long j10) {
            this.mml = j10;
        }

        public void lnr(String str) {
            this.to = str;
        }

        public void qdl(float f10) {
            this.f16153ud = f10;
        }

        public void ud(String str) {
            this.mzz = str;
        }

        public void qdl(String str) {
            this.lnr = str;
        }

        public void ud(float f10) {
            this.mo = f10;
        }

        public void qdl(float[] fArr) {
            this.jpc = fArr;
        }

        public static C0206qdl qdl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
            if (jSONObject == null) {
                return null;
            }
            C0206qdl c0206qdl = new C0206qdl();
            c0206qdl.qdl(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0206qdl.qdl(-1.0f);
            } else {
                try {
                    c0206qdl.qdl(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0206qdl.qdl(0.0f);
                }
            }
            c0206qdl.qdl(jSONObject.optString("loopMode"));
            c0206qdl.ud(jSONObject.optString("type"));
            if (TextUtils.equals(c0206qdl.mzz(), "ripple")) {
                c0206qdl.lnr(jSONObject.optString("rippleColor"));
            }
            View viewRq = lnrVar.rq();
            Context context = viewRq != null ? viewRq.getContext() : null;
            if (TextUtils.equals(c0206qdl.mzz(), "backgroundColor")) {
                String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("valueTo"), lnrVar.fs());
                int iQdl = com.bytedance.adsdk.ugeno.wd.qdl.qdl(jSONObject.optString("valueFrom"));
                int iQdl2 = com.bytedance.adsdk.ugeno.wd.qdl.qdl(strQdl);
                c0206qdl.ud(iQdl);
                c0206qdl.lnr(iQdl2);
            } else if ((TextUtils.equals(c0206qdl.mzz(), "translateX") || TextUtils.equals(c0206qdl.mzz(), "translateY")) && context != null) {
                try {
                    float fQdl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(context, (float) jSONObject.optDouble("valueFrom"));
                    float fQdl2 = com.bytedance.adsdk.ugeno.wd.jpc.qdl(context, (float) jSONObject.optDouble("valueTo"));
                    c0206qdl.ud(fQdl);
                    c0206qdl.lnr(fQdl2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0206qdl.ud((float) jSONObject.optDouble("valueFrom"));
                c0206qdl.lnr((float) jSONObject.optDouble("valueTo"));
            }
            c0206qdl.mml(jSONObject.optString("interpolator"));
            String strQdl2 = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("startDelay"), lnrVar.fs());
            Log.d("TAG", "createAnimationModel: ");
            c0206qdl.ud(com.bytedance.adsdk.ugeno.wd.lnr.qdl(strQdl2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0206qdl.mzz(), "translateX") || TextUtils.equals(c0206qdl.mzz(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.wd.jpc.qdl(context, (float) qdl.qdl(jSONArrayOptJSONArray.optString(i10), lnrVar.fs()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) qdl.qdl(jSONArrayOptJSONArray.optString(i10), lnrVar.fs());
                        i10++;
                    }
                }
                c0206qdl.qdl(fArr);
            }
            return c0206qdl;
        }
    }

    public List<C0206qdl> lnr() {
        return this.lnr;
    }

    public long mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public long mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public float ud() {
        return this.f16152ud;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(long j10) {
        this.mzz = j10;
    }

    public void qdl(float f10) {
        this.f16152ud = f10;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(List<C0206qdl> list) {
        this.lnr = list;
    }

    public void qdl(long j10) {
        this.mml = j10;
    }

    public static qdl qdl(String str, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return qdl(new JSONObject(str), lnrVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static qdl qdl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        return qdl(jSONObject, null, lnrVar);
    }

    public static qdl qdl(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        qdlVar.qdl(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            qdlVar.qdl(-1.0f);
        } else {
            try {
                qdlVar.qdl(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                qdlVar.qdl(0.0f);
            }
        }
        qdlVar.qdl(jSONObject.optLong("duration", 0L));
        qdlVar.ud(com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("startDelay"), lnrVar.fs()), 0L));
        qdlVar.ud(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.wd.ud.qdl(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0206qdl.qdl(jSONObjectOptJSONObject, lnrVar));
            }
            qdlVar.qdl(arrayList);
        }
        return qdlVar;
    }

    public static double qdl(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
