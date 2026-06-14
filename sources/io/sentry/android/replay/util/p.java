package io.sentry.android.replay.util;

import android.os.Build;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f83172a = new p();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SOC_MODEL = new a("SOC_MODEL", 0);
        public static final a SOC_MANUFACTURER = new a("SOC_MANUFACTURER", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SOC_MODEL, SOC_MANUFACTURER};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = qf.a.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private p() {
    }

    public static /* synthetic */ String b(p pVar, a aVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return pVar.a(aVar, str);
    }

    public final String a(a key, String defaultValue) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return defaultValue;
        }
        int i10 = b.$EnumSwitchMapping$0[key.ordinal()];
        if (i10 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i10 != 2) {
                throw new lf.m();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.checkNotNull(str);
        return str;
    }
}
