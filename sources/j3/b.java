package j3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import com.flask.colorpicker.R$dimen;
import com.flask.colorpicker.R$id;
import com.flask.colorpicker.R$layout;
import i3.c;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlertDialog.Builder f85492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f85493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i3.c f85494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l3.c f85495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l3.b f85496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f85497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f85498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f85499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f85500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f85501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f85502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f85503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f85504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer[] f85505n;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3.a f85506b;

        a(j3.a aVar) {
            this.f85506b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            b.this.h(dialogInterface, this.f85506b);
        }
    }

    private b(Context context) {
        this(context, 0);
    }

    private static int d(Context context, int i10) {
        return (int) (context.getResources().getDimension(i10) + 0.5f);
    }

    private int e(Integer[] numArr) {
        Integer numF = f(numArr);
        if (numF == null) {
            return -1;
        }
        return numArr[numF.intValue()].intValue();
    }

    private Integer f(Integer[] numArr) {
        int i10 = 0;
        int iValueOf = 0;
        while (i10 < numArr.length && numArr[i10] != null) {
            i10++;
            iValueOf = Integer.valueOf(i10 / 2);
        }
        return iValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(DialogInterface dialogInterface, j3.a aVar) {
        aVar.a(dialogInterface, this.f85494c.getSelectedColor(), this.f85494c.getAllColors());
    }

    public static b n(Context context) {
        return new b(context);
    }

    public AlertDialog b() {
        Context context = this.f85492a.getContext();
        i3.c cVar = this.f85494c;
        Integer[] numArr = this.f85505n;
        cVar.i(numArr, f(numArr).intValue());
        if (this.f85499h) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, d(context, R$dimen.f20069c));
            l3.c cVar2 = new l3.c(context);
            this.f85495d = cVar2;
            cVar2.setLayoutParams(layoutParams);
            this.f85493b.addView(this.f85495d);
            this.f85494c.setLightnessSlider(this.f85495d);
            this.f85495d.setColor(e(this.f85505n));
        }
        if (this.f85500i) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, d(context, R$dimen.f20069c));
            l3.b bVar = new l3.b(context);
            this.f85496e = bVar;
            bVar.setLayoutParams(layoutParams2);
            this.f85493b.addView(this.f85496e);
            this.f85494c.setAlphaSlider(this.f85496e);
            this.f85496e.setColor(e(this.f85505n));
        }
        if (this.f85501j) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            EditText editText = (EditText) View.inflate(context, R$layout.f20075c, null);
            this.f85497f = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            this.f85497f.setSingleLine();
            this.f85497f.setVisibility(8);
            this.f85497f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f85500i ? 9 : 7)});
            this.f85493b.addView(this.f85497f, layoutParams3);
            this.f85497f.setText(i3.d.e(e(this.f85505n), this.f85500i));
            this.f85494c.setColorEdit(this.f85497f);
        }
        if (this.f85502k) {
            LinearLayout linearLayout = (LinearLayout) View.inflate(context, R$layout.f20073a, null);
            this.f85498g = linearLayout;
            linearLayout.setVisibility(8);
            this.f85493b.addView(this.f85498g);
            if (this.f85505n.length == 0) {
                ((ImageView) View.inflate(context, R$layout.f20074b, null)).setImageDrawable(new ColorDrawable(-1));
            } else {
                int i10 = 0;
                while (true) {
                    Integer[] numArr2 = this.f85505n;
                    if (i10 >= numArr2.length || i10 >= this.f85503l || numArr2[i10] == null) {
                        break;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) View.inflate(context, R$layout.f20074b, null);
                    ((ImageView) linearLayout2.findViewById(R$id.f20072a)).setImageDrawable(new ColorDrawable(this.f85505n[i10].intValue()));
                    this.f85498g.addView(linearLayout2);
                    i10++;
                }
            }
            this.f85498g.setVisibility(0);
            this.f85494c.g(this.f85498g, f(this.f85505n));
        }
        return this.f85492a.create();
    }

    public b c(int i10) {
        this.f85494c.setDensity(i10);
        return this;
    }

    public b g(int i10) {
        this.f85505n[0] = Integer.valueOf(i10);
        return this;
    }

    public b i(int i10, DialogInterface.OnClickListener onClickListener) {
        this.f85492a.setNegativeButton(i10, onClickListener);
        return this;
    }

    public b j(int i10, j3.a aVar) {
        this.f85492a.setPositiveButton(i10, new a(aVar));
        return this;
    }

    public b k(int i10) {
        this.f85492a.setTitle(i10);
        return this;
    }

    public b l(boolean z10) {
        this.f85500i = z10;
        return this;
    }

    public b m(c.EnumC0917c enumC0917c) {
        this.f85494c.setRenderer(c.a(enumC0917c));
        return this;
    }

    private b(Context context, int i10) {
        this.f85499h = true;
        this.f85500i = true;
        this.f85501j = false;
        this.f85502k = false;
        this.f85503l = 1;
        this.f85504m = 0;
        this.f85505n = new Integer[]{null, null, null, null, null};
        this.f85504m = d(context, R$dimen.f20070d);
        int iD = d(context, R$dimen.f20071e);
        this.f85492a = new AlertDialog.Builder(context, i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f85493b = linearLayout;
        linearLayout.setOrientation(1);
        this.f85493b.setGravity(1);
        LinearLayout linearLayout2 = this.f85493b;
        int i11 = this.f85504m;
        linearLayout2.setPadding(i11, iD, i11, i11);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        i3.c cVar = new i3.c(context);
        this.f85494c = cVar;
        this.f85493b.addView(cVar, layoutParams);
        this.f85492a.setView(this.f85493b);
    }
}
