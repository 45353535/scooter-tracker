package org.bidon.dtexchange.ext;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InneractiveErrorCode.values().length];
            try {
                iArr[InneractiveErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InneractiveErrorCode.UNKNOWN_APP_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InneractiveErrorCode.CANCELLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InneractiveErrorCode.UNSPECIFIED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BidonError a(InneractiveErrorCode inneractiveErrorCode) {
        switch (inneractiveErrorCode == null ? -1 : a.$EnumSwitchMapping$0[inneractiveErrorCode.ordinal()]) {
            case 1:
                return new BidonError.NoFill(org.bidon.dtexchange.a.a());
            case 2:
            case 3:
            case 4:
                return new BidonError.NetworkError(org.bidon.dtexchange.a.a(), "InneractiveErrorCode: " + inneractiveErrorCode);
            case 5:
            case 6:
                return new BidonError.BidTimedOut(org.bidon.dtexchange.a.a());
            case 7:
            case 8:
            case 9:
                return BidonError.NoAppropriateAdUnitId.INSTANCE;
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
                return new BidonError.Unspecified(org.bidon.dtexchange.a.a(), new Throwable("InneractiveErrorCode: " + inneractiveErrorCode), null, 4, null);
            default:
                return new BidonError.Unspecified(org.bidon.dtexchange.a.a(), new Throwable("InneractiveErrorCode: " + inneractiveErrorCode), null, 4, null);
        }
    }
}
