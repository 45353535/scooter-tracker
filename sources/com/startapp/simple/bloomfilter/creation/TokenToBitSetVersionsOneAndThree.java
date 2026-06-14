package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class TokenToBitSetVersionsOneAndThree extends TokenToBitSet {
    private void incrementInputStreamForBackwordCompatability(DataInput dataInput) {
        try {
            dataInput.readInt();
        } catch (IOException e10) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", e10);
        }
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    protected DataInput createDataInput(byte[] bArr) {
        DataInput dataInputCreateDataInput = super.createDataInput(bArr);
        incrementInputStreamForBackwordCompatability(dataInputCreateDataInput);
        return dataInputCreateDataInput;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    protected OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        long j10 = dataInput.readInt();
        OpenBitSet openBitSet = new OpenBitSet(j10 << 6);
        fillBitSet(dataInput, openBitSet, j10);
        return openBitSet;
    }
}
