package x4;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import com.ktwapps.speedometer.MainActivity;
import com.ktwapps.speedometer.R;
import com.ktwapps.speedometer.Widget.DigitalTextView;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;

/* JADX INFO: loaded from: classes10.dex */
public class n implements View.OnClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f108127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f108128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f108129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f108130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f108131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f108132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    a5.y f108133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    WindowManager.LayoutParams f108134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    WindowManager f108135j;

    public n(Context context) {
        this.f108127b = context;
        this.f108135j = (WindowManager) context.getSystemService("window");
        a5.y yVarC = a5.y.c(LayoutInflater.from(this.f108127b));
        this.f108133h = yVarC;
        yVarC.f4110b.setImageResource(R.drawable.float_cancel);
        this.f108133h.f4110b.setOnClickListener(this);
        this.f108133h.getRoot().setOnTouchListener(this);
    }

    private void a() {
        int iH = x.h(this.f108127b);
        int alphaComponent = ColorUtils.setAlphaComponent(Color.parseColor(x.e(this.f108127b)), 230);
        int color = Color.parseColor(x.i(this.f108127b));
        int iD = m.d(this.f108127b, iH);
        int iC = m.c(this.f108127b, iH);
        int iB = m.b(this.f108127b, iH);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f108133h.f4110b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = iC;
        ((ViewGroup.MarginLayoutParams) layoutParams).width = iC;
        layoutParams.setMargins(iB, iB, 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(alphaComponent);
        gradientDrawable.setCornerRadius(iD);
        this.f108133h.getRoot().setBackground(gradientDrawable);
        this.f108133h.f4110b.setLayoutParams(layoutParams);
        this.f108133h.f4115g.setTextColor(color);
        this.f108133h.f4116h.setTextColor(color);
        this.f108133h.f4111c.setTextColor(color);
        this.f108133h.f4112d.setTextColor(color);
        this.f108133h.f4110b.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.f108133h.f4115g.setTextSize(1, m.f(iH));
        this.f108133h.f4116h.setTextSize(1, m.g(iH));
        this.f108133h.f4111c.setTextSize(1, m.f(iH));
        this.f108133h.f4112d.setTextSize(1, m.g(iH));
    }

    public void b() {
        if (this.f108128c) {
            this.f108128c = false;
            this.f108135j.removeView(this.f108133h.getRoot());
        }
    }

    public void c() {
        if (this.f108128c) {
            return;
        }
        this.f108128c = true;
        Context context = this.f108127b;
        int iE = m.e(context, x.h(context));
        int i10 = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        a();
        if (x.y(this.f108127b)) {
            Point pointG = x.g(this.f108127b);
            this.f108134i = new WindowManager.LayoutParams(iE, iE, pointG.x, pointG.y, i10, 8, -3);
        } else {
            this.f108134i = new WindowManager.LayoutParams(iE, iE, i10, 8, -3);
        }
        this.f108133h.f4114f.setVisibility(x.f(this.f108127b) == 1 ? 0 : 8);
        this.f108133h.f4113e.setVisibility(x.f(this.f108127b) != 1 ? 0 : 8);
        this.f108133h.f4115g.setText("–");
        this.f108133h.f4111c.setText(TokenBuilder.TOKEN_DELIMITER);
        TextView textView = this.f108133h.f4116h;
        Context context2 = this.f108127b;
        textView.setText(l.z(context2, x.u(context2)));
        DigitalTextView digitalTextView = this.f108133h.f4112d;
        Context context3 = this.f108127b;
        digitalTextView.setText(l.z(context3, x.u(context3)));
        this.f108135j.addView(this.f108133h.getRoot(), this.f108134i);
    }

    public void d(w4.c cVar) {
        if (this.f108128c) {
            this.f108133h.f4115g.setText(cVar.k(this.f108127b));
            this.f108133h.f4115g.setTextColor(Color.parseColor(cVar.K(this.f108127b) ? "#FF454A" : x.i(this.f108127b)));
            this.f108133h.f4111c.setText(cVar.k(this.f108127b));
            this.f108133h.f4111c.setTextColor(Color.parseColor(cVar.K(this.f108127b) ? "#FF454A" : x.i(this.f108127b)));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel) {
            b();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            WindowManager.LayoutParams layoutParams = this.f108134i;
            this.f108129d = layoutParams.x;
            this.f108130e = layoutParams.y;
            this.f108131f = (int) motionEvent.getRawX();
            this.f108132g = (int) motionEvent.getRawY();
            return false;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            this.f108134i.x = (int) (this.f108129d + (motionEvent.getRawX() - this.f108131f));
            this.f108134i.y = (int) (this.f108130e + (motionEvent.getRawY() - this.f108132g));
            this.f108135j.updateViewLayout(view, this.f108134i);
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (this.f108131f == rawX && this.f108132g == rawY) {
            Intent intent = new Intent(this.f108127b, (Class<?>) MainActivity.class);
            intent.addFlags(872415232);
            this.f108127b.startActivity(intent);
            b();
        }
        Context context = this.f108127b;
        WindowManager.LayoutParams layoutParams2 = this.f108134i;
        x.O(context, new Point(layoutParams2.x, layoutParams2.y));
        return false;
    }
}
