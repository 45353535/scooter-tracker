package yads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mh0 implements yv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz1 f113471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy f113472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm2 f113473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uh0 f113474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ei0 f113475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f113476f;

    public mh0(jz1 jz1Var, wy wyVar, mr1 mr1Var, uh0 uh0Var, ei0 ei0Var) {
        this.f113471a = jz1Var;
        this.f113472b = wyVar;
        this.f113473c = mr1Var;
        this.f113474d = uh0Var;
        this.f113475e = ei0Var;
    }

    public final void a(Context context) {
        oh0 oh0Var;
        Object next;
        try {
            uh0 uh0Var = this.f113474d;
            jz1 jz1Var = this.f113471a;
            uh0Var.getClass();
            List listD = jz1Var.d();
            if (listD != null) {
                Iterator it = listD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str = ((oh0) next).f114317a;
                    nf0[] nf0VarArr = nf0.f113851b;
                    if (Intrinsics.areEqual(str, "close_dialog")) {
                        break;
                    }
                }
                oh0Var = (oh0) next;
            } else {
                oh0Var = null;
            }
            if (oh0Var == null) {
                this.f113472b.e();
                return;
            }
            Lazy lazyA = lf.i.a(new nh0(context, null));
            ei0 ei0Var = this.f113475e;
            DivConfiguration divConfiguration = (DivConfiguration) lazyA.getValue();
            ei0Var.getClass();
            AttributeSet attributeSet = null;
            int i10 = 0;
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), divConfiguration, 0, null, 4, null), attributeSet, i10, 6, null);
            div2View.setTag("");
            Dialog dialog = new Dialog(context, com.yandex.mobile.ads.R$style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.nn
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    mh0.a(this.f113987b, dialogInterface);
                }
            });
            div2View.setActionHandler(new xv(new wv(dialog, this.f113472b)));
            div2View.setData(oh0Var.f114321e, oh0Var.f114322f);
            dialog.setContentView(div2View);
            this.f113476f = dialog;
            dialog.show();
        } catch (Throwable th2) {
            this.f113473c.reportError("Failed to show DivKit close dialog", th2);
        }
    }

    public static final void a(mh0 mh0Var, DialogInterface dialogInterface) {
        mh0Var.f113476f = null;
    }
}
