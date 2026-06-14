package com.taurusx.tax.g.q0.n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.taurusx.tax.g.q0.y;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class z extends com.taurusx.tax.g.q0.z {
    public z(Context context) {
        super(context);
    }

    @Override // com.taurusx.tax.g.q0.z
    public y z() {
        LogUtil.d("taurusx", "fetch: ...");
        String string = "";
        try {
            Cursor cursorQuery = this.f66311z.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                cursorQuery.close();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            LogUtil.d("taurusx", "fetch: query provider exception " + e10);
        } catch (Throwable th2) {
            th2.printStackTrace();
            LogUtil.d("taurusx", "fetch: query provider exception " + th2);
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.d("taurusx", "fetch: get OAID failed!");
            return null;
        }
        LogUtil.d("taurusx", "fetch: get OAID success! OAID is " + string);
        return new y(string, false);
    }
}
