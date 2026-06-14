package sg.bigo.ads.core.adview;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a<?> f103878a;

    protected c(@NonNull sg.bigo.ads.api.a<?> aVar) {
        this.f103878a = aVar;
    }

    protected final void a(int i10) {
        this.f103878a.setTag(Integer.valueOf(i10));
    }

    protected void a(View view) {
        u.a(view, this.f103878a, null, -1);
    }

    public boolean a(int i10, int i11) {
        return u.a(this.f103878a, i10, i11);
    }
}
