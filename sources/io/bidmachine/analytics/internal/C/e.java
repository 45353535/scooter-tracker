package io.bidmachine.analytics.internal.C;

import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;
import kotlin.Result;
import lf.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.MONITOR_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.MONITOR_NO_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.a.MONITOR_BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.a.READER_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.a.READER_NO_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.a.READER_BAD_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.a.READER_NO_ACCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final JSONObject a(io.bidmachine.analytics.internal.g.e eVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", eVar.a());
        jSONObject.put("type", a(eVar.c()));
        jSONObject.put("reason", eVar.b());
        return jSONObject;
    }

    public static final io.bidmachine.analytics.internal.g.e a(JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new io.bidmachine.analytics.internal.g.e(jSONObject.getString("name"), a(jSONObject.getInt("type")), jSONObject.optString("reason")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (io.bidmachine.analytics.internal.g.e) objB;
    }

    private static final int a(e.a aVar) {
        switch (a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return 2000;
            case 2:
                return 2100;
            case 3:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE;
            case 4:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE;
            case 5:
                return 2200;
            case 6:
                return 2201;
            case 7:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE;
            case 8:
                return 2203;
            default:
                throw new m();
        }
    }

    private static final e.a a(int i10) {
        switch (i10) {
            case 2100:
                return e.a.MONITOR_INVALID;
            case ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE:
                return e.a.MONITOR_NO_CONTENT;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                return e.a.MONITOR_BAD_CONTENT;
            default:
                switch (i10) {
                    case 2200:
                        return e.a.READER_INVALID;
                    case 2201:
                        return e.a.READER_NO_CONTENT;
                    case ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE:
                        return e.a.READER_BAD_CONTENT;
                    case 2203:
                        return e.a.READER_NO_ACCESS;
                    default:
                        return e.a.UNKNOWN;
                }
        }
    }
}
