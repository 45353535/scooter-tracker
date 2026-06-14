package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f2 {
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.fyber.inneractive.sdk.protobuf.d2 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.f2.a(com.fyber.inneractive.sdk.protobuf.d2, java.lang.StringBuilder, int):void");
    }

    public static final void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(h3.a(s.a((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof s) {
            sb2.append(": \"");
            sb2.append(h3.a((s) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof z0) {
            sb2.append(" {");
            a((z0) obj, sb2, i10 + 2);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i10 + 2;
            a(sb2, i13, C4240b4.i.W, entry.getKey());
            a(sb2, i13, "value", entry.getValue());
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj.toString());
    }

    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }
}
