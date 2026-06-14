package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f21138d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21139a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f21140b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f21141c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.f21141c;
            }
            g gVar = (g) this.f21139a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f21139a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.f21141c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.f21140b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.f21140b.put(str, iVar);
        return iVar;
    }
}
