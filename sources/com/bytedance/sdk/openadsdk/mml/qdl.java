package com.bytedance.sdk.openadsdk.mml;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.mraid.MraidBrowser;
import com.taurusx.tax.y.z.w.s;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements com.bytedance.sdk.component.mo.qdl.mml.qdl.ud {
    private com.bytedance.sdk.openadsdk.mml.ud.qdl aaj;
    private String bch;
    private String bjy;
    private String exc;
    private JSONObject exu;
    private final AtomicBoolean fs;
    private String jl;
    private int jpc;
    private String jtx;
    private String jyq;
    private int ljh;
    private boolean lnr;
    private long mml;
    private final String mo;
    private long mzz;
    private String oth;
    public final String qdl;
    private String rdp;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected final JSONObject f17726ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17727wd;
    private String yt;
    private static final Set<String> to = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> rq = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", MraidBrowser.f66374a);
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mml.qdl$qdl, reason: collision with other inner class name */
    public static final class C0290qdl {
        private String aaj;
        private com.bytedance.sdk.openadsdk.mml.ud.qdl bjy;
        private boolean exc;
        private String exu;
        private final int fs;
        private int jl;
        private String jpc;
        private final long jtx;
        private String lnr;
        private String mml;
        private String mo;
        private String mzz;
        public int qdl;
        private com.bytedance.sdk.openadsdk.mml.ud.ud rdp;
        private String rq;
        private JSONObject to;
        private String tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f17728ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private String f17729wd;
        private int yt;

        public C0290qdl(long j10, ljh ljhVar) {
            this.yt = -1;
            this.jl = -1;
            this.qdl = -1;
            if (ljhVar != null) {
                this.exc = vu.ud(ljhVar);
                this.yt = ljhVar.tid();
                this.jl = ljhVar.taz();
                this.qdl = ljhVar.vxg();
            }
            this.jtx = j10;
            this.fs = com.bytedance.sdk.component.utils.jl.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl());
        }

        public C0290qdl jpc(String str) {
            this.aaj = str;
            return this;
        }

        public C0290qdl lnr(String str) {
            this.mml = str;
            return this;
        }

        public C0290qdl mml(String str) {
            this.mzz = str;
            return this;
        }

        public C0290qdl mo(String str) {
            this.tvp = str;
            return this;
        }

        public C0290qdl mzz(String str) {
            this.jpc = str;
            return this;
        }

        public C0290qdl ud(String str) {
            this.lnr = str;
            return this;
        }

        public C0290qdl wd(String str) {
            this.f17729wd = str;
            return this;
        }

        public C0290qdl qdl(String str) {
            this.exu = str;
            return this;
        }

        public C0290qdl qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.to = jSONObject;
            return this;
        }

        public void qdl(com.bytedance.sdk.openadsdk.mml.ud.qdl qdlVar) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl(this.mml, this.aaj, this.f17729wd, this.lnr);
            this.bjy = qdlVar;
            final qdl qdlVar2 = new qdl(this);
            try {
                com.bytedance.sdk.openadsdk.mml.ud.ud udVar = this.rdp;
                if (udVar != null) {
                    udVar.qdl(qdlVar2.f17726ud, this.jtx);
                } else {
                    new com.bytedance.sdk.openadsdk.mml.ud.lnr().qdl(qdlVar2.f17726ud, this.jtx);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                fco.lnr(new com.bytedance.sdk.component.jpc.jpc("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.mml.qdl.qdl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(qdlVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(qdlVar2);
            }
        }
    }

    public qdl(String str, JSONObject jSONObject) {
        this.mo = "adiff";
        this.fs = new AtomicBoolean(false);
        this.exu = new JSONObject();
        this.qdl = str;
        this.f17726ud = jSONObject;
    }

    private void mo() {
        JSONObject jSONObject = this.exu;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.exu.optString("category");
            String strOptString3 = this.exu.optString("log_extra");
            if (qdl(this.yt, this.jtx, this.oth)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ud(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.yt) || TextUtils.equals(this.yt, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.jtx) || !ud(this.jtx)) && (TextUtils.isEmpty(strOptString2) || !ud(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.oth) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!qdl(this.yt, this.jtx, this.oth)) {
            return;
        }
        this.mml = com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl.incrementAndGet();
    }

    private boolean qdl(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
        }
        return false;
    }

    private boolean ud(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private void wd() throws JSONException {
        this.f17726ud.putOpt("app_log_url", this.bch);
        this.f17726ud.putOpt(s.z.f67720z, this.rdp);
        this.f17726ud.putOpt("label", this.bjy);
        this.f17726ud.putOpt("category", this.jtx);
        if (!TextUtils.isEmpty(this.yt)) {
            try {
                this.f17726ud.putOpt("value", Long.valueOf(Long.parseLong(this.yt)));
            } catch (NumberFormatException unused) {
                this.f17726ud.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.exc)) {
            try {
                this.f17726ud.putOpt("ext_value", Long.valueOf(Long.parseLong(this.exc)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.oth)) {
            this.f17726ud.putOpt("log_extra", this.oth);
        }
        if (!TextUtils.isEmpty(this.jyq)) {
            try {
                this.f17726ud.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.jyq)));
            } catch (NumberFormatException unused3) {
            }
        }
        qdl(this.f17726ud, this.bjy);
        try {
            this.f17726ud.putOpt("nt", Integer.valueOf(this.ljh));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.exu.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f17726ud.putOpt(next, this.exu.opt(next));
        }
    }

    public JSONObject lnr() {
        if (this.fs.get()) {
            return this.f17726ud;
        }
        try {
            wd();
            if (this.f17726ud.has("ad_extra_data")) {
                Object objOpt = this.f17726ud.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.f17726ud.put("ad_extra_data", qdl((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.f17726ud.put("ad_extra_data", qdl(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        aaj.lnr("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.qdl);
                    if (this.lnr) {
                        jSONObject.put("interaction_method", this.f17727wd);
                        jSONObject.put("real_interaction_method", this.jpc);
                        jSONObject.put("image_mode", this.tvp);
                    }
                    this.f17726ud.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e11) {
                    aaj.lnr("AdEvent", "json error", e11.getMessage());
                }
            }
            this.fs.set(true);
        } catch (Throwable unused) {
        }
        return this.f17726ud;
    }

    public String mml() {
        return this.qdl;
    }

    public boolean mzz() {
        Set<String> setRdp;
        if (this.f17726ud == null || (setRdp = com.bytedance.sdk.openadsdk.core.yt.mml().rdp()) == null) {
            return false;
        }
        String strOptString = this.f17726ud.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setRdp.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.bjy)) {
            return false;
        }
        return setRdp.contains(this.bjy);
    }

    private void ud(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : rq.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(rq.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject qdl(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.qdl);
            }
            if (this.lnr) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.f17727wd);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.jpc);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.tvp);
                }
            }
            if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("replace_log_extra_key", false)) {
                ud(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.qdl + TokenBuilder.TOKEN_DELIMITER + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            aaj.lnr("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    qdl(C0290qdl c0290qdl) {
        this.mo = "adiff";
        this.fs = new AtomicBoolean(false);
        this.exu = new JSONObject();
        if (!TextUtils.isEmpty(c0290qdl.f17728ud)) {
            this.qdl = c0290qdl.f17728ud;
        } else {
            this.qdl = uw.qdl();
        }
        this.aaj = c0290qdl.bjy;
        this.oth = c0290qdl.mo;
        this.rdp = c0290qdl.lnr;
        this.bjy = c0290qdl.mml;
        if (!TextUtils.isEmpty(c0290qdl.mzz)) {
            this.jtx = c0290qdl.mzz;
        } else {
            this.jtx = "app_union";
        }
        this.jyq = c0290qdl.rq;
        this.yt = c0290qdl.jpc;
        this.exc = c0290qdl.tvp;
        this.jl = c0290qdl.f17729wd;
        this.ljh = c0290qdl.fs;
        this.bch = c0290qdl.exu;
        this.exu = c0290qdl.to = c0290qdl.to != null ? c0290qdl.to : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f17726ud = jSONObject;
        if (!TextUtils.isEmpty(c0290qdl.exu)) {
            try {
                jSONObject.put("app_log_url", c0290qdl.exu);
            } catch (JSONException e10) {
                aaj.lnr("AdEvent", e10.getMessage());
            }
        }
        this.f17727wd = c0290qdl.yt;
        this.jpc = c0290qdl.jl;
        this.tvp = c0290qdl.qdl;
        this.lnr = c0290qdl.exc;
        this.mzz = System.currentTimeMillis();
        mo();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl.ud
    public long ud() {
        return this.mml;
    }

    public JSONObject qdl(boolean z10) {
        JSONObject jSONObjectLnr = lnr();
        try {
            if (z10) {
                JSONObject jSONObject = new JSONObject(jSONObjectLnr.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectLnr.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e10) {
            aaj.lnr("AdEvent", e10.getMessage());
            return jSONObjectLnr;
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl.ud
    public JSONObject qdl(String str) {
        return lnr();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl.ud
    public long qdl() {
        return this.mzz;
    }

    private static void qdl(JSONObject jSONObject, String str) {
        try {
            Set<String> set = to;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th2) {
            aaj.lnr("AdEvent", th2);
        }
    }
}
