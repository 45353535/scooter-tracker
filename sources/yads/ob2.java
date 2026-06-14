package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ob2 extends ho {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f114253w = (int) TimeUnit.SECONDS.toMillis(10);

    public ob2(Context context, String str, go goVar) {
        super(context, str, goVar);
        a(context);
        l();
        m();
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        return new qn2(r62Var, g01.a(r62Var));
    }

    public final void a(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && (num2 = hr2VarA.f111756u0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = f114253w;
        }
        hr2 hr2VarA2 = ut2.a().a(context);
        this.f112775o = new zd0(1.0f, iIntValue, (hr2VarA2 == null || (num = hr2VarA2.K) == null) ? 0 : num.intValue());
    }
}
