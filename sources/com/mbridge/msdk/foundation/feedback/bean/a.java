package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.b;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f48556c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f48558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48559f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f48562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f48563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Dialog f48564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONArray f48565l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f48570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<g> f48571r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f48574u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f48554a = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f48557d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f48560g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48561h = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f48566m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f48567n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f48568o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48569p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f48572s = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 20.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f48573t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f48575v = new C0514a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f48576w = A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f48577x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f48578y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f48579z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    class C0514a implements com.mbridge.msdk.widget.dialog.b {
        C0514a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    class c implements com.mbridge.msdk.widget.dialog.b {
        c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f48563j != null) {
                a.this.f48563j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f48564k == null || !a.this.f48564k.isShowing()) {
                    return;
                }
                a.this.f48564k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public a(String str) {
        this.f48571r = new ArrayList();
        this.f48562i = str;
        if (this.f48571r == null) {
            this.f48571r = new ArrayList();
        }
        d();
        e();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, 1, 4, B, this.f48557d);
        List<g> list = this.f48571r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, 0, 4, B, this.f48557d);
        List<g> list = this.f48571r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, 0, 4, B, this.f48557d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        List<g> list = this.f48571r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    private void o() {
        if (TextUtils.isEmpty(this.f48573t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(i0.a(activityA, "mbridge_cm_feedback_notice_layout", "layout"), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f48564k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f48564k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f48564k.setContentView(viewInflate);
                this.f48564k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        FeedBackButton feedBackButton = this.f48558e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f48558e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f48558e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f48558e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f48563j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f48563j.setListener(null);
        }
        this.f48563j = null;
        this.f48571r = null;
        this.f48558e = null;
        this.f48575v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f48563j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f48563j.cancel();
    }

    public CampaignEx h() {
        return this.f48556c;
    }

    public FeedBackButton i() {
        if (this.f48558e == null) {
            e();
        }
        return this.f48558e;
    }

    public int j() {
        return this.f48570q;
    }

    public int k() {
        return this.f48574u;
    }

    public void p() {
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, 0, 1, B, this.f48557d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d());
            MBFeedBackDialog mBFeedBackDialog = this.f48563j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            FeedBackButton feedBackButton = this.f48558e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, contextD, this.f48563j);
            a(zA ? 2 : 3);
            if (zA) {
                return;
            }
            a(contextD);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                b.C0564b c0564bZ = gVarD.z();
                if (c0564bZ == null) {
                    q0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f48563j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.n().d()), this.f48575v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0564bZ);
                this.f48563j.setCancelText(c0564bZ.d());
                this.f48563j.setConfirmText(c0564bZ.a());
                this.f48563j.setPrivacyText(c0564bZ.c());
                this.f48573t = c0564bZ.e();
                this.f48563j.setTitle(c0564bZ.f());
                this.f48563j.setContent(feedbackRadioGroupA);
                this.f48563j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0564bZ);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f48575v == null) {
            this.f48575v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f48558e = feedBackButton;
                int i10 = 8;
                if (this.f48576w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f48558e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void b(String str) {
        this.f48557d = str;
    }

    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f48586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f48587b;

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f48586a = aVar;
            this.f48587b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f48549f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f48586a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f48549f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f48586a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f48586a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public void a(int i10) {
            if (this.f48586a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f48549f = true;
            this.f48586a.a();
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f48558e;
        if (feedBackButton != null) {
            int i10 = this.f48578y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f48579z;
            if (i11 > -1) {
                this.f48558e.setY(i11);
            }
            float f10 = this.f48554a;
            if (f10 >= 0.0f) {
                this.f48558e.setAlpha(f10);
                this.f48558e.setEnabled(this.f48554a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f48558e.getLayoutParams();
            int i12 = this.f48577x;
            if (i12 > 0) {
                this.f48558e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f48577x;
                }
            }
            int i13 = this.f48561h;
            if (i13 > 0) {
                this.f48558e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f48561h;
                }
            }
            if (layoutParams != null) {
                this.f48558e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f48559f)) {
                    this.f48558e.setTextColor(Color.parseColor(this.f48559f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f48560g;
            if (f11 > 0.0f) {
                this.f48558e.setTextSize(f11);
            }
            JSONArray jSONArray = this.f48565l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                this.f48558e.setPadding(v0.a(contextD, (float) this.f48565l.optDouble(0)), v0.a(contextD, (float) this.f48565l.optDouble(1)), v0.a(contextD, (float) this.f48565l.optDouble(2)), v0.a(contextD, (float) this.f48565l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f48572s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f48555b)) {
                gradientDrawable.setColor(Color.parseColor(this.f48555b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f48558e.setBackground(gradientDrawable);
        }
    }

    public void a(g gVar) {
        if (this.f48571r == null) {
            this.f48571r = new ArrayList();
        }
        this.f48571r.add(gVar);
    }

    public void d(int i10) {
        this.f48576w = i10;
        FeedBackButton feedBackButton = this.f48558e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f48556c = campaignEx;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, 0, 2, B, this.f48557d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f48562i, 0, 3, B, this.f48557d);
        }
        List<g> list = this.f48571r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, v0.a(this.f48556c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, v0.a(this.f48556c));
            }
        }
    }

    private FeedbackRadioGroup a(b.C0564b c0564b) {
        JSONArray jSONArrayB = c0564b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void c(int i10) {
        this.f48574u = i10;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, b.C0564b c0564b) {
        ColorStateList colorStateList;
        JSONArray jSONArrayB = c0564b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        i0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = i0.a(contextD);
        int iA = i0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
                colorStateList = null;
            }
        } else {
            colorStateList = null;
        }
        int iA2 = v0.a(contextD, 1.0f);
        int iA3 = v0.a(contextD, 1.0f);
        int iA4 = v0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    public void b(int i10) {
        this.f48570q = i10;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f48558e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f48554a);
            feedBackButton.setEnabled(this.f48554a != 0.0f);
            feedBackButton.setVisibility(this.f48576w != 8 ? 0 : 8);
            this.f48558e = feedBackButton;
            CampaignEx campaignEx = this.f48556c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f48578y = i10;
        }
        if (i11 > -1) {
            this.f48579z = i11;
        }
        if (i12 > -1) {
            this.f48577x = i12;
        }
        if (i13 > -1) {
            this.f48561h = i13;
        }
        if (f11 > -1.0f) {
            this.f48560g = f11;
        }
        if (jSONArray != null) {
            this.f48565l = jSONArray;
        }
        this.f48559f = str;
        this.f48555b = str2;
        this.f48554a = f10;
        this.f48572s = i14;
        b();
    }
}
