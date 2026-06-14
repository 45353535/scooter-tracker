package com.appodeal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.appodeal.ads.utils.Log;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/AppodealPackageAddedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "onReceive", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", com.taurusx.tax.g.n.f66171o, "Landroid/content/Intent;", "register", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppodealPackageAddedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope = lf.i.a(new Function0() { // from class: com.appodeal.ads.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppodealPackageAddedReceiver.scope_delegate$lambda$0();
        }
    });

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$0() {
        return kotlinx.coroutines.i.a(eg.o0.b().plus(new eg.e0("ApdPackageAddedReceiver")));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Context applicationContext;
        String dataString;
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            boolean z10 = h2.f13367a;
            if (j2.w() >= 21 && Intrinsics.areEqual(intent.getAction(), "android.intent.action.PACKAGE_ADDED") && (applicationContext = context.getApplicationContext()) != null && (dataString = intent.getDataString()) != null && (listSplit$default = StringsKt.split$default(dataString, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null)) != null && (str = (String) CollectionsKt.getOrNull(listSplit$default, 1)) != null) {
                eg.i.d(getScope(), null, null, new p7(applicationContext, str, null), 3, null);
            }
        } catch (Throwable th2) {
            Log.log(th2);
        }
    }

    public final void register(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(this, intentFilter);
            } catch (Throwable th2) {
                Log.log(th2);
            }
        }
    }
}
