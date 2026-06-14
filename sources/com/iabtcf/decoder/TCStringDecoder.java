package com.iabtcf.decoder;

import com.iabtcf.exceptions.ByteParseException;
import com.iabtcf.exceptions.UnsupportedVersionException;
import com.iabtcf.utils.BitReader;
import com.iabtcf.utils.FieldDefs;
import j$.util.Base64;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes9.dex */
class TCStringDecoder {
    TCStringDecoder() {
    }

    public static TCString decode(String str, DecoderOption... decoderOptionArr) throws ByteParseException, IllegalArgumentException, UnsupportedVersionException {
        TCStringV2 tCStringV2FromBitVector;
        EnumSet enumSetNoneOf = EnumSet.noneOf(DecoderOption.class);
        for (DecoderOption decoderOption : decoderOptionArr) {
            enumSetNoneOf.add(decoderOption);
        }
        String[] strArrSplit = str.split("\\.");
        BitReader bitReaderVectorFromString = vectorFromString(strArrSplit[0]);
        byte bits6 = bitReaderVectorFromString.readBits6(FieldDefs.CORE_VERSION);
        if (bits6 == 1) {
            return TCStringV1.fromBitVector(bitReaderVectorFromString);
        }
        if (bits6 != 2) {
            throw new UnsupportedVersionException("Version " + ((int) bits6) + "is unsupported yet");
        }
        if (strArrSplit.length > 1) {
            BitReader[] bitReaderArr = new BitReader[strArrSplit.length - 1];
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                bitReaderArr[i10 - 1] = vectorFromString(strArrSplit[i10]);
            }
            tCStringV2FromBitVector = TCStringV2.fromBitVector(bitReaderVectorFromString, bitReaderArr);
        } else {
            tCStringV2FromBitVector = TCStringV2.fromBitVector(bitReaderVectorFromString, new BitReader[0]);
        }
        if (!enumSetNoneOf.contains(DecoderOption.LAZY)) {
            tCStringV2FromBitVector.hashCode();
        }
        return tCStringV2FromBitVector;
    }

    static BitReader vectorFromString(String str) {
        return new BitReader(Base64.getUrlDecoder().decode(str));
    }
}
