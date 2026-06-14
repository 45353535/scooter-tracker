package com.startapp.sdk.internal;

import com.startapp.json.TypeParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class ja implements TypeParser<int[]> {
    @Override // com.startapp.json.TypeParser
    public final int[] parse(Class<int[]> cls, Object obj) {
        int i10;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        int[] iArr = null;
        if (obj instanceof String) {
            WeakHashMap weakHashMap = vi.f65408a;
            String[] strArrSplit = ((String) obj).split(StringUtils.COMMA);
            int length = strArrSplit.length;
            int[] iArr2 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    iArr2[i11] = Integer.parseInt(strArrSplit[i11].trim());
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            return iArr2;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            int length2 = jSONArray.length();
            iArr = new int[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                Object objOpt = jSONArray.opt(i12);
                if (objOpt instanceof Number) {
                    iArr[i12] = ((Number) objOpt).intValue();
                } else if (objOpt instanceof String) {
                    String str = (String) objOpt;
                    WeakHashMap weakHashMap2 = vi.f65408a;
                    if (str != null) {
                        try {
                            i10 = Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            i10 = 0;
                        }
                        iArr[i12] = i10;
                    } else {
                        i10 = 0;
                        iArr[i12] = i10;
                    }
                }
            }
        }
        return iArr;
    }
}
