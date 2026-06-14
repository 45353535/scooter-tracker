package yads;

import android.view.View;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class it3 extends yt3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final it3 f112137d = new it3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.yt3
    public final void a(boolean z10) {
        Iterator it = DesugarCollections.unmodifiableCollection(ut3.f116776c.f116777a).iterator();
        while (it.hasNext()) {
            ia iaVar = ((dt3) it.next()).f110065e;
            if (iaVar.f111922b.get() != 0) {
                pu3.f114791a.a((WebView) iaVar.f111922b.get(), "setState", z10 ? "foregrounded" : "backgrounded", iaVar.f111921a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.yt3
    public final boolean a() {
        Iterator it = DesugarCollections.unmodifiableCollection(ut3.f116776c.f116778b).iterator();
        while (it.hasNext()) {
            View view = (View) ((dt3) it.next()).f110064d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
