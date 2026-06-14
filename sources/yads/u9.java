package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u9 {
    public static c a(Map map) {
        Set set;
        Long lValueOf;
        String strC = ez0.c(map, f01.f110555n);
        String strOptString = "";
        if (strC == null) {
            strC = "";
        }
        String strC2 = ez0.c(map, f01.L);
        if (strC2 == null) {
            set = SetsKt.emptySet();
        } else {
            try {
                strOptString = new JSONObject(strC2).optString("test_ids", "");
            } catch (Throwable unused) {
                boolean z10 = lb1.f113032a;
            }
            List listSplit$default = StringsKt.split$default(strOptString, new String[]{";"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                try {
                    lValueOf = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            set = CollectionsKt.toSet(arrayList);
        }
        return new c(strC, set);
    }
}
