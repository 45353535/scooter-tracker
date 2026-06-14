package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20386a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20387b;

    public i(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f20386a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f20387b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f20386a.isEmpty() || eVar.f20373b == null) {
            return false;
        }
        Iterator it = this.f20386a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f20373b)) {
                return !this.f20387b;
            }
        }
        return this.f20387b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f20386a, Boolean.valueOf(this.f20387b));
    }
}
