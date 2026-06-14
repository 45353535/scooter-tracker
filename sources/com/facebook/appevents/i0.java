package com.facebook.appevents;

import com.facebook.appevents.i0;
import com.facebook.internal.e;
import com.facebook.internal.m;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f19661a = new i0();

    public static final class a implements m.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(boolean z10) {
            if (z10) {
                o2.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(boolean z10) {
            if (z10) {
                u2.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(boolean z10) {
            if (z10) {
                t2.s.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(boolean z10) {
            if (z10) {
                u2.h.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void E(boolean z10) {
            if (z10) {
                u2.e.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void F(boolean z10) {
            if (z10) {
                u2.d.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void G(boolean z10) {
            if (z10) {
                u2.b.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(boolean z10) {
            if (z10) {
                k2.b.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(boolean z10) {
            if (z10) {
                y2.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(boolean z10) {
            if (z10) {
                u2.f.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(boolean z10) {
            if (z10) {
                u2.g.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(boolean z10) {
            if (z10) {
                l2.d.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(boolean z10) {
            if (z10) {
                q2.b.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(boolean z10) {
            if (z10) {
                r2.e.c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(boolean z10) {
            if (z10) {
                s2.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(boolean z10) {
            if (z10) {
                w2.f.f();
            }
        }

        @Override // com.facebook.internal.m.b
        public void a(com.facebook.internal.i iVar) {
            com.facebook.internal.e.a(e.b.AAM, new e.a() { // from class: com.facebook.appevents.s
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.r(z10);
                }
            });
            com.facebook.internal.e.a(e.b.RestrictiveDataFiltering, new e.a() { // from class: com.facebook.appevents.f0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.s(z10);
                }
            });
            com.facebook.internal.e.a(e.b.PrivacyProtection, new e.a() { // from class: com.facebook.appevents.g0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.z(z10);
                }
            });
            com.facebook.internal.e.a(e.b.EventDeactivation, new e.a() { // from class: com.facebook.appevents.h0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.A(z10);
                }
            });
            com.facebook.internal.e.a(e.b.BannedParamFiltering, new e.a() { // from class: com.facebook.appevents.t
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.B(z10);
                }
            });
            com.facebook.internal.e.a(e.b.IapLogging, new e.a() { // from class: com.facebook.appevents.u
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.C(z10);
                }
            });
            com.facebook.internal.e.a(e.b.StdParamEnforcement, new e.a() { // from class: com.facebook.appevents.v
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.D(z10);
                }
            });
            com.facebook.internal.e.a(e.b.ProtectedMode, new e.a() { // from class: com.facebook.appevents.w
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.E(z10);
                }
            });
            com.facebook.internal.e.a(e.b.MACARuleMatching, new e.a() { // from class: com.facebook.appevents.x
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.F(z10);
                }
            });
            com.facebook.internal.e.a(e.b.BlocklistEvents, new e.a() { // from class: com.facebook.appevents.y
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.G(z10);
                }
            });
            com.facebook.internal.e.a(e.b.FilterRedactedEvents, new e.a() { // from class: com.facebook.appevents.z
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.t(z10);
                }
            });
            com.facebook.internal.e.a(e.b.FilterSensitiveParams, new e.a() { // from class: com.facebook.appevents.a0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.u(z10);
                }
            });
            com.facebook.internal.e.a(e.b.CloudBridge, new e.a() { // from class: com.facebook.appevents.b0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.v(z10);
                }
            });
            com.facebook.internal.e.a(e.b.GPSARATriggers, new e.a() { // from class: com.facebook.appevents.c0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.w(z10);
                }
            });
            com.facebook.internal.e.a(e.b.GPSPACAProcessing, new e.a() { // from class: com.facebook.appevents.d0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.x(z10);
                }
            });
            com.facebook.internal.e.a(e.b.GPSTopicsObservation, new e.a() { // from class: com.facebook.appevents.e0
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    i0.a.y(z10);
                }
            });
        }

        @Override // com.facebook.internal.m.b
        public void onError() {
        }
    }

    private i0() {
    }

    public static final void a() {
        if (e3.a.d(i0.class)) {
            return;
        }
        try {
            com.facebook.internal.m.d(new a());
        } catch (Throwable th2) {
            e3.a.b(th2, i0.class);
        }
    }
}
