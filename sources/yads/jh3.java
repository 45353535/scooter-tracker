package yads;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jh3 extends nh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9 f112346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh3 f112347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i52 f112348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gh3 f112349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u42 f112350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fh3 f112351h;

    public jh3(es2 es2Var, r52 r52Var, lf3 lf3Var, c4 c4Var, t9 t9Var, g41 g41Var, q42 q42Var, u12 u12Var, rx1 rx1Var, hg2 hg2Var, zv2 zv2Var, hh3 hh3Var) {
        super(r52Var);
        this.f112346c = t9Var;
        this.f112347d = hh3Var;
        this.f112348e = new i52(r52Var.getContext(), this, lf3Var, c4Var, es2Var, t9Var, g41Var, q42Var, u12Var, hg2Var, zv2Var);
        this.f112349f = new gh3(((pr3) es2Var).f());
        this.f112350g = rx1Var.a();
        g41Var.a(hh3Var);
    }

    @Override // yads.nh3
    public final void a(View view) {
        r52 r52Var = (r52) view;
        i52 i52Var = this.f112348e;
        f52 f52Var = i52Var.f111870e;
        if (f52Var != null) {
            cc2 cc2Var = f52Var.f110613l;
            if (cc2Var != null) {
                cc2Var.f109343b.stop();
                d42 d42Var = r52Var.f115325c;
                t52 t52Var = cc2Var.f109344c;
                sj1 sj1Var = d42Var.f109755b;
                t52Var.getClass();
                if (sj1Var != null) {
                    CheckBox muteControl = sj1Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = sj1Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = sj1Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            f52Var.f110607f.b(r52Var);
        }
        t12 t12Var = i52Var.f111871f;
        if (t12Var != null) {
            i52Var.f111866a.f116438a.remove(t12Var);
            i52Var.f111871f = null;
        }
        r52Var.setOnAttachStateChangeListener(null);
        r52Var.setVisibility(8);
        r52Var.setOnClickListener(null);
        r52Var.setOnTouchListener(null);
        r52Var.setSelected(false);
    }

    @Override // yads.nh3
    public final void b(View view, Object obj) {
        r52 r52Var = (r52) view;
        gb3 gb3Var = (gb3) obj;
        xb3 xb3Var = (xb3) CollectionsKt.first(gb3Var.f111136a);
        fh3 fh3VarA = this.f112349f.a(r52Var.getContext(), xb3Var, ad3.f108647e);
        this.f112351h = fh3VarA;
        this.f112347d.f111596a = fh3VarA;
        u42 u42Var = this.f112350g;
        Context context = r52Var.getContext();
        t9 t9Var = this.f112346c;
        u42Var.getClass();
        String str = xb3Var.f117782g;
        boolean zA = aq0.a(context, zp0.f118750c);
        c52[] c52VarArr = c52.f109225b;
        if (Intrinsics.areEqual("first_video_preloading_strategy", t9Var.f116129v) && zA) {
            tt0 tt0Var = u42Var.f116491c;
            synchronized (tt0Var.f116375d) {
                try {
                    m42 m42Var = tt0Var.f116373b;
                    ti0 ti0Var = m42Var.f113317a;
                    if (ti0Var != null) {
                        ti0Var.f116253c++;
                        ti0Var.f116251a.obtainMessage(7, str).sendToTarget();
                    }
                    m42Var.f113318b.remove(str);
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            u42Var.f116490b.a(str);
        }
        this.f112348e.a(r52Var, gb3Var, fh3VarA);
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        r52 r52Var;
        gb3 gb3Var = (gb3) obj;
        r52 r52Var2 = (r52) b();
        if (r52Var2 != null) {
            qh3Var.a(r52Var2, giVar);
            if (gb3Var == null || this.f112351h == null) {
                return;
            }
            xb3 xb3Var = (xb3) CollectionsKt.first(gb3Var.f111136a);
            qh3Var.a(giVar, new pe3(r52Var2, xb3Var.f117776a));
            i52 i52Var = this.f112348e;
            i52Var.f111868c.getClass();
            int i10 = ((a52) xb3Var.f117779d).f108565c;
            r52Var2.setAspectRatio(i10 != 0 ? r5.f108564b / i10 : 1.7777778f);
            f52 f52Var = i52Var.f111870e;
            if (f52Var == null || (r52Var = (r52) f52Var.f110602a.b()) == null) {
                return;
            }
            r52Var.setClickable(false);
        }
    }

    @Override // yads.nh3
    public final void a() {
        fh3 fh3Var = this.f112351h;
        if (fh3Var != null) {
            fh3Var.k();
        }
        this.f112347d.f111596a = null;
    }

    @Override // yads.nh3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
