package sg.bigo.ads.common.g.c;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static long a(List<String> list) {
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "delStatInfo:" + list.size());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        int i10 = 0;
        while (i10 < list.size()) {
            sb2.append(i10 == 0 ? "?" : ",?");
            i10++;
        }
        sb2.append(")");
        long jB = sg.bigo.ads.common.g.a.a.b("tb_stat", sb2.toString(), (String[]) list.toArray(new String[0]));
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "delStatInfo count = ".concat(String.valueOf(jB)));
        return jB;
    }

    public static List<sg.bigo.ads.common.g.b.b> a(int i10) {
        Cursor cursorA = sg.bigo.ads.common.g.a.a.a("tb_stat", null, null, "mtime DESC", i10);
        ArrayList arrayList = new ArrayList();
        if (cursorA == null) {
            return arrayList;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "getStatInfoList: count = " + cursorA.getCount());
        while (cursorA.moveToNext()) {
            arrayList.add(new sg.bigo.ads.common.g.b.b(cursorA));
            t.a();
        }
        cursorA.close();
        return arrayList;
    }
}
