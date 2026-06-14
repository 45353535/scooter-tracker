package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class ub2 extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f116601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f116602f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb2 f116604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f116605d;

    public ub2(tb2 tb2Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f116604c = tb2Var;
        this.f116603b = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f116604c) {
            try {
                if (!this.f116605d) {
                    tb2 tb2Var = this.f116604c;
                    tb2Var.f116161c.getClass();
                    tb2Var.f116161c.sendEmptyMessage(2);
                    this.f116605d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
