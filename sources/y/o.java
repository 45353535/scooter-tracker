package y;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil.request.BaseRequestDelegate;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.e f108318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0.s f108319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0.m f108320c;

    public o(o.e eVar, c0.s sVar, c0.q qVar) {
        this.f108318a = eVar;
        this.f108319b = sVar;
        this.f108320c = c0.f.a(qVar);
    }

    private final boolean d(h hVar, z.i iVar) {
        return c(hVar, hVar.j()) && this.f108320c.a(iVar);
    }

    private final boolean e(h hVar) {
        return hVar.O().isEmpty() || ArraysKt.contains(c0.i.o(), hVar.j());
    }

    public final boolean a(m mVar) {
        return !c0.a.d(mVar.f()) || this.f108320c.b();
    }

    public final e b(h hVar, Throwable th2) {
        Drawable drawableT;
        if (!(th2 instanceof k) || (drawableT = hVar.u()) == null) {
            drawableT = hVar.t();
        }
        return new e(drawableT, hVar, th2);
    }

    public final boolean c(h hVar, Bitmap.Config config) {
        if (!c0.a.d(config)) {
            return true;
        }
        if (!hVar.h()) {
            return false;
        }
        a0.a aVarM = hVar.M();
        if (aVarM instanceof a0.b) {
            View view = ((a0.b) aVarM).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final m f(h hVar, z.i iVar) {
        Bitmap.Config configJ = (e(hVar) && d(hVar, iVar)) ? hVar.j() : Bitmap.Config.ARGB_8888;
        a aVarD = this.f108319b.b() ? hVar.D() : a.DISABLED;
        boolean z10 = hVar.i() && hVar.O().isEmpty() && configJ != Bitmap.Config.ALPHA_8;
        z.c cVarB = iVar.b();
        c.b bVar = c.b.f119121a;
        return new m(hVar.l(), configJ, hVar.k(), iVar, (Intrinsics.areEqual(cVarB, bVar) || Intrinsics.areEqual(iVar.a(), bVar)) ? z.h.FIT : hVar.J(), c0.h.a(hVar), z10, hVar.I(), hVar.r(), hVar.x(), hVar.L(), hVar.E(), hVar.C(), hVar.s(), aVarD);
    }

    public final RequestDelegate g(h hVar, Job job) {
        Lifecycle lifecycleZ = hVar.z();
        a0.a aVarM = hVar.M();
        return aVarM instanceof a0.b ? new ViewTargetRequestDelegate(this.f108318a, hVar, (a0.b) aVarM, lifecycleZ, job) : new BaseRequestDelegate(lifecycleZ, job);
    }
}
