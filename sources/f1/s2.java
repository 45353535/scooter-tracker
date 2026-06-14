package f1;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class s2 {
    public JSONObject a(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j1.d dVar = (j1.d) it.next();
            try {
                jSONObject.put(dVar.a(), dVar.getConsent());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }
}
