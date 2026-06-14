package io.bidmachine.analytics.internal.w;

import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;
import lf.m;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

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

    public static final ErrorReasonAnalytics a(e.a aVar) {
        switch (a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_INVALID;
            case 2:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED;
            case 3:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT;
            case 4:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT;
            case 5:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_UNDEFINED;
            case 6:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_CONTENT;
            case 7:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT;
            case 8:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_ACCESS;
            default:
                throw new m();
        }
    }
}
