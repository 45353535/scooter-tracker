package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f10194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f10195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f10196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f10198e;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f10199e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f10199e = list;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i10) {
            return q.this.f10196c;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i10) {
            return this.f10199e.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i10) {
            return new v4("");
        }
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f10194a;
    }

    public void initialize(final List<n> list, boolean z10, final com.applovin.impl.sdk.k kVar) {
        this.f10197d = z10;
        this.f10194a = kVar;
        this.f10196c = a(list);
        a aVar = new a(this, list);
        this.f10195b = aVar;
        aVar.a(new s2.a() { // from class: com.applovin.impl.ud
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f11088a.a(list, kVar, j2Var, r2Var);
            }
        });
        this.f10195b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10197d ? "Selective Init " : "");
        sb2.append("Ad Units");
        setTitle(sb2.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f10198e = listView;
        listView.setAdapter((ListAdapter) this.f10195b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        final n nVar = (n) list.get(j2Var.a());
        if (nVar.g().size() == 1) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.sd
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(nVar, null, null, kVar);
                }
            });
        } else {
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.td
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(nVar, kVar);
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(r2.a(r2.c.DETAIL).b(StringUtils.createSpannedString(nVar.d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
