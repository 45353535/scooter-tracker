package com.pubmatic.sdk.monitor;

import android.R;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;

/* JADX INFO: loaded from: classes11.dex */
public class POBMonitorView extends RelativeLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f62661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f62662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f62663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f62664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Point f62665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ViewGroup f62666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f62667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    RelativeLayout f62668h;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBMonitorView.this.f62666f.removeView(POBMonitorView.this);
            if (POBMonitorView.this.f62667g != null) {
                POBMonitorView.this.f62667g.a();
            }
        }
    }

    interface b {
        void a();

        void b();
    }

    public POBMonitorView(Activity activity, Point point) {
        super(activity);
        this.f62665e = point;
        this.f62666f = (ViewGroup) activity.findViewById(R.id.content);
        a();
    }

    public Point getTouchPointLocation() {
        Point point = new Point();
        point.set((int) this.f62668h.getX(), (int) this.f62668h.getY());
        return point;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f62663c = view.getX();
            this.f62664d = view.getY();
            this.f62661a = this.f62663c - motionEvent.getRawX();
            this.f62662b = this.f62664d - motionEvent.getRawY();
        } else if (actionMasked == 1) {
            float x10 = view.getX();
            float y10 = view.getY();
            if (Math.abs(x10 - this.f62663c) <= 20.0f && Math.abs(y10 - this.f62664d) <= 20.0f && (bVar = this.f62667g) != null) {
                bVar.b();
            }
        } else {
            if (actionMasked != 2) {
                return false;
            }
            view.setY(motionEvent.getRawY() + this.f62662b);
            view.setX(motionEvent.getRawX() + this.f62661a);
        }
        return true;
    }

    public void setListener(@Nullable b bVar) {
        this.f62667g = bVar;
    }

    private void a() {
        RelativeLayout relativeLayout = (RelativeLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R$layout.pob_monitor_view, (ViewGroup) null);
        this.f62668h = relativeLayout;
        Button button = (Button) relativeLayout.findViewById(R$id.pob_monitor_floating_btn);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(POBUtils.convertDpToPixel(16));
        gradientDrawable.setColor(getResources().getColor(R$color.pob_monitor_background));
        button.setBackground(gradientDrawable);
        Button button2 = (Button) this.f62668h.findViewById(R$id.pob_monitor_close_btn);
        button2.setOnClickListener(new a());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(getResources().getColor(R$color.pob_monitor_close_background));
        button2.setBackground(gradientDrawable2);
        this.f62668h.setX(this.f62665e.x);
        this.f62668h.setY(this.f62665e.y);
        this.f62668h.setOnTouchListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        Point point = this.f62665e;
        if (point.x == 0 && point.y == 0) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.rightMargin = POBUtils.convertDpToPixel(80);
            layoutParams.bottomMargin = POBUtils.convertDpToPixel(100);
        }
        addView(this.f62668h, layoutParams);
        this.f62666f.addView(this, 0, new RelativeLayout.LayoutParams(-1, -1));
    }
}
