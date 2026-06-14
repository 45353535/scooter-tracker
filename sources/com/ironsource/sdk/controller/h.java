package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.C4240b4;
import com.ironsource.C4462o4;
import com.ironsource.C4561u2;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.Nc;
import com.ironsource.sdk.controller.v;

/* JADX INFO: loaded from: classes10.dex */
public class h extends FrameLayout implements Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f45126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4634y7 f45127c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f45127c = Ib.U().i();
        this.f45125a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.f45125a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f45125a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f45127c.z(activity) == 1) {
                int i10 = rect.bottom - rect2.bottom;
                if (i10 > 0) {
                    return i10;
                }
                return 0;
            }
            int i11 = rect.right - rect2.right;
            if (i11 > 0) {
                return i11;
            }
            return 0;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f45125a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f45125a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f45125a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f45125a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45126b.F();
        this.f45126b.b(true, C4240b4.i.Z);
    }

    @Override // com.ironsource.Nc
    public boolean onBackButtonPressed() {
        return C4561u2.a().a((Activity) this.f45125a);
    }

    @Override // com.ironsource.Nc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45126b.B();
        this.f45126b.b(false, C4240b4.i.Z);
        v vVar = this.f45126b;
        if (vVar != null) {
            vVar.a(v.u.Gone);
            this.f45126b.C();
            this.f45126b.D();
        }
        removeAllViews();
    }

    @Override // com.ironsource.Nc
    public void onOrientationChanged(String str, int i10) {
    }

    public void a(v vVar) {
        this.f45126b = vVar;
        vVar.a(this);
        this.f45126b.E();
        this.f45125a = this.f45126b.p();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    private void a() {
        ((Activity) this.f45125a).runOnUiThread(new a());
    }

    private void a(int i10, int i11) {
        try {
            Context context = this.f45125a;
            if (context != null) {
                int iZ = this.f45127c.z(context);
                if (iZ == 1) {
                    setPadding(0, i10, 0, i11);
                } else if (iZ == 2) {
                    setPadding(0, i10, i11, 0);
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }
}
