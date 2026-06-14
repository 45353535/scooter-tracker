package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class t52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf3 f116073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j42 f116074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f116075c;

    public /* synthetic */ t52(f42 f42Var, lf3 lf3Var) {
        this(lf3Var, new j42(f42Var));
    }

    public final void a(sj1 sj1Var) {
        if (sj1Var != null) {
            final CheckBox muteControl = sj1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: yads.sq0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        t52.a(this.f115896b, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f116073a.f113087b ? 0 : 8);
            }
            ProgressBar videoProgress = sj1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f116073a.f113088c ? 8 : 0);
            }
            TextView countDownProgress = sj1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t52(yads.lf3 r5, yads.j42 r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.f116073a = r5
            r4.f116074b = r6
            java.lang.Double r5 = r5.a()
            if (r5 == 0) goto L25
            double r0 = r5.doubleValue()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L25
            double r5 = r5.doubleValue()
            goto L27
        L25:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L27:
            r4.f116075c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.t52.<init>(yads.lf3, yads.j42):void");
    }

    public static final void a(t52 t52Var, CheckBox checkBox, View view) {
        double d10 = !checkBox.isChecked() ? t52Var.f116075c : 0.0d;
        j42 j42Var = t52Var.f116074b;
        j42Var.getClass();
        float f10 = (float) d10;
        do0 do0Var = (do0) j42Var.f112233a;
        if (do0Var.f110002m) {
            return;
        }
        ((vm0) do0Var.f109990a).a(f10);
        yc3 yc3Var = do0Var.f110000k;
        qc3 qc3Var = do0Var.f109999j;
        if (yc3Var == null || qc3Var == null) {
            return;
        }
        yc3Var.onVolumeChanged(f10);
    }
}
