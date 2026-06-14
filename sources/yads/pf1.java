package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class pf1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bd1(context, new qf1()));
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA == null || hr2VarA.f111727g) {
            return arrayList;
        }
        if (ly0.f113270b == null) {
            synchronized (ly0.f113269a) {
                try {
                    if (ly0.f113270b == null) {
                        ly0.f113270b = new jx0(context, "com.google.android.gms.location.LocationServices");
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        jx0 jx0Var = ly0.f113270b;
        if (jx0Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        arrayList.add(jx0Var);
        arrayList.add(jz0.a(context));
        return arrayList;
    }
}
