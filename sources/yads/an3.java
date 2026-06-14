package yads;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class an3 {
    public static final xm2 a(Context context, int i10) {
        yp2 yp2VarA = xp2.a();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory sSLSocketFactoryA = yp2VarA.a(applicationContext);
        w62.a(applicationContext);
        xm2 xm2Var = new xm2(new n72(), new po(new l01(new cs1(sSLSocketFactoryA, new xj2(), new s62(), new k01(), new p01()), he.a()), new xq()), i10);
        xm2Var.a();
        return xm2Var;
    }
}
