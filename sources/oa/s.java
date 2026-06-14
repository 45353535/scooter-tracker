package oa;

/* JADX INFO: loaded from: classes12.dex */
public interface s extends n9.h {
    void advancePeekPosition(int i10);

    boolean advancePeekPosition(int i10, boolean z10);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i10, int i11);

    void peekFully(byte[] bArr, int i10, int i11);

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10);

    @Override // n9.h
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10);

    void resetPeekPosition();

    int skip(int i10);

    void skipFully(int i10);
}
