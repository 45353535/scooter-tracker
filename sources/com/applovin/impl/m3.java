package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.d;
import com.applovin.impl.o3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o3 f9316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f9317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f9318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f9319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f9320e;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            m3.this.a();
            m3 m3Var = m3.this;
            m3Var.b((Context) m3Var);
        }
    }

    class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f9322a;

        class a implements d.b {
            a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.this.f9316a.t());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.m3$b$b, reason: collision with other inner class name */
        class C0173b implements d.b {
            C0173b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.this.f9316a.d(), m3.this.f9316a.t());
            }
        }

        class c implements d.b {
            c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.this.f9316a.d(), m3.this.f9316a.t());
            }
        }

        class d implements d.b {
            d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f9316a.f(), false, m3.this.f9316a.t());
            }
        }

        class e implements d.b {
            e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.this.f9316a.k(), m3.this.f9316a.w(), m3.this.f9316a.t());
            }
        }

        class f implements d.b {
            f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.this.f9316a.v(), m3.this.f9316a.t());
            }
        }

        class g implements d.b {
            g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f9316a.o(), true, m3.this.f9316a.t());
            }
        }

        class h implements d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r2 f9331a;

            h(r2 r2Var) {
                this.f9331a = r2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.f9331a).r());
            }
        }

        b(com.applovin.impl.c cVar) {
            this.f9322a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            int iB = j2Var.b();
            if (iB == o3.e.APP_INFO.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), m3.this);
                return;
            }
            if (iB == o3.e.MAX.ordinal()) {
                if (m3.this.f9316a.a(r2Var)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.f9322a, new a());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB == o3.e.PRIVACY.ordinal()) {
                if (j2Var.a() != o3.d.CMP.ordinal()) {
                    if (j2Var.a() == o3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f9322a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(m3.this.f9316a.t().r0().j())) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.f9322a, new C0173b());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB != o3.e.ADS.ordinal()) {
                if ((iB == o3.e.INCOMPLETE_NETWORKS.ordinal() || iB == o3.e.COMPLETED_NETWORKS.ordinal()) && (r2Var instanceof z3)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerDetailActivity.class, this.f9322a, new h(r2Var));
                    return;
                }
                return;
            }
            if (j2Var.a() == o3.b.AD_UNITS.ordinal()) {
                if (m3.this.f9316a.f().size() > 0) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f9322a, new d());
                    return;
                } else {
                    n7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", m3.this);
                    return;
                }
            }
            if (j2Var.a() == o3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (m3.this.f9316a.k().size() <= 0 && m3.this.f9316a.w().size() <= 0) {
                    n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                    return;
                } else if (m3.this.f9316a.t().s0().c()) {
                    n7.a("Restart Required", r2Var.b(), m3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f9322a, new e());
                    return;
                }
            }
            if (j2Var.a() != o3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (j2Var.a() == o3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f9322a, new g());
                }
            } else if (!m3.this.f9316a.t().s0().c()) {
                m3.this.getSdk().s0().a();
                n7.a("Restart Required", r2Var.b(), m3.this);
            } else if (m3.this.f9316a.v().size() > 0) {
                com.applovin.impl.d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.f9322a, new f());
            } else {
                n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f9320e = aVar;
        aVar.setColor(-3355444);
        this.f9318c.addView(this.f9320e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f9318c.bringChildToFront(this.f9320e);
        this.f9320e.a();
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        o3 o3Var = this.f9316a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f9318c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f9319d = listView;
        listView.setAdapter((ListAdapter) this.f9316a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.f9316a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.f9317b);
            this.f9316a.a((s2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        o3 o3Var = this.f9316a;
        if (o3Var == null || o3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(o3 o3Var, c cVar) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.f9316a;
        if (o3Var2 != null && (dataSetObserver = this.f9317b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f9316a = o3Var;
        this.f9317b = new a();
        b((Context) this);
        this.f9316a.registerDataSetObserver(this.f9317b);
        this.f9316a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f9320e;
        if (aVar != null) {
            aVar.b();
            this.f9318c.removeView(this.f9320e);
            this.f9320e = null;
        }
    }

    private void b() {
        o3 o3Var = this.f9316a;
        if (o3Var == null) {
            return;
        }
        String strP = o3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        n7.a(this.f9316a.i(), this.f9316a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f9316a.h()) || this.f9316a.x()) {
            return;
        }
        this.f9316a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.kc
            @Override // java.lang.Runnable
            public final void run() {
                this.f9190b.a(context);
            }
        });
    }
}
