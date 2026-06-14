package com.mbridge.msdk.config.component.common.express;

import androidx.webkit.ProxyConfig;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCaseKt;
import com.google.android.gms.measurement.internal.h;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f46668c = f.a(new Map.Entry[]{h.a(C4240b4.j.f42668b, 0), h.a("+=", 0), h.a("-=", 0), h.a("*=", 0), h.a("/=", 0), h.a("%=", 0), h.a("or", 1), h.a("OR", 1), h.a("and", 2), h.a("AND", 2), h.a("==", 3), h.a("!=", 3), h.a(">", 4), h.a("<", 4), h.a(GetAdRequestUseCaseKt.DEFAULT_COMPARATOR, 4), h.a("<=", 4), h.a(ScarConstants.IN_SIGNAL_KEY, 4), h.a("IN", 4), h.a("+", 5), h.a(TokenBuilder.TOKEN_DELIMITER, 5), h.a(ProxyConfig.MATCH_ALL_SCHEMES, 6), h.a("/", 6), h.a("%", 6)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f46669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46670b;

    a() {
    }

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb2.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + C4240b4.j.f42668b);
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f46669a.get(this.f46670b).equals("(")) {
            return a(dVar, z10);
        }
        this.f46670b++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f46670b + 1;
        this.f46670b = i10;
        return i10 > this.f46669a.size() - 1 ? dVarB : b(dVarB, false);
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f46669a = b(str);
        this.f46670b = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f46670b < this.f46669a.size() && (num = f46668c.get((str = this.f46669a.get(this.f46670b)))) != null && num.intValue() >= i10) {
            int i11 = this.f46670b + 1;
            this.f46670b = i11;
            if (i11 > this.f46669a.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
            }
            dVarC = cVar;
        }
        return dVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r4 = new com.mbridge.msdk.config.component.common.express.node.i(r8 + r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.a.a(com.mbridge.msdk.config.component.common.express.node.d, boolean):com.mbridge.msdk.config.component.common.express.node.d");
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }
}
