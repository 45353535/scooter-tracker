package yads;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class qw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz f115183a;

    public qw0(qz qzVar) {
        this.f115183a = qzVar;
    }

    public static void b(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: yads.ah0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return qw0.b(view, windowInsetsCompat);
            }
        });
    }

    public static void c(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: yads.ch0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return qw0.c(view, windowInsetsCompat);
            }
        });
    }

    public final void a(Window window, RelativeLayout relativeLayout) {
        WindowCompat.setDecorFitsSystemWindows(window, false);
        if (sb.a(30)) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        } else if (sb.a(28)) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (this.f115183a == qz.f115226i) {
            b(relativeLayout);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a(relativeLayout);
        } else {
            c(relativeLayout);
        }
    }

    public static final WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        return WindowInsetsCompat.CONSUMED;
    }

    public static final WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        return windowInsetsCompat;
    }

    public static void a(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: yads.dh0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return qw0.a(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
