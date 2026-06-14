package com.yandex.mobile.ads.common;

import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import kotlin.Metadata;
import yads.a2;
import yads.b2;
import yads.c2;
import yads.s82;
import yads.w1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/ads/common/AdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class AdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s82 f68178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f68179b;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w1 w1Var = this.f68179b;
        if (w1Var == null || w1Var.f117269c.d()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f68179b;
        if (w1Var != null) {
            b2 b2Var = w1Var.f117270d;
            b2Var.getClass();
            int i10 = configuration.orientation;
            if (i10 != b2Var.f108891c) {
                Iterator it = b2Var.f108889a.iterator();
                if (it.hasNext()) {
                    a2.a(it.next());
                    throw null;
                }
                b2Var.f108891c = i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.common.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        w1 w1Var = this.f68179b;
        if (w1Var != null) {
            w1Var.f117269c.onAdClosed();
            w1Var.f117269c.g();
            w1Var.f117268b.removeAllViews();
        }
        s82 s82Var = this.f68178a;
        if (s82Var != null) {
            s82Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        w1 w1Var = this.f68179b;
        if (w1Var != null) {
            w1Var.f117269c.b();
            Iterator it = w1Var.f117270d.f108890b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).b();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        w1 w1Var = this.f68179b;
        if (w1Var != null) {
            w1Var.f117269c.a();
            Iterator it = w1Var.f117270d.f108890b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).a();
            }
        }
    }
}
