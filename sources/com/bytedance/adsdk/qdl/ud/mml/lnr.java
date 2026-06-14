package com.bytedance.adsdk.qdl.ud.mml;

import androidx.webkit.ProxyConfig;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCaseKt;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public enum lnr implements mzz {
    QUESTION("?", 0),
    COLON(StringUtils.PROCESS_POSTFIX_DELIMITER, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(GetAdRequestUseCaseKt.DEFAULT_COMPARATOR, 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS(TokenBuilder.TOKEN_DELIMITER, 3),
    MULTI(ProxyConfig.MATCH_ALL_SCHEMES, 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final int exc;
    private final String jl;
    private static final Map<String, lnr> jtx = new HashMap(128);
    private static final Set<lnr> yt = new HashSet();

    static {
        for (lnr lnrVar : values()) {
            jtx.put(lnrVar.qdl(), lnrVar);
            yt.add(lnrVar);
        }
    }

    lnr(String str, int i10) {
        this.jl = str;
        this.exc = i10;
    }

    public static lnr qdl(String str) {
        return jtx.get(str);
    }

    public int ud() {
        return this.exc;
    }

    public static boolean qdl(mzz mzzVar) {
        return mzzVar instanceof lnr;
    }

    public String qdl() {
        return this.jl;
    }
}
