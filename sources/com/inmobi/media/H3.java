package com.inmobi.media;

import java.util.Map;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class H3 {
    public static final Object a(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.f93230c;
            return Result.b(block.invoke());
        } catch (Error e10) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(e10));
        } catch (Exception e11) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(e11));
        }
    }

    public static final String a(String url, Map macros) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(macros, "macros");
        String strW = url;
        for (Map.Entry entry : macros.entrySet()) {
            strW = StringsKt.W(strW, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strW;
    }
}
