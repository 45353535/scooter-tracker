package com.bytedance.adsdk.qdl.ud;

import com.bytedance.adsdk.qdl.ud.lnr.qdl.jpc;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.lnr;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.mml;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.mo;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.mzz;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.to;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.tvp;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.ud;
import com.bytedance.adsdk.qdl.ud.lnr.qdl.wd;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static final com.bytedance.adsdk.qdl.ud.lnr.qdl qdl;
    private com.bytedance.adsdk.qdl.ud.ud.qdl lnr;
    private Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> mml = new LinkedList();
    private String mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.adsdk.qdl.ud.lnr.qdl f15973ud;

    static {
        int i10 = 8;
        mo[] moVarArr = {new to(), new mml(), new tvp(), new ud(), new mzz(), new com.bytedance.adsdk.qdl.ud.lnr.qdl.qdl(), new wd(), new lnr(), new jpc()};
        final com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar = new com.bytedance.adsdk.qdl.ud.lnr.qdl() { // from class: com.bytedance.adsdk.qdl.ud.qdl.1
            @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl
            public int qdl(String str, int i11, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final mo moVar = moVarArr[i10];
            i10--;
            qdlVar = new com.bytedance.adsdk.qdl.ud.lnr.qdl() { // from class: com.bytedance.adsdk.qdl.ud.qdl.2
                @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl
                public int qdl(String str, int i11, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
                    return moVar.qdl(str, i11, deque, qdlVar);
                }
            };
        }
        qdl = qdlVar;
    }

    private qdl(String str, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        this.f15973ud = qdlVar;
        this.mzz = str;
        try {
            qdl();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.qdl.qdl.ud(str, e10);
        }
    }

    public static qdl qdl(String str) {
        return new qdl(str, qdl);
    }

    private void qdl() {
        int length = this.mzz.length();
        int i10 = 0;
        while (i10 < length) {
            int iQdl = this.f15973ud.qdl(this.mzz, i10, this.mml);
            if (iQdl == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.mzz.substring(0, i10));
            }
            i10 = iQdl;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.qdl.ud.ud.qdl qdlVarPollFirst = this.mml.pollFirst();
            if (qdlVarPollFirst == null) {
                this.lnr = com.bytedance.adsdk.qdl.ud.mzz.ud.qdl(arrayList, this.mzz, i10);
                this.mml = null;
                return;
            }
            arrayList.add(0, qdlVarPollFirst);
        }
    }

    public <T> T qdl(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) qdl(map);
    }

    public <T> T qdl(Map<String, JSONObject> map) {
        return (T) this.lnr.qdl(map);
    }
}
