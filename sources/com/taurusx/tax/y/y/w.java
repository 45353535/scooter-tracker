package com.taurusx.tax.y.y;

import android.content.Context;
import android.text.TextUtils;
import com.taurusx.tax.g.p0.z;
import com.taurusx.tax.g.q0.y;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class w implements com.taurusx.tax.y.y.z {

    public class z implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Context f67708z;

        public z(Context context) {
            this.f67708z = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taurusx.tax.g.p0.w.y(this.f67708z);
            com.taurusx.tax.g.q0.w.z(this.f67708z);
        }
    }

    @Override // com.taurusx.tax.y.o.y
    public String c(Context context) {
        y yVarZ = com.taurusx.tax.g.q0.w.z(context);
        if (yVarZ == null || TextUtils.isEmpty(yVarZ.f66310z)) {
            return "";
        }
        LogUtil.d("taurusx", "flyer get OAID from cache");
        return yVarZ.f66310z;
    }

    @Override // com.taurusx.tax.y.y.z
    public void o(Context context) {
        new Thread(new z(context)).start();
    }

    @Override // com.taurusx.tax.y.o.y
    public String s(Context context) {
        return com.taurusx.tax.y.s.w.z(context);
    }

    @Override // com.taurusx.tax.y.o.y
    public boolean w(Context context) {
        y yVarZ = com.taurusx.tax.g.q0.w.z(context);
        if (yVarZ == null) {
            return false;
        }
        LogUtil.d("taurusx", "flyer get OAID limit from cache");
        return yVarZ.f66309w;
    }

    @Override // com.taurusx.tax.y.o.y
    public String y(Context context) {
        z.w wVarY = com.taurusx.tax.g.p0.w.y(context);
        if (wVarY == null || TextUtils.isEmpty(wVarY.z())) {
            return "";
        }
        LogUtil.d("taurusx", "flyer get GAID from cache");
        return wVarY.z();
    }

    @Override // com.taurusx.tax.y.o.y
    public boolean z(Context context) {
        z.w wVarY = com.taurusx.tax.g.p0.w.y(context);
        if (wVarY == null) {
            return false;
        }
        LogUtil.d("taurusx", "flyer get GAID limit from cache");
        return wVarY.w();
    }
}
