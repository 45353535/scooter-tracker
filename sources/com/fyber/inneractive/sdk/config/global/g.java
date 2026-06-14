package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static JSONArray a(Map map, boolean z10) {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : map.values()) {
                hVar.getClass();
                ArrayList<b> arrayList = new ArrayList(hVar.f20380c.values());
                HashMap map2 = hVar.f20381d;
                for (b bVar : arrayList) {
                    JSONObject jSONObject = new JSONObject();
                    String str = bVar != null ? bVar.f20366a : null;
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = (k) map2.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.f20390b);
                        } else {
                            jSONObject.put("v", SessionDescription.ATTR_CONTROL);
                        }
                        if (z10) {
                            Iterator it = bVar.f20369d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    dVar = null;
                                    break;
                                }
                                dVar = (d) it.next();
                                if (c.class.equals(dVar.getClass())) {
                                    break;
                                }
                            }
                            if (dVar != null && ((c) dVar).f20371b) {
                                HashSet hashSet = ((c) dVar).f20370a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    jSONArray2.put((Long) it2.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f23840a <= 3) {
                e10.printStackTrace();
            }
            return null;
        }
    }
}
