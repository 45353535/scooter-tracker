package com.taurusx.tax.n;

import android.text.TextUtils;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.n.w;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66396c = "[CACHEBUSTING]";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66397o = "[ASSETURI]";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66398w = "[ERRORCODE]";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66399y = "[CONTENTPLAYHEAD]";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66400z = "TaxTrackEvent";

    public class w implements w.InterfaceC0810w {
        @Override // com.taurusx.tax.n.w.InterfaceC0810w
        public void z(int i10, String str) {
        }

        @Override // com.taurusx.tax.n.w.InterfaceC0810w
        public void z(String str) {
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.n.z$z, reason: collision with other inner class name */
    public class C0811z implements w.InterfaceC0810w {
        @Override // com.taurusx.tax.n.w.InterfaceC0810w
        public void z(int i10, String str) {
        }

        @Override // com.taurusx.tax.n.w.InterfaceC0810w
        public void z(String str) {
        }
    }

    public static void z(HashSet<String> hashSet, String str, String str2) {
        if (hashSet == null || hashSet.size() <= 0) {
            return;
        }
        LogUtil.v(f66400z, "error list:" + hashSet.toString());
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            com.taurusx.tax.n.w.z().z(z(it.next(), str, str2), "ad-error", new C0811z());
        }
    }

    public static void z(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.v(f66400z, "progress list:" + str);
        com.taurusx.tax.n.w.z().z(z(str, "", str2), "ad-progress", new w());
    }

    public static String z(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        return str.replace(f66398w, str2).replace(f66399y, new SimpleDateFormat("HH:MM:SS.mmm").format(Calendar.getInstance().getTime())).replace(f66396c, j0.z(8)).replace(f66397o, str3);
    }
}
