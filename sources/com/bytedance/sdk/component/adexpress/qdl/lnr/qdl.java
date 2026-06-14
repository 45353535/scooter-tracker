package com.bytedance.sdk.component.adexpress.qdl.lnr;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private String lnr;
    private List<C0226qdl> mml;
    private String mo;
    private ud mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16456ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private Map<String, qdl> f16457wd = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.qdl.lnr.qdl$qdl, reason: collision with other inner class name */
    public static class C0226qdl {
        private int lnr;
        private String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f16458ud;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0226qdl)) {
                return super.equals(obj);
            }
            String str2 = this.qdl;
            if (str2 != null) {
                C0226qdl c0226qdl = (C0226qdl) obj;
                if (str2.equals(c0226qdl.qdl()) && (str = this.f16458ud) != null && str.equals(c0226qdl.ud())) {
                    return true;
                }
            }
            return false;
        }

        public int lnr() {
            return this.lnr;
        }

        public String qdl() {
            return this.qdl;
        }

        public String ud() {
            return this.f16458ud;
        }

        public void qdl(String str) {
            this.qdl = str;
        }

        public void ud(String str) {
            this.f16458ud = str;
        }

        public void qdl(int i10) {
            this.lnr = i10;
        }
    }

    public static class ud {
        private List<Pair<String, String>> lnr;
        private String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f16459ud;

        public String qdl() {
            return this.qdl;
        }

        public void ud(String str) {
            this.f16459ud = str;
        }

        public void qdl(String str) {
            this.qdl = str;
        }

        public List<Pair<String, String>> ud() {
            return this.lnr;
        }

        public void qdl(List<Pair<String, String>> list) {
            this.lnr = list;
        }
    }

    public boolean jpc() {
        return (TextUtils.isEmpty(mml()) || TextUtils.isEmpty(lnr()) || TextUtils.isEmpty(ud())) ? false : true;
    }

    public String lnr() {
        return this.f16456ud;
    }

    public String mml() {
        return this.lnr;
    }

    public List<C0226qdl> mo() {
        if (this.mml == null) {
            this.mml = new ArrayList();
        }
        return this.mml;
    }

    public ud mzz() {
        return this.mzz;
    }

    public Map<String, qdl> qdl() {
        return this.f16457wd;
    }

    public String to() {
        JSONObject jSONObjectTvp;
        if (!jpc() || (jSONObjectTvp = tvp()) == null) {
            return null;
        }
        return jSONObjectTvp.toString();
    }

    public JSONObject tvp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", ud());
            jSONObject.putOpt("version", lnr());
            jSONObject.putOpt(C4240b4.i.Z, mml());
            if (!TextUtils.isEmpty(this.mo)) {
                jSONObject.put("template_fetch_url", this.mo);
            }
            JSONArray jSONArray = new JSONArray();
            if (mo() != null) {
                for (C0226qdl c0226qdl : mo()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0226qdl.qdl());
                    jSONObject2.putOpt("md5", c0226qdl.ud());
                    jSONObject2.putOpt("level", Integer.valueOf(c0226qdl.lnr()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.f16457wd.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.f16457wd.keySet()) {
                    qdl qdlVar = this.f16457wd.get(str);
                    if (qdlVar != null) {
                        jSONObject3.put(str, qdlVar.tvp());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            ud udVarMzz = mzz();
            if (udVarMzz != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", udVarMzz.qdl);
                jSONObject4.put("md5", udVarMzz.f16459ud);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listUd = udVarMzz.ud();
                if (listUd != null) {
                    for (Pair<String, String> pair : listUd) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String ud() {
        return this.qdl;
    }

    public String wd() {
        return this.mo;
    }

    public static qdl mzz(String str) {
        if (str == null) {
            return null;
        }
        try {
            return qdl(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void lnr(String str) {
        this.lnr = str;
    }

    public void mml(String str) {
        this.mo = str;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.f16456ud = str;
    }

    public void qdl(ud udVar) {
        this.mzz = udVar;
    }

    public void qdl(List<C0226qdl> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mml = list;
    }

    public static qdl qdl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        qdlVar.qdl(jSONObject.optString("name"));
        qdlVar.ud(jSONObject.optString("version"));
        qdlVar.lnr(jSONObject.optString(C4240b4.i.Z));
        qdlVar.mml(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0226qdl c0226qdl = new C0226qdl();
                c0226qdl.qdl(jSONObjectOptJSONObject2.optString("url"));
                c0226qdl.ud(jSONObjectOptJSONObject2.optString("md5"));
                c0226qdl.qdl(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0226qdl);
            }
        }
        qdlVar.qdl(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    qdl qdlVarQdl = qdl(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (qdlVarQdl != null) {
                        qdlVar.qdl().put(next, qdlVarQdl);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            ud udVar = new ud();
            udVar.qdl(jSONObjectOptJSONObject.optString("url"));
            udVar.ud(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                udVar.qdl(arrayList2);
            }
            qdlVar.qdl(udVar);
        }
        if (qdlVar.jpc()) {
            return qdlVar;
        }
        return null;
    }
}
