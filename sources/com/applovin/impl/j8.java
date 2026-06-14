package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.r2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j8 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f9135c;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f9136e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f9136e = list;
        }

        @Override // com.applovin.impl.s2
        protected r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i10) {
            return this.f9136e;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i10) {
            return this.f9136e.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i10) {
            return new v4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r2.a(r2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f9134b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.k kVar) {
        this.f9133a = str;
        this.f9134b = kVar;
        a aVar = new a(this, a(list));
        this.f9135c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f9133a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9135c);
    }
}
