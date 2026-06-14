package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl0 f112909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4 f112910b;

    public l11(fl0 fl0Var, z4 z4Var) {
        this.f112909a = fl0Var;
        this.f112910b = z4Var;
    }

    public final void a(Context context, k11 k11Var) {
        String strA;
        mg mgVar = k11Var.f112553a;
        String str = k11Var.f112554b;
        p11 p11Var = k11Var.f112555c;
        z4 z4Var = this.f112910b;
        z4Var.getClass();
        int iOrdinal = p11Var.ordinal();
        if (iOrdinal == 0) {
            strA = z4Var.a(context);
        } else {
            if (iOrdinal != 1) {
                throw new lf.m();
            }
            strA = mgVar.f113461a;
            if (strA == null) {
                strA = z4Var.a(context);
            }
        }
        fl0 fl0Var = this.f112909a;
        fl0Var.f110764e = strA;
        fl0Var.f110760a = mgVar.f113462b;
        String str2 = mgVar.f113463c;
        synchronized (fl0.f110759h) {
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        fl0Var.f110766g = str2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.f93236a;
        }
        this.f112909a.f110763d = str;
    }
}
