package sg.bigo.ads.common.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static long a(long j10) {
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "clearEventInfo");
        long jB = sg.bigo.ads.common.g.a.a.b("tb_event", "ctime < ".concat(String.valueOf(j10)), null);
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "clearEventInfo count = ".concat(String.valueOf(jB)));
        return jB;
    }

    public static long a(List<String> list) {
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "delEventInfo:" + list.size());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_id in (");
        int i10 = 0;
        while (i10 < list.size()) {
            sb2.append(i10 == 0 ? "?" : ",?");
            i10++;
        }
        sb2.append(")");
        long jB = sg.bigo.ads.common.g.a.a.b("tb_event", sb2.toString(), (String[]) list.toArray(new String[0]));
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "delEventInfo count = ".concat(String.valueOf(jB)));
        return jB;
    }

    public static long a(sg.bigo.ads.common.g.b.a aVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "insertEventInfo:" + aVar.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_action", aVar.f102436b);
        contentValues.put("event_info", aVar.f102437c);
        contentValues.put("states", Integer.valueOf(aVar.f102438d));
        contentValues.put("ext", aVar.f102439e);
        long jCurrentTimeMillis = aVar.f102440f;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(jCurrentTimeMillis));
        long jCurrentTimeMillis2 = aVar.f102441g;
        if (jCurrentTimeMillis2 == 0) {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis2));
        return sg.bigo.ads.common.g.a.a.a("tb_event", contentValues);
    }

    public static List<sg.bigo.ads.common.g.b.a> a(int i10) {
        Cursor cursorA = sg.bigo.ads.common.g.a.a.a("tb_event", null, null, "mtime DESC", i10);
        ArrayList arrayList = new ArrayList();
        if (cursorA == null) {
            return arrayList;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "getEventInfoList: count = " + cursorA.getCount());
        while (cursorA.moveToNext()) {
            arrayList.add(new sg.bigo.ads.common.g.b.a(cursorA));
            t.a();
        }
        cursorA.close();
        return arrayList;
    }

    public static List<sg.bigo.ads.common.g.b.a> a(int i10, String str, String str2, boolean z10) {
        Cursor cursorA = sg.bigo.ads.common.g.a.a.a("tb_event", z10 ? "event_action = ? OR event_action = ?" : "event_action != ? AND event_action != ?", new String[]{str, str2}, "mtime DESC", i10);
        ArrayList arrayList = new ArrayList();
        if (cursorA == null) {
            return arrayList;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "getEventInfoList: count = " + cursorA.getCount());
        while (cursorA.moveToNext()) {
            arrayList.add(new sg.bigo.ads.common.g.b.a(cursorA));
            t.a();
        }
        cursorA.close();
        return arrayList;
    }
}
