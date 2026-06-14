package com.taurusx.tax.n;

import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.s.c;
import com.taurusx.tax.w.s.o;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static w f66392z;

    /* JADX INFO: renamed from: com.taurusx.tax.n.w$w, reason: collision with other inner class name */
    public interface InterfaceC0810w {
        void z(int i10, String str);

        void z(String str);
    }

    public class z implements o {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0810w f66394z;

        public z(InterfaceC0810w interfaceC0810w) {
            this.f66394z = interfaceC0810w;
        }

        @Override // com.taurusx.tax.w.s.o
        public void w() {
            this.f66394z.z("");
        }

        @Override // com.taurusx.tax.w.s.o
        public void z() {
            this.f66394z.z(0, "");
        }
    }

    public static synchronized w z() {
        try {
            if (f66392z == null) {
                synchronized (w.class) {
                    try {
                        if (f66392z == null) {
                            f66392z = new w();
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f66392z;
    }

    public synchronized void z(String str, String str2, InterfaceC0810w interfaceC0810w) {
        if (str != null) {
            if (str.length() > 0) {
                LogUtil.v("taurusx", "TaxTrackManager tracking send url:" + str);
                c.z(TaurusXAds.getContext(), str, str2, new z(interfaceC0810w));
                return;
            }
        }
        interfaceC0810w.z(2, "url is null");
    }
}
