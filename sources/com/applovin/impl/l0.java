package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.a7;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l0 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f9220b;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f9221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f9222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f9223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f9224h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f9225i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f9221e = list;
            this.f9222f = list2;
            this.f9223g = list3;
            this.f9224h = list4;
            this.f9225i = list5;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f9221e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f9222f;
            } else {
                z10 = false;
                list = i10 == c.LISTED_TC_NETWORKS.ordinal() ? this.f9223g : i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f9224h : this.f9225i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((a7) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i10) {
            return i10 == c.MISSING_TC_NETWORKS.ordinal() ? this.f9221e.size() : i10 == c.MISSING_AC_NETWORKS.ordinal() ? this.f9222f.size() : i10 == c.LISTED_TC_NETWORKS.ordinal() ? this.f9223g.size() : i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f9224h.size() : this.f9225i.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i10) {
            return i10 == c.MISSING_TC_NETWORKS.ordinal() ? new v4("MISSING TCF VENDORS (TC STRING)") : i10 == c.MISSING_AC_NETWORKS.ordinal() ? new v4("MISSING ATP NETWORKS (AC STRING)") : i10 == c.LISTED_TC_NETWORKS.ordinal() ? new v4("LISTED TCF VENDORS (TC STRING)") : i10 == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }
    }

    class b implements s2.a {
        b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), l0.this);
        }
    }

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f9219a;
    }

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, com.applovin.impl.sdk.k kVar) {
        this.f9219a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f9220b = aVar;
        aVar.a(new b());
        this.f9220b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9220b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z10) {
        r2.b bVarA = r2.a();
        boolean zB = this.f9219a.r0().b();
        a7.a aVarF = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (aVarF == aVar || (a7Var.f() == a7.a.ATP_NETWORK && zB)) {
            String strC = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarA.d(strC).d(z10 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).b(strC).a(str + a7Var.d()).a(true);
        } else {
            bVarA.d(a7Var.b());
        }
        return bVarA.a();
    }
}
