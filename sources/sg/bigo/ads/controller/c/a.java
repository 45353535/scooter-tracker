package sg.bigo.ads.controller.c;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @Nullable
    public static sg.bigo.ads.api.core.b a(@NonNull sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.core.g gVar) {
        String[] strArr = {"slot"};
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 <= 0; i10++) {
            sb2.append(strArr[0]);
            sb2.append("=? ");
        }
        Cursor cursorA = sg.bigo.ads.common.g.a.a.a("tb_addata", sb2.toString(), new String[]{String.valueOf(lVar.l())}, null, 1);
        if (cursorA != null) {
            if (cursorA.moveToNext()) {
                long j10 = cursorA.getLong(cursorA.getColumnIndex("log_id"));
                String string = cursorA.getString(cursorA.getColumnIndex("ad_data"));
                long j11 = cursorA.getLong(cursorA.getColumnIndex("end_time"));
                b bVarA = b.a(j10, gVar, lVar, string);
                if (bVarA != null) {
                    bVarA.ag();
                    bVarA.a(j11);
                    return bVarA;
                }
            }
            cursorA.close();
        }
        return null;
    }

    public static boolean a(@NonNull String str) {
        int iB = sg.bigo.ads.common.g.a.a.b("tb_addata", "slot = '" + str + "'", null);
        t.a();
        return iB > 0;
    }
}
