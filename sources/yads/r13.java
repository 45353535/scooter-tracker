package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class r13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn f115275a;

    public /* synthetic */ r13() {
        this(new bn());
    }

    public final String a(Context context, String str) {
        cl0 cl0Var;
        byte[] bArrA;
        byte[] bArrDecode;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA == null || (cl0Var = hr2VarA.X) == null) {
            cl0Var = cl0.f109440c;
        }
        String str2 = cl0Var.f109441a;
        ur1 ur1Var = new ur1(cl0Var.f109442b, str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            bArrDecode = Base64.decode(str2, 0);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
        if (bArrDecode != null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            bArrA = ur1Var.a(bytes, bArr2, bArr, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
        } else {
            bArrA = null;
        }
        if (bArrA == null) {
            return null;
        }
        this.f115275a.getClass();
        return bn.a(bArrA);
    }

    public r13(bn bnVar) {
        this.f115275a = bnVar;
    }
}
