package sg.bigo.ads.ad.b;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.ad.d<T, U> {
    private Integer A;
    boolean M;
    public Integer N;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f100230z;

    public d(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.f100230z = false;
        this.M = false;
    }

    @Nullable
    public final Integer I() {
        if (J()) {
            return null;
        }
        return this.A;
    }

    public final boolean J() {
        return !this.f100230z;
    }

    public final void a(final Bitmap bitmap, final int i10) {
        if (J() || this.M || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.M = true;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.d.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (i10 == 1) {
                        d.this.N = sg.bigo.ads.common.w.b.a(bitmap);
                    } else {
                        d.this.A = sg.bigo.ads.common.w.b.a(bitmap);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void b(boolean z10) {
        this.f100230z = z10;
    }
}
