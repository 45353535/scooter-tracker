package com.ironsource.sdk.controller;

import com.ironsource.C4240b4;
import com.ironsource.C4326g5;
import com.ironsource.C4462o4;
import com.ironsource.C4533s8;
import com.ironsource.C4618x8;
import com.ironsource.C4652z8;
import com.ironsource.D5;
import com.ironsource.Xd;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f45013h = "controllerSourceData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45014i = "next_";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45015j = "fallback_";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f45016k = "controllerSourceCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f45019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0474d f45020d = EnumC0474d.NONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f45021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f45022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4326g5 f45023g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt(C4240b4.a.f42505j, Integer.valueOf(d.this.f45018b));
            putOpt(d.f45016k, Integer.valueOf(d.this.f45020d.b()));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45025a;

        static {
            int[] iArr = new int[c.values().length];
            f45025a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45025a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45025a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0474d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45037a;

        EnumC0474d(int i10) {
            this.f45037a = i10;
        }

        public int b() {
            return this.f45037a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, C4326g5 c4326g5) {
        int iOptInt = jSONObject.optInt(C4240b4.a.f42505j, -1);
        this.f45018b = iOptInt;
        this.f45019c = a(iOptInt);
        this.f45021e = str;
        this.f45022f = str2;
        this.f45023g = c4326g5;
    }

    private void c() {
        try {
            C4652z8 c4652z8G = g();
            if (c4652z8G.exists()) {
                C4652z8 c4652z8H = h();
                if (c4652z8H.exists()) {
                    c4652z8H.delete();
                }
                IronSourceStorageUtils.renameFile(c4652z8G.getPath(), c4652z8H.getPath());
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C4652z8 h() {
        return new C4652z8(this.f45021e, "fallback_mobileController.html");
    }

    private C4652z8 i() {
        return new C4652z8(this.f45021e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C4533s8 c4533s8A = new C4533s8().a(D5.f40578y, Integer.valueOf(this.f45018b));
        if (this.f45017a > 0) {
            c4533s8A.a(D5.B, Long.valueOf(System.currentTimeMillis() - this.f45017a));
        }
        C4618x8.a(Xd.f42090x, c4533s8A.a());
    }

    JSONObject f() throws JSONException {
        return new a();
    }

    C4652z8 g() {
        return new C4652z8(this.f45021e, C4240b4.f42477f);
    }

    boolean k() {
        int i10 = b.f45025a[this.f45019c.ordinal()];
        if (i10 == 1) {
            e();
            a(new C4652z8(this.f45021e, SDKUtils.getFileName(this.f45022f)));
            return false;
        }
        if (i10 == 2) {
            c();
            a(new C4652z8(this.f45021e, SDKUtils.getFileName(this.f45022f)));
            return false;
        }
        if (i10 == 3) {
            try {
                C4652z8 c4652z8G = g();
                C4652z8 c4652z8I = i();
                if (!c4652z8I.exists() && !c4652z8G.exists()) {
                    a(new C4652z8(this.f45021e, SDKUtils.getFileName(this.f45022f)));
                    return false;
                }
                if (!c4652z8I.exists() && c4652z8G.exists()) {
                    EnumC0474d enumC0474d = EnumC0474d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.f45020d = enumC0474d;
                    a(enumC0474d);
                    a(new C4652z8(this.f45021e, c4652z8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0474d enumC0474d2 = EnumC0474d.PREPARED_CONTROLLER_LOADED;
                    this.f45020d = enumC0474d2;
                    a(enumC0474d2);
                    d();
                    a(new C4652z8(this.f45021e, c4652z8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C4652z8(this.f45021e, SDKUtils.getFileName(this.f45022f)));
                    return false;
                }
                EnumC0474d enumC0474d3 = EnumC0474d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.f45020d = enumC0474d3;
                a(enumC0474d3);
                a(new C4652z8(this.f45021e, c4652z8I.getName()));
                return true;
            } catch (Exception e10) {
                C4462o4.d().a(e10);
            }
        }
        return false;
    }

    boolean m() {
        return this.f45020d != EnumC0474d.NONE;
    }

    private c a(int i10) {
        return i10 != 1 ? i10 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f45019c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0474d enumC0474d = EnumC0474d.CONTROLLER_FROM_SERVER;
        this.f45020d = enumC0474d;
        a(enumC0474d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f45019c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC0474d enumC0474d = EnumC0474d.FALLBACK_CONTROLLER_RECOVERY;
            this.f45020d = enumC0474d;
            a(enumC0474d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C4652z8 c4652z8) {
        if (this.f45023g.c()) {
            return;
        }
        this.f45023g.a(c4652z8, this.f45022f);
    }

    void a(C4533s8 c4533s8) {
        c4533s8.a(D5.f40578y, Integer.valueOf(this.f45018b));
        C4618x8.a(Xd.f42088v, c4533s8.a());
        this.f45017a = System.currentTimeMillis();
    }

    private void a(EnumC0474d enumC0474d) {
        C4533s8 c4533s8A = new C4533s8().a(D5.f40578y, Integer.valueOf(this.f45018b)).a(D5.f40579z, Integer.valueOf(enumC0474d.b()));
        if (this.f45017a > 0) {
            c4533s8A.a(D5.B, Long.valueOf(System.currentTimeMillis() - this.f45017a));
        }
        C4618x8.a(Xd.f42089w, c4533s8A.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return false;
        }
    }
}
