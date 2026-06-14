package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.s;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import yads.di3;
import yads.en;
import yads.l10;
import yads.va1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lyads/va1;", "T", "Landroid/app/Activity;", "<init>", "()V", "yads/en", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public abstract class BaseActivity<T extends va1> extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineScope f68253a = l10.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private va1 f68254c;

    public BaseActivity() {
        boolean z10 = getLastNonConfigurationInstance() instanceof en;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    protected final CoroutineScope getF68253a() {
        return this.f68253a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final va1 b() {
        va1 va1Var = this.f68254c;
        if (va1Var != null) {
            return va1Var;
        }
        va1 va1VarA = c().a();
        this.f68254c = va1VarA;
        return va1VarA;
    }

    public abstract di3 c();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        en enVar = lastNonConfigurationInstance instanceof en ? (en) lastNonConfigurationInstance : null;
        if (enVar != null) {
            va1 va1Var = enVar.f110424a;
            this.f68254c = s.a(va1Var) ? va1Var : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        va1 va1Var;
        super.onDestroy();
        i.f(this.f68253a, null, 1, null);
        if (isChangingConfigurations() || (va1Var = this.f68254c) == null) {
            return;
        }
        i.f(va1Var.f116918a, null, 1, null);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new en(b());
    }
}
