package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.k;

/* JADX INFO: loaded from: classes4.dex */
public class d extends sg.bigo.ads.ad.b.b {
    private k I;

    public d(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        k kVarX = fVar.f102175b.x();
        this.I = kVarX;
        this.H = kVarX.c();
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i10, viewArr);
        if (this.I.b()) {
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, i10, this, this.H);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.f100350q) {
            return;
        }
        this.f100350q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.f100344k);
    }
}
