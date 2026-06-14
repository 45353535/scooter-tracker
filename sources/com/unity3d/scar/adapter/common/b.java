package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes11.dex */
public class b extends m {
    public b(c cVar, Object... objArr) {
        super(cVar, null, objArr);
    }

    public static b a(m6.c cVar) {
        String str = String.format("Cannot show ad that is not loaded for placement %s", cVar.c());
        return new b(c.AD_NOT_LOADED_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b b(String str) {
        return new b(c.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static b c(m6.c cVar, String str) {
        return new b(c.INTERNAL_LOAD_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b d(m6.c cVar, String str) {
        return new b(c.INTERNAL_SHOW_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static b e(String str) {
        return new b(c.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static b f(String str, String str2, String str3) {
        return new b(c.NO_AD_ERROR, str3, str, str2, str3);
    }

    @Override // com.unity3d.scar.adapter.common.m
    public String getDomain() {
        return "GMA";
    }

    public b(c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
