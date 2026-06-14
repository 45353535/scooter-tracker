package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20384a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20385b;

    public h(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f20384a.add(strOptString);
                }
            }
        }
        this.f20385b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f20384a.isEmpty() || eVar.f20374c == null) {
            return false;
        }
        Iterator it = this.f20384a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.f20374c.value())) {
                return !this.f20385b;
            }
        }
        return this.f20385b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f20384a, Boolean.valueOf(this.f20385b));
    }
}
