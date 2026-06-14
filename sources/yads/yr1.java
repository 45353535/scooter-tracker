package yads;

import com.yandex.div.core.DivKit;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yr1 extends is1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118334a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db3 f118335b;

    public yr1(db3 db3Var) {
        this.f118335b = db3Var;
    }

    public final void a(hs1 hs1Var) {
        try {
            db3 db3Var = this.f118335b;
            String versionName = DivKit.INSTANCE.getVersionName();
            db3Var.getClass();
            cb3 cb3VarA = db3.a(versionName);
            this.f118335b.getClass();
            cb3 cb3VarA2 = db3.a("32.18.1");
            Integer numValueOf = cb3VarA2 != null ? Integer.valueOf(cb3VarA2.f109313b) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (cb3VarA == null || !(this.f118334a || cb3VarA.f109313b == iIntValue)) {
                    String str = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{numValueOf, cb3VarA != null ? Integer.valueOf(cb3VarA.f109313b) : null}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    fa1 fa1Var = new fa1(str, str);
                    hs1Var.getClass();
                    throw fa1Var;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String str2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            fa1 fa1Var2 = new fa1(str2, str2);
            hs1Var.getClass();
            throw fa1Var2;
        }
    }
}
