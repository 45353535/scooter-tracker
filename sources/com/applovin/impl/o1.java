package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q1 f9945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f9947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f9948d;

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.f9946b.y().a(this.f9945a));
        String strB = this.f9946b.y().b(this.f9945a);
        if (strB != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f9947c = textView;
        textView.setText(v2Var.toString());
        this.f9947c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f9945a.d() + " - " + this.f9945a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        e8.a(findViewById(android.R.id.content), this.f9946b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f9948d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.bd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8464b.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f9946b.y().a(this.f9945a, (Context) this, false);
        return true;
    }

    public void a(q1 q1Var, com.applovin.impl.sdk.k kVar) {
        this.f9945a = q1Var;
        this.f9946b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f9946b.y().a(this.f9945a, (Context) this, true);
    }

    private boolean a() {
        return (this.f9945a == null || this.f9946b == null) ? false : true;
    }
}
