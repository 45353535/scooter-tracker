package com.facebook.internal;

import android.R;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.internal.h;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f19865a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f19866b = new HashMap();

    public interface a {
        void a(boolean z10);
    }

    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        StdParamEnforcement(R.attr.trimPathEnd),
        BannedParamFiltering(R.attr.trimPathOffset),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        IapLoggingLib5To7(67330),
        AndroidManualImplicitPurchaseDedupe(67331),
        AndroidManualImplicitSubsDedupe(67332),
        AndroidIAPSubscriptionAutoLogging(67333),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED),
        GPSARATriggers(393216),
        GPSPACAProcessing(458752),
        GPSTopicsObservation(524288),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f19867c = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19891b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i10) {
                for (b bVar : b.values()) {
                    if (bVar.f19891b == i10) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.facebook.internal.e$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0334b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.Core.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.AppEvents.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.CodelessEvents.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.Instrument.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.CrashReport.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.CrashShield.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b.ThreadCheck.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[b.ErrorReport.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[b.AnrReport.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[b.AAM.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[b.CloudBridge.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[b.PrivacyProtection.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[b.SuggestedEvents.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[b.IntelligentIntegrity.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[b.StdParamEnforcement.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[b.ProtectedMode.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[b.BannedParamFiltering.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[b.MACARuleMatching.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[b.BlocklistEvents.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[b.FilterRedactedEvents.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[b.FilterSensitiveParams.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[b.ModelRequest.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[b.EventDeactivation.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[b.OnDeviceEventProcessing.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[b.IapLogging.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[b.IapLoggingLib2.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[b.IapLoggingLib5To7.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[b.AndroidManualImplicitPurchaseDedupe.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[b.AndroidManualImplicitSubsDedupe.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[b.AndroidIAPSubscriptionAutoLogging.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[b.Monitoring.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[b.Megatron.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[b.Elora.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[b.GPSARATriggers.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[b.GPSPACAProcessing.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[b.GPSTopicsObservation.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[b.ServiceUpdateCompliance.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[b.Login.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[b.BypassAppSwitch.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[b.Share.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(int i10) {
            this.f19891b = i10;
        }

        public final b h() {
            int i10 = this.f19891b;
            return (i10 & 255) > 0 ? f19867c.a(i10 & (-256)) : (65280 & i10) > 0 ? f19867c.a(i10 & SupportMenu.CATEGORY_MASK) : (16711680 & i10) > 0 ? f19867c.a(i10 & ViewCompat.MEASURED_STATE_MASK) : f19867c.a(0);
        }

        public final String i() {
            return "FBSDKFeature" + this;
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C0334b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "StdParamEnforcement";
                case 17:
                    return "ProtectedMode";
                case 18:
                    return "BannedParamFiltering";
                case 19:
                    return "MACARuleMatching";
                case 20:
                    return "BlocklistEvents";
                case 21:
                    return "FilterRedactedEvents";
                case 22:
                    return "FilterSensitiveParams";
                case 23:
                    return "ModelRequest";
                case 24:
                    return "EventDeactivation";
                case 25:
                    return "OnDeviceEventProcessing";
                case 26:
                    return "OnDevicePostInstallEventProcessing";
                case 27:
                    return "IAPLogging";
                case 28:
                    return "IAPLoggingLib2";
                case 29:
                    return "IAPLoggingLib5To7";
                case 30:
                    return "AndroidManualImplicitPurchaseDedupe";
                case 31:
                    return "AndroidManualImplicitSubsDedupe";
                case 32:
                    return "AndroidIAPSubscriptionAutoLogging";
                case 33:
                    return "Monitoring";
                case 34:
                    return "Megatron";
                case 35:
                    return "Elora";
                case 36:
                    return "GPSARATriggers";
                case 37:
                    return "GPSPACAProcessing";
                case 38:
                    return "GPSTopicsObservation";
                case 39:
                    return "ServiceUpdateCompliance";
                case 40:
                    return "LoginKit";
                case 41:
                    return "ChromeCustomTabsPrefetching";
                case 42:
                    return "IgnoreAppSwitchToLoggedOut";
                case 43:
                    return "BypassAppSwitch";
                case 44:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Instrument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.ErrorReport.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.AnrReport.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.AAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.CloudBridge.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.PrivacyProtection.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.SuggestedEvents.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.IntelligentIntegrity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.ModelRequest.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.EventDeactivation.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[b.IapLogging.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[b.IapLoggingLib2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[b.IapLoggingLib5To7.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[b.AndroidManualImplicitPurchaseDedupe.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[b.AndroidManualImplicitSubsDedupe.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[b.AndroidIAPSubscriptionAutoLogging.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[b.BannedParamFiltering.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[b.ProtectedMode.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[b.StdParamEnforcement.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[b.MACARuleMatching.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[b.BlocklistEvents.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[b.FilterRedactedEvents.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[b.FilterSensitiveParams.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[b.Monitoring.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[b.BypassAppSwitch.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[b.GPSARATriggers.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[b.GPSPACAProcessing.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[b.GPSTopicsObservation.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f19892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f19893b;

        d(a aVar, b bVar) {
            this.f19892a = aVar;
            this.f19893b = bVar;
        }

        @Override // com.facebook.internal.h.a
        public void onCompleted() {
            this.f19892a.a(e.g(this.f19893b));
        }
    }

    private e() {
    }

    public static final void a(b feature, a callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        h.h(new d(callback, feature));
    }

    private final boolean b(b bVar) {
        switch (c.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                return false;
            default:
                return true;
        }
    }

    public static final void c(b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.s.m().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.i(), com.facebook.s.z()).apply();
    }

    public static final b d(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        f19865a.f();
        for (Map.Entry entry : f19866b.entrySet()) {
            b bVar = (b) entry.getKey();
            for (String str : (String[]) entry.getValue()) {
                if (StringsKt.a0(className, str, false, 2, null)) {
                    return bVar;
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        return h.d(bVar.i(), com.facebook.s.n(), b(bVar));
    }

    private final synchronized void f() {
        Map map = f19866b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(b.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(b.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(b.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            map.put(b.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
            map.put(b.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
            map.put(b.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
        }
    }

    public static final boolean g(b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        String string = com.facebook.s.m().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.i(), null);
        if (string != null && Intrinsics.areEqual(string, com.facebook.s.z())) {
            return false;
        }
        b bVarH = feature.h();
        return bVarH == feature ? f19865a.e(feature) : g(bVarH) && f19865a.e(feature);
    }
}
