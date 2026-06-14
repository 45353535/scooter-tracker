package com.pubmatic.sdk.webrendering.ui;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class POBFullScreenDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnDialogCloseListener f63436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f63437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f63439d;

    public interface OnDialogCloseListener {
        void onClose();
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBFullScreenDialog.this.dismiss();
        }
    }

    public POBFullScreenDialog(@NonNull Context context, @NonNull WebView webView, @NonNull OnDialogCloseListener onDialogCloseListener) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.f63437b = new WeakReference(context);
        a(onDialogCloseListener);
        FrameLayout frameLayoutA = a(webView, -1, -1);
        if (Build.VERSION.SDK_INT >= 30) {
            POBUtils.setSystemFitWindowsForEdgeToEdge(frameLayoutA);
        }
        setContentView(frameLayoutA);
    }

    private void a(OnDialogCloseListener onDialogCloseListener) {
        this.f63436a = onDialogCloseListener;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        OnDialogCloseListener onDialogCloseListener = this.f63436a;
        if (onDialogCloseListener != null) {
            onDialogCloseListener.onClose();
        }
        if (this.f63438c && this.f63439d != null) {
            Context context = (Context) this.f63437b.get();
            if (context instanceof Activity) {
                ((Activity) context).setRequestedOrientation(this.f63439d.intValue());
            }
        }
        this.f63436a = null;
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    public void show(int i10) {
        Activity ownerActivity;
        show();
        if (!this.f63438c || (ownerActivity = getOwnerActivity()) == null) {
            return;
        }
        this.f63439d = Integer.valueOf(ownerActivity.getRequestedOrientation());
        a(ownerActivity, i10);
    }

    private FrameLayout a(View view, int i10, int i11) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        frameLayout.addView(view, layoutParams);
        ImageButton imageButtonCreateSkipButton = POBUIUtil.createSkipButton(view.getContext(), R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        frameLayout.addView(imageButtonCreateSkipButton);
        imageButtonCreateSkipButton.setOnClickListener(new a());
        return frameLayout;
    }

    private void a(Activity activity, int i10) {
        if (i10 == 0) {
            activity.setRequestedOrientation(-1);
        } else if (i10 == 2) {
            activity.setRequestedOrientation(6);
        } else if (i10 == 1) {
            activity.setRequestedOrientation(7);
        }
    }
}
