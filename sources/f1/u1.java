package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71196a;

    public u1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71196a = context;
    }

    public final boolean a() {
        try {
            j1.d dVarC = b1.b.c(this.f71196a, "coppa");
            Object consent = dVarC != null ? dVarC.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
