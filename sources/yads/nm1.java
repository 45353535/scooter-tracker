package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class nm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f113979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ki3 f113980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ji3 f113981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f113982d;

    public nm1(Context context, es2 es2Var, c4 c4Var) {
        this(c4Var, new ki3(context), new ji3(context, es2Var));
    }

    public final void a(CustomizableMediaView customizableMediaView, String str) {
        c4 c4Var = this.f113979a;
        String str2 = c4Var.f109196c.f110681a;
        if (str2 != null) {
            int i10 = c4Var.f109208o;
            ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(s73.a(layoutParams.width)) : null;
            ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
            Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(s73.a(layoutParams2.height)) : null;
            int iA = s73.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
            int iA2 = s73.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
            int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
            zh1 zh1Var = mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? zh1.f118685d : zh1.f118683b : zh1.f118684c;
            int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
            zh1 zh1Var2 = mode2 != Integer.MIN_VALUE ? (mode2 == 0 || mode2 != 1073741824) ? zh1.f118685d : zh1.f118683b : zh1.f118684c;
            final hi3 hi3Var = new hi3(new gi3(s73.a(customizableMediaView.getWidth()), s73.a(customizableMediaView.getHeight())), new ld1(numValueOf, numValueOf2), new xh1(new yh1(iA, zh1Var), new yh1(iA2, zh1Var2)), MapsKt.mapOf(TuplesKt.to("asset", "media"), TuplesKt.to("media_type", str)));
            final li3 li3Var = new li3(i10, str2);
            this.f113982d.execute(new Runnable() { // from class: yads.ey
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    nm1.a(this.f110518b, li3Var, hi3Var);
                }
            });
        }
    }

    public /* synthetic */ nm1(c4 c4Var, ki3 ki3Var, ji3 ji3Var) {
        this(c4Var, ki3Var, ji3Var, Executors.newSingleThreadExecutor());
    }

    public nm1(c4 c4Var, ki3 ki3Var, ji3 ji3Var, Executor executor) {
        this.f113979a = c4Var;
        this.f113980b = ki3Var;
        this.f113981c = ji3Var;
        this.f113982d = executor;
    }

    public static final void a(nm1 nm1Var, li3 li3Var, hi3 hi3Var) throws JSONException {
        nm1Var.f113980b.a(li3Var, hi3Var);
        nm1Var.f113981c.a(hi3Var, nm1Var.f113979a);
    }
}
