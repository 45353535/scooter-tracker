package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements l1, co2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f109688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f109689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f109690c;

    public d1(e1 e1Var) {
        this.f109688a = e1Var;
    }

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        boolean z10 = lb1.f113032a;
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !Intrinsics.areEqual(string, this.f109690c)) {
            return;
        }
        this.f109688a.b();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        Objects.toString(activity);
        boolean z10 = lb1.f113032a;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(activity);
        boolean z11 = false;
        boolean z12 = hr2VarA != null && hr2VarA.h();
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
            z11 = true;
        }
        WeakReference weakReference = this.f109689b;
        if ((weakReference == null || !Intrinsics.areEqual(activity, (Activity) weakReference.get()) || z12) && (!z12 || z11)) {
            return;
        }
        this.f109688a.b();
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        Objects.toString(activity);
        boolean z10 = lb1.f113032a;
        if (this.f109689b == null) {
            this.f109689b = new WeakReference(activity);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        boolean z10 = lb1.f113032a;
        if (bundle == null || (weakReference = this.f109689b) == null || !Intrinsics.areEqual(activity, (Activity) weakReference.get())) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.f109690c = string;
        bundle.putString("monetization_ads_activity_id", string);
    }
}
