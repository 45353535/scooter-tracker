package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class he1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f111563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg f111564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final os1 f111565d;

    public /* synthetic */ he1(Context context, c4 c4Var) {
        this(context, c4Var, new sg(), os1.f114407e.a());
    }

    public final List a() {
        k4 k4VarA;
        k4 k4VarA2;
        try {
            this.f111564c.a();
            k4VarA = null;
        } catch (fa1 e10) {
            k4 k4Var = f9.f110640a;
            k4VarA = f9.a(1, e10.getMessage(), e10.f110677c);
        }
        try {
            os1 os1Var = this.f111565d;
            Context context = this.f111562a;
            if (os1Var.f114410b) {
                synchronized (os1Var.f114409a) {
                    try {
                        if (os1Var.f114410b) {
                            if (sb.a(context)) {
                                os1Var.f114411c.a(context);
                                os1Var.f114412d.getClass();
                                ua2.a(context);
                            }
                            os1Var.f114410b = false;
                        }
                        Unit unit = Unit.f93236a;
                    } finally {
                    }
                }
            }
            k4VarA2 = null;
        } catch (fa1 e11) {
            k4 k4Var2 = f9.f110640a;
            k4VarA2 = f9.a(1, e11.getMessage(), e11.f110677c);
        }
        c4 c4Var = this.f111563b;
        return CollectionsKt.listOfNotNull((Object[]) new k4[]{k4VarA, k4VarA2, c4Var.f109196c.f110681a == null ? f9.f110650k : null, c4Var.f109198e == null ? f9.f110648i : null});
    }

    public he1(Context context, c4 c4Var, sg sgVar, os1 os1Var) {
        this.f111562a = context;
        this.f111563b = c4Var;
        this.f111564c = sgVar;
        this.f111565d = os1Var;
    }
}
