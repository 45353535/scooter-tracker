package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private ArrayList<qdl> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private mml f17391ud;

    public static class qdl {
        private com.bytedance.sdk.openadsdk.core.fs.mml lnr;
        private Set<com.bytedance.sdk.openadsdk.core.fs.to> mml;
        private final String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final String f17392ud;

        public qdl(JSONObject jSONObject) {
            this.qdl = jSONObject.optString("vast_url");
            this.f17392ud = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = new com.bytedance.sdk.openadsdk.core.fs.mml();
                this.lnr = mmlVar;
                mmlVar.qdl(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.mml = com.bytedance.sdk.openadsdk.core.fs.to.qdl(jSONArrayOptJSONArray);
            }
        }

        public String lnr() {
            return this.qdl;
        }

        public String mml() {
            return this.f17392ud;
        }

        public JSONObject mzz() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.qdl);
            jSONObject.put("vast_content", this.f17392ud);
            com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = this.lnr;
            if (mmlVar != null) {
                jSONObject.put("videoTrackers", mmlVar.qdl());
            }
            if (this.mml != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.fs.to toVar : this.mml) {
                    if (toVar != null) {
                        jSONArray.put(toVar.mml());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }

        public com.bytedance.sdk.openadsdk.core.fs.mml qdl() {
            return this.lnr;
        }

        public Set<com.bytedance.sdk.openadsdk.core.fs.to> ud() {
            return this.mml;
        }

        public void qdl(com.bytedance.sdk.openadsdk.core.fs.mml mmlVar) {
            this.lnr = mmlVar;
        }

        public void qdl(Set<com.bytedance.sdk.openadsdk.core.fs.to> set) {
            this.mml = set;
        }
    }

    public mzz(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            qdl qdlVar = new qdl(jSONArray.optJSONObject(i10));
            if (this.qdl == null) {
                this.qdl = new ArrayList<>();
            }
            this.qdl.add(qdlVar);
        }
    }

    public static boolean qdl(ljh ljhVar) {
        if (ljhVar == null || ljhVar.xmv()) {
            return false;
        }
        int iVz = ljhVar.vz();
        int iVxg = ljhVar.vxg();
        return (iVz == 3 || iVz == 7 || iVz == 8) && (iVxg == 5 || iVxg == 15 || iVxg == 50);
    }

    @Nullable
    public mml lnr() {
        if (this.f17391ud == null) {
            this.f17391ud = new mml();
            ArrayList<qdl> arrayList = this.qdl;
            if (arrayList != null) {
                for (qdl qdlVar : arrayList) {
                    com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl = qdlVar.qdl();
                    Set<com.bytedance.sdk.openadsdk.core.fs.to> setUd = qdlVar.ud();
                    if (mmlVarQdl != null) {
                        this.f17391ud.qdl().qdl(mmlVarQdl);
                    }
                    if (setUd != null) {
                        this.f17391ud.ud().addAll(setUd);
                    }
                }
            }
        }
        return this.f17391ud;
    }

    public boolean mml() {
        ArrayList<qdl> arrayList = this.qdl;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public JSONArray ud() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<qdl> arrayList = this.qdl;
        if (arrayList != null) {
            try {
                Iterator<qdl> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().mzz());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public ArrayList<qdl> qdl() {
        return this.qdl;
    }
}
