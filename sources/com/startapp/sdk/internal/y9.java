package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.insight.NetworkTestsMetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class y9 extends z9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f65598d;

    public y9(Context context, g9 g9Var, j9 j9Var, q9 q9Var) {
        super(g9Var, j9Var, q9Var);
        this.f65598d = context;
    }

    @Override // com.startapp.sdk.internal.z9
    public final int a() {
        x9 x9Var = new x9(this.f65678a);
        x9Var.c(this.f65598d);
        String str = this.f65678a.f64552c;
        if (str != null && str.length() > 0) {
            x9Var.f65635c = str;
        }
        if ((this.f65679b.f64751b & 32) != 0) {
            try {
                com.startapp.sdk.adsbase.g.e(this.f65598d);
            } catch (Throwable th2) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th2);
                }
            }
        }
        if ((this.f65679b.f64751b & 8) != 0) {
            try {
                x9Var.f65535n0 = ((mh) ((ph) com.startapp.sdk.components.a.a(this.f65598d).f64179f.a()).b()).a(6);
            } catch (Throwable th3) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th3);
                }
            }
        }
        String strE = null;
        if ((this.f65679b.f64751b & 1) != 0) {
            try {
                x9Var.b(this.f65598d, null);
            } catch (Throwable th4) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th4);
                }
            }
        }
        if ((this.f65679b.f64751b & 2) != 0) {
            try {
                x9Var.d(this.f65598d);
            } catch (Throwable th5) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th5);
                }
            }
        }
        if ((this.f65679b.f64751b & 4) != 0) {
            try {
                x9Var.e(this.f65598d);
            } catch (Throwable th6) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th6);
                }
            }
        }
        if ((this.f65679b.f64751b & 16) != 0) {
            try {
                x9Var.a(this.f65598d);
            } catch (Throwable th7) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th7);
                }
            }
        }
        if ((this.f65679b.f64751b & 1024) != 0) {
            try {
                x9Var.b(this.f65598d);
            } catch (Throwable th8) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th8);
                }
            }
        }
        if ((this.f65679b.f64751b & 128) != 0) {
            try {
                String str2 = (String) ((m2) com.startapp.sdk.components.a.a(this.f65598d).f64191r.a()).b();
                if (str2 != null) {
                    x9Var.f65537p0 = g.b(str2);
                }
            } catch (Throwable th9) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th9);
                }
            }
        }
        if ((this.f65679b.f64751b & 256) != 0) {
            try {
                String str3 = (String) ((mg) com.startapp.sdk.components.a.a(this.f65598d).f64192s.a()).b();
                if (str3 != null) {
                    x9Var.f65536o0 = g.b(str3);
                }
            } catch (Throwable th10) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th10);
                }
            }
        }
        if ((this.f65679b.f64751b & 512) != 0) {
            try {
                x9Var.Y = ((o0) com.startapp.sdk.components.a.a(this.f65598d).f64189p.a()).a();
            } catch (Throwable th11) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th11);
                }
            }
        }
        if ((this.f65679b.f64751b & 2048) != 0) {
            try {
                x9Var.f65538q0 = ((yh) com.startapp.sdk.components.a.a(this.f65598d).f64180g.a()).a(this.f65678a.f64550a);
            } catch (Throwable th12) {
                if (this.f65678a.f64550a != h9.f64611f) {
                    g9.a(th12);
                }
            }
        }
        try {
            x9Var.J = ((hf) com.startapp.sdk.components.a.a(this.f65598d).f64182i.a()).a(x9Var);
        } catch (Throwable th13) {
            if (this.f65678a.f64550a != h9.f64611f) {
                g9.a(th13);
            }
        }
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        NetworkTestsMetaData networkTestsMetaDataL = MetaData.E().L();
        h9 h9Var = this.f65678a.f64550a;
        if (h9Var == h9.f64618m) {
            if (networkTestsMetaDataL != null) {
                strE = networkTestsMetaDataL.a();
            }
        } else if (h9Var == h9.f64619n) {
            if (networkTestsMetaDataL != null) {
                strE = networkTestsMetaDataL.b();
            }
        } else if (h9Var == h9.f64620o) {
            if (networkTestsMetaDataL != null) {
                strE = networkTestsMetaDataL.c();
            }
        } else if (h9Var == h9.f64614i) {
            strE = analyticsConfigH.e();
        }
        if (strE == null) {
            strE = analyticsConfigH.d();
        }
        q8 q8Var = (q8) com.startapp.sdk.components.a.a(this.f65598d).f64187n.a();
        p8 p8Var = new p8(q8Var, strE);
        p8Var.f65092c = x9Var.a(((HttpClientConfig) q8Var.f65149f.a()).e());
        p8Var.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(x9Var.Z);
        return p8Var.b() != null ? 1 : 0;
    }
}
