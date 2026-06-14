package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.yandex.mobile.ads.R$id;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* JADX INFO: loaded from: classes4.dex */
public final class qj2 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f115029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj2 f115030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sw1 f115031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx1 f115032d;

    public qj2(k00 k00Var, rj2 rj2Var, sw1 sw1Var, nx1 nx1Var) {
        this.f115029a = k00Var;
        this.f115030b = rj2Var;
        this.f115031c = sw1Var;
        this.f115032d = nx1Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        String strValueOf;
        this.f115032d.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.rating_container);
        Float f10 = this.f115029a.f112539k;
        if (f10 == null) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        this.f115031c.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.rating_text);
        if (textView != null) {
            rj2 rj2Var = this.f115030b;
            float fFloatValue = f10.floatValue();
            rj2Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                strValueOf = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME, decimalFormatSymbols).format(fFloatValue);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    @Override // yads.hf0
    public final void c() {
    }
}
