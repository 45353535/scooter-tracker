package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w6 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f11215b;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f11216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f11217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11218g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f11216e = arrayList;
            this.f11217f = arrayList2;
            this.f11218g = z10;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f11216e : this.f11217f;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f11216e.size() : this.f11217f.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new v4("TCF VENDORS (TC STRING)");
            }
            return new v4(this.f11218g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f11214a;
    }

    public void initialize(List<a7> list, com.applovin.impl.sdk.k kVar) {
        this.f11214a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = p0.b().a(this);
        boolean zB = kVar.r0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (a7 a7Var : list) {
            Boolean boolA = a7Var.a();
            if (boolA != null) {
                if (a7Var.f() == a7.a.TCF_VENDOR) {
                    arrayList.add(a(a7Var.b(), String.valueOf(boolA)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK) {
                    arrayList2.add(a(a7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && a7Var.f() == a7.a.ATP_NETWORK) {
                arrayList2.add(a(a7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f11215b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f11215b);
    }
}
