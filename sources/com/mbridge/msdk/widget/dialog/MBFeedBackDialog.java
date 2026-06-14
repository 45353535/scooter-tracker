package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: loaded from: classes10.dex */
public class MBFeedBackDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Button f53347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f53348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f53349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f53350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Button f53351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f53352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53354h;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f53350d != null) {
                MBFeedBackDialog.this.f53350d.b();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f53350d != null) {
                MBFeedBackDialog.this.f53350d.a();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBFeedBackDialog.this.dismiss();
            if (MBFeedBackDialog.this.f53350d != null) {
                MBFeedBackDialog.this.f53350d.c();
            }
        }
    }

    class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (MBFeedBackDialog.this.f53350d != null) {
                MBFeedBackDialog.this.f53350d.a();
            }
        }
    }

    public MBFeedBackDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(i0.a(context, "mbridge_cm_feedbackview", "layout"), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f53350d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f53352f = (TextView) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e10) {
                q0.a("MBAlertDialog", e10.getMessage());
            }
            try {
                this.f53349c = (LinearLayout) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f53348b = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f53347a = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f53351e = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e11) {
                q0.a("MBAlertDialog", e11.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        a();
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public void clear() {
        if (this.f53350d != null) {
            this.f53350d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.f53350d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            f1.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z10) {
        Button button = this.f53347a;
        if (button != null) {
            button.setClickable(z10);
            if (z10) {
                this.f53347a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
                this.f53347a.setAlpha(1.0f);
            } else {
                this.f53347a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
                this.f53347a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f53347a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f53349c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 16.0f);
            layoutParams.rightMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 16.0f);
            layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 3.0f);
            layoutParams.bottomMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 3.0f);
            this.f53349c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f10, float f11) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (!isScreenOrientationPortrait(getContext())) {
            this.f53354h = displayMetrics.heightPixels;
            this.f53353g = displayMetrics.widthPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = (int) (this.f53353g * f10);
            attributes.height = -1;
            attributes.gravity = 17;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f53354h = displayMetrics.widthPixels;
        this.f53353g = displayMetrics.heightPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = -1;
        attributes2.height = (int) (this.f53353g * f11);
        attributes2.gravity = 80;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(com.mbridge.msdk.widget.dialog.b bVar) {
        this.f53350d = bVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.f53351e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f53352f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e10) {
            q0.b("MBAlertDialog", e10.getMessage());
            super.show();
        }
    }

    private void a() {
        Button button = this.f53347a;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        Button button2 = this.f53348b;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
        Button button3 = this.f53351e;
        if (button3 != null) {
            button3.setOnClickListener(new c());
        }
        setOnCancelListener(new d());
    }
}
