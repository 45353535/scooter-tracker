package sg.bigo.ads.api;

import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes4.dex */
public class PopupAdActivity extends AdActivity {
    @Override // sg.bigo.ads.api.AdActivity
    protected final void a() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.setStatusBarColor(0);
    }
}
