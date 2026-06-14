package com.my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class p3 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f60506b;

    public p3() {
        HashMap map = new HashMap();
        this.f60506b = map;
        map.put("preroll", v5.a("preroll"));
        map.put("pauseroll", v5.a("pauseroll"));
        map.put("midroll", v5.a("midroll"));
        map.put("postroll", v5.a("postroll"));
    }

    public static p3 e() {
        return new p3();
    }

    public v5 a(String str) {
        return (v5) this.f60506b.get(str);
    }

    public ArrayList c() {
        return new ArrayList(this.f60506b.values());
    }

    public boolean d() {
        for (v5 v5Var : this.f60506b.values()) {
            if (v5Var.a() > 0 || v5Var.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.my.target.t
    public int a() {
        Iterator it = this.f60506b.values().iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((v5) it.next()).a();
        }
        return iA;
    }
}
