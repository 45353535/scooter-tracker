package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TokenToBitSet {
    public static final String HIGH_PAGE_COUNT_EXCEPTION_TAG = "HighPageCountException";
    private final StringManipulations stringManipulations = new StringManipulations();

    public OpenBitSet convert(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrHexToByte = this.stringManipulations.hexToByte(str);
            if (bArrHexToByte == null) {
                return null;
            }
            return createOpenBitSet(createDataInput(bArrHexToByte));
        } catch (Exception e10) {
            if (e10.getMessage() != null && e10.getMessage().contains(HIGH_PAGE_COUNT_EXCEPTION_TAG)) {
                System.err.println("HighPageCountException (PLM-2573) " + e10.getMessage() + ", bad bloom token: " + str);
            }
            return null;
        }
    }

    protected DataInput createDataInput(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    protected abstract OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException;

    protected void fillBitSet(DataInput dataInput, OpenBitSet openBitSet, long j10) throws IOException {
        int pageCount = openBitSet.getPageCount();
        for (int i10 = 0; i10 < pageCount; i10++) {
            long[] page = openBitSet.getPage(i10);
            int i11 = 0;
            while (true) {
                if (i11 < 4096) {
                    long j11 = j10 - 1;
                    if (j10 <= 0) {
                        j10 = j11;
                        break;
                    } else {
                        page[i11] = dataInput.readLong();
                        i11++;
                        j10 = j11;
                    }
                }
            }
        }
    }
}
