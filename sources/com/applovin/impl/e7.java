package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e7 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f8785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f8786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f8787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f8788e;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f8789e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f8789e = list;
        }

        @Override // com.applovin.impl.s2
        protected r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i10) {
            return e7.this.f8787d;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i10) {
            return this.f8789e.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i10) {
            return new v4("TEST MODE NETWORKS");
        }
    }

    class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f8792b;

        b(List list, com.applovin.impl.sdk.k kVar) {
            this.f8791a = list;
            this.f8792b = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            List listU = ((e3) this.f8791a.get(j2Var.a())).u();
            if (listU.equals(this.f8792b.s0().b())) {
                this.f8792b.s0().a((List) null);
            } else {
                this.f8792b.s0().a(listU);
            }
            e7.this.f8786c.notifyDataSetChanged();
        }
    }

    class c extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ e3 f8794p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e3 e3Var, Context context, e3 e3Var2) {
            super(e3Var, context);
            this.f8794p = e3Var2;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (this.f8794p.u().equals(e7.this.f8784a.s0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (this.f8794p.u().equals(e7.this.f8784a.s0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f8794p.g(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    public e7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f8784a;
    }

    public void initialize(List<e3> list, com.applovin.impl.sdk.k kVar) {
        this.f8784a = kVar;
        this.f8785b = list;
        this.f8787d = a(list);
        a aVar = new a(this, list);
        this.f8786c = aVar;
        aVar.a(new b(list, kVar));
        this.f8786c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8788e = listView;
        listView.setAdapter((ListAdapter) this.f8786c);
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f8787d = a(this.f8785b);
        this.f8786c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            arrayList.add(new c(e3Var, this, e3Var));
        }
        return arrayList;
    }
}
