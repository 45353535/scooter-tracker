package com.mobilefuse.sdk.identity;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.utils.SharedPreferenceFactoryKt;
import com.taurusx.tax.f.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J\u001c\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016J@\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidPrefsDataStore;", "Lcom/mobilefuse/sdk/identity/EidDataStore;", "sharedPrefs", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "(Lkotlin/jvm/functions/Function0;)V", "getSharedPrefs", "()Lkotlin/jvm/functions/Function0;", "getMapFromPrefs", "", "", "prefsMapKey", "prefsMapItemKeyPrefix", "loadEidOverrides", "loadSdkEids", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "removeMapFromPrefs", "", "prefs", "prefsEdit", "Landroid/content/SharedPreferences$Editor;", "storeEidOverrides", "eids", "storeMapInPrefs", "map", "storeSdkEids", "eidData", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class EidPrefsDataStore implements EidDataStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EID_DATA_PARTNERS_KEY = "eid_data_partners";

    @NotNull
    public static final String EID_DATA_PARTNERS_KEY_PREFIX = "eid_";

    @NotNull
    public static final String EID_MFX_PAYLOAD_KEY = "mfx_payload";

    @NotNull
    public static final String EID_MFX_REFRESH_TIMESTAMP_KEY = "mfx_refresh_timestamp";

    @NotNull
    public static final String EID_OVERRIDE_PARTNERS_KEY = "eid_override_partners";

    @NotNull
    public static final String EID_OVERRIDE_PARTNER_KEY_PREFIX = "eid_override_";

    @NotNull
    public static final String EID_USER_PAYLOAD_KEY = "user_payload";

    @NotNull
    private final Function0<SharedPreferences> sharedPrefs;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0016\u0010\u0010\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidPrefsDataStore$Companion;", "", "()V", "EID_DATA_PARTNERS_KEY", "", "getEID_DATA_PARTNERS_KEY$mobilefuse_sdk_core_release$annotations", "EID_DATA_PARTNERS_KEY_PREFIX", "getEID_DATA_PARTNERS_KEY_PREFIX$mobilefuse_sdk_core_release$annotations", "EID_MFX_PAYLOAD_KEY", "getEID_MFX_PAYLOAD_KEY$mobilefuse_sdk_core_release$annotations", "EID_MFX_REFRESH_TIMESTAMP_KEY", "getEID_MFX_REFRESH_TIMESTAMP_KEY$mobilefuse_sdk_core_release$annotations", "EID_OVERRIDE_PARTNERS_KEY", "getEID_OVERRIDE_PARTNERS_KEY$mobilefuse_sdk_core_release$annotations", "EID_OVERRIDE_PARTNER_KEY_PREFIX", "getEID_OVERRIDE_PARTNER_KEY_PREFIX$mobilefuse_sdk_core_release$annotations", "EID_USER_PAYLOAD_KEY", "getEID_USER_PAYLOAD_KEY$mobilefuse_sdk_core_release$annotations", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_DATA_PARTNERS_KEY$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_DATA_PARTNERS_KEY_PREFIX$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_MFX_PAYLOAD_KEY$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_MFX_REFRESH_TIMESTAMP_KEY$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_OVERRIDE_PARTNERS_KEY$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_OVERRIDE_PARTNER_KEY_PREFIX$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEID_USER_PAYLOAD_KEY$mobilefuse_sdk_core_release$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EidPrefsDataStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Map<String, String> getMapFromPrefs(String prefsMapKey, String prefsMapItemKeyPrefix) {
        Either errorResult;
        Object value;
        Map mapEmptyMap;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            if (sharedPreferencesInvoke == null) {
                mapEmptyMap = MapsKt.emptyMap();
            } else {
                Set<String> stringSet = sharedPreferencesInvoke.getStringSet(prefsMapKey, SetsKt.emptySet());
                if (stringSet == null) {
                    return MapsKt.emptyMap();
                }
                Intrinsics.checkNotNullExpressionValue(stringSet, "prefs.getStringSet(prefs…t()) ?: return emptyMap()");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (prefsMapItemKeyPrefix == null) {
                    prefsMapItemKeyPrefix = "";
                }
                for (String str : stringSet) {
                    if (str != null && str.length() != 0) {
                        String string = sharedPreferencesInvoke.getString(prefsMapItemKeyPrefix + str, null);
                        if (string != null && string.length() != 0) {
                            Pair pair = TuplesKt.to(str, string);
                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        }
                    }
                }
                mapEmptyMap = linkedHashMap;
            }
            errorResult = new SuccessResult(mapEmptyMap);
        } catch (Throwable th2) {
            if (EidPrefsDataStore$getMapFromPrefs$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = MapsKt.emptyMap();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Map) value;
    }

    static /* synthetic */ Map getMapFromPrefs$default(EidPrefsDataStore eidPrefsDataStore, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return eidPrefsDataStore.getMapFromPrefs(str, str2);
    }

    private final void removeMapFromPrefs(String prefsMapKey, SharedPreferences prefs, SharedPreferences.Editor prefsEdit, String prefsMapItemKeyPrefix) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Set<String> stringSet = prefs.getStringSet(prefsMapKey, null);
            if (stringSet == null) {
                return;
            }
            prefsEdit.remove(prefsMapKey);
            if (prefsMapItemKeyPrefix == null) {
                prefsMapItemKeyPrefix = "";
            }
            Iterator<T> it = stringSet.iterator();
            while (it.hasNext()) {
                prefsEdit.remove(prefsMapItemKeyPrefix + ((String) it.next()));
            }
        } catch (Throwable th2) {
            int i10 = EidPrefsDataStore$removeMapFromPrefs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    static /* synthetic */ void removeMapFromPrefs$default(EidPrefsDataStore eidPrefsDataStore, String str, SharedPreferences sharedPreferences, SharedPreferences.Editor editor, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        eidPrefsDataStore.removeMapFromPrefs(str, sharedPreferences, editor, str2);
    }

    private final void storeMapInPrefs(String prefsMapKey, SharedPreferences prefs, SharedPreferences.Editor prefsEdit, Map<String, String> map, String prefsMapItemKeyPrefix) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            removeMapFromPrefs(prefsMapKey, prefs, prefsEdit, prefsMapItemKeyPrefix);
            prefsEdit.putStringSet(prefsMapKey, map.keySet());
            if (prefsMapItemKeyPrefix == null) {
                prefsMapItemKeyPrefix = "";
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                prefsEdit.putString(prefsMapItemKeyPrefix + entry.getKey(), entry.getValue());
            }
        } catch (Throwable th2) {
            int i10 = EidPrefsDataStore$storeMapInPrefs$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    static /* synthetic */ void storeMapInPrefs$default(EidPrefsDataStore eidPrefsDataStore, String str, SharedPreferences sharedPreferences, SharedPreferences.Editor editor, Map map, String str2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        eidPrefsDataStore.storeMapInPrefs(str, sharedPreferences, editor, map, str2);
    }

    @NotNull
    public final Function0<SharedPreferences> getSharedPrefs() {
        return this.sharedPrefs;
    }

    @Override // com.mobilefuse.sdk.identity.EidDataStore
    @NotNull
    public Map<String, String> loadEidOverrides() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(getMapFromPrefs(EID_OVERRIDE_PARTNERS_KEY, EID_OVERRIDE_PARTNER_KEY_PREFIX));
        } catch (Throwable th2) {
            if (EidPrefsDataStore$loadEidOverrides$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = MapsKt.emptyMap();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Map) value;
    }

    @Override // com.mobilefuse.sdk.identity.EidDataStore
    @NotNull
    public EidSdkData loadSdkEids() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            if (sharedPreferencesInvoke == null) {
                return new EidSdkData(0L, null, null, null, 15, null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = sharedPreferencesInvoke.getLong(EID_MFX_REFRESH_TIMESTAMP_KEY, -1L);
            return new EidSdkData(j10 < jCurrentTimeMillis ? -1L : j10, getMapFromPrefs(EID_DATA_PARTNERS_KEY, EID_DATA_PARTNERS_KEY_PREFIX), sharedPreferencesInvoke.getString(EID_MFX_PAYLOAD_KEY, null), sharedPreferencesInvoke.getString(EID_USER_PAYLOAD_KEY, null));
        } catch (Throwable th2) {
            if (EidPrefsDataStore$loadSdkEids$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return new EidSdkData(0L, null, null, null, 15, null);
        }
    }

    @Override // com.mobilefuse.sdk.identity.EidDataStore
    public void storeEidOverrides(@NotNull Map<String, String> eids) {
        Intrinsics.checkNotNullParameter(eids, "eids");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            if (sharedPreferencesInvoke == null) {
                return;
            }
            SharedPreferences.Editor prefsEdit = sharedPreferencesInvoke.edit();
            Intrinsics.checkNotNullExpressionValue(prefsEdit, "prefsEdit");
            storeMapInPrefs(EID_OVERRIDE_PARTNERS_KEY, sharedPreferencesInvoke, prefsEdit, eids, EID_OVERRIDE_PARTNER_KEY_PREFIX);
            prefsEdit.commit();
        } catch (Throwable th2) {
            int i10 = EidPrefsDataStore$storeEidOverrides$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Override // com.mobilefuse.sdk.identity.EidDataStore
    public void storeSdkEids(@NotNull EidSdkData eidData) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            if (sharedPreferencesInvoke == null) {
                return;
            }
            SharedPreferences.Editor prefsEdit = sharedPreferencesInvoke.edit();
            prefsEdit.putLong(EID_MFX_REFRESH_TIMESTAMP_KEY, eidData.getMfxRefreshTimestamp());
            prefsEdit.putString(EID_MFX_PAYLOAD_KEY, eidData.getMfxPayload());
            prefsEdit.putString(EID_USER_PAYLOAD_KEY, eidData.getUserPayload());
            Intrinsics.checkNotNullExpressionValue(prefsEdit, "prefsEdit");
            storeMapInPrefs(EID_DATA_PARTNERS_KEY, sharedPreferencesInvoke, prefsEdit, eidData.getSdkEids(), EID_DATA_PARTNERS_KEY_PREFIX);
            prefsEdit.commit();
        } catch (Throwable th2) {
            int i10 = EidPrefsDataStore$storeSdkEids$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EidPrefsDataStore(@NotNull Function0<? extends SharedPreferences> sharedPrefs) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.sharedPrefs = sharedPrefs;
    }

    public /* synthetic */ EidPrefsDataStore(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? SharedPreferenceFactoryKt.createLazySharedPrefs("com.mobilefuse.sdk.eid") : function0);
    }
}
