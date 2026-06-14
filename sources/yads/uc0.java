package yads;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class uc0 implements oj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f116607a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ik1 f116608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tc0 f116609c;

    public static tc0 a(ik1 ik1Var) {
        cd0 cd0Var = new cd0();
        cd0Var.f109349b = null;
        Uri uri = ik1Var.f112034b;
        h01 h01Var = new h01(uri != null ? uri.toString() : null, ik1Var.f112038f, cd0Var);
        w73 it = ik1Var.f112035c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (h01Var.f111423d) {
                h01Var.f111423d.put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = ar.f108751a;
        im0 im0Var = iw0.f112162d;
        ld0 ld0Var = new ld0(0);
        UUID uuid2 = ik1Var.f112033a;
        im0 im0Var2 = iw0.f112162d;
        uuid2.getClass();
        im0Var2.getClass();
        boolean z10 = ik1Var.f112036d;
        boolean z11 = ik1Var.f112037e;
        int[] iArrA = ec1.a(ik1Var.f112039g);
        for (int i10 : iArrA) {
            if (i10 != 2 && i10 != 1) {
                throw new IllegalArgumentException();
            }
        }
        tc0 tc0Var = new tc0(uuid2, im0Var2, h01Var, map, z10, (int[]) iArrA.clone(), z11, ld0Var, 300000L);
        byte[] bArrA = ik1Var.a();
        if (!tc0Var.f116178m.isEmpty()) {
            throw new IllegalStateException();
        }
        tc0Var.f116187v = 0;
        tc0Var.f116188w = bArrA;
        return tc0Var;
    }

    public final nj0 a(rk1 rk1Var) {
        tc0 tc0Var;
        rk1Var.f115475c.getClass();
        ik1 ik1Var = rk1Var.f115475c.f113133c;
        if (ik1Var != null && w83.f117341a >= 18) {
            synchronized (this.f116607a) {
                try {
                    if (!w83.a(ik1Var, this.f116608b)) {
                        this.f116608b = ik1Var;
                        this.f116609c = a(ik1Var);
                    }
                    tc0Var = this.f116609c;
                    tc0Var.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return tc0Var;
        }
        return nj0.f113922a;
    }
}
