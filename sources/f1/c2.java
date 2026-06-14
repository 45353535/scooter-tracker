package f1;

import com.chartboost.sdk.view.CBImpressionActivity;
import g1.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c2 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f69502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of f69503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga f69504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r2 f69505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69506e;

    public c2(u0 view, of rendererActivityBridge, ga sdkConfiguration, r2 displayMeasurement) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f69502a = view;
        this.f69503b = rendererActivityBridge;
        this.f69504c = sdkConfiguration;
        this.f69505d = displayMeasurement;
        this.f69506e = -1;
    }

    @Override // f1.e0
    public void a(int i10, boolean z10) {
        int i11;
        try {
            CBImpressionActivity activity = this.f69502a.getActivity();
            if (ea.e(activity)) {
                return;
            }
            j();
            if (i10 != 0) {
                i11 = 1;
                if (i10 != 1) {
                    i11 = z10 ? -1 : activity.getResources().getConfiguration().orientation;
                }
            } else {
                i11 = 0;
            }
            activity.setRequestedOrientation(i11);
        } catch (Exception e10) {
            eg.i("applyOrientationProperties: ", e10);
        }
    }

    @Override // f1.e0
    public void b(v4 viewBase) {
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        this.f69502a.a(viewBase);
    }

    public void c() {
        try {
            this.f69503b.e();
        } catch (Exception e10) {
            eg.d("Cannot perform onStop", e10);
        }
    }

    public void d() {
        this.f69503b.d(this, this.f69502a.getActivity());
        this.f69502a.c();
        j();
    }

    public void e() {
        try {
            this.f69503b.c();
        } catch (Exception e10) {
            eg.d("Cannot perform onStop", e10);
        }
    }

    public void f() {
        try {
            this.f69503b.b();
        } catch (Exception e10) {
            eg.d("Cannot perform onPause", e10);
        }
        try {
            ea.c(this.f69502a.getActivity(), this.f69504c);
        } catch (Exception e11) {
            eg.d("Cannot lock the orientation in activity", e11);
        }
    }

    @Override // f1.e0
    public void finishActivity() {
        this.f69502a.finishActivity();
    }

    public void g() {
        try {
            this.f69503b.d(this, this.f69502a.getActivity());
        } catch (Exception e10) {
            eg.d("Cannot setActivityRendererInterface", e10);
        }
        try {
            this.f69503b.onResume();
        } catch (Exception e11) {
            eg.d("Cannot perform onResume", e11);
        }
        this.f69502a.c();
        try {
            ea.d(this.f69502a.getActivity(), this.f69504c, this.f69505d);
        } catch (Exception e12) {
            eg.d("Cannot lock the orientation in activity", e12);
        }
    }

    public void h() {
        try {
            this.f69503b.onStart();
        } catch (Exception e10) {
            eg.d("Cannot perform onResume", e10);
        }
    }

    public void i() {
        try {
            if (this.f69502a.b()) {
                return;
            }
            eg.j("The activity passed down is not hardware accelerated, so Chartboost cannot show ads", null, 2, null);
            this.f69503b.a(a.b.A);
            this.f69502a.finishActivity();
        } catch (Exception e10) {
            eg.i("onAttachedToWindow", e10);
        }
    }

    public final void j() {
        try {
            this.f69506e = this.f69502a.getActivity().getRequestedOrientation();
        } catch (Exception e10) {
            eg.i("saveOriginalOrientation: ", e10);
        }
    }

    @Override // f1.e0
    public void a() {
        try {
            CBImpressionActivity activity = this.f69502a.getActivity();
            if (ea.e(activity)) {
                return;
            }
            int requestedOrientation = activity.getRequestedOrientation();
            int i10 = this.f69506e;
            if (requestedOrientation != i10) {
                eg.j("restoreOriginalOrientation: " + i10, null, 2, null);
                activity.setRequestedOrientation(this.f69506e);
            }
        } catch (Exception e10) {
            eg.i("restoreOriginalOrientation: ", e10);
        }
    }
}
