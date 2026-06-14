package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class hb extends ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f64624b;

    public hb(Set set) {
        super(set);
        this.f64624b = new JSONObject();
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (this.f65402a.contains(str)) {
            return;
        }
        try {
            Object objA = obj instanceof ue ? ((ue) obj).a() : obj != null ? obj.toString() : null;
            if (objA != null) {
                this.f64624b.put(str, objA);
            } else if (z10) {
                throw new SDKException(str);
            }
        } catch (JSONException e10) {
            if (z10) {
                throw new SDKException(str, e10);
            }
        }
    }

    public final String toString() {
        return this.f64624b.toString();
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Set set) {
        if (this.f65402a.contains(str) || set == null || set.size() <= 0) {
            return;
        }
        try {
            this.f64624b.put(str, new JSONArray((Collection) set));
        } catch (JSONException unused) {
        }
    }
}
