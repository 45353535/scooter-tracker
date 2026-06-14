package com.my.target.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.my.target.ib;
import com.my.target.jb;
import com.my.target.o0;

/* JADX INFO: loaded from: classes11.dex */
public class MyTargetActivity extends Activity {

    @Nullable
    public static ActivityEngine activityEngine;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityEngine f59411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f59412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f59413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WindowInsetsController f59414d;

    public interface ActivityEngine {
        void onActivityAttach(@NonNull MyTargetActivity myTargetActivity);

        boolean onActivityBackPressed();

        void onActivityCreate(@NonNull MyTargetActivity myTargetActivity, @NonNull Intent intent, @NonNull FrameLayout frameLayout);

        void onActivityDestroy();

        boolean onActivityOptionsItemSelected(MenuItem menuItem);

        void onActivityPause();

        void onActivityResume();

        void onActivityStart();

        void onActivityStop();
    }

    public final class a extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f59415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f59416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f59417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f59418d;

        public a(MyTargetActivity myTargetActivity, Context context) {
            this(myTargetActivity, context, null);
        }

        public void a() {
            int iArgb = Color.argb(204, Color.red(ViewCompat.MEASURED_STATE_MASK), Color.green(ViewCompat.MEASURED_STATE_MASK), Color.blue(ViewCompat.MEASURED_STATE_MASK));
            this.f59415a.setBackground(new ColorDrawable(iArgb));
            this.f59418d.setBackground(new ColorDrawable(iArgb));
            this.f59416b.setBackground(new ColorDrawable(iArgb));
            this.f59417c.setBackground(new ColorDrawable(iArgb));
            if (MyTargetActivity.this.f59414d != null) {
                float fRed = Color.red(iArgb);
                float fGreen = Color.green(iArgb);
                float fBlue = Color.blue(iArgb);
                if (16256.25f < (fRed * fRed * 0.299f) + (fGreen * fGreen * 0.587f) + (fBlue * fBlue * 0.114f)) {
                    MyTargetActivity.this.f59414d.setSystemBarsAppearance(8, 8);
                    MyTargetActivity.this.f59414d.setSystemBarsAppearance(16, 16);
                } else {
                    MyTargetActivity.this.f59414d.setSystemBarsAppearance(0, 8);
                    MyTargetActivity.this.f59414d.setSystemBarsAppearance(0, 16);
                }
            }
        }

        public final void b(FrameLayout frameLayout) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            frameLayout.setLayoutParams(layoutParams);
            addView(frameLayout);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 48);
            layoutParams2.height = 0;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            this.f59415a.setLayoutParams(layoutParams2);
            addView(this.f59415a);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1, 5);
            layoutParams3.width = 0;
            this.f59416b.setLayoutParams(layoutParams3);
            addView(this.f59416b);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams4.height = 0;
            layoutParams4.leftMargin = 0;
            layoutParams4.rightMargin = 0;
            this.f59417c.setLayoutParams(layoutParams4);
            addView(this.f59417c);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1, 3);
            layoutParams5.width = 0;
            this.f59418d.setLayoutParams(layoutParams5);
            addView(this.f59418d);
        }

        public a(MyTargetActivity myTargetActivity, Context context, AttributeSet attributeSet) {
            this(myTargetActivity, context, attributeSet, 0);
        }

        public a(MyTargetActivity myTargetActivity, Context context, AttributeSet attributeSet, int i10) {
            this(context, attributeSet, i10, 0);
        }

        public a(Context context, AttributeSet attributeSet, int i10, int i11) {
            super(context, attributeSet, i10, i11);
            this.f59415a = new View(getContext());
            this.f59416b = new View(getContext());
            this.f59417c = new View(getContext());
            this.f59418d = new View(getContext());
        }

        public final void a(final FrameLayout frameLayout) {
            b(frameLayout);
            jb.a(this, new o0() { // from class: l5.a
                @Override // com.my.target.o0
                public final Object a(Object obj, Object obj2) {
                    return this.f94048a.a(frameLayout, (View) obj, (WindowInsets) obj2);
                }
            });
        }

        public final /* synthetic */ WindowInsets a(FrameLayout frameLayout, View view, WindowInsets windowInsets) {
            ib ibVarA = jb.a(windowInsets);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f59416b.getLayoutParams();
            layoutParams.width = ibVarA.f59878c;
            this.f59416b.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f59417c.getLayoutParams();
            layoutParams2.height = ibVarA.f59879d;
            layoutParams2.leftMargin = Math.max(ibVarA.f59876a, 0);
            layoutParams2.rightMargin = Math.max(ibVarA.f59878c, 0);
            this.f59417c.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f59418d.getLayoutParams();
            layoutParams3.width = ibVarA.f59876a;
            this.f59418d.setLayoutParams(layoutParams3);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f59415a.getLayoutParams();
            layoutParams4.height = ibVarA.f59877b;
            layoutParams4.leftMargin = Math.max(ibVarA.f59876a, 0);
            layoutParams4.rightMargin = Math.max(ibVarA.f59878c, 0);
            this.f59415a.setLayoutParams(layoutParams4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams5.topMargin = ibVarA.f59877b;
            layoutParams5.leftMargin = ibVarA.f59876a;
            layoutParams5.rightMargin = ibVarA.f59878c;
            layoutParams5.bottomMargin = ibVarA.f59879d;
            frameLayout.setLayoutParams(layoutParams5);
            FrameLayout frameLayout2 = MyTargetActivity.this.f59412b;
            if (frameLayout2 != null) {
                frameLayout2.dispatchApplyWindowInsets(windowInsets);
            }
            view.invalidate();
            return WindowInsets.CONSUMED;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f59411a != null) {
            if (jb.a(getApplicationInfo())) {
                getWindow().setNavigationBarContrastEnforced(false);
                this.f59414d = getWindow().getInsetsController();
                a aVar = this.f59413c;
                if (aVar != null) {
                    aVar.a();
                }
            }
            this.f59411a.onActivityAttach(this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 == null || activityEngine2.onActivityBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ActivityEngine activityEngine2 = activityEngine;
        this.f59411a = activityEngine2;
        activityEngine = null;
        if (activityEngine2 == null || intent == null) {
            finish();
            return;
        }
        this.f59412b = new FrameLayout(this);
        if (jb.a(getApplicationInfo())) {
            a aVar = new a(this, this);
            this.f59413c = aVar;
            aVar.a(this.f59412b);
        }
        this.f59411a.onActivityCreate(this, intent, this.f59412b);
        View view = this.f59413c;
        if (view == null) {
            view = this.f59412b;
        }
        setContentView(view);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityDestroy();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f59414d = null;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 == null || !activityEngine2.onActivityOptionsItemSelected(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityPause();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStart();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        ActivityEngine activityEngine2 = this.f59411a;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStop();
        }
    }
}
