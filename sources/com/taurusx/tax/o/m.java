package com.taurusx.tax.o;

import com.taurusx.tax.o.g0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class m extends g {
    public m(Map<String, String> map, g0 g0Var) {
        super(map, g0Var);
    }

    @Override // com.taurusx.tax.o.g
    public boolean z(g0.f fVar) {
        return true;
    }

    @Override // com.taurusx.tax.o.g
    public void z() {
        Map<String, String> map = this.f66430z;
        if (map == null || !map.containsKey("url")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f66430z.get("url"));
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map2 = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map2.put(next, jSONObject.getString(next));
            }
            this.f66429w.getDisplayController().z(map2);
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
