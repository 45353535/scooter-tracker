package com.taurusx.tax.y.c;

import com.ironsource.D5;
import com.taurusx.tax.y.c.y;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    public interface w {
        void z(int i10);

        void z(String str);
    }

    public class z implements y.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f67609c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f67610o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w f67611s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67612w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ byte[] f67613y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ y.w.z f67614z;

        public z(y.w.z zVar, String str, byte[] bArr, Map map, int i10, w wVar) {
            this.f67614z = zVar;
            this.f67612w = str;
            this.f67613y = bArr;
            this.f67609c = map;
            this.f67610o = i10;
            this.f67611s = wVar;
        }

        @Override // com.taurusx.tax.y.c.y.w
        public Map<String, String> c() {
            return this.f67609c;
        }

        @Override // com.taurusx.tax.y.c.y.w
        public int o() {
            return this.f67610o;
        }

        @Override // com.taurusx.tax.y.c.y.w
        public y.w.z w() {
            return this.f67614z;
        }

        @Override // com.taurusx.tax.y.c.y.w
        public byte[] y() {
            return this.f67613y;
        }

        @Override // com.taurusx.tax.y.c.y.w
        public String z() {
            return this.f67612w;
        }

        @Override // com.taurusx.tax.y.c.y.w
        public void z(HttpURLConnection httpURLConnection, boolean z10) {
            int responseCode = -1;
            if (httpURLConnection != null) {
                try {
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String strZ = com.taurusx.tax.y.s.c.z(com.taurusx.tax.y.c.z.z(httpURLConnection), Charset.forName(D5.N));
                        w wVar = this.f67611s;
                        if (wVar != null) {
                            wVar.z(strZ);
                            return;
                        }
                        return;
                    }
                } catch (Error | Exception e10) {
                    e10.printStackTrace();
                }
            }
            w wVar2 = this.f67611s;
            if (wVar2 != null) {
                wVar2.z(responseCode);
            }
        }
    }

    public static void w(String str, Map<String, String> map, int i10, w wVar) {
        z(str, y.w.z.POST, map, null, i10, wVar);
    }

    public static void z(String str, Map<String, String> map, int i10, w wVar) {
        z(str, y.w.z.GET, map, null, i10, wVar);
    }

    public static void z(String str, Map<String, String> map, String str2, int i10, w wVar) {
        z(str, y.w.z.POST, map, str2.getBytes(), i10, wVar);
    }

    public static void z(String str, Map<String, String> map, byte[] bArr, int i10, w wVar) {
        z(str, y.w.z.POST, map, bArr, i10, wVar);
    }

    public static void z(String str, y.w.z zVar, Map<String, String> map, byte[] bArr, int i10, w wVar) {
        y yVar = new y();
        yVar.z(new z(zVar, str, bArr, map, i10, wVar));
        yVar.y();
    }
}
