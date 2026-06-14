package com.taurusx.tax.c;

import android.text.TextUtils;
import com.ironsource.D5;
import com.taurusx.tax.c.w;
import com.taurusx.tax.log.LogUtil;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static c f65976w = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static c f65977y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f65978z = "EventRequestHelper";

    public interface w {
        void z(int i10, String str, String str2);
    }

    public static void w(c cVar) {
    }

    public static void z(c cVar) {
    }

    /* JADX INFO: renamed from: com.taurusx.tax.c.z$z, reason: collision with other inner class name */
    public class C0794z implements w.y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f65979c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f65980o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w f65981s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f65982w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f65983y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ w.y.z f65984z;

        public C0794z(w.y.z zVar, String str, String str2, Map map, int i10, w wVar) {
            this.f65984z = zVar;
            this.f65982w = str;
            this.f65983y = str2;
            this.f65979c = map;
            this.f65980o = i10;
            this.f65981s = wVar;
        }

        @Override // com.taurusx.tax.c.w.y
        public Map<String, String> c() {
            return this.f65979c;
        }

        @Override // com.taurusx.tax.c.w.y
        public int o() {
            return com.taurusx.tax.w.o.w.t();
        }

        @Override // com.taurusx.tax.c.w.y
        public int s() {
            return com.taurusx.tax.w.o.w.t();
        }

        @Override // com.taurusx.tax.c.w.y
        public w.y.z w() {
            LogUtil.v("taurusx", "request method : " + this.f65984z);
            return this.f65984z;
        }

        @Override // com.taurusx.tax.c.w.y
        public String y() {
            return this.f65983y;
        }

        @Override // com.taurusx.tax.c.w.y
        public String z() {
            LogUtil.v("taurusx", "request url : " + this.f65982w);
            return this.f65982w;
        }

        @Override // com.taurusx.tax.c.w.y
        public void z(int i10, byte[] bArr, Map<String, List<String>> map, String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                str = "Http Exception";
            }
            if (bArr != null && bArr.length > 0 && this.f65984z == w.y.z.POST) {
                str2 = new String(bArr, Charset.forName(D5.N));
            } else {
                str2 = "";
            }
            w wVar = this.f65981s;
            if (wVar != null) {
                wVar.z(i10, str, str2);
            }
        }
    }

    public static void w(String str, int i10, Map<String, String> map, w wVar) {
        z(str, i10, w.y.z.POST, map, null, wVar);
    }

    public static void z(String str, int i10, String str2, Map<String, String> map, String str3) {
    }

    public static void z(String str, int i10, Map<String, String> map, w wVar) {
        z(str, i10, w.y.z.GET, map, null, wVar);
    }

    public static void z(String str, int i10, Map<String, String> map, String str2, w wVar) {
        z(str, i10, w.y.z.POST, map, str2, wVar);
    }

    public static void z(String str, int i10, w.y.z zVar, Map<String, String> map, String str2, w wVar) {
        com.taurusx.tax.c.w wVar2 = new com.taurusx.tax.c.w();
        wVar2.z(new C0794z(zVar, str, str2, map, i10, wVar));
        wVar2.y(i10);
    }
}
