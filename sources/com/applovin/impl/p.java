package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f10060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f10061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f10062c;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f10063e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, n nVar) {
            super(context);
            this.f10063e = nVar;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return this.f10063e.g().size();
        }

        @Override // com.applovin.impl.s2
        protected List c(int i10) {
            ArrayList arrayList = new ArrayList();
            o oVar = (o) this.f10063e.g().get(i10);
            arrayList.add(p.this.c(oVar.c()));
            if (oVar.b() != null) {
                arrayList.add(p.this.a("AB Test Experiment Name", oVar.b()));
            }
            k8 k8VarD = oVar.d();
            p pVar = p.this;
            arrayList.add(pVar.a("Device ID Targeting", pVar.a(k8VarD.a())));
            p pVar2 = p.this;
            arrayList.add(pVar2.a("Device Type Targeting", pVar2.b(k8VarD.b())));
            if (k8VarD.c() != null) {
                arrayList.add(p.this.a(k8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i10) {
            o oVar = (o) this.f10063e.g().get(i10);
            return (oVar.b() != null ? 1 : 0) + 3 + (oVar.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i10) {
            return i10 == b.TARGETED_WATERFALL.ordinal() ? new v4("TARGETED WATERFALL FOR CURRENT DEVICE") : i10 == b.OTHER_WATERFALLS.ordinal() ? new v4("OTHER WATERFALLS") : new v4("");
        }
    }

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f10061b;
    }

    public void initialize(final n nVar, final com.applovin.impl.sdk.k kVar) {
        this.f10060a = nVar;
        this.f10061b = kVar;
        a aVar = new a(this, nVar);
        this.f10062c = aVar;
        aVar.a(new s2.a() { // from class: com.applovin.impl.md
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f9354a.a(kVar, nVar, j2Var, r2Var);
            }
        });
        this.f10062c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f10060a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f10062c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f10062c;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 c(String str) {
        return r2.a(r2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final n nVar, final j2 j2Var, r2 r2Var) {
        if (j2Var.a() == 0) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.kd
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    p.a(nVar, j2Var, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.ld
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    p.a(nVar, j2Var, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, (o) nVar.g().get(j2Var.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        o oVar = (o) nVar.g().get(j2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(oVar.c(), oVar.d().c(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(String str, String str2) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(List list) {
        return r2.a(r2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
