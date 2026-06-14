package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.List;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.k;

/* JADX INFO: loaded from: classes4.dex */
public class e extends sg.bigo.ads.ad.b.c {
    private k O;

    public e(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        k kVarX = fVar.f102175b.x();
        this.O = kVarX;
        this.H = kVarX.c();
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i10, viewArr);
        if (this.O.b()) {
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, i10, this, this.H);
        }
        if (this.O.a() && mediaView != null) {
            mediaView.b().a(false);
        }
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) e.this.f();
                    if (aVar.aR()) {
                        File file = new File(aVar.b(e.this.f100335b.f102178e));
                        if (file.exists() || new File(file.getParentFile(), sg.bigo.ads.common.utils.f.c(file.getName())).exists()) {
                            return;
                        }
                        sg.bigo.ads.core.d.b.a(aVar, new AdError(2010, "resource clear."));
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.f100350q) {
            return;
        }
        this.f100350q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.f100344k);
    }
}
