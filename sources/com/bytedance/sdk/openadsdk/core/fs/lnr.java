package com.bytedance.sdk.openadsdk.core.fs;

import com.bytedance.sdk.openadsdk.core.fs.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private ljh fs;
    protected String jpc;
    protected qdl.EnumC0258qdl lnr;
    protected qdl.ud mml;
    protected List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mo;
    protected String mzz;
    protected int qdl;
    private String to;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected int f17206ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> f17207wd;
    private final AtomicBoolean rq = new AtomicBoolean(false);
    protected String tvp = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.lnr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[qdl.ud.values().length];
            qdl = iArr;
            try {
                iArr[qdl.ud.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[qdl.ud.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[qdl.ud.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lnr(int i10, int i11, qdl.EnumC0258qdl enumC0258qdl, qdl.ud udVar, String str, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list2, String str2) {
        this.mo = new ArrayList();
        this.f17207wd = new ArrayList();
        this.qdl = i10;
        this.f17206ud = i11;
        this.lnr = enumC0258qdl;
        this.mml = udVar;
        this.mzz = str;
        this.mo = list;
        this.f17207wd = list2;
        this.jpc = str2;
    }

    public int lnr() {
        return this.f17206ud;
    }

    public String mml() {
        int i10 = AnonymousClass1.qdl[this.mml.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.mzz;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.qdl + "\" height=\"" + this.f17206ud + "\" src=\"" + this.mzz + "\"></iframe>";
        }
        qdl.EnumC0258qdl enumC0258qdl = this.lnr;
        if (enumC0258qdl == qdl.EnumC0258qdl.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.mzz + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0258qdl != qdl.EnumC0258qdl.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.mzz + "\"></script>";
    }

    public String mo() {
        return this.mzz;
    }

    public String mzz() {
        if (this.mml == qdl.ud.STATIC_RESOURCE && this.lnr == qdl.EnumC0258qdl.IMAGE) {
            return this.mzz;
        }
        return null;
    }

    public void qdl(long j10) {
        com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(null, this.mo, null, j10, this.to, new lnr.ud(this.tvp, this.fs), null);
    }

    public int ud() {
        return this.qdl;
    }

    public static float qdl(int i10, int i11, int i12, int i13, qdl.ud udVar, qdl.EnumC0258qdl enumC0258qdl) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return qdl(udVar, enumC0258qdl) / ((Math.abs((f10 / i11) - (f11 / i13)) + Math.abs((f10 - f11) / f10)) + 1.0f);
    }

    public void ud(long j10) {
        if (this.rq.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud((ljh) null, this.f17207wd, (com.bytedance.sdk.openadsdk.core.fs.qdl.qdl) null, j10, this.to, (String) null);
        }
    }

    public static lnr ud(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", qdl.EnumC0258qdl.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", qdl.ud.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new lnr.qdl(jSONArrayOptJSONArray.optString(i10)).qdl());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new lnr.qdl(jSONArrayOptJSONArray2.optString(i11)).qdl());
        }
        return new lnr(iOptInt, iOptInt2, qdl.EnumC0258qdl.valueOf(strOptString), qdl.ud.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float qdl(qdl.ud udVar, qdl.EnumC0258qdl enumC0258qdl) {
        int i10 = AnonymousClass1.qdl[udVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (qdl.EnumC0258qdl.JAVASCRIPT.equals(enumC0258qdl)) {
            return 1.0f;
        }
        return qdl.EnumC0258qdl.IMAGE.equals(enumC0258qdl) ? 0.8f : 0.0f;
    }

    public void qdl(String str) {
        this.to = str;
    }

    public JSONObject qdl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.qdl);
        jSONObject.put("height", this.f17206ud);
        jSONObject.put("creativeType", this.lnr.toString());
        jSONObject.put("resourceType", this.mml.toString());
        jSONObject.put("contentUrl", this.mzz);
        jSONObject.put("clickThroughUri", this.jpc);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.mo));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.f17207wd));
        return jSONObject;
    }

    public void qdl(ljh ljhVar) {
        this.fs = ljhVar;
    }
}
