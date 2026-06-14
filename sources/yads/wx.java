package yads;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class wx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f117622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sw1 f117624c;

    public wx(k00 k00Var, int i10, sw1 sw1Var) {
        this.f117622a = k00Var;
        this.f117623b = i10;
        this.f117624c = sw1Var;
    }

    public final ImageView a(View view, vx vxVar, m00 m00Var) {
        k00 k00Var = this.f117622a;
        vx vxVar2 = k00Var.f112531c != null ? vx.f117216c : k00Var.f112530b != null ? vx.f117215b : vx.f117217d;
        if (m00Var == null || vxVar2 != vxVar) {
            return null;
        }
        int i10 = m00Var.f113283c;
        int i11 = m00Var.f113284d;
        int i12 = this.f117623b;
        if (i12 > i10 || i12 > i11) {
            this.f117624c.getClass();
            return (ImageView) view.findViewById(R$id.icon_small);
        }
        this.f117624c.getClass();
        return (ImageView) view.findViewById(R$id.icon_large);
    }
}
