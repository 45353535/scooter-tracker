package com.appodeal.ads.modules.common.internal.service;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "", y.f66058y, "Passive", "Active", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitializationMode {
    public static final InitializationMode Active;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InitializationMode Passive;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InitializationMode[] f13690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13691c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13692a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InitializationMode$Companion;", "", "", "code", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "get", "(Ljava/lang/String;)Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final InitializationMode get(String code) {
            InitializationMode initializationMode;
            InitializationMode[] initializationModeArrValues = InitializationMode.values();
            int length = initializationModeArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    initializationMode = null;
                    break;
                }
                initializationMode = initializationModeArrValues[i10];
                if (Intrinsics.areEqual(initializationMode.f13692a, code)) {
                    break;
                }
                i10++;
            }
            return initializationMode == null ? InitializationMode.Active : initializationMode;
        }
    }

    static {
        InitializationMode initializationMode = new InitializationMode("Passive", 0, "passive");
        Passive = initializationMode;
        InitializationMode initializationMode2 = new InitializationMode("Active", 1, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        Active = initializationMode2;
        InitializationMode[] initializationModeArr = {initializationMode, initializationMode2};
        f13690b = initializationModeArr;
        f13691c = a.a(initializationModeArr);
        INSTANCE = new Companion(null);
    }

    public InitializationMode(String str, int i10, String str2) {
        this.f13692a = str2;
    }

    public static EnumEntries getEntries() {
        return f13691c;
    }

    public static InitializationMode valueOf(String str) {
        return (InitializationMode) Enum.valueOf(InitializationMode.class, str);
    }

    public static InitializationMode[] values() {
        return (InitializationMode[]) f13690b.clone();
    }
}
