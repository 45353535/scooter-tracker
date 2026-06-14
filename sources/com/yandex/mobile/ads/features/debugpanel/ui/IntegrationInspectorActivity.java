package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import lf.i;
import yads.b90;
import yads.d90;
import yads.di3;
import yads.ga1;
import yads.ia1;
import yads.ka1;
import yads.l80;
import yads.la1;
import yads.m70;
import yads.na1;
import yads.o80;
import yads.r80;
import yads.va1;
import yads.vs;
import yads.z60;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/ads/features/debugpanel/ui/IntegrationInspectorActivity;", "Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lyads/va1;", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class IntegrationInspectorActivity extends BaseActivity<va1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f68255d = i.a(new ga1(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f68256e = i.a(new na1(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f68257f = i.a(new la1(this));

    public static final z60 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (z60) integrationInspectorActivity.f68255d.getValue();
    }

    public static final b90 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (b90) integrationInspectorActivity.f68257f.getValue();
    }

    public static final d90 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (d90) integrationInspectorActivity.f68256e.getValue();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(o80.f114217a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(l80.f112999a);
        CoroutineScope coroutineScopeA = getF68253a();
        eg.i.d(coroutineScopeA, null, null, new ia1(this, null), 3, null);
        eg.i.d(coroutineScopeA, null, null, new ka1(this, null), 3, null);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    protected final void onDestroy() {
        m70 m70Var = (m70) ((z60) this.f68255d.getValue()).f118573r.getValue();
        Iterator it = m70Var.f113343b.iterator();
        while (it.hasNext()) {
            ((vs) it.next()).cancel();
        }
        m70Var.f113343b.clear();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(r80.f115365a);
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new View.OnClickListener() { // from class: l8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationInspectorActivity.a(this.f94080b, view);
            }
        });
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final di3 c() {
        return ((z60) this.f68255d.getValue()).a();
    }
}
