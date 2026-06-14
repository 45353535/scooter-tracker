package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gg.m;
import gg.t;
import gg.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgg/v;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {610}, m = "invokeSuspend")
final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends k implements Function2<v, Continuation, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, continuation);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull v vVar, @Nullable Continuation continuation) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            final v vVar = (v) this.L$0;
            final r0 r0Var = new r0();
            double streamVolume = this.this$0.getStreamVolume(3);
            r0Var.f93327b = streamVolume;
            m.b(vVar, new VolumeSettingsChange.VolumeChange(streamVolume));
            final t0 t0Var = new t0();
            int ringerMode = this.this$0.getRingerMode();
            t0Var.f93331b = ringerMode;
            m.b(vVar, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r42 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    super.onChange(selfChange);
                    double streamVolume2 = androidDynamicDeviceInfoDataSource.getStreamVolume(3);
                    r0 r0Var2 = r0Var;
                    if (streamVolume2 != r0Var2.f93327b) {
                        r0Var2.f93327b = streamVolume2;
                        m.b(vVar, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = androidDynamicDeviceInfoDataSource.getRingerMode();
                    t0 t0Var2 = t0Var;
                    if (ringerMode2 != t0Var2.f93331b) {
                        t0Var2.f93331b = ringerMode2;
                        m.b(vVar, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r42);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidDynamicDeviceInfoDataSource2.getContext().getContentResolver().unregisterContentObserver(r42);
                }
            };
            this.label = 1;
            if (t.b(vVar, function0, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }
}
