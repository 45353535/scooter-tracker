package yads;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sc {
    public static void a(ViewGroup viewGroup) {
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: yads.bq0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return sc.a(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
