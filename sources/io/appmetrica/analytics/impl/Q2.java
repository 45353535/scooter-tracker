package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Q2 implements Ka {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashSet f76276n = new HashSet(Arrays.asList(1, 13));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final O2 f76277o = new O2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f76278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Kh f76279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final PublicLogger f76280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    protected final Tn f76281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    protected final Jg f76282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    protected final C6 f76283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5028d0 f76284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Bi f76285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5494vb f76286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Hf f76287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T9 f76288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Oe f76289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C5179in f76290m;

    public Q2(Context context, Bi bi2, Kh kh2, T9 t92, C5564y6 c5564y6, Tn tn, Jg jg2, C6 c62, C5028d0 c5028d0, Oe oe2) {
        Context applicationContext = context.getApplicationContext();
        this.f76278a = applicationContext;
        this.f76285h = bi2;
        this.f76279b = kh2;
        this.f76288k = t92;
        this.f76281d = tn;
        this.f76282e = jg2;
        this.f76283f = c62;
        this.f76284g = c5028d0;
        this.f76289l = oe2;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh2.b().getApiKey());
        this.f76280c = orCreatePublicLogger;
        if (AbstractC5108g3.a(kh2.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f76287j = c5564y6;
        this.f76290m = new C5179in(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f76280c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f76280c.info("Put error environment pair <%s, %s>", str, str2);
        Kh kh2 = this.f76279b;
        synchronized (kh2) {
            I8 i82 = kh2.f76024c;
            i82.f75927b.b(i82.f75926a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (no.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f76280c.info("Clear app environment", new Object[0]);
        Bi bi2 = this.f76285h;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        W5 w5N = U3.n();
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str = kh2.f76027f;
        }
        bi2.a(new Ah(w5N, false, 1, null, new Kh(gf2, counterConfiguration, i82, str)));
    }

    public final void d(String str) {
        if (this.f76279b.f()) {
            return;
        }
        this.f76285h.f75595d.c();
        C5494vb c5494vb = this.f76286i;
        c5494vb.f78444a.removeCallbacks(c5494vb.f78446c, c5494vb.f78445b.f76279b.f76218b.getApiKey());
        this.f76279b.f76026e = true;
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", str, 3, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    public final void e(String str) {
        this.f76285h.f75595d.b();
        C5494vb c5494vb = this.f76286i;
        C5494vb.a(c5494vb.f78444a, c5494vb.f78445b, c5494vb.f78446c);
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", str, 6400, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76279b.f76026e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C5498vf c5498vf;
        Bi bi2 = this.f76285h;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        C5598zf c5598zf = kh2.f76025d;
        synchronized (kh2) {
            str = kh2.f76027f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh2.f76218b.getApiKey());
        Set set = D9.f75657a;
        JSONObject jSONObject = new JSONObject();
        if (c5598zf != null && (c5498vf = c5598zf.f78633a) != null) {
            try {
                jSONObject.put("preloadInfo", c5498vf.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(string, "", 6144, 0, orCreatePublicLogger);
        u32.c(str);
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f76280c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f76280c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f76280c.info("Put app environment: <%s, %s>", str, str2);
        Bi bi2 = this.f76285h;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        W5 w5B = U3.b(str, str2);
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str3 = kh2.f76027f;
        }
        bi2.a(new Ah(w5B, false, 1, null, new Kh(gf2, counterConfiguration, i82, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrB;
        C5053e0 c5053e0 = new C5053e0(new C5079f0(this, map));
        C5418sa c5418sa = new C5418sa();
        C5564y6 c5564y6 = C5186j4.l().f77465a;
        Thread threadA = c5053e0.a();
        Map mapC = null;
        try {
            stackTraceElementArrB = c5053e0.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        C5581yn c5581yn = (C5581yn) c5418sa.apply(threadA, stackTraceElementArrB);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            mapC = c5053e0.c();
        } catch (SecurityException unused3) {
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadA && thread != null) {
                arrayList.add((C5581yn) c5418sa.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c5581yn, arrayList, c5564y6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f76280c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Bi bi2 = this.f76285h;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        for (Ii ii : eCommerceEvent.toProto()) {
            U3 u32 = new U3(LoggerStorage.getOrCreatePublicLogger(kh2.f76218b.getApiKey()));
            EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
            u32.f76617d = 41000;
            u32.f76615b = u32.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ii.f75947a)));
            u32.f76620g = ii.f75948b.getBytesTruncated();
            Gf gf2 = new Gf(kh2.f76217a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
            I8 i82 = kh2.f76024c;
            synchronized (kh2) {
                str = kh2.f76027f;
            }
            bi2.a(new Ah(u32, false, 1, null, new Kh(gf2, counterConfiguration, i82, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        Ig ig2 = new Ig(str, a(th2));
        Bi bi2 = this.f76285h;
        byte[] byteArray = MessageNano.toByteArray(this.f76282e.fromModel(ig2));
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str, 5892, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76280c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f76280c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", str, 1, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        Si si = P2.f76216a;
        si.getClass();
        so soVarA = si.a(revenue);
        if (!soVarA.f78248a) {
            this.f76280c.warning("Passed revenue is not valid. Reason: " + soVarA.f78249b, new Object[0]);
            return;
        }
        Bi bi2 = this.f76285h;
        Ti ti = new Ti(revenue, this.f76280c);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        U3 u3A = U3.a(LoggerStorage.getOrCreatePublicLogger(kh2.f76218b.getApiKey()), ti);
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str = kh2.f76027f;
        }
        bi2.a(new Ah(u3A, false, 1, null, new Kh(gf2, counterConfiguration, i82, str)));
        this.f76280c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        Sn snA = Vn.a(th2, new V(null, null, this.f76287j.a()), null, (String) this.f76288k.f76495b.a(), (Boolean) this.f76288k.f76496c.a());
        Bi bi2 = this.f76285h;
        bi2.a(bi2.a(snA, this.f76279b));
        this.f76280c.info("Unhandled exception received: " + snA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C5103fo c5103fo = new C5103fo(C5103fo.f77186c);
        Iterator<UserProfileUpdate<? extends InterfaceC5129go>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC5129go userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Hd) userProfileUpdatePatcher).f75866e = this.f76280c;
            userProfileUpdatePatcher.a(c5103fo);
        }
        C5232ko c5232ko = new C5232ko();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c5103fo.f77187a.size(); i10++) {
            SparseArray sparseArray = c5103fo.f77187a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i10))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C5155ho) it2.next());
            }
        }
        c5232ko.f77633a = (C5155ho[]) arrayList.toArray(new C5155ho[arrayList.size()]);
        so soVarA = f76277o.a(c5232ko);
        if (!soVarA.f78248a) {
            this.f76280c.warning("UserInfo wasn't sent because " + soVarA.f78249b, new Object[0]);
            return;
        }
        Bi bi2 = this.f76285h;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        W5 w5A = U3.a(c5232ko);
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str = kh2.f76027f;
        }
        bi2.a(new Ah(w5A, false, 1, null, new Kh(gf2, counterConfiguration, i82, str)));
        this.f76280c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f76280c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f76280c.info("Send event buffer", new Object[0]);
        Bi bi2 = this.f76285h;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        U3 u32 = new U3("", "", 256, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f76279b.f76218b.setDataSendingEnabled(z10);
        this.f76280c.info("Updated data sending enabled: %s", Boolean.valueOf(z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        u32.f76629p = Collections.singletonMap(str, bArr);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        String str2;
        Bi bi2 = this.f76285h;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        U3 u32 = new U3(LoggerStorage.getOrCreatePublicLogger(kh2.f76218b.getApiKey()));
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        u32.f76617d = 40962;
        u32.c(str);
        u32.f76615b = u32.e(str);
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str2 = kh2.f76027f;
        }
        bi2.a(new Ah(u32, false, 1, null, new Kh(gf2, counterConfiguration, i82, str2)));
        this.f76280c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        String str;
        Bi bi2 = this.f76285h;
        E e10 = new E(adRevenue, z10, this.f76290m, this.f76280c);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        U3 u3A = U3.a(LoggerStorage.getOrCreatePublicLogger(kh2.f76218b.getApiKey()), e10);
        Gf gf2 = new Gf(kh2.f76217a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh2.f76218b);
        I8 i82 = kh2.f76024c;
        synchronized (kh2) {
            str = kh2.f76027f;
        }
        bi2.a(new Ah(u3A, false, 1, null, new Kh(gf2, counterConfiguration, i82, str)));
        this.f76280c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC5295nb.b(adRevenue.payload) + ", autoCollected=" + z10 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(@NonNull String str, @Nullable String str2) {
        this.f76280c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(str2, str, 1, 0, publicLogger);
        u32.f76625l = EnumC5442t9.JS;
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (no.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f76280c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(str2, str, 1, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    public final Sn a(Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTrace;
        if (th2 == null) {
            stackTrace = null;
            th3 = null;
        } else if (th2 instanceof W1) {
            stackTrace = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTrace = null;
        }
        return Vn.a(th3, new V(null, null, this.f76287j.a()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f76288k.f76495b.a(), (Boolean) this.f76288k.f76496c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        B6 b62 = new B6(new Ig(str2, a(th2)), str);
        Bi bi2 = this.f76285h;
        byte[] byteArray = MessageNano.toByteArray(this.f76283f.fromModel(b62));
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76280c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Sn snA = this.f76289l.a(pluginErrorDetails);
        Bi bi2 = this.f76285h;
        In in = snA.f76465a;
        String str = in != null ? (String) WrapUtils.getOrDefault(in.f75964a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f76281d.fromModel(snA));
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str, 5891, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76280c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(@NonNull String str) {
        Bi bi2 = this.f76285h;
        W5 w5A = W5.a(str);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(w5A, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final boolean b() {
        return this.f76279b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        bi2.a(new U3("", str, 1, 0, publicLogger), this.f76279b, 1, map);
        PublicLogger publicLogger2 = this.f76280c;
        StringBuilder sb2 = new StringBuilder("Event received: ");
        sb2.append(WrapUtils.wrapToTag(str));
        sb2.append(". With value: ");
        sb2.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC4987bb
    public final void a(@NonNull Sn sn) {
        Bi bi2 = this.f76285h;
        Ah ahA = bi2.a(sn, this.f76279b);
        Kh kh2 = ahA.f75527e;
        Tl tl = bi2.f75596e;
        if (tl != null) {
            kh2.f76218b.setUuid(((Sl) tl).g());
        } else {
            kh2.getClass();
        }
        bi2.f75594c.b(ahA);
        this.f76280c.info("Unhandled exception received: " + sn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        Sn snA;
        Oe oe2 = this.f76289l;
        if (pluginErrorDetails != null) {
            snA = oe2.a(pluginErrorDetails);
        } else {
            oe2.getClass();
            snA = null;
        }
        Ig ig2 = new Ig(str, snA);
        Bi bi2 = this.f76285h;
        byte[] byteArray = MessageNano.toByteArray(this.f76282e.fromModel(ig2));
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str, 5896, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76280c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC5105g0
    public final void a(@NonNull V v10) {
        C5002c0 c5002c0 = new C5002c0(v10, (String) this.f76288k.f76495b.a(), (Boolean) this.f76288k.f76496c.a());
        Bi bi2 = this.f76285h;
        byte[] byteArray = MessageNano.toByteArray(this.f76284g.fromModel(c5002c0));
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, "", 5968, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        String str = null;
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        PublicLogger publicLogger2 = this.f76280c;
        StringBuilder sb2 = new StringBuilder("ANR was reported ");
        C5581yn c5581yn = v10.f76574a;
        if (c5581yn != null) {
            str = "Thread[name=" + c5581yn.f78588a + ",tid={" + c5581yn.f78590c + ", priority=" + c5581yn.f78589b + ", group=" + c5581yn.f78591d + "}] at " + CollectionsKt.joinToString$default(c5581yn.f78593f, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, null, 62, null);
        }
        sb2.append(str);
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC5442t9 enumC5442t9;
        if (f76276n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i10 = J8.f75989a[moduleEvent.getCategory().ordinal()];
        if (i10 == 1) {
            enumC5442t9 = EnumC5442t9.NATIVE;
        } else {
            if (i10 != 2) {
                throw new lf.m();
            }
            enumC5442t9 = EnumC5442t9.SYSTEM;
        }
        u32.f76625l = enumC5442t9;
        u32.f76616c = AbstractC5295nb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            u32.f76629p = moduleEvent.getExtras();
        }
        this.f76285h.a(u32, this.f76279b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        Sn snA;
        Oe oe2 = this.f76289l;
        if (pluginErrorDetails != null) {
            snA = oe2.a(pluginErrorDetails);
        } else {
            oe2.getClass();
            snA = null;
        }
        B6 b62 = new B6(new Ig(str2, snA), str);
        Bi bi2 = this.f76285h;
        byte[] byteArray = MessageNano.toByteArray(this.f76283f.fromModel(b62));
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76280c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
