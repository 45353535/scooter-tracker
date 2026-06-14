package com.taurusx.tax.s;

import android.content.Context;
import com.taurusx.tax.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class w {
    public static String z(Context context) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.omsdk_v1);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                String str = new String(bArr, 0, inputStreamOpenRawResource.read(bArr), "UTF-8");
                inputStreamOpenRawResource.close();
                return str;
            } finally {
            }
        } catch (IOException e10) {
            throw new UnsupportedOperationException("Yikes, omid resource not found", e10);
        }
    }
}
