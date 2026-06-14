package com.bytedance.adsdk.qdl.ud.mml;

import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public enum mml implements mzz {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(C4240b4.j.f42672d),
    RIGHT_BRACKET(C4240b4.j.f42674e),
    COMMA(StringUtils.COMMA);

    private static final Map<String, mml> mo;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final String f15968wd;

    static {
        HashMap map = new HashMap(128);
        mo = map;
        for (mml mmlVar : map.values()) {
            mo.put(mmlVar.qdl(), mmlVar);
        }
    }

    mml(String str) {
        this.f15968wd = str;
    }

    public static boolean qdl(mzz mzzVar) {
        return mzzVar instanceof mml;
    }

    public String qdl() {
        return this.f15968wd;
    }
}
