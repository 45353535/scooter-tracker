package yads;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q82 {
    public static ab3 a(ua3 ua3Var) {
        lc1 lc1Var = ua3Var.f116593b;
        if (lc1Var == null || !Intrinsics.areEqual(lc1Var.f113036b, "omid")) {
            throw new wa3(ua3Var, va3.f116946c);
        }
        try {
            URL url = new URL(lc1Var.f113037c);
            String str = ua3Var.f116592a;
            String str2 = ua3Var.f116594c;
            if (str2 == null || str2.length() == 0) {
                return new ab3(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            return new ab3(str, url, str2);
        } catch (MalformedURLException unused) {
            throw new wa3(ua3Var, va3.f116947d);
        }
    }
}
