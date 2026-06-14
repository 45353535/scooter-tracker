package com.ironsource.sdk.controller;

import com.ironsource.C4462o4;
import com.ironsource.C4468oa;
import com.ironsource.C4485pa;
import com.ironsource.C4516r8;
import com.ironsource.C4652z8;
import com.ironsource.Lc;
import com.ironsource.V5;
import com.ironsource.X5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X5 f45146b;

    j(String str, X5 x52) {
        this.f45145a = str;
        this.f45146b = x52;
    }

    private C4652z8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(V5.c.f41893c) || !jSONObject.has(V5.c.f41892b)) {
            throw new Exception(V5.a.f41877a);
        }
        String string = jSONObject.getString(V5.c.f41893c);
        return new C4652z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(V5.c.f41892b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(org.json.JSONObject r10, com.ironsource.InterfaceC4451na r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.j.a(org.json.JSONObject, com.ironsource.na):void");
    }

    class a implements Lc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4485pa f45147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4468oa f45148b;

        a(C4485pa c4485pa, C4468oa c4468oa) {
            this.f45147a = c4485pa;
            this.f45148b = c4468oa;
        }

        @Override // com.ironsource.Lc
        public void a(C4652z8 c4652z8) {
            try {
                C4485pa c4485pa = this.f45147a;
                C4468oa c4468oa = this.f45148b;
                c4485pa.b(c4468oa, j.this.a(c4468oa, c4652z8.a()));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Lc
        public void a(C4652z8 c4652z8, C4516r8 c4516r8) {
            try {
                C4485pa c4485pa = this.f45147a;
                C4468oa c4468oa = this.f45148b;
                c4485pa.a(c4468oa, j.this.a(c4468oa, c4516r8.b()));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    private Lc a(C4468oa c4468oa, C4485pa c4485pa) {
        return new a(c4485pa, c4468oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4468oa c4468oa, JSONObject jSONObject) {
        try {
            return c4468oa.e().put("result", jSONObject);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C4468oa c4468oa, long j10) {
        try {
            return c4468oa.e().put("result", j10);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4468oa c4468oa, String str) {
        try {
            return c4468oa.e().put("errMsg", str);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    private C4652z8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(V5.c.f41894d)) {
            return new C4652z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(V5.c.f41894d)));
        }
        throw new Exception(V5.a.f41878b);
    }
}
