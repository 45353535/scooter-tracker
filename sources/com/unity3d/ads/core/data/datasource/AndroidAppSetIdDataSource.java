package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import hg.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_appSetIdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "appSetId", "getAppSetId", "()Ljava/lang/String;", "isCollecting", "", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final MutableStateFlow _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final MutableStateFlow isCollecting;

    public AndroidAppSetIdDataSource(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = l0.a(Boolean.FALSE);
        this._appSetIdFlow = l0.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Nullable
    public final String getAppSetId() {
        return (String) this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this.isCollecting;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!mutableStateFlow.b(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final Function1<AppSetIdInfo, Unit> function1 = new Function1<AppSetIdInfo, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.invoke.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppSetIdInfo appSetIdInfo2) {
                    invoke2(appSetIdInfo2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AppSetIdInfo appSetIdInfo2) {
                    String id2 = appSetIdInfo2.getId();
                    Intrinsics.checkNotNullExpressionValue(id2, "it.id");
                    AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(id2);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AndroidAppSetIdDataSource.invoke$lambda$1(function1, obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
