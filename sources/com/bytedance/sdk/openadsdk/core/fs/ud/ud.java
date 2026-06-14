package com.bytedance.sdk.openadsdk.core.fs.ud;

import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends lnr implements Comparable<ud> {
    private final float qdl;

    public static class qdl {
        private lnr.EnumC0259lnr lnr = lnr.EnumC0259lnr.TRACKING_URL;
        private boolean mml = false;
        private final String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final float f17250ud;

        public qdl(String str, float f10) {
            this.qdl = str;
            this.f17250ud = f10;
        }

        public ud qdl() {
            return new ud(this.f17250ud, this.qdl, this.lnr, Boolean.valueOf(this.mml));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fs.ud.lnr
    public void j_() {
        super.j_();
    }

    public boolean qdl(float f10) {
        return this.qdl <= f10 && !mzz();
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject ud() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", lnr());
        jSONObject.put("trackingFraction", this.qdl);
        return jSONObject;
    }

    private ud(float f10, String str, lnr.EnumC0259lnr enumC0259lnr, Boolean bool) {
        super(str, enumC0259lnr, bool);
        this.qdl = f10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(ud udVar) {
        if (udVar == null) {
            return 1;
        }
        float f10 = this.qdl;
        float f11 = udVar.qdl;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
