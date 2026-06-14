package com.amazon.device.ads;

import android.util.Base64;
import com.amazon.device.ads.AdRegistration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class DTBGDPREncoder {
    private static final int AMAZON_CONSENT_STRING_VERSION_VALUE = 1;
    private static final int CMP_INDICATOR_RANGE = 4;
    private static final int CMP_INDICATOR_START_INDEX = 11;
    private static final int CONSENT_STATUS_INDICATOR_RANGE = 3;
    private static final int CONSENT_STATUS_START_INDEX = 15;
    private static final int CONSENT_STRING_VERSION_INDICATOR_RANGE = 5;
    private static final int CONSENT_STRING_VERSION_START_INDEX = 6;
    private static final int EXPLICIT_NO_VALUE = 0;
    private static final int EXPLICIT_YES_VALUE = 7;
    private static final int GOOGLE_CMP_VALUE = 1;
    private static final int MAX_VENDOR_ID_INDICATOR_RANGE = 14;
    private static final int MAX_VENDOR_ID_START_INDEX = 18;
    private static final int MOPUB_CMP_VALUE = 2;
    private static final int TOTAL_NUMBER_OF_BITS_FOR_META_INFO = 32;
    private static final int UNKNOWN_CONSENT_STATUS_VALUE = 1;

    DTBGDPREncoder() {
    }

    static String getBinaryStringBasedOnPositions(List<Integer> list) {
        if (list.isEmpty()) {
            return "";
        }
        int iIntValue = ((Integer) Collections.max(list)).intValue() + 1;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            sb2.append("0");
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb2.setCharAt(it.next().intValue(), '1');
        }
        return sb2.toString();
    }

    static String getEncodedBinaryString(List<Integer> list) {
        String binaryStringBasedOnPositions = getBinaryStringBasedOnPositions(list);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            sb2.append("0");
        }
        setBitSetBasedOnConsentStringVersion(sb2);
        setBitSetBasedOnCMPFlavor(sb2);
        setBitSetBasedOnConsentStatus(sb2);
        if (binaryStringBasedOnPositions.length() >= 1) {
            setBitSetBasedOnMaxVendorID(sb2, binaryStringBasedOnPositions.length() - 1);
        }
        sb2.append(binaryStringBasedOnPositions);
        return sb2.toString();
    }

    static String getEncodedNonIABConsentString(List<Integer> list) {
        String encodedBinaryString = getEncodedBinaryString(list);
        int length = encodedBinaryString.length();
        byte[] bArr = new byte[(length / 8) + ((length % 8 == 0 ? 1 : 0) ^ 1)];
        for (int i10 = 0; i10 < length; i10++) {
            if (encodedBinaryString.charAt(i10) == '1') {
                setBit(bArr, i10);
            } else {
                unsetBit(bArr, i10);
            }
        }
        return Base64.encodeToString(bArr, 11).trim();
    }

    static String getValidPaddedStringForInt(int i10, int i11) {
        String binaryString = Integer.toBinaryString(i10);
        String str = "";
        for (int i12 = 0; i12 < i11 - binaryString.length(); i12++) {
            str = str + "0";
        }
        return str + binaryString;
    }

    static void setBit(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        bArr[i11] = (byte) ((1 << ((((i11 + 1) * 8) - i10) - 1)) | bArr[i11]);
    }

    static void setBitSetBasedOnCMPFlavor(StringBuilder sb2) {
        AdRegistration.CMPFlavor cMPFlavor = AdRegistration.getCMPFlavor();
        if (cMPFlavor == AdRegistration.CMPFlavor.GOOGLE_CMP || cMPFlavor == AdRegistration.CMPFlavor.ADMOB_CMP) {
            sb2.replace(11, 15, getValidPaddedStringForInt(1, 4));
        } else if (cMPFlavor == AdRegistration.CMPFlavor.MOPUB_CMP) {
            sb2.replace(11, 15, getValidPaddedStringForInt(2, 4));
        }
    }

    static void setBitSetBasedOnConsentStatus(StringBuilder sb2) {
        AdRegistration.ConsentStatus consentStatus = AdRegistration.getConsentStatus();
        if (consentStatus == AdRegistration.ConsentStatus.EXPLICIT_YES) {
            sb2.replace(15, 18, getValidPaddedStringForInt(7, 3));
        } else if (consentStatus == AdRegistration.ConsentStatus.EXPLICIT_NO) {
            sb2.replace(15, 18, getValidPaddedStringForInt(0, 3));
        } else {
            sb2.replace(15, 18, getValidPaddedStringForInt(1, 3));
        }
    }

    static void setBitSetBasedOnConsentStringVersion(StringBuilder sb2) {
        sb2.replace(6, 11, getValidPaddedStringForInt(1, 5));
    }

    static void setBitSetBasedOnMaxVendorID(StringBuilder sb2, int i10) {
        sb2.replace(18, 32, getValidPaddedStringForInt(i10, 14));
    }

    static void unsetBit(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        bArr[i11] = (byte) ((~(1 << ((((i11 + 1) * 8) - i10) - 1))) & bArr[i11]);
    }
}
