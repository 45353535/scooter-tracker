package io.appmetrica.analytics.impl;

import android.content.Context;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5112g7 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile C5112g7 f77217q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f77222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5086f7 f77223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4953a3 f77224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C4979b3 f77225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5594zb f77226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ab f77227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C5481un f77228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C5506vn f77229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C5594zb f77230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Ab f77231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C5117gc f77232o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f77218a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f77219b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f77220c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T6 f77221d = D5.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C5164i7 f77233p = new C5164i7();

    public C5112g7(Context context) {
        this.f77222e = context;
    }

    public static C5112g7 a(Context context) {
        if (f77217q == null) {
            synchronized (C5112g7.class) {
                try {
                    if (f77217q == null) {
                        f77217q = new C5112g7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f77217q;
    }

    public final synchronized Oa b(X4 x42) {
        Oa c5594zb;
        String str = new O4(x42).f76186a;
        c5594zb = (Oa) this.f77219b.get(str);
        if (c5594zb == null) {
            c5594zb = new C5594zb(new C5479ul(c(x42)));
            this.f77219b.put(str, c5594zb);
        }
        return c5594zb;
    }

    public final synchronized C5086f7 c(X4 x42) {
        C5086f7 c5086f7;
        try {
            O4 o42 = new O4(x42);
            c5086f7 = (C5086f7) this.f77218a.get(o42.f76186a);
            if (c5086f7 == null) {
                Context context = this.f77222e;
                C5164i7 c5164i7 = this.f77233p;
                String strA = new C5138h7(c5164i7.f77382a, c5164i7.f77383b, false).a(context, o42);
                T6 t62 = this.f77221d;
                t62.getClass();
                String str = x42.f76663b;
                if (str == null) {
                    str = C4240b4.i.Z;
                }
                String str2 = String.format("component-%s", str);
                C5231kn c5231kn = t62.f76488c;
                C5035d7 c5035d7 = t62.f76486a;
                V6 v62 = c5035d7.f77006a;
                W6 w62 = c5035d7.f77007b;
                C5518wa c5518wa = new C5518wa(false);
                c5518wa.a(112, new R4());
                C5307nn c5307nn = new C5307nn(str2, t62.f76487b.f75608a);
                c5231kn.getClass();
                c5086f7 = new C5086f7(context, strA, new C5257ln(v62, w62, c5518wa, c5307nn), PublicLogger.getAnonymousInstance());
                this.f77218a.put(o42.f76186a, c5086f7);
            }
        } finally {
        }
        return c5086f7;
    }

    public final synchronized Oa d() {
        try {
            if (this.f77226i == null) {
                this.f77226i = new C5594zb(new C5479ul(h()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77226i;
    }

    public final Oa e() {
        C5117gc c5117gc;
        if (this.f77230m == null) {
            synchronized (this) {
                try {
                    if (this.f77232o == null) {
                        C5164i7 c5164i7 = this.f77233p;
                        String strA = new C5138h7(c5164i7.f77382a, c5164i7.f77383b, true).a(this.f77222e, new V3());
                        Context context = this.f77222e;
                        T6 t62 = this.f77221d;
                        t62.getClass();
                        HashMap map = new HashMap();
                        map.put("preferences", A5.f75493a);
                        C5231kn c5231kn = t62.f76488c;
                        C5035d7 c5035d7 = t62.f76486a;
                        Z6 z62 = c5035d7.f77008c;
                        C4957a7 c4957a7 = c5035d7.f77009d;
                        C5518wa c5518wa = new C5518wa(false);
                        c5518wa.a(112, new W3());
                        C5307nn c5307nn = new C5307nn("service database", map);
                        c5231kn.getClass();
                        this.f77232o = new C5117gc(context, strA, new C5089fa(strA), new C5257ln(z62, c4957a7, c5518wa, c5307nn));
                    }
                    c5117gc = this.f77232o;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f77230m = new C5594zb(c5117gc);
        }
        return this.f77230m;
    }

    public final IBinaryDataHelper f() {
        if (this.f77224g == null) {
            this.f77224g = new C4953a3(new C5479ul(h()), "binary_data");
        }
        return this.f77224g;
    }

    public final synchronized IBinaryDataHelper g() {
        try {
            if (this.f77225h == null) {
                this.f77225h = new C4979b3(f());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77225h;
    }

    public final synchronized C5086f7 h() {
        try {
            if (this.f77223f == null) {
                Context context = this.f77222e;
                C5164i7 c5164i7 = this.f77233p;
                String strA = new C5138h7(c5164i7.f77382a, c5164i7.f77383b, true).a(context, new C5228kk());
                T6 t62 = this.f77221d;
                t62.getClass();
                HashMap map = new HashMap();
                map.put("preferences", A5.f75493a);
                map.put("binary_data", AbstractC5563y5.f78572a);
                map.put("temp_cache", AbstractC5556xn.f78566a);
                Iterator<ModuleServicesDatabase> it = C5468ua.H.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C5231kn c5231kn = t62.f76488c;
                C5035d7 c5035d7 = t62.f76486a;
                C4983b7 c4983b7 = c5035d7.f77010e;
                C5009c7 c5009c7 = c5035d7.f77011f;
                C5518wa c5518wa = new C5518wa(false);
                c5518wa.a(114, new C5254lk());
                Iterator<ModuleServicesDatabase> it2 = C5468ua.H.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c5518wa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C5307nn c5307nn = new C5307nn("service database", map);
                c5231kn.getClass();
                this.f77223f = new C5086f7(context, strA, new C5257ln(c4983b7, c5009c7, c5518wa, c5307nn), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77223f;
    }

    public final synchronized IBinaryDataHelper a(X4 x42) {
        IBinaryDataHelper c4953a3;
        String str = new O4(x42).f76186a;
        c4953a3 = (IBinaryDataHelper) this.f77220c.get(str);
        if (c4953a3 == null) {
            c4953a3 = new C4953a3(new C5479ul(c(x42)), "binary_data");
            this.f77220c.put(str, c4953a3);
        }
        return c4953a3;
    }

    public final synchronized Oa b() {
        return e();
    }

    public final synchronized Oa a() {
        try {
            if (this.f77231n == null) {
                this.f77231n = new Ab(e());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77231n;
    }

    public final synchronized Oa c() {
        try {
            if (this.f77227j == null) {
                if (this.f77226i == null) {
                    this.f77226i = new C5594zb(new C5479ul(h()));
                }
                this.f77227j = new Ab(this.f77226i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77227j;
    }
}
