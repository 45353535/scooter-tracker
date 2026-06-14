package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.y2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DecimalFormat f61454l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final y2 f61456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f61457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f61458d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f1 f61462h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f61455a = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f61459e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected b3 f61460f = b3.f61279j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f61461g = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f61463i = new q(65536);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final g1 f61464j = g1.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f61465k = 0;

    public interface a {
        void b(List list);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public interface c {
        void a(List list);
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        f61454l = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private e0(y2 y2Var, b bVar, Context context) {
        this.f61456b = y2Var;
        this.f61458d = bVar;
        this.f61457c = context.getApplicationContext();
    }

    public static e0 a(y2 y2Var, b bVar, Context context) {
        return new e0(y2Var, bVar, context);
    }

    static boolean b(Map map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (c((String) entry.getKey()) || c((String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    static boolean c(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        x2.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (a(this.f61462h)) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f61462h != null) {
            x2.b("EventTracker error: tracker has already been initialized");
            return;
        }
        d1 d1VarA = d1.a(this.f61456b.g(), this.f61457c);
        if (d1VarA == null) {
            return;
        }
        f1 f1VarA = f1.a(d1VarA);
        this.f61462h = f1VarA;
        if (a(f1VarA)) {
            return;
        }
        this.f61465k = p1.a(this.f61457c).l();
        this.f61456b.m().a(new s() { // from class: com.my.tracker.obfuscated.v4
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                this.f61867a.a((b3) obj);
            }
        }, new s() { // from class: com.my.tracker.obfuscated.w4
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                this.f61889a.c((b3) obj);
            }
        });
        b();
    }

    public void d() {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.c5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61387b.f();
            }
        });
    }

    public void g() {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.k4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61625b.a(jA);
            }
        });
    }

    static boolean a(f1 f1Var) {
        if (f1Var != null) {
            return false;
        }
        x2.b("EventTracker error: repository is null");
        return true;
    }

    public void d(Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.q4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61799b.b(mapA, jA);
            }
        });
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public void b(final String str, final String str2, Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.p4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61775b.b(mapA, str, str2, jA);
            }
        });
    }

    public void c(Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.b5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61289b.a(mapA, jA);
            }
        });
    }

    private static void a(Runnable runnable) {
        m.a(runnable);
    }

    private static int a(r1 r1Var, f1 f1Var, y2.a aVar, boolean z10, b3 b3Var, String str, g1 g1Var, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!f1Var.j()) {
            return 3;
        }
        long jI = f1Var.i();
        x1 x1VarB = f1Var.b();
        z1 z1VarC = f1Var.c();
        return g1Var.a(r1Var, aVar, z10, b3Var, str, g0.a().a(aVar.f61951m, aVar.f61945g, aVar.f61943e, z10, str2, okHttpClientProvider, context), jI, f1Var.f(), x1VarB, z1VarC);
    }

    public void d(final String str) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.s4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61827b.a(str, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j10) {
        byte[] bArrB;
        if (a(this.f61462h) || b(map) || (bArrB = this.f61464j.b(this.f61459e, str, str2, map)) == null || !this.f61462h.r(bArrB, j10)) {
            return;
        }
        b();
    }

    public void c(final List list) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.t4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61840b.a(list);
            }
        });
    }

    public void c(final float f10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.k5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61627b.c(jCurrentTimeMillis, f10);
            }
        });
    }

    public void d(final List list) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.h4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61557b.b(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j10, float f10) {
        if (a(this.f61462h) || a(29, j10)) {
            return;
        }
        long jB = v2.b(j10);
        byte[] bArrC = this.f61464j.c((long) (f10 * 1000.0f));
        if (bArrC != null) {
            this.f61462h.p(bArrC, jB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, long j10) {
        byte[] bArrB;
        if (a(this.f61462h) || b(map) || (bArrB = this.f61464j.b(map)) == null || !this.f61462h.k(bArrB, j10)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        this.f61460f = b3Var;
    }

    public void a() {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.r4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61815b.e();
            }
        });
    }

    public void c(final Boolean bool) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.i5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61589b.a(bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final b3 b3Var) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.g4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61534b.b(b3Var);
            }
        });
    }

    public void a(final String str, Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.d5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61443b.a(str, mapA, jA);
            }
        });
    }

    public void c() {
        if (a(this.f61462h)) {
            return;
        }
        this.f61458d.a();
        if (!s0.a(this.f61457c)) {
            x2.a("MyTrackerRepository: no network connection");
            return;
        }
        String strA = a(this.f61459e, this.f61460f, this.f61461g, this.f61462h);
        if (strA != null) {
            this.f61458d.a(strA);
        }
        b(this.f61462h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || c(str) || b(map) || (bArrA = this.f61464j.a(str, map)) == null || !this.f61462h.d(bArrA, j10)) {
            return;
        }
        b();
    }

    public void b(final String str, final String str2, final long j10, final long j11) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.n4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61720b.b(str, str2, j10, j11, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j10, long j11, long j12) {
        byte[] bArrB;
        if (a(this.f61462h) || (bArrB = this.f61464j.b(str, str2, j10, j11)) == null || !this.f61462h.h(bArrB, j12)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10) {
        if (a(this.f61462h)) {
            return;
        }
        boolean zA = this.f61462h.a(j10, p1.a(this.f61457c).n());
        if (this.f61462h.b(j10)) {
            zA = true;
        }
        if (zA) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (a(this.f61462h)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            a(o0Var.e(), o0Var.d(), o0Var.a(), (Map) null, o0Var.f());
            this.f61462h.b(o0Var);
        }
        b();
    }

    public void a(final String str, final String str2, Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.l5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61649b.a(mapA, str, str2, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || b(map) || (bArrA = this.f61464j.a(this.f61459e, str, str2, map)) == null || !this.f61462h.m(bArrA, j10)) {
            return;
        }
        b();
    }

    public void b(final float f10, final float f11, final float f12) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.h5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61559b.b(jCurrentTimeMillis, f10, f11, f12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j10, float f10, float f11, float f12) {
        if (a(this.f61462h) || a(26, j10)) {
            return;
        }
        long jB = v2.b(j10);
        byte[] bArrB = this.f61464j.b((long) (f10 * 1000.0f), (long) (f11 * 1000.0f), (long) (f12 * 1000.0f));
        if (bArrB != null) {
            this.f61462h.n(bArrB, jB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || b(map) || (bArrA = this.f61464j.a(map)) == null || !this.f61462h.j(bArrA, j10)) {
            return;
        }
        b();
    }

    public void b(final float f10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.j5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61609b.b(jCurrentTimeMillis, f10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j10, float f10) {
        if (a(this.f61462h) || a(28, j10)) {
            return;
        }
        long jB = v2.b(j10);
        byte[] bArrB = this.f61464j.b((long) (f10 * 1000.0f));
        if (bArrB != null) {
            this.f61462h.o(bArrB, jB);
        }
    }

    public void a(final int i10, Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.o4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61747b.a(mapA, i10, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i10, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || b(map) || (bArrA = this.f61464j.a(i10, map)) == null || !this.f61462h.k(bArrA, j10)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar) {
        if (a(this.f61462h)) {
            cVar.a(Collections.EMPTY_LIST);
        } else {
            cVar.a(this.f61462h.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        if (a(this.f61462h)) {
            aVar.b(Collections.EMPTY_LIST);
        } else {
            aVar.b(this.f61462h.e());
        }
    }

    public void a(final long j10, final String str, final o1.a aVar) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.p5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61780b.a(j10, str, aVar, jA);
            }
        });
    }

    public void b(Boolean bool) {
        this.f61459e = bool.booleanValue();
    }

    public void b(final String str) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.u4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61849b.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, String str, o1.a aVar, long j11) {
        byte[] bArrA;
        if (a(this.f61462h) || (bArrA = this.f61464j.a(j10, str, aVar)) == null || !this.f61462h.i(bArrA, j11)) {
            return;
        }
        p1.a(this.f61457c).c(j11);
        this.f61465k = j11;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b3 b3Var) {
        x2.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b3Var.f61286g));
        if (l.a(this.f61460f.f61286g, b3Var.f61286g) != 0 && !a(this.f61462h)) {
            b(this.f61459e, this.f61460f, this.f61461g, this.f61462h);
        }
        this.f61460f = b3Var;
    }

    void b(boolean z10, b3 b3Var, String str, f1 f1Var) {
        x2.a("createAndStorePartialPacket: start");
        y2.a aVarO = this.f61456b.o();
        String strH = this.f61456b.h();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderN = this.f61456b.n();
        this.f61463i.a();
        int iA = a(this.f61463i, f1Var, aVarO, z10, b3Var, str, this.f61464j, strH, okHttpClientProviderN, this.f61457c);
        x2.a("createAndStorePartialPacket: writeResult=" + iA);
        if (iA == 1) {
            f1Var.a();
            f1Var.a(this.f61463i.c());
        } else if (iA == 2) {
            f1Var.a();
        }
        this.f61463i.d();
    }

    public void a(final String str, final String str2, final Runnable runnable) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.z4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61991b.a(str, str2, jA, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j10, Runnable runnable) {
        if (a(this.f61462h)) {
            return;
        }
        byte[] bArrB = this.f61464j.b(str, str2);
        if (bArrB != null && this.f61462h.q(bArrB, j10)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(final String str, final String str2, final long j10, final long j11) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.g5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61536b.a(str, str2, j10, j11, jA);
            }
        });
    }

    void b(f1 f1Var) {
        String strQ = this.f61456b.q();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderN = this.f61456b.n();
        try {
            com.my.tracker.obfuscated.b bVarD = f1Var.d();
            try {
                if (bVarD == null) {
                    x2.a("EventTracker error: iterator is null");
                    if (bVarD == null) {
                        return;
                    }
                } else {
                    while (bVarD.b()) {
                        long jA = bVarD.a();
                        byte[] bArrI = bVarD.i();
                        this.f61463i.a();
                        this.f61463i.b(bArrI);
                        s0.b bVarA = a(strQ, okHttpClientProviderN, this.f61463i);
                        if (bVarA == null || !bVarA.c()) {
                            break;
                        }
                        String str = (String) bVarA.b();
                        if (!TextUtils.isEmpty(str)) {
                            this.f61458d.a(str);
                        }
                        f1Var.a(jA);
                    }
                }
                bVarD.close();
            } finally {
            }
        } catch (Throwable th2) {
            x2.b("EventTracker error: ", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j10, long j11, long j12) {
        byte[] bArrA;
        if (a(this.f61462h) || (bArrA = this.f61464j.a(str, str2, j10, j11)) == null || !this.f61462h.a(bArrA, j12)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || (bArrA = this.f61464j.a(str)) == null || !this.f61462h.b(bArrA, j10)) {
            return;
        }
        b();
    }

    public void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.m4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61689b.a(str, str2, str3, str4, str5, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || (bArrA = this.f61464j.a(str, str2, str3, str4, str5)) == null || !this.f61462h.s(bArrA, j10)) {
            return;
        }
        p1.a(this.f61457c).c(j10);
        this.f61465k = j10;
        b();
    }

    void b() {
        int iF;
        if (a(this.f61462h)) {
            return;
        }
        if (this.f61462h.h() != 0 || ((iF = this.f61456b.f()) > 0 && v2.a() - this.f61465k <= iF)) {
            c();
        }
    }

    public void a(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.m5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61696b.a(mapA, jSONObject, jSONObject2, str, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        if (a(this.f61462h) || b(map) || !a(jSONObject, jSONObject2, str, map, j10)) {
            return;
        }
        b();
    }

    public void a(final JSONObject jSONObject, final String str, final String str2, final String str3, Map map) {
        final long jA = v2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: com.my.tracker.obfuscated.x4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61896b.a(mapA, jSONObject, str, str2, str3, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j10) {
        if (a(this.f61462h) || b(map) || !a(jSONObject, str, str2, str3, map, j10)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        String string;
        if (a(this.f61462h)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                string = fVar.e().toString();
            } catch (Throwable th2) {
                x2.a("Error: purchase data: ", th2);
                string = null;
            }
            a(fVar.d(), string, fVar.a(), fVar.f(), (Map) null, fVar.h());
            this.f61462h.b(fVar);
        }
        b();
    }

    public void a(final String str, final String str2) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.o5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61751b.a(str, str2, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || (bArrA = this.f61464j.a(str, str2)) == null || !this.f61462h.e(bArrA, j10)) {
            return;
        }
        b();
    }

    public void a(final int i10, final byte[] bArr, final boolean z10, final boolean z11, final Runnable runnable) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.f5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61507b.a(i10, bArr, z10, z11, jA, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, byte[] bArr, boolean z10, boolean z11, long j10, Runnable runnable) {
        if (!a(this.f61462h) && this.f61462h.a(i10, bArr, z10, z11, j10)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(final AdEvent adEvent) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.n5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61726b.a(adEvent, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEvent adEvent, long j10) {
        byte[] bArrA;
        if (a(this.f61462h) || (bArrA = this.f61464j.a(adEvent, f61454l.format(adEvent.revenue))) == null || !this.f61462h.a(adEvent.f61466a, bArrA, j10)) {
            return;
        }
        b();
    }

    public void a(final MiniAppEvent miniAppEvent) {
        final long jA = v2.a();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.l4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61646b.a(miniAppEvent, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j10) {
        String str;
        Map<String, String> map;
        if (a(this.f61462h) || c(miniAppEvent.name) || b(miniAppEvent.eventParams)) {
            return;
        }
        int i10 = miniAppEvent.f61466a;
        String str2 = (i10 == 24 || i10 == 22 || i10 == 23) ? miniAppEvent.customUserId : null;
        if (i10 == 24) {
            str = miniAppEvent.name;
            map = miniAppEvent.eventParams;
        } else {
            str = null;
            map = null;
        }
        byte[] bArrA = this.f61464j.a(i10, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i10 == 20 ? miniAppEvent.query : null, map);
        if (bArrA == null || !this.f61462h.b(i10, bArrA, j10)) {
            return;
        }
        b();
    }

    public void a(final float f10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.a5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61270b.a(jCurrentTimeMillis, f10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, float f10) {
        if (a(this.f61462h) || a(25, j10)) {
            return;
        }
        long jB = v2.b(j10);
        byte[] bArrA = this.f61464j.a((long) (f10 * 1000.0f));
        if (bArrA != null) {
            this.f61462h.l(bArrA, jB);
        }
    }

    public void a(final float f10, final float f11, final float f12) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: com.my.tracker.obfuscated.j4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61604b.a(jCurrentTimeMillis, f10, f11, f12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, float f10, float f11, float f12) {
        if (a(this.f61462h) || a(27, j10)) {
            return;
        }
        long jB = v2.b(j10);
        byte[] bArrA = this.f61464j.a((long) (f10 * 1000.0f), (long) (f11 * 1000.0f), (long) (f12 * 1000.0f));
        if (bArrA != null) {
            this.f61462h.g(bArrA, jB);
        }
    }

    public void a(final List list, final c cVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.i4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61586b.a(cVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.f61462h)) {
            cVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f61462h.a((o0) it.next());
        }
        cVar.a(list);
    }

    public void a(final List list, final a aVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.y4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61952b.a(aVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.f61462h)) {
            aVar.b(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f61462h.a((f) it.next());
        }
        aVar.b(list);
    }

    public void a(final c cVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.e5
            @Override // java.lang.Runnable
            public final void run() {
                this.f61469b.b(cVar);
            }
        });
    }

    public void a(final a aVar) {
        a(new Runnable() { // from class: com.my.tracker.obfuscated.f4
            @Override // java.lang.Runnable
            public final void run() {
                this.f61505b.b(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        x2.a("updateKidMode: newKidMode=" + bool);
        if (bool.booleanValue() == this.f61459e) {
            return;
        }
        if (!a(this.f61462h)) {
            b(this.f61459e, this.f61460f, this.f61461g, this.f61462h);
        }
        this.f61459e = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        x2.a("setRemoteConfig: remoteConfig=" + str);
        if (this.f61461g.equals(str)) {
            return;
        }
        if (!a(this.f61462h)) {
            b(this.f61459e, this.f61460f, this.f61461g, this.f61462h);
        }
        this.f61461g = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(boolean r12, com.my.tracker.obfuscated.b3 r13, java.lang.String r14, com.my.tracker.obfuscated.f1 r15) {
        /*
            r11 = this;
            com.my.tracker.obfuscated.y2 r0 = r11.f61456b
            com.my.tracker.obfuscated.y2$a r3 = r0.o()
            com.my.tracker.obfuscated.y2 r0 = r11.f61456b
            java.lang.String r0 = r0.q()
            com.my.tracker.obfuscated.y2 r1 = r11.f61456b
            java.lang.String r8 = r1.h()
            com.my.tracker.obfuscated.y2 r1 = r11.f61456b
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r9 = r1.n()
            com.my.tracker.obfuscated.q r1 = r11.f61463i
            r1.a()
            com.my.tracker.obfuscated.q r1 = r11.f61463i
            com.my.tracker.obfuscated.g1 r7 = r11.f61464j
            android.content.Context r10 = r11.f61457c
            r4 = r12
            r5 = r13
            r6 = r14
            r2 = r15
            int r12 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13 = 1
            if (r12 == r13) goto L2f
            goto L53
        L2f:
            com.my.tracker.obfuscated.q r12 = r11.f61463i
            com.my.tracker.obfuscated.s0$b r12 = r11.a(r0, r9, r12)
            if (r12 != 0) goto L38
            goto L53
        L38:
            boolean r13 = r12.c()
            if (r13 == 0) goto L46
            java.lang.String r13 = "Events were sent successfully"
            com.my.tracker.obfuscated.x2.a(r13)
            r2.a()
        L46:
            java.lang.Object r12 = r12.b()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L53
            goto L54
        L53:
            r12 = 0
        L54:
            com.my.tracker.obfuscated.q r13 = r11.f61463i
            r13.d()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(boolean, com.my.tracker.obfuscated.b3, java.lang.String, com.my.tracker.obfuscated.f1):java.lang.String");
    }

    private s0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, q qVar) {
        if (this.f61464j.a(qVar, v2.a())) {
            return s0.a(new r(qVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map, long j10) {
        String string;
        String string2;
        String str2;
        f1 f1Var;
        String strOptString = null;
        try {
            string = jSONObject2.toString();
        } catch (Throwable th2) {
            x2.a("Error: can't convert purchaseData json to string", th2);
            string = null;
        }
        if (jSONObject != null) {
            try {
                string2 = jSONObject.toString();
            } catch (Throwable th3) {
                x2.a("Error: can't convert skuDetails json to string", th3);
                string2 = null;
            }
        } else {
            string2 = null;
        }
        try {
            str2 = f61454l.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
        } catch (Throwable th4) {
            x2.a("Error: wrong price in micros in sku details: ", th4);
            str2 = null;
        }
        try {
            strOptString = jSONObject.optString("price_currency_code");
        } catch (Throwable th5) {
            x2.a("Error: wrong currency in sku details: ", th5);
        }
        byte[] bArrA = this.f61464j.a(str, string, string2, str2, strOptString, map);
        return (bArrA == null || (f1Var = this.f61462h) == null || !f1Var.f(bArrA, j10)) ? false : true;
    }

    private boolean a(JSONObject jSONObject, String str, String str2, String str3, Map map, long j10) {
        String str4;
        String strValueOf;
        f1 f1Var;
        if (str == null) {
            x2.a("Error: empty data " + str);
            return false;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(str).optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                x2.a("Error: empty productId in data " + str);
                return false;
            }
            String string = null;
            if (jSONObject != null) {
                try {
                    str4 = null;
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    x2.a("Error: can't convert productInfo json to string", th2);
                    str4 = null;
                }
            } else {
                str4 = null;
            }
            try {
                strValueOf = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
            } catch (Throwable th3) {
                x2.a("Error: wrong price in micros in sku details: ", th3);
                strValueOf = str4;
            }
            byte[] bArrA = this.f61464j.a(string, str, str2, str3, 0, strValueOf, jSONObject.optString("currency"), map);
            return (bArrA == null || (f1Var = this.f61462h) == null || !f1Var.c(bArrA, j10)) ? false : true;
        } catch (Throwable th4) {
            x2.b("Error: creating object failed", th4);
            return false;
        }
    }

    protected boolean a(int i10, long j10) {
        Long l10 = (Long) this.f61455a.get(Integer.valueOf(i10));
        if (l10 != null && j10 - l10.longValue() < 800) {
            x2.a("EventTracker: event with type " + i10 + " was throttled");
            return true;
        }
        this.f61455a.put(Integer.valueOf(i10), Long.valueOf(j10));
        return false;
    }
}
