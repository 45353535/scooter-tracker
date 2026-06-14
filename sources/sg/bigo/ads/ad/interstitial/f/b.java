package sg.bigo.ads.ad.interstitial.f;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<InterfaceC1241b> f101231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f101232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f101233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f101234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final float f101235e;

    public interface a {
        boolean a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.b$b, reason: collision with other inner class name */
    public interface InterfaceC1241b {
        void a(int i10, int i11, int i12, int i13, int i14);

        boolean a(@NonNull MotionEvent motionEvent, @Nullable a aVar, int i10);

        void a_(int i10);

        void b_(int i10);

        void c(int i10);

        void d(int i10);
    }

    b(int i10, int i11, int i12, float f10) {
        this.f101232b = i10;
        this.f101233c = i11;
        this.f101234d = i12;
        this.f101235e = f10;
    }

    public final void a() {
        int i10 = this.f101232b;
        WeakReference<InterfaceC1241b> weakReference = f101231a;
        InterfaceC1241b interfaceC1241b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1241b != null) {
            interfaceC1241b.b_(i10);
        }
    }

    public final void b() {
        int i10 = this.f101232b;
        WeakReference<InterfaceC1241b> weakReference = f101231a;
        InterfaceC1241b interfaceC1241b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1241b != null) {
            interfaceC1241b.c(i10);
        }
    }

    public final void c() {
        int i10 = this.f101232b;
        WeakReference<InterfaceC1241b> weakReference = f101231a;
        InterfaceC1241b interfaceC1241b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1241b != null) {
            interfaceC1241b.d(i10);
        }
    }

    public final int d() {
        return this.f101234d;
    }

    public final float e() {
        return this.f101235e;
    }

    public final boolean f() {
        int i10 = this.f101233c;
        return i10 == 2 || i10 == 4 || i10 == 6;
    }

    public final boolean g() {
        int i10 = this.f101233c;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        int i14 = this.f101232b;
        WeakReference<InterfaceC1241b> weakReference = f101231a;
        InterfaceC1241b interfaceC1241b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1241b != null) {
            interfaceC1241b.a(i10, i11, i12, i13, i14);
        }
    }

    public static void a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || !landingPageStyleConfig.a() || landingPageStyleConfig.b()) {
            return;
        }
        WeakReference<InterfaceC1241b> weakReference = f101231a;
        InterfaceC1241b interfaceC1241b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1241b != null) {
            interfaceC1241b.a_(landingPageStyleConfig.f103723c);
        }
    }

    public final boolean a(@NonNull MotionEvent motionEvent, a aVar) {
        int i10 = this.f101232b;
        WeakReference<InterfaceC1241b> weakReference = f101231a;
        InterfaceC1241b interfaceC1241b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1241b != null) {
            return interfaceC1241b.a(motionEvent, aVar, i10);
        }
        return false;
    }
}
