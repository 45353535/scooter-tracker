package sg.bigo.ads.controller.e;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.api.core.BaseAdActivityImpl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T extends sg.bigo.ads.ad.c<?, ?>> extends BaseAdActivityImpl {

    @Nullable
    public T N;

    protected b(@NonNull Activity activity) {
        super(activity);
        try {
            this.N = (T) sg.bigo.ads.controller.landing.e.b(this.L.getIntent().getIntExtra("ad_identifier", -1));
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void T() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i10, int i11, Intent intent) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ac() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ae() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ag() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void ah() {
        if (this.N != null) {
            sg.bigo.ads.controller.landing.e.a();
        }
    }
}
