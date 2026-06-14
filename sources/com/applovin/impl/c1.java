package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.d1;
import com.applovin.impl.s2;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d1 f8480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f8481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f8482c;

    class a implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f8483a;

        /* JADX INFO: renamed from: com.applovin.impl.c1$a$a, reason: collision with other inner class name */
        class C0169a implements d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2 f8485a;

            C0169a(j2 j2Var) {
                this.f8485a = j2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((q1) c1.this.f8480a.d().get(this.f8485a.a()), c1.this.f8480a.e());
            }
        }

        a(c cVar) {
            this.f8483a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != d1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(c1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f8483a, new C0169a(j2Var));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f8481b = (FrameLayout) findViewById(android.R.id.content);
        this.f8482c = (ListView) findViewById(R.id.listView);
        e8.a(this.f8481b, com.applovin.impl.sdk.k.C0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.f8480a;
        if (d1Var != null) {
            d1Var.a((s2.a) null);
            this.f8480a.g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        d1 d1Var = this.f8480a;
        if (d1Var == null) {
            finish();
            return;
        }
        this.f8482c.setAdapter((ListAdapter) d1Var);
        d1 d1Var2 = this.f8480a;
        if (d1Var2 != null && !d1Var2.e().y().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        d1 d1Var3 = this.f8480a;
        if (d1Var3 == null || !d1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(d1 d1Var, c cVar) {
        this.f8480a = d1Var;
        d1Var.a(new a(cVar));
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f8481b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8481b.bringChildToFront(textView);
    }
}
