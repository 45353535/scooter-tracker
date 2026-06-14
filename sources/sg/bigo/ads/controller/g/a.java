package sg.bigo.ads.controller.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.z;
import com.taurusx.tax.g.e0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f103683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final sg.bigo.ads.common.g f103684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final sg.bigo.ads.controller.a.b f103685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final long f103686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    protected final String f103687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    protected final String f103688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    protected final String f103689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f103690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f103691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.b, sg.bigo.ads.common.u.c.d> f103692j;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.g.a$a, reason: collision with other inner class name */
    static class C1282a extends sg.bigo.ads.common.u.b.b<sg.bigo.ads.controller.a.f> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long f103702p;

        public C1282a(Context context, int i10, @NonNull sg.bigo.ads.controller.a.f fVar, long j10) {
            super(i10, fVar, context);
            this.f103702p = j10;
        }

        @Override // sg.bigo.ads.common.u.b.c
        public final void h() {
            super.h();
            sg.bigo.ads.controller.a.f fVar = (sg.bigo.ads.controller.a.f) this.f102748k;
            HashMap map = new HashMap();
            map.put("pre_host", fVar.f());
            map.put("host_cfg_clear", Integer.valueOf(fVar.h() ? 1 : 0));
            map.put("host_src", fVar.i());
            sg.bigo.ads.controller.a.j jVarG = fVar.g();
            if (jVarG != null) {
                map.put("host_type", Integer.valueOf(jVarG.d()));
            }
            a(map);
            long j10 = this.f103702p;
            if (j10 > 0) {
                fVar.a(j10);
            }
        }
    }

    public interface b {
        void a(String str, Object obj);
    }

    public a(@NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar) {
        this(gVar, bVar, 15000L);
    }

    public final int a() {
        return this.f103683a;
    }

    protected abstract void a(int i10, int i11, String str);

    protected abstract void a(@NonNull String str, @NonNull Map<String, Object> map);

    protected abstract void a(@NonNull b bVar);

    public final void b() {
        final JSONObject jSONObject;
        String str;
        Object objA;
        String str2;
        sg.bigo.ads.common.u.a aVarF = f();
        sg.bigo.ads.common.u.b.b c1282a = aVarF instanceof sg.bigo.ads.controller.a.f ? new C1282a(this.f103684b.af(), this.f103683a, (sg.bigo.ads.controller.a.f) aVarF, e()) : new sg.bigo.ads.common.u.b.b(this.f103683a, aVarF, this.f103684b.af());
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (sg.bigo.ads.common.x.a.q() && !(this instanceof m)) {
            String str3 = "Missing CCPA consent";
            if (sg.bigo.ads.common.x.a.m() == 2) {
                str2 = "Missing GDPR consent";
                i10 = 1;
            } else {
                str2 = "Missing CCPA consent";
            }
            if (sg.bigo.ads.common.x.a.o() == 2) {
                i10++;
                str2 = "Missing LGPD consent";
            }
            if (sg.bigo.ads.common.x.a.n() == 2) {
                i10++;
            } else {
                str3 = str2;
            }
            if (sg.bigo.ads.common.x.a.p() == 2) {
                i10++;
                str3 = "Missing COPPA consent";
            }
            if (i10 > 1) {
                str3 = "Missing user consent";
            }
            this.f103692j.a(c1282a, new sg.bigo.ads.common.u.h(800, str3));
            return;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, q.a(this.f103684b.a()));
            jSONObject.putOpt("pkg_name", q.a(this.f103684b.b()));
            jSONObject.putOpt("pkg_ver", q.a(this.f103684b.c()));
            jSONObject.putOpt("pkg_vc", Integer.valueOf(this.f103684b.d()));
            jSONObject.putOpt("pkg_ch", this.f103684b.e());
            jSONObject.putOpt("os", q.a(this.f103684b.i()));
            jSONObject.putOpt("os_ver", q.a(this.f103684b.j()));
            jSONObject.putOpt("os_lang", this.f103684b.k());
            jSONObject.putOpt(z.f66061c, this.f103684b.l());
            jSONObject.putOpt("model", this.f103684b.m());
            jSONObject.putOpt("resolution", this.f103684b.o());
            jSONObject.putOpt("dpi", Integer.valueOf(this.f103684b.p()));
            jSONObject.putOpt("dpi_f", this.f103684b.q());
            jSONObject.putOpt("net", this.f103684b.r());
            jSONObject.putOpt("timezone", this.f103684b.s());
            jSONObject.putOpt("country", this.f103684b.t());
            jSONObject.putOpt("sdk_ver", q.a(this.f103684b.y()));
            jSONObject.putOpt("sdk_vc", 50602);
            if (sg.bigo.ads.common.x.a.q()) {
                str = "consent_status";
                objA = Integer.valueOf(sg.bigo.ads.core.d.b.b());
            } else {
                jSONObject.putOpt(N6.V0, q.a(this.f103684b.A()));
                jSONObject.putOpt("hw_id", q.a(this.f103684b.G()));
                jSONObject.putOpt("fire_id", q.a(this.f103684b.ae()));
                str = "af_id";
                objA = q.a(this.f103684b.B());
            }
            jSONObject.putOpt(str, objA);
            jSONObject.putOpt(e0.f66120c, q.a(this.f103684b.C()));
            long jD = this.f103684b.D();
            jSONObject.putOpt("timestamp", Long.valueOf(jD));
            jSONObject.putOpt("abflags", this.f103684b.E());
            jSONObject.putOpt("batsa", Integer.valueOf(this.f103684b.ag() ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(this.f103684b.ah()));
            jSONObject.putOpt("root", Integer.valueOf(this.f103684b.ai() ? 1 : 0));
            String string = UUID.randomUUID().toString();
            jSONObject.putOpt(CommonUrlParts.REQUEST_ID, q.a(string));
            jSONObject.putOpt("sdk_channel", this.f103684b.aa());
            jSONObject.putOpt("simulator_file", Integer.valueOf(this.f103684b.ab()));
            jSONObject.putOpt("sim_country", this.f103688f);
            jSONObject.putOpt("system_country", this.f103689g);
            jSONObject.putOpt("inst_src", this.f103684b.T());
            a(new b() { // from class: sg.bigo.ads.controller.g.a.3
                @Override // sg.bigo.ads.controller.g.a.b
                public final void a(String str4, Object obj) {
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    try {
                        jSONObject.putOpt(str4, obj);
                    } catch (JSONException unused) {
                    }
                }
            });
            jSONObject.putOpt("sign", sg.bigo.ads.common.utils.m.a(a(jD, string).toString()));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (sg.bigo.ads.common.x.a.t() && j()) {
            z10 = true;
        }
        sg.bigo.ads.common.u.f fVarD = d();
        c1282a.f102738b = jSONObject;
        c1282a.f102739c = null;
        c1282a.f102740d = fVarD;
        c1282a.f102741e = z10;
        c1282a.f102750m = this.f103686d;
        c1282a.a("SDK-Version-Code", BigoAdSdk.getSDKVersion());
        c1282a.f102749l = c();
        sg.bigo.ads.common.u.b bVar = this.f103692j;
        if (bVar == null) {
            bVar = sg.bigo.ads.common.u.b.f102733d;
        }
        sg.bigo.ads.common.u.g.f102772a.a(c1282a, bVar);
    }

    @Nullable
    protected abstract sg.bigo.ads.common.n.e c();

    protected sg.bigo.ads.common.u.f d() {
        return sg.bigo.ads.common.u.b.b.f102737a;
    }

    protected long e() {
        return 0L;
    }

    @NonNull
    protected abstract T f();

    protected boolean g() {
        return true;
    }

    protected boolean h() {
        return true;
    }

    protected abstract void i();

    protected abstract boolean j();

    public a(@NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar, long j10) {
        this.f103690h = new p();
        this.f103691i = null;
        this.f103692j = new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.b, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.g.a.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f103694b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f103695c = false;

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar) {
                return new sg.bigo.ads.common.u.c.d(aVar);
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar) {
                super.a((sg.bigo.ads.common.u.b.b) cVar);
                this.f103694b = SystemClock.elapsedRealtime();
                this.f103695c = sg.bigo.ads.common.f.b.d();
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                sg.bigo.ads.common.u.b.b bVar2 = (sg.bigo.ads.common.u.b.b) cVar;
                sg.bigo.ads.common.u.c.d dVar = (sg.bigo.ads.common.u.c.d) cVar2;
                String strA = dVar.a();
                if (bVar2.f102742f) {
                    try {
                        if (TextUtils.isEmpty(strA) || !strA.trim().startsWith("{")) {
                            String strA2 = sg.bigo.ads.common.j.a.a(strA, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", null);
                            if (TextUtils.isEmpty(strA2)) {
                                bVar2.f102743g = 0;
                            } else {
                                try {
                                    bVar2.f102743g = 1;
                                    strA = strA2;
                                } catch (Exception unused) {
                                    strA = strA2;
                                    bVar2.f102743g = 2;
                                    try {
                                        bVar2.f102744h = dVar.a("logid");
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        } else {
                            bVar2.f102743g = 3;
                        }
                        bVar2.f102744h = dVar.a("logid");
                    } catch (Exception unused3) {
                    }
                }
                a aVar = a.this;
                p pVar = aVar.f103690h;
                boolean z10 = bVar2.f102741e;
                boolean z11 = bVar2.f102742f;
                int i10 = bVar2.f102743g;
                String str = bVar2.f102744h;
                pVar.f102213a = z10;
                pVar.f102214b = z11;
                pVar.f102215c = i10;
                pVar.f102216d = str;
                if (z10 && (!z11 || i10 != 1)) {
                    if (z11) {
                        aVar.i();
                    } else {
                        sg.bigo.ads.common.x.a.u();
                    }
                }
                sg.bigo.ads.controller.h.a aVar2 = new sg.bigo.ads.controller.h.a(strA);
                if (aVar2.a()) {
                    a.this.a(bVar2.g(), aVar2.f103719c, aVar2.f103720d);
                } else {
                    if (aVar2.b()) {
                        sg.bigo.ads.common.x.a.e(System.currentTimeMillis());
                    }
                    a.this.a(bVar2.g(), 1005, aVar2.f103717a, aVar2.f103718b, aVar2.f103720d);
                }
                a.a(a.this, sg.bigo.ads.common.utils.l.a(aVar2.f103720d, "host_cfg"), bVar2.g(), this.f103694b);
                if (a.this.g() && a.this.f103691i == null) {
                    long jElapsedRealtime = this.f103694b > 0 ? SystemClock.elapsedRealtime() - this.f103694b : 0L;
                    T t10 = bVar2.f102748k;
                    String strD = t10.e() ? t10.d() : "";
                    String strG = bVar2.g();
                    int i11 = dVar.f102764a.f102756a;
                    boolean z12 = this.f103695c;
                    int iE = bVar2.e();
                    a aVar3 = a.this;
                    String str2 = aVar3.f103687e;
                    String str3 = aVar3.f103688f;
                    String str4 = aVar3.f103689g;
                    sg.bigo.ads.common.g gVar2 = aVar3.f103684b;
                    sg.bigo.ads.core.d.b.a(strG, strD, true, jElapsedRealtime, i11, "", z12, iE, str2, str3, str4, gVar2 != null ? gVar2.X() : null, bVar2.f102741e, bVar2.f102742f, bVar2.f102743g, bVar2.f102744h);
                }
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                int i10;
                String str;
                sg.bigo.ads.common.u.b.b bVar2 = (sg.bigo.ads.common.u.b.b) cVar;
                if (a.this.g() && a.this.f103691i == null) {
                    long jElapsedRealtime = this.f103694b > 0 ? SystemClock.elapsedRealtime() - this.f103694b : 0L;
                    String strG = bVar2.g();
                    if (hVar.f102773a == 900) {
                        strG = "https://invalid.url";
                    }
                    String str2 = strG;
                    T t10 = bVar2.f102748k;
                    String strD = t10.e() ? t10.d() : "";
                    int i11 = hVar.f102773a;
                    String message = hVar.getMessage();
                    boolean z10 = this.f103695c;
                    int iE = bVar2.e();
                    a aVar = a.this;
                    String str3 = aVar.f103687e;
                    String str4 = aVar.f103688f;
                    String str5 = aVar.f103689g;
                    sg.bigo.ads.common.g gVar2 = aVar.f103684b;
                    sg.bigo.ads.core.d.b.a(str2, strD, false, jElapsedRealtime, i11, message, z10, iE, str3, str4, str5, gVar2 == null ? null : gVar2.X(), bVar2.f102741e, bVar2.f102742f, bVar2.f102743g, bVar2.f102744h);
                }
                int i12 = hVar.f102773a;
                if (i12 == 701 || i12 == 702) {
                    i10 = 1025;
                    str = "Request timeout.";
                } else {
                    str = "(" + hVar.f102773a + ") " + hVar.getMessage();
                    i10 = 1026;
                }
                a.this.a(bVar2.g(), i10, hVar.f102773a, str, null);
                a.this.a(bVar2.g());
            }
        };
        this.f103683a = sg.bigo.ads.common.y.a.a();
        this.f103684b = gVar;
        this.f103685c = bVar;
        this.f103686d = j10;
        this.f103687e = gVar.Q();
        this.f103688f = gVar.R();
        this.f103689g = gVar.S();
    }

    @NonNull
    @CallSuper
    protected StringBuilder a(long j10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q.a(this.f103684b.a()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f103684b.b()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f103684b.c()));
        sb2.append(StringUtils.COMMA);
        sb2.append(this.f103684b.d());
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f103684b.i()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f103684b.j()));
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(this.f103684b.y()));
        sb2.append(",50602");
        sb2.append(StringUtils.COMMA);
        sb2.append(j10);
        boolean zQ = sg.bigo.ads.common.x.a.q();
        sb2.append(StringUtils.COMMA);
        if (zQ) {
            sb2.append(StringUtils.COMMA);
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f103684b.C()));
            sb2.append(StringUtils.COMMA);
        } else {
            sb2.append(q.a(this.f103684b.A()));
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f103684b.B()));
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f103684b.C()));
            sb2.append(StringUtils.COMMA);
            sb2.append(q.a(this.f103684b.G()));
        }
        sb2.append(StringUtils.COMMA);
        sb2.append(q.a(str));
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f103685c != null && h() && this.f103691i == null) {
            this.f103685c.a(100L, str);
        }
    }

    @CallSuper
    protected void a(String str, int i10, int i11, String str2, @Nullable Map<String, Object> map) {
        a(i10, i11, str2);
    }

    @CallSuper
    protected void a(String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        a(str2, map);
    }

    static /* synthetic */ void a(a aVar, final String str, final String str2, final long j10) {
        if (aVar.f103685c != null) {
            if (TextUtils.isEmpty(str)) {
                aVar.a(str2);
            } else {
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        sg.bigo.ads.controller.a.b bVar = aVar2.f103685c;
                        if (bVar == null || bVar.a(str, str2, j10, aVar2.g()).f103297d == 0) {
                            return;
                        }
                        a.this.a(str2);
                    }
                });
            }
        }
    }
}
