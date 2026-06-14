package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a7;
import com.applovin.impl.b0;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class o3 extends s2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f9958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f9959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f9960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f9961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f9965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final StringBuilder f9966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f9967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f9969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f9970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f9971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f9972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f9973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f9974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f9975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f9976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f9977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f9978z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9979a;

        static {
            int[] iArr = new int[b0.b.values().length];
            f9979a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9979a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9979a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9979a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9979a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public o3(Context context) {
        super(context);
        this.f9966n = new StringBuilder("");
        this.f9967o = new AtomicBoolean();
        this.f9969q = new ArrayList();
        this.f9970r = new ArrayList();
        this.f9971s = new ArrayList();
        this.f9972t = new ArrayList();
        this.f9973u = new ArrayList();
        this.f9974v = new ArrayList();
        this.f9975w = new ArrayList();
        this.f9976x = new ArrayList();
        this.f9977y = new ArrayList();
        this.f9978z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
    }

    private List g() {
        boolean zC = this.f9957e.s0().c();
        List listB = this.f9957e.s0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo packageInfoA = n7.a(this.f10385a, 0);
        String str = packageInfoA != null ? packageInfoA.versionName : null;
        arrayList.add(r2.a().d("Package Name").c(this.f10385a.getPackageName()).a());
        r2.b bVarD = r2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(r2.a().d("OS").c(n7.d()).a());
        arrayList.add(r2.a().d("Account").c(StringUtils.isValidString(this.f9964l) ? this.f9964l : "None").a());
        arrayList.add(r2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f9957e.V()) ? this.f9957e.V() : "None").a());
        arrayList.add(r2.a().d("OM SDK Version").c(this.f9957e.e0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.F0()));
        return arrayList;
    }

    private r2 l() {
        String strD = this.f9957e.r0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f9957e.r0().j());
        r2.b bVarD = r2.a(r2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        r2.b bVarC = bVarD.c(strD);
        if (this.f9965m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f10385a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z10 = this.f9957e.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(m0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f10385a));
            }
        }
        return bVarC.a();
    }

    private r2 m() {
        return r2.a().d("MAX Terms and Privacy Policy Flow").a(this.f10385a).a(true).a();
    }

    private r2 n() {
        boolean zHasSupportedCmp = this.f9957e.s().hasSupportedCmp();
        return r2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f10385a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(r2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f9957e.a(x4.L3);
        r2.b bVarD = r2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f9957e.H0()) {
            String strA = n7.a(this.f9957e.n0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f9957e.x().j()) {
            arrayList.add(m());
            arrayList.add(n());
            return arrayList;
        }
        if (this.f9957e.x().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private r2 r() {
        return r2.a().d("Network Consent Statuses").a(this.f10385a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f9957e.r0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new r4(p0.b(), false, this.f10385a));
        }
        arrayList.add(new r4(p0.a(), true, this.f10385a));
        return arrayList;
    }

    private r2 u() {
        return r2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f10385a)).b("Terms Flow has been replaced").a(this.f9957e.x().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + n7.c(this.f9957e));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nTest Mode - ");
        sb3.append(this.f9957e.s0().c() ? "enabled" : "disabled");
        sb2.append(sb3.toString());
        sb2.append("\nTarget SDK - " + this.f9957e.A().G().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f9957e.a(x4.L3);
        String strB = j.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb4.append(str2);
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb5.append(strB);
        sb2.append(sb5.toString());
        if (this.f9957e.H0()) {
            String strA = n7.a(this.f9957e.n0());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("\nUnity Version - ");
            sb6.append(StringUtils.isValidString(strA) ? strA : "None");
            sb2.append(sb6.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(p0.a(this.f10385a));
        sb2.append(this.f9957e.x().e());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f9957e.r0().i());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb2.append(((a7) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f9970r.iterator();
        while (it2.hasNext()) {
            a(sb2, ((e3) it2.next()).j());
        }
        Iterator it3 = this.f9969q.iterator();
        while (it3.hasNext()) {
            a(sb2, ((e3) it3.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f9959g.iterator();
        while (it4.hasNext()) {
            a(sb2, ((n) it4.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb2.toString());
        this.f9966n.append(sb2.toString());
    }

    public boolean a(r2 r2Var) {
        if (r2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(r2Var.k().toString());
    }

    public void b(boolean z10) {
        this.f9968p = z10;
    }

    @Override // com.applovin.impl.s2
    protected List c(int i10) {
        return i10 == e.APP_INFO.ordinal() ? this.f9975w : i10 == e.MAX.ordinal() ? this.f9976x : i10 == e.PRIVACY.ordinal() ? this.f9977y : i10 == e.ADS.ordinal() ? this.f9978z : i10 == e.INCOMPLETE_NETWORKS.ordinal() ? this.A : i10 == e.COMPLETED_NETWORKS.ordinal() ? this.B : this.C;
    }

    public List d() {
        ArrayList<a7> arrayList = new ArrayList();
        Iterator it = this.f9958f.iterator();
        while (it.hasNext()) {
            arrayList.add(((e3) it.next()).t());
        }
        String strK = this.f9957e.r0().k();
        if (strK != null) {
            String strC = this.f9957e.r0().c();
            for (a7 a7Var : arrayList) {
                if (a7Var.f() == a7.a.TCF_VENDOR && a7Var.d() != null) {
                    a7Var.a(Boolean.valueOf(c7.a(strK, a7Var.d().intValue() - 1)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK && a7Var.d() != null) {
                    a7Var.a(c7.a(a7Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((a7) it2.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i10) {
        return i10 == e.APP_INFO.ordinal() ? new v4("APP INFO") : i10 == e.MAX.ordinal() ? new v4("MAX") : i10 == e.PRIVACY.ordinal() ? new v4("PRIVACY") : i10 == e.ADS.ordinal() ? new v4("ADS") : i10 == e.INCOMPLETE_NETWORKS.ordinal() ? new v4("INCOMPLETE SDK INTEGRATIONS") : i10 == e.COMPLETED_NETWORKS.ordinal() ? new v4("COMPLETED SDK INTEGRATIONS") : new v4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.f9959g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f9963k;
    }

    public String i() {
        return this.f9962j;
    }

    public List k() {
        return this.f9972t;
    }

    public List o() {
        return this.f9960h;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9977y = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(this.f9969q);
            this.B = a(this.f9970r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9978z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9978z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.f9966n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.f9957e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f9967o.get() + "}";
    }

    public List v() {
        return this.f9974v;
    }

    public List w() {
        return this.f9973u;
    }

    public boolean x() {
        return this.f9968p;
    }

    public boolean y() {
        return this.f9967o.get();
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVarF = ((n) it.next()).f();
            Iterator it2 = oVarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((i8) it2.next()).b());
            }
            Iterator it3 = oVarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((i8) it3.next()).b());
            }
        }
        this.f9972t = new ArrayList(hashSet);
        this.f9973u = new ArrayList(hashSet2);
        Collections.sort(this.f9972t);
        Collections.sort(this.f9973u);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f9957e = kVar;
        this.f9958f = list;
        this.f9959g = list2;
        this.f9960h = list3;
        this.f9961i = list4;
        this.f9962j = str;
        this.f9963k = str2;
        this.f9964l = str3;
        this.f9965m = z10;
        if (list != null && this.f9967o.compareAndSet(false, true)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f9970r);
            this.f9975w.addAll(j());
            this.f9976x.addAll(q());
            this.f9977y.addAll(s());
            this.f9978z.addAll(g());
            this.A = a(this.f9969q);
            this.B = a(this.f9970r);
            this.C = a(this.f9971s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f10385a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.dd
            @Override // java.lang.Runnable
            public final void run() {
                this.f8688b.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.s2
    protected int d(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f9975w.size();
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f9976x.size();
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f9977y.size();
        }
        if (i10 == e.ADS.ordinal()) {
            return this.f9978z.size();
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.A.size();
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.B.size();
        }
        return this.C.size();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (!e3Var.G()) {
                if (e3Var.q() != e3.a.INCOMPLETE_INTEGRATION && e3Var.q() != e3.a.INVALID_INTEGRATION) {
                    if (e3Var.q() == e3.a.COMPLETE) {
                        this.f9970r.add(e3Var);
                    } else if (e3Var.q() == e3.a.MISSING) {
                        this.f9971s.add(e3Var);
                    }
                } else {
                    this.f9969q.add(e3Var);
                }
            }
        }
    }

    private r2 e() {
        String string;
        r2.b bVarD = r2.a().d("Ad Review Version");
        String strB = j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f9957e.i0())) {
                string = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb2.append(this.f9957e.H0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb2.append(" from the correct account.");
                string = sb2.toString();
            }
        } else {
            string = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (string != null) {
            bVarD.b("MAX Ad Review").a(string).a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f10385a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private r2 b(String str, String str2) {
        r2.b bVarD = r2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(m0.a(R.color.applovin_sdk_xmarkColor, this.f10385a));
        }
        return bVarD.a();
    }

    private r2 b(String str) {
        r2.b bVarA = r2.a();
        if (this.f9957e.s0().c()) {
            bVarA.a(this.f10385a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb2.append("Test Mode Network");
        r2.b bVarD = bVarA.d(sb2.toString());
        if (!this.f9957e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.y() == e3.b.READY) {
                this.f9974v.add(e3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(z zVar, String str) {
        String strA;
        c cVarA;
        c cVar;
        String str2;
        List<a0> listA = b0.a(zVar, this.f9961i);
        if (listA.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : listA) {
                this.f9957e.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9957e.O().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + a0Var2.d());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, a0Var.d());
                cVarA = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str3 = strA;
            cVar = cVarA;
            str2 = str3;
        }
        this.f9976x.add(a(str2, cVar));
        c();
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.f9957e.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9957e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f9976x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (string.length() + str.length() >= ((Integer) this.f9957e.a(x4.f11407r)).intValue()) {
            com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", string);
            this.f9966n.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(r2.a().d("View Ad Units (" + this.f9959g.size() + ")").a(this.f10385a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f9960h.isEmpty()) {
            arrayList.add(r2.a().d("Selective Init Ad Units (" + this.f9960h.size() + ")").a(this.f10385a).a(true).a());
        }
        arrayList.add(r2.a().d("Test Mode Enabled").c(String.valueOf(this.f9957e.s0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z3((e3) it.next(), this.f10385a));
        }
        return arrayList;
    }

    private r2 a(String str) {
        r2.b bVarA = r2.a();
        if (!this.f9957e.s0().c()) {
            bVarA.a(this.f10385a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb2.append("Live Network");
        r2.b bVarD = bVarA.d(sb2.toString());
        if (this.f9957e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private r2 a(boolean z10) {
        return r2.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f10385a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z10).a();
    }

    private r2 a(String str, c cVar) {
        int i10;
        int iA;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            iA = m0.a(R.color.applovin_sdk_checkmarkColor, this.f10385a);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            iA = m0.a(R.color.applovin_sdk_warningColor, this.f10385a);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            iA = m0.a(R.color.applovin_sdk_xmarkColor, this.f10385a);
        }
        return r2.a().d("app-ads.txt").a(i10).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.f9979a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i10 == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return "";
            }
            return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    private c a(b0.b bVar) {
        int i10 = a.f9979a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return c.ERROR;
        }
        if (i10 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (u2 u2Var : this.f9972t) {
                if (list.equals(u2Var.b())) {
                    return u2Var.a();
                }
            }
            for (u2 u2Var2 : this.f9973u) {
                if (list.equals(u2Var2.b())) {
                    return u2Var2.a();
                }
            }
        } else {
            for (e3 e3Var : this.f9974v) {
                if (list.equals(e3Var.u())) {
                    return e3Var.g();
                }
            }
        }
        return uc.a(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, list);
    }
}
