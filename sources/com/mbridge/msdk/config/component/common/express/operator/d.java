package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46720b = Arrays.asList("+", TokenBuilder.TOKEN_DELIMITER, ProxyConfig.MATCH_ALL_SCHEMES, "/", "%");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46721a;

    public d(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46721a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #0 {Exception -> 0x0044, blocks: (B:12:0x001e, B:48:0x007e, B:50:0x0086, B:51:0x0094, B:52:0x009b, B:53:0x009c, B:55:0x00a4, B:56:0x00c7, B:57:0x00ce, B:58:0x00cf, B:59:0x00dd, B:60:0x00eb, B:23:0x003b, B:28:0x0047, B:31:0x0051, B:34:0x005b, B:37:0x0065), top: B:76:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.String r9, java.lang.Object r10, java.util.List<java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.d.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f46720b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Double a(Object obj) {
        if (obj == null) {
            return Double.valueOf(0.0d);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private boolean a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.floor(d10)) ? false : true;
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
