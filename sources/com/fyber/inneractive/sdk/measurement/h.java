package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f21112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21113b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f21117f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f21114c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21118g = false;

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f21114c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f21114c.put(xVar, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final boolean b() {
        if (!this.f21118g || this.f21112a == null) {
            return false;
        }
        String str = this.f21113b;
        if (str != null) {
            return !TextUtils.isEmpty(str) && this.f21113b.equalsIgnoreCase("omid");
        }
        return true;
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f21112a + ", mTrackingEvents=" + this.f21114c + ", mVerificationParameters='" + this.f21115d + "', mVendor='" + this.f21116e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f21114c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final String a() {
        if (!this.f21118g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f21113b)) {
            return "apiFramework = ";
        }
        if (!this.f21113b.equalsIgnoreCase("omid")) {
            return "apiFramework = " + this.f21113b;
        }
        return "JavaScriptResource_url = " + (TextUtils.isEmpty(this.f21117f) ? "" : this.f21117f);
    }
}
