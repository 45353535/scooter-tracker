package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.D7;
import com.ironsource.E5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4511r3 implements C7 {
    static boolean O = false;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private C5 K;
    private C4246ba L;
    private Fe M;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44791l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private D4 f44795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC4286e f44796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<C4649z5> f44797r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private J8 f44800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f44801v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f44805z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f44780a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f44781b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f44782c = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f44783d = Constants.VIDEO_MAX_DURATION;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f44784e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f44785f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f44786g = "supersonic_sdk.db";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f44787h = IronSourceConstants.EVENTS_PROVIDER;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f44788i = "placement";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f44789j = "abt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f44790k = N6.f41367a1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44792m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44793n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44794o = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44798s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f44802w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f44803x = 5000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f44804y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* JADX INFO: renamed from: com.ironsource.r3$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4511r3.this.a();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4649z5 f44807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSource.a f44808b;

        b(C4649z5 c4649z5, IronSource.a aVar) {
            this.f44807a = c4649z5;
            this.f44808b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44807a.a("eventSessionId", AbstractC4511r3.this.f44800u.b());
            this.f44807a.a("essn", Integer.valueOf(AbstractC4511r3.this.f44800u.c()));
            String strA = IronSourceUtils.a(AbstractC4511r3.this.f44801v);
            if (AbstractC4511r3.this.g(this.f44807a)) {
                this.f44807a.a("connectionType", strA);
            }
            if (AbstractC4511r3.this.a(strA, this.f44807a)) {
                C4649z5 c4649z5 = this.f44807a;
                c4649z5.a(AbstractC4511r3.this.b(c4649z5));
            }
            String strD = Y3.d(AbstractC4511r3.this.f44801v);
            if (strD != null) {
                this.f44807a.a("rawConnectionType", strD);
            }
            int iA = AbstractC4511r3.this.a(this.f44807a.c(), this.f44808b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.f44807a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC4511r3.this.a(this.f44807a, "reason");
            AbstractC4511r3.this.a(this.f44807a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC4511r3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC4511r3.this.E.entrySet()) {
                    if (!this.f44807a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f44807a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC4511r3.this.i(this.f44807a)) {
                if (AbstractC4511r3.this.h(this.f44807a) && !AbstractC4511r3.this.e(this.f44807a)) {
                    this.f44807a.a("sessionDepth", Integer.valueOf(AbstractC4511r3.this.c(this.f44807a)));
                }
                if (AbstractC4511r3.this.j(this.f44807a)) {
                    AbstractC4511r3.this.f(this.f44807a);
                }
                long jA = AbstractC4511r3.this.f44800u.a();
                if (jA > 0) {
                    this.f44807a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.f44807a.toString());
                AbstractC4511r3.this.f44797r.add(this.f44807a);
                AbstractC4511r3.this.f44799t++;
            }
            AbstractC4511r3 abstractC4511r3 = AbstractC4511r3.this;
            boolean zA = abstractC4511r3.a(abstractC4511r3.B) ? AbstractC4511r3.this.a(this.f44807a.c(), AbstractC4511r3.this.B) : AbstractC4511r3.this.d(this.f44807a);
            AbstractC4511r3 abstractC4511r32 = AbstractC4511r3.this;
            if (!abstractC4511r32.f44792m && zA) {
                abstractC4511r32.f44792m = true;
            }
            if (abstractC4511r32.f44795p != null) {
                if (abstractC4511r32.g()) {
                    AbstractC4511r3.this.f();
                    return;
                }
                AbstractC4511r3 abstractC4511r33 = AbstractC4511r3.this;
                if (abstractC4511r33.b((ArrayList<C4649z5>) abstractC4511r33.f44797r) || zA) {
                    AbstractC4511r3.this.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$c */
    class c implements D7 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(D7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC4511r3 abstractC4511r3 = AbstractC4511r3.this;
                    ArrayList<C4649z5> arrayListA = abstractC4511r3.f44795p.a(abstractC4511r3.I);
                    AbstractC4511r3.this.f44799t = arrayListA.size() + AbstractC4511r3.this.f44797r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC4511r3.this.a(AbstractC4511r3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
            }
            a(aVar.b());
        }

        public void a(ArrayList<C4649z5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error("clearData exception: " + e10.getMessage());
                }
            }
        }

        @Override // com.ironsource.D7
        public synchronized void a(final D7.a aVar) {
            AbstractC4511r3.this.K.a(new Runnable() { // from class: com.ironsource.rl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44848b.b(aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4511r3.this.f();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44818a;

        e(int i10) {
            this.f44818a = i10;
        }

        public int b() {
            return this.f44818a;
        }
    }

    protected abstract int c(C4649z5 c4649z5);

    abstract void d();

    protected abstract boolean d(C4649z5 c4649z5);

    protected abstract String e(int i10);

    protected abstract void f(C4649z5 c4649z5);

    protected abstract boolean j(C4649z5 c4649z5);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C4649z5 c4649z5) {
        return c4649z5.c() + Constants.VIDEO_MAX_DURATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        ArrayList<C4649z5> arrayListA;
        try {
            this.f44792m = false;
            ArrayList<C4649z5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    arrayListA = this.f44795p.a(this.I);
                    this.f44795p.b(this.I);
                }
                E5.c cVar = new E5.c(new E5.a(arrayListA, this.f44797r), this.f44803x);
                this.f44795p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th2.getMessage());
                arrayList.clear();
                arrayList.addAll(this.f44797r);
            }
            if (arrayList.size() > 0) {
                this.f44797r.clear();
                this.f44799t = 0;
                JSONObject jSONObjectB = K6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strP = com.ironsource.mediationsdk.r.m().p();
                    if (!TextUtils.isEmpty(strP)) {
                        jSONObjectB.put(N6.f41367a1, strP);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new J5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th3) {
                    C4462o4.d().a(th3);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th3.getMessage());
                }
                String strA = this.f44796q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.f44791l && a(arrayList, A5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + strA);
                    O = true;
                }
                if (this.f44793n) {
                    try {
                        strA = Base64.encodeToString(R9.a(strA, this.f44794o), 0);
                    } catch (Exception e10) {
                        C4462o4.d().a(e10);
                    }
                }
                C4473of.f44574a.a(new K5(new c(), strA, this.f44796q.b(), arrayList));
            }
        } catch (Throwable th4) {
            C4462o4.d().a(th4);
            IronLog.INTERNAL.error("Send event exception: " + th4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f44799t >= this.f44802w || this.f44792m) && this.f44791l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C4649z5 c4649z5) {
        if (c4649z5 == null) {
            return false;
        }
        if (a(this.f44805z)) {
            return !a(c4649z5.c(), this.f44805z);
        }
        if (a(this.A)) {
            return a(c4649z5.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, C4246ba c4246ba) {
        String strA = IronSourceUtils.a(context, this.I, this.H);
        this.H = strA;
        b(strA);
        this.f44796q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.f44795p = D4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f44805z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c4246ba;
        this.f44801v = context;
    }

    @Override // com.ironsource.C7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    @Override // com.ironsource.C7
    public void d(int i10) {
        if (i10 > 0) {
            this.f44803x = i10;
        }
    }

    void e() {
        this.f44797r = new ArrayList<>();
        this.f44799t = 0;
        this.f44796q = H5.a(this.H, this.G);
        C5 c52 = new C5(this.I + "EventThread");
        this.K = c52;
        c52.start();
        this.K.a();
        this.f44800u = Ib.U().m();
        this.J = new HashSet();
        d();
    }

    public void h() {
        this.K.a(new d());
    }

    private void b(String str) {
        AbstractC4286e abstractC4286e = this.f44796q;
        if (abstractC4286e == null || !abstractC4286e.c().equals(str)) {
            this.f44796q = H5.a(str, this.G);
        }
    }

    @Override // com.ironsource.C7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    protected boolean g(C4649z5 c4649z5) {
        return (c4649z5.c() == A5.CONSENT_TRUE_CODE.b() || c4649z5.c() == A5.CONSENT_FALSE_CODE.b() || c4649z5.c() == A5.SET_META_DATA.b() || c4649z5.c() == A5.SET_META_DATA_AFTER_INIT.b() || c4649z5.c() == A5.SET_USER_ID.b()) ? false : true;
    }

    protected boolean h(C4649z5 c4649z5) {
        return (c4649z5.c() == A5.FIRST_INSTANCE.b() || c4649z5.c() == A5.FIRST_INSTANCE_RESULT.b() || c4649z5.c() == A5.INIT_COMPLETE.b() || c4649z5.c() == A5.SDK_INIT_FAILED.b() || c4649z5.c() == A5.SDK_INIT_SUCCESS.b() || c4649z5.c() == A5.USING_CACHE_FOR_INIT_EVENT.b() || c4649z5.c() == A5.CONSENT_TRUE_CODE.b() || c4649z5.c() == A5.CONSENT_FALSE_CODE.b() || c4649z5.c() == A5.SET_META_DATA.b() || c4649z5.c() == A5.SET_META_DATA_AFTER_INIT.b() || c4649z5.c() == A5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.C7
    public void c(int i10) {
        this.f44794o = i10;
    }

    @Override // com.ironsource.C7
    public void b(int i10) {
        if (i10 > 0) {
            this.f44804y = i10;
        }
    }

    public void c(boolean z10) {
        this.f44791l = z10;
    }

    @Override // com.ironsource.C7
    public void b(int[] iArr, Context context) {
        this.f44805z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.C7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC4286e abstractC4286e = this.f44796q;
        if (abstractC4286e != null) {
            abstractC4286e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C4649z5 c4649z5) {
        JSONObject jSONObjectB = c4649z5.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    @Override // com.ironsource.C7
    public void b(boolean z10) {
        this.f44793n = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C4649z5> arrayList) {
        return arrayList != null && arrayList.size() >= this.f44804y;
    }

    public synchronized void a(Fe fe2) {
        this.M = fe2;
    }

    public String b() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, C4649z5 c4649z5) {
        boolean zContains;
        try {
            if (!str.equalsIgnoreCase("none")) {
                return false;
            }
            if (a(this.C)) {
                zContains = a(c4649z5.c(), this.C);
            } else {
                zContains = this.J.contains(Integer.valueOf(c4649z5.c()));
            }
            return zContains;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    @Override // com.ironsource.C7
    public synchronized void a(C4649z5 c4649z5) {
        a(c4649z5, (IronSource.a) null);
    }

    public synchronized void a(C4649z5 c4649z5, @Nullable IronSource.a aVar) {
        if (c4649z5 != null) {
            if (this.f44798s) {
                this.K.a(new b(c4649z5, aVar));
            }
        }
    }

    private boolean a(ArrayList<C4649z5> arrayList, int i10) {
        Iterator<C4649z5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C4649z5> a(ArrayList<C4649z5> arrayList, String str) {
        String strA = a(str, 1024);
        Iterator<C4649z5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    protected void a(ArrayList<C4649z5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.f44795p.a(arrayList, this.I);
                this.f44799t = this.f44795p.a(this.I).size() + this.f44797r.size();
            }
        }
    }

    @Override // com.ironsource.C7
    public void a(int i10) {
        if (i10 > 0) {
            this.f44802w = i10;
        }
    }

    @Override // com.ironsource.C7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.C7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.C7
    public void a(boolean z10) {
        this.f44798s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.f44795p.a(this.f44797r, this.I);
            this.f44797r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, int[] iArr) {
        if (a(iArr)) {
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            C4246ba c4246ba = this.L;
            if (c4246ba != null) {
                if (c4246ba.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C4246ba.f42746n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Fe fe2 = this.M;
            if (fe2 != null) {
                String strB = fe2.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    protected int f(int i10) {
        return a(i10, (IronSource.a) null);
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C4649z5 c4649z5, String str, int i10) {
        JSONObject jSONObjectB = c4649z5.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            c4649z5.a(str, a(jSONObjectB.optString(str, null), i10));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    String a(String str, int i10) {
        return (TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C4649z5 c4649z5, String str) {
        a(c4649z5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, @Nullable IronSource.a aVar) {
        int iB = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i10 < 1000 || i10 >= 2000) && (i10 < 91000 || i10 >= 92000))) {
            if (aVar != IronSource.a.INTERSTITIAL && ((i10 < 2000 || i10 >= 3000) && (i10 < 92000 || i10 >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i10 >= 4000 && i10 < 5000) || (i10 >= 94000 && i10 < 95000)) ? e.NATIVE_AD.b() : iB;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C4246ba c4246ba) {
        this.L = c4246ba;
    }

    void a(Runnable runnable) {
        this.K.a(runnable);
    }
}
