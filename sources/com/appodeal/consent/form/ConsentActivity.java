package com.appodeal.consent.form;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.OnConsentFormDismissedListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/appodeal/consent/form/ConsentActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/appodeal/consent/form/a", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f15405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f15406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static OnConsentFormDismissedListener f15407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f15408e = new AtomicBoolean(false);

    public static final WindowInsets a(FrameLayout frameLayout, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        frameLayout.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        return insets;
    }

    public static void b(final FrameLayout frameLayout) {
        frameLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.appodeal.consent.form.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return ConsentActivity.a(frameLayout, view, windowInsets);
            }
        });
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WeakReference weakReference = f15405b;
        WebView webView = weakReference != null ? (WebView) weakReference.get() : null;
        if (webView == null) {
            b.c(new ConsentManagerError.FormNotReadyError("WebView is null"));
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(webView, -1, -1);
        setContentView(frameLayout);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (i10 >= 30) {
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                insetsController.setSystemBarsBehavior(2);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(5382);
        }
        b(frameLayout);
        f15406c = new WeakReference(this);
    }
}
