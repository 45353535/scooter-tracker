package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;

/* JADX INFO: loaded from: classes4.dex */
public final class rp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115543a;

    public rp1(Context context) {
        this.f115543a = context;
    }

    public final String a(pp1 pp1Var) {
        int i10 = pp1Var == null ? -1 : qp1.f115117a[pp1Var.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return this.f115543a.getString(R$string.invalid_mediation_adapter_version);
        }
        throw new lf.m();
    }
}
