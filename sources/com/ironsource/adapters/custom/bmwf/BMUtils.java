package com.ironsource.adapters.custom.bmwf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.CustomParams;
import io.bidmachine.PriceFloorParams;
import java.util.Map;
import zb.f;

/* JADX INFO: loaded from: classes6.dex */
public class BMUtils {

    @NonNull
    private static final String MEDIATION_MODE = "mediation_mode";

    @NonNull
    private static final String MEDIATION_MODE_WATERFALL_IS = "waterfall_is";

    @NonNull
    private static final String TAG = "BMWF";

    @NonNull
    public static AdPlacementConfig.Builder applyConfigParams(@NonNull AdPlacementConfig.Builder builder, @NonNull AdData adData) {
        String string = getString(adData.getConfiguration(), "placementId");
        if (!TextUtils.isEmpty(string)) {
            builder.withPlacementId(string);
        }
        builder.withCustomParams(new CustomParams().m7753addParam(MEDIATION_MODE, MEDIATION_MODE_WATERFALL_IS));
        return builder;
    }

    @Nullable
    public static Boolean castToBooleanOrNull(@Nullable Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    @Nullable
    public static Double castToDoubleOrNull(@Nullable Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    @Nullable
    public static Float castToFloatOrNull(@Nullable Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return null;
    }

    @Nullable
    public static Integer castToIntegerOrNull(@Nullable Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    @Nullable
    public static String castToStringOrNull(@Nullable Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public static Boolean getBoolean(@Nullable Map<String, Object> map, @Nullable String str) {
        return toBooleanOrNull(getValue(map, str), null);
    }

    @Nullable
    public static Double getDouble(@Nullable Map<String, Object> map, @Nullable String str) {
        return toDoubleOrNull(getValue(map, str), null);
    }

    @Nullable
    public static Float getFloat(@Nullable Map<String, Object> map, @Nullable String str) {
        return toFloatOrNull(getValue(map, str), null);
    }

    @Nullable
    public static Integer getInteger(@Nullable Map<String, Object> map, @Nullable String str) {
        return toIntegerOrNull(getValue(map, str), null);
    }

    @Nullable
    public static String getString(@Nullable Map<String, Object> map, @Nullable String str) {
        return toStringOrNull(getValue(map, str), null);
    }

    @Nullable
    public static Object getValue(@Nullable Map<String, Object> map, @Nullable String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return map.get(str);
    }

    public static void log(@NonNull IronLog ironLog, @NonNull String str) {
        ironLog.verbose(String.format("[%s] %s", TAG, str));
    }

    public static void logApi(@NonNull String str) {
        log(IronLog.ADAPTER_API, str);
    }

    public static void logApiError(@NonNull String str) {
        logError(IronLog.ADAPTER_API, str);
    }

    public static void logCallback(@NonNull String str) {
        log(IronLog.ADAPTER_CALLBACK, str);
    }

    public static void logCallbackError(@NonNull String str) {
        logError(IronLog.ADAPTER_CALLBACK, str);
    }

    public static void logError(@NonNull IronLog ironLog, @NonNull String str) {
        ironLog.error(String.format("[%s] %s", TAG, str));
    }

    @NonNull
    public static <T extends f> T prepareAdRequest(@NonNull T t10, @NonNull AdData adData) {
        Map<String, Object> configuration = adData.getConfiguration();
        String string = getString(configuration, "placementId");
        Double d10 = getDouble(configuration, "price");
        if (d10 != null) {
            PriceFloorParams priceFloorParams = new PriceFloorParams();
            if (TextUtils.isEmpty(string)) {
                priceFloorParams.m7756addPriceFloor(d10.doubleValue());
            } else {
                priceFloorParams.m7757addPriceFloor(string, d10.doubleValue());
            }
            t10.setPriceFloorParams(priceFloorParams);
        }
        return t10;
    }

    @Nullable
    public static Boolean toBooleanOrNull(@Nullable Object obj, @Nullable Boolean bool) {
        if (obj != null) {
            Boolean boolCastToBooleanOrNull = castToBooleanOrNull(obj);
            if (boolCastToBooleanOrNull != null) {
                return boolCastToBooleanOrNull;
            }
            String strCastToStringOrNull = castToStringOrNull(obj);
            if (strCastToStringOrNull != null) {
                try {
                    return Boolean.valueOf(strCastToStringOrNull);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                    return bool;
                }
            }
        }
        return bool;
    }

    @Nullable
    public static Double toDoubleOrNull(@Nullable Object obj, @Nullable Double d10) {
        if (obj != null) {
            Double dCastToDoubleOrNull = castToDoubleOrNull(obj);
            if (dCastToDoubleOrNull != null) {
                return dCastToDoubleOrNull;
            }
            Integer numCastToIntegerOrNull = castToIntegerOrNull(obj);
            if (numCastToIntegerOrNull != null) {
                return Double.valueOf(numCastToIntegerOrNull.doubleValue());
            }
            String stringOrNull = toStringOrNull(obj, null);
            if (stringOrNull != null) {
                try {
                    return Double.valueOf(stringOrNull);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return d10;
    }

    @Nullable
    public static Float toFloatOrNull(@Nullable Object obj, @Nullable Float f10) {
        if (obj != null) {
            Float fCastToFloatOrNull = castToFloatOrNull(obj);
            if (fCastToFloatOrNull != null) {
                return fCastToFloatOrNull;
            }
            Integer numCastToIntegerOrNull = castToIntegerOrNull(obj);
            if (numCastToIntegerOrNull != null) {
                return Float.valueOf(numCastToIntegerOrNull.floatValue());
            }
            String stringOrNull = toStringOrNull(obj, null);
            if (stringOrNull != null) {
                try {
                    return Float.valueOf(stringOrNull);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return f10;
    }

    @Nullable
    public static Integer toIntegerOrNull(@Nullable Object obj, @Nullable Integer num) {
        if (obj != null) {
            Integer numCastToIntegerOrNull = castToIntegerOrNull(obj);
            if (numCastToIntegerOrNull != null) {
                return numCastToIntegerOrNull;
            }
            Double dCastToDoubleOrNull = castToDoubleOrNull(obj);
            if (dCastToDoubleOrNull != null) {
                return Integer.valueOf(dCastToDoubleOrNull.intValue());
            }
            Float fCastToFloatOrNull = castToFloatOrNull(obj);
            if (fCastToFloatOrNull != null) {
                return Integer.valueOf(fCastToFloatOrNull.intValue());
            }
            String strCastToStringOrNull = castToStringOrNull(obj);
            if (strCastToStringOrNull != null) {
                try {
                    return Integer.valueOf(strCastToStringOrNull);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return num;
    }

    @Nullable
    public static String toStringOrNull(@Nullable Object obj, @Nullable String str) {
        if (obj == null) {
            return str;
        }
        String strCastToStringOrNull = castToStringOrNull(obj);
        if (strCastToStringOrNull != null) {
            return strCastToStringOrNull;
        }
        try {
            return String.valueOf(obj);
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
            return str;
        }
    }

    public static void logCallbackError(@NonNull String str, @NonNull ae.a aVar) {
        logError(IronLog.ADAPTER_CALLBACK, String.format("%s (errorCode - %s, errorMessage - %s)", str, Integer.valueOf(aVar.e()), aVar.g()));
    }
}
