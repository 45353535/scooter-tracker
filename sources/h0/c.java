package h0;

import android.content.Context;
import q0.p;

/* JADX INFO: loaded from: classes5.dex */
public class c implements b {
    @Override // h0.b
    public a a(Context context) {
        return (context == null || p.f(context) != 0.0f) ? a.STANDARD_MOTION : a.REDUCED_MOTION;
    }
}
