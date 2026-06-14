package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g3 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e3 f8890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f8891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f8895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SpannedString f8896k;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    g3(e3 e3Var, Context context) {
        super(context);
        this.f8890e = e3Var;
        if (e3Var.q() == e3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f8896k = new SpannedString(spannableString);
        } else {
            this.f8896k = new SpannedString("");
        }
        this.f8891f = g();
        this.f8892g = b(e3Var.n());
        this.f8893h = e();
        this.f8894i = a(e3Var.f());
        this.f8895j = j();
        notifyDataSetChanged();
    }

    private r2 f() {
        if (this.f8890e.H()) {
            return null;
        }
        return r2.a().d("Initialization Status").c(f(this.f8890e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private r2 i() {
        r2.b bVarC = r2.a().d(LogConstants.KEY_SDK).c(this.f8890e.p());
        if (TextUtils.isEmpty(this.f8890e.p())) {
            bVarC.a(a(this.f8890e.F())).b(b(this.f8890e.F()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f8890e.v())) {
            arrayList.add(r2.a(r2.c.DETAIL).d(this.f8890e.v()).a());
        }
        if (this.f8890e.y() == e3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f8890e.s() != null) {
            arrayList.add(c(this.f8890e.s()));
        }
        arrayList.add(a(this.f8890e.y()));
        return arrayList;
    }

    public boolean a(j2 j2Var) {
        return j2Var.b() == a.TEST_ADS.ordinal() && j2Var.a() == this.f8895j.size() - 1;
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f8891f : i10 == a.PERMISSIONS.ordinal() ? this.f8892g : i10 == a.CONFIGURATION.ordinal() ? this.f8893h : i10 == a.DEPENDENCIES.ordinal() ? this.f8894i : this.f8895j;
    }

    @Override // com.applovin.impl.s2
    protected int d(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f8891f.size() : i10 == a.PERMISSIONS.ordinal() ? this.f8892g.size() : i10 == a.CONFIGURATION.ordinal() ? this.f8893h.size() : i10 == a.DEPENDENCIES.ordinal() ? this.f8894i.size() : this.f8895j.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? new v4("INTEGRATIONS") : i10 == a.PERMISSIONS.ordinal() ? new v4("PERMISSIONS") : i10 == a.CONFIGURATION.ordinal() ? new v4("CONFIGURATION") : i10 == a.DEPENDENCIES.ordinal() ? new v4("DEPENDENCIES") : new v4("TEST ADS");
    }

    public e3 h() {
        return this.f8890e;
    }

    public void k() {
        this.f8891f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1 k1Var = (k1) it.next();
                arrayList.add(a(k1Var.b(), k1Var.a(), k1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p4 p4Var = (p4) it.next();
                arrayList.add(a(p4Var.b(), p4Var.a(), p4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i10 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i10 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i10) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private r2 a(e3.b bVar) {
        r2.b bVarA = r2.a();
        if (bVar == e3.b.READY) {
            bVarA.a(this.f10385a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f10385a);
    }

    private r2 c(List list) {
        return r2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private r2 d() {
        r2.b bVarC = r2.a().d("Adapter").c(this.f8890e.c());
        if (TextUtils.isEmpty(this.f8890e.c())) {
            bVarC.a(a(this.f8890e.z())).b(b(this.f8890e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f8890e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.k.F0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f10385a);
    }

    private r2 a(String str, String str2, boolean z10, boolean z11) {
        return r2.a(z10 ? r2.c.RIGHT_DETAIL : r2.c.DETAIL).d(str).a(z10 ? null : this.f8896k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? m0.a(R.color.applovin_sdk_checkmarkColor, this.f10385a) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
