package pg;

/* JADX INFO: loaded from: classes3.dex */
public interface s extends j {
    long Q(i iVar);

    void c0(i iVar, long j10);

    boolean exhausted();

    a getBuffer();

    int j0(byte[] bArr, int i10, int i11);

    s peek();

    byte readByte();

    boolean request(long j10);

    void require(long j10);
}
