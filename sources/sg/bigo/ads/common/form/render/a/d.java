package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.render.a.a;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a {
    public d(e.c cVar, Map<String, Object> map, Context context, a.InterfaceC1260a interfaceC1260a) {
        super(cVar, map, context, interfaceC1260a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final void a(int i10) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z10 = false;
        if (i10 != 2 && i10 == 3) {
            iA = -45718;
            z10 = true;
            iB = -45718;
        }
        a(iA, iB, z10);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f102369h, sg.bigo.ads.common.form.render.a.a(6), null, false);
        this.f102370i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.f102365d);
        a(1);
        final RadioGroup radioGroup = (RadioGroup) this.f102370i.findViewById(R.id.inter_form_edit_content);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i10) {
                    radioGroup.requestFocus();
                    RadioButton radioButton = (RadioButton) radioGroup2.findViewById(i10);
                    d.this.a(2);
                    if (radioButton != null) {
                        radioButton.setTextColor(-16736769);
                        d.this.f102364c = radioButton.getText().toString();
                        d dVar = d.this;
                        a.InterfaceC1260a interfaceC1260a = dVar.f102371j;
                        if (interfaceC1260a != null) {
                            interfaceC1260a.a(dVar.f102366e, dVar.f102364c);
                        }
                    }
                }
            });
            if (this.f102368g.length != 0) {
                String strA = sg.bigo.ads.common.form.a.a(this.f102366e, this.f102363b);
                CompoundButton compoundButton = null;
                int i10 = 0;
                while (true) {
                    String[] strArr = this.f102368g;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    String str = strArr[i10];
                    boolean z10 = i10 == 0;
                    CompoundButton bVar = new sg.bigo.ads.common.view.b(this.f102369h);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    if (!z10) {
                        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f102369h, 8);
                    }
                    bVar.setLayoutParams(marginLayoutParams);
                    bVar.setPadding(sg.bigo.ads.common.utils.e.a(this.f102369h, 12), sg.bigo.ads.common.utils.e.a(this.f102369h, 10), sg.bigo.ads.common.utils.e.a(this.f102369h, 12), sg.bigo.ads.common.utils.e.a(this.f102369h, 11));
                    bVar.setTextSize(13.0f);
                    a.a(bVar, str);
                    bVar.setButtonDrawable((Drawable) null);
                    Context context = this.f102369h;
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int i11 = sg.bigo.ads.common.form.render.a.f102361a ? -15524570 : -657158;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(i11);
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(i11);
                    gradientDrawable2.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    gradientDrawable2.setStroke(1, -16736769);
                    stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                    stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable2);
                    bVar.setBackground(stateListDrawable);
                    bVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.2
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton2, boolean z11) {
                            compoundButton2.setTextColor(z11 ? -16736769 : sg.bigo.ads.common.form.render.a.b());
                        }
                    });
                    bVar.setTextColor(sg.bigo.ads.common.form.render.a.b());
                    if (!q.a((CharSequence) strA) && strA.equalsIgnoreCase(this.f102368g[i10])) {
                        a.InterfaceC1260a interfaceC1260a = this.f102371j;
                        if (interfaceC1260a != null) {
                            interfaceC1260a.a(this.f102362a.f102115d, strA);
                        }
                        this.f102364c = strA;
                        compoundButton = bVar;
                    }
                    u.a(bVar, radioGroup, null, -1);
                    i10++;
                }
                if (compoundButton != null) {
                    compoundButton.setChecked(true);
                }
            }
        }
        return this.f102370i;
    }
}
