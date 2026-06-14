package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected e.c f102362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected Map<String, Object> f102363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f102364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f102365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f102366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f102367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String[] f102368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Context f102369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View f102370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected InterfaceC1260a f102371j;

    /* JADX INFO: renamed from: sg.bigo.ads.common.form.render.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1260a {
        void a(String str, String str2);
    }

    protected a(@NonNull e.c cVar, @Nullable Map<String, Object> map, @NonNull Context context, InterfaceC1260a interfaceC1260a) {
        this.f102369h = context;
        this.f102362a = cVar;
        this.f102363b = map;
        this.f102365d = cVar.f102112a;
        this.f102366e = cVar.f102115d;
        this.f102367f = cVar.f102113b;
        this.f102368g = cVar.f102114c;
        this.f102371j = interfaceC1260a;
    }

    public void a(int i10) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z10 = false;
        if (i10 != 2) {
            if (i10 == 3) {
                iA = -45718;
                z10 = true;
            }
            a(iA, iB, z10);
        }
        iA = -16736769;
        iB = iA;
        a(iA, iB, z10);
    }

    public abstract View b();

    public final View c() {
        return this.f102370i;
    }

    protected final void a(int i10, int i11, boolean z10) {
        View view = this.f102370i;
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.inter_form_edit_content);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(this.f102369h, 1), i10);
            gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(this.f102369h, 8));
            viewFindViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.f102370i.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(sg.bigo.ads.common.form.a.a(this.f102369h, R.string.bigo_ad_form_warning));
            textView.setVisibility(z10 ? 0 : 8);
        }
        TextView textView2 = (TextView) this.f102370i.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i11);
        }
    }

    protected static void a(TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    public final boolean a() {
        boolean zA = q.a((CharSequence) this.f102364c);
        if (this.f102362a.f102113b == 3) {
            zA = !q.g(this.f102364c);
        }
        a(zA ? 3 : 1);
        return zA;
    }
}
