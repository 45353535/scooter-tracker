package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/bidmachine/SimpleContextProvider;", "Lio/bidmachine/ContextProvider;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "getActivity", "Landroid/app/Activity;", "getApplicationContext", "getContext", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SimpleContextProvider implements ContextProvider {

    @NotNull
    private final Context applicationContext;

    public SimpleContextProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    @Nullable
    public Activity getActivity() {
        return n1.a();
    }

    @Override // io.bidmachine.ContextProvider
    @NotNull
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    @NotNull
    public Context getContext() {
        return this.applicationContext;
    }
}
