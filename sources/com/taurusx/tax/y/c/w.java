package com.taurusx.tax.y.c;

import com.ironsource.D5;
import com.taurusx.tax.y.c.z;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f67615z = "JsonRequestHelper";

    /* JADX INFO: renamed from: com.taurusx.tax.y.c.w$w, reason: collision with other inner class name */
    public interface InterfaceC0830w {
        void z(int i10);

        void z(String str);
    }

    public class z implements z.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f67616c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f67617o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0830w f67618s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67619w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ byte[] f67620y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ z.w.EnumC0831z f67621z;

        public z(z.w.EnumC0831z enumC0831z, String str, byte[] bArr, Map map, int i10, InterfaceC0830w interfaceC0830w) {
            this.f67621z = enumC0831z;
            this.f67619w = str;
            this.f67620y = bArr;
            this.f67616c = map;
            this.f67617o = i10;
            this.f67618s = interfaceC0830w;
        }

        @Override // com.taurusx.tax.y.c.z.w
        public Map<String, String> c() {
            return this.f67616c;
        }

        @Override // com.taurusx.tax.y.c.z.w
        public int o() {
            return this.f67617o;
        }

        @Override // com.taurusx.tax.y.c.z.w
        public z.w.EnumC0831z w() {
            return this.f67621z;
        }

        @Override // com.taurusx.tax.y.c.z.w
        public byte[] y() {
            return this.f67620y;
        }

        @Override // com.taurusx.tax.y.c.z.w
        public String z() {
            return this.f67619w;
        }

        @Override // com.taurusx.tax.y.c.z.w
        public void z(HttpURLConnection httpURLConnection, boolean z10) {
            int responseCode = -1;
            if (httpURLConnection != null) {
                try {
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String strZ = com.taurusx.tax.y.s.c.z(com.taurusx.tax.y.c.z.z(httpURLConnection), Charset.forName(D5.N));
                        InterfaceC0830w interfaceC0830w = this.f67618s;
                        if (interfaceC0830w != null) {
                            interfaceC0830w.z(strZ);
                            return;
                        }
                        return;
                    }
                } catch (Error | Exception e10) {
                    e10.printStackTrace();
                }
            }
            InterfaceC0830w interfaceC0830w2 = this.f67618s;
            if (interfaceC0830w2 != null) {
                interfaceC0830w2.z(responseCode);
            }
        }
    }

    public static void w(String str, Map<String, String> map, int i10, InterfaceC0830w interfaceC0830w) {
        z(str, z.w.EnumC0831z.POST, map, null, i10, interfaceC0830w);
    }

    public static void z(String str, Map<String, String> map, int i10, InterfaceC0830w interfaceC0830w) {
        z(str, z.w.EnumC0831z.GET, map, null, i10, interfaceC0830w);
    }

    public static void z(String str, Map<String, String> map, String str2, int i10, InterfaceC0830w interfaceC0830w) {
        z(str, z.w.EnumC0831z.POST, map, str2.getBytes(), i10, interfaceC0830w);
    }

    public static void z(String str, Map<String, String> map, byte[] bArr, int i10, InterfaceC0830w interfaceC0830w) {
        z(str, z.w.EnumC0831z.POST, map, bArr, i10, interfaceC0830w);
    }

    public static void z(String str, z.w.EnumC0831z enumC0831z, Map<String, String> map, byte[] bArr, int i10, InterfaceC0830w interfaceC0830w) {
        com.taurusx.tax.y.c.z zVar = new com.taurusx.tax.y.c.z();
        zVar.z(new z(enumC0831z, str, bArr, map, i10, interfaceC0830w));
        zVar.y();
    }
}
