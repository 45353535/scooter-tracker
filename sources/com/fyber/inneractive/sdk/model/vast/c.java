package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f21177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f21178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f21182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f21185i = new HashMap();

    public c(i iVar, int i10, int i11, String str, int i12) {
        this.f21177a = iVar;
        this.f21179c = i10;
        this.f21180d = i11;
        this.f21181e = str;
        this.f21184h = i12;
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f21185i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f21185i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f21179c);
        sb2.append(" h:");
        sb2.append(this.f21180d);
        sb2.append(" type:");
        sb2.append(this.f21177a.toString());
        sb2.append(" creativeType: ");
        k kVar = this.f21178b;
        sb2.append(kVar != null ? kVar.mimeType : "none");
        sb2.append(" ctr:");
        sb2.append(this.f21183g);
        sb2.append(" events:");
        sb2.append(this.f21185i);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f21185i.isEmpty()) {
            return null;
        }
        return (List) this.f21185i.get(xVar);
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, this.f21179c);
            jSONObject.put("h", this.f21180d);
            jSONObject.put("type", this.f21177a.toString());
            k kVar = this.f21178b;
            if (kVar != null) {
                str = kVar.mimeType;
            } else {
                str = "none";
            }
            jSONObject.put("creativeType", str);
            jSONObject.put("content", this.f21182f);
            return jSONObject;
        } catch (JSONException e10) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e10.getMessage());
            return jSONObject;
        }
    }
}
