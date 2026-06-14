package com.taurusx.tax.c;

import android.text.TextUtils;
import com.taurusx.tax.a.z.y;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.c.w;
import com.taurusx.tax.g.e0;
import com.taurusx.tax.g.q;
import com.taurusx.tax.log.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f65971w = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f65972y = "JsonRequestHelper";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f65973z = 1;

    public interface c {
    }

    public interface w extends c {
        void onResult(int i10, int i11, String str, String str2);
    }

    /* JADX INFO: renamed from: com.taurusx.tax.c.y$y, reason: collision with other inner class name */
    public interface InterfaceC0793y extends c {
        void z(int i10, String str);
    }

    public static void w(o oVar, int i10, c cVar) {
        z(oVar, cVar, i10);
    }

    public class z implements w.y {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c f65974w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ o f65975z;

        public z(o oVar, c cVar) {
            this.f65975z = oVar;
            this.f65974w = cVar;
        }

        @Override // com.taurusx.tax.c.w.y
        public Map<String, String> c() {
            Map<String, String> mapY = this.f65975z.y();
            LogUtil.sensitiveD("taurusx", "request header map : " + mapY);
            return mapY;
        }

        @Override // com.taurusx.tax.c.w.y
        public int o() {
            return com.taurusx.tax.w.o.w.f();
        }

        @Override // com.taurusx.tax.c.w.y
        public int s() {
            return com.taurusx.tax.w.o.w.f();
        }

        @Override // com.taurusx.tax.c.w.y
        public w.y.z w() {
            w.y.z zVarC = this.f65975z.c();
            LogUtil.v("taurusx", "request method : " + zVarC);
            return zVarC;
        }

        @Override // com.taurusx.tax.c.w.y
        public String y() {
            String string;
            y.w wVarZ = this.f65975z.z();
            try {
                wVarZ.n(com.taurusx.tax.g.p0.w.z(TaurusXAds.getContext()));
                wVarZ.h(e0.y(TaurusXAds.getContext()));
                wVarZ.x(com.taurusx.tax.g.w.c(TaurusXAds.getContext()));
                wVarZ.i(com.taurusx.tax.g.p0.w.s(TaurusXAds.getContext()) ? "1" : "0");
                com.taurusx.tax.g.q0.y yVarZ = com.taurusx.tax.g.q0.w.z(TaurusXAds.getContext());
                if (yVarZ != null && !TextUtils.isEmpty(yVarZ.f66310z)) {
                    wVarZ.l(yVarZ.f66310z);
                    wVarZ.e(yVarZ.f66309w ? "1" : "0");
                }
                if (z().equals(com.taurusx.tax.a.z.w.z(TaurusXAds.getContext()))) {
                    wVarZ.y(com.taurusx.tax.y.s.w.y(TaurusXAds.getContext()));
                    wVarZ.w(q.z(com.taurusx.tax.w.z.t().o()).w());
                    wVarZ.z(q.z(com.taurusx.tax.w.z.t().o()).z());
                }
            } catch (Exception unused) {
            }
            try {
                string = wVarZ.z().w().toString();
            } catch (Exception unused2) {
                string = null;
            }
            LogUtil.sensitiveD("taurusx", "request post data : " + string);
            return string;
        }

        @Override // com.taurusx.tax.c.w.y
        public String z() {
            String strA = this.f65975z.a();
            LogUtil.v("taurusx", "request url : " + strA);
            return strA;
        }

        @Override // com.taurusx.tax.c.w.y
        public void z(int i10, byte[] bArr, Map<String, List<String>> map, String str) {
            c cVar = this.f65974w;
            if (cVar instanceof w) {
                y.w(i10, bArr, this.f65975z.s(), str, (w) this.f65974w);
            } else if (cVar instanceof InterfaceC0793y) {
                y.w(i10, bArr, this.f65975z.s(), str, (InterfaceC0793y) this.f65974w);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(int r5, byte[] r6, java.lang.String r7, java.lang.String r8, com.taurusx.tax.c.y.w r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "http response code : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "taurusx"
            com.taurusx.tax.log.LogUtil.v(r1, r0)
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r5 == r0) goto L22
            r0 = 204(0xcc, float:2.86E-43)
            if (r5 != r0) goto L20
            goto L22
        L20:
            r3 = r5
            goto L74
        L22:
            if (r6 == 0) goto L34
            int r0 = r6.length
            if (r0 <= 0) goto L34
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L2f
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L2f
            r0.<init>(r6, r3)     // Catch: java.lang.Exception -> L2f
            goto L35
        L2f:
            r6 = move-exception
            java.lang.String r8 = r6.getLocalizedMessage()
        L34:
            r0 = r2
        L35:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "responseString : "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.taurusx.tax.log.LogUtil.sensitiveD(r1, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            r3 = 7
            if (r6 != 0) goto L74
            r6 = -1
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6a
            r8.<init>(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "f_c270976b"
            int r6 = r8.optInt(r0, r6)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "f_ab8a4991"
            java.lang.String r0 = r8.optString(r0, r2)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "f_6ff2fd9c"
            java.lang.String r2 = r8.optString(r4, r2)     // Catch: java.lang.Exception -> L68
        L68:
            r8 = r0
            goto L6c
        L6a:
            r0 = r2
            goto L68
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L73
            goto L74
        L73:
            r3 = r6
        L74:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "result http code : "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = " response code : "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = " , type : "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r7 = " , msg : "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.taurusx.tax.log.LogUtil.v(r1, r6)
            if (r9 == 0) goto La5
            r9.onResult(r5, r3, r8, r2)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.c.y.w(int, byte[], java.lang.String, java.lang.String, com.taurusx.tax.c.y$w):void");
    }

    public static void z(o oVar, int i10, c cVar) {
        z(oVar, cVar, i10);
    }

    public static void z(o oVar, c cVar, int i10) {
        if (oVar != null) {
            com.taurusx.tax.c.w wVar = new com.taurusx.tax.c.w();
            wVar.z(new z(oVar, cVar));
            wVar.y(i10);
            return;
        }
        throw new IllegalArgumentException("RequestParams can not be null");
    }

    public static void w(int i10, byte[] bArr, String str, String str2, InterfaceC0793y interfaceC0793y) {
        if (interfaceC0793y != null) {
            interfaceC0793y.z(i10, str2);
        }
    }
}
