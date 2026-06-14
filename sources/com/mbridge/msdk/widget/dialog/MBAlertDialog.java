package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class MBAlertDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Button f53338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f53339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f53340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f53341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f53342e;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f53343a;

        a(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f53343a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f53343a;
            if (bVar != null) {
                bVar.b();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f53345a;

        b(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f53345a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f53345a;
            if (bVar != null) {
                bVar.a();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    public MBAlertDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(i0.a(context, "mbridge_cm_alertview", "layout"), (ViewGroup) null);
        this.f53341d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f53342e = (TextView) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e10) {
                q0.a("MBAlertDialog", e10.getMessage());
            }
            try {
                this.f53340c = (TextView) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f53339b = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f53338a = (Button) viewInflate.findViewById(i0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e11) {
                q0.a("MBAlertDialog", e11.getMessage());
            }
        }
        Button button = this.f53338a;
        if (button != null) {
            button.setOnClickListener(new a(bVar));
        }
        Button button2 = this.f53339b;
        if (button2 != null) {
            button2.setOnClickListener(new b(bVar));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void a(int i10) {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle(i10 == com.mbridge.msdk.foundation.same.a.H ? "Confirm" : "Tips");
            setContent(i10 == com.mbridge.msdk.foundation.same.a.H ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
            setConfirmText(i10 == com.mbridge.msdk.foundation.same.a.H ? "Close" : "Cancel");
            setCancelText("Continue");
            return;
        }
        setTitle(i10 == com.mbridge.msdk.foundation.same.a.H ? "确认关闭？" : "提示");
        setContent(i10 == com.mbridge.msdk.foundation.same.a.H ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
        setConfirmText(i10 == com.mbridge.msdk.foundation.same.a.H ? "确认关闭" : "取消");
        setCancelText("继续");
    }

    private void b() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续观看");
    }

    public void clear() {
        if (this.f53341d != null) {
            this.f53341d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.f53341d;
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

    public void makeDownloadAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.a(this, str);
    }

    public void makeIVAlertView(int i10, String str) {
        try {
            String string = y0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = y0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = y0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = y0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                a(i10);
            } else {
                a(string, string2, string3, string4);
            }
        } catch (Exception e10) {
            q0.a("MBAlertDialog", e10.getMessage());
        }
    }

    public void makeInsAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.b(this, str);
    }

    public void makePlayableAlertView() {
        g gVarD = h.b().d(c.n().b());
        if (gVarD != null) {
            a(gVarD.s(), gVarD.q(), gVarD.r(), gVarD.o());
        } else {
            a();
        }
    }

    public void makeRVAlertView(String str) {
        try {
            String string = y0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = y0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = y0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = y0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g gVarD = h.b().d(c.n().b());
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                if (gVarD != null) {
                    a(gVarD.s(), gVarD.q(), gVarD.r(), gVarD.p());
                    return;
                } else {
                    b();
                    return;
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(string)) {
                if (gVarD != null) {
                    string = gVarD.s();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(string2)) {
                if (gVarD != null) {
                    string2 = gVarD.q();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(string4)) {
                if (gVarD != null) {
                    string4 = gVarD.r();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(string3)) {
                if (gVarD != null) {
                    string3 = gVarD.p();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            a(string, string2, string4, string3);
        } catch (Exception e10) {
            q0.a("MBAlertDialog", e10.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    public void setCancelText(String str) {
        Button button = this.f53338a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f53339b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f53340c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f53342e;
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

    private void a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    private void a() {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            setTitle("确认关闭？");
            setContent("关闭后您将不会获得任何奖励噢~ ");
            setConfirmText("确认关闭");
            setCancelText("继续试玩");
            return;
        }
        setTitle("Confirm to close? ");
        setContent("You will not be rewarded after closing the window");
        setConfirmText("Close it");
        setCancelText("Continue");
    }
}
