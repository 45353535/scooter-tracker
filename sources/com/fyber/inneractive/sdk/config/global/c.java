package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20370a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20371b;

    public c(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f20370a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f20371b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f20370a.isEmpty() || eVar.f20372a == null) {
            return false;
        }
        Iterator it = this.f20370a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f20372a)) {
                return !this.f20371b;
            }
        }
        return this.f20371b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f20370a, Boolean.valueOf(this.f20371b));
    }
}
