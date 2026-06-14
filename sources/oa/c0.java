package oa;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f96490a;

    public c0(s sVar) {
        this.f96490a = sVar;
    }

    @Override // oa.s
    public boolean advancePeekPosition(int i10, boolean z10) {
        return this.f96490a.advancePeekPosition(i10, z10);
    }

    @Override // oa.s
    public long getLength() {
        return this.f96490a.getLength();
    }

    @Override // oa.s
    public long getPeekPosition() {
        return this.f96490a.getPeekPosition();
    }

    @Override // oa.s
    public long getPosition() {
        return this.f96490a.getPosition();
    }

    @Override // oa.s
    public int peek(byte[] bArr, int i10, int i11) {
        return this.f96490a.peek(bArr, i10, i11);
    }

    @Override // oa.s
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f96490a.peekFully(bArr, i10, i11, z10);
    }

    @Override // oa.s, n9.h
    public int read(byte[] bArr, int i10, int i11) {
        return this.f96490a.read(bArr, i10, i11);
    }

    @Override // oa.s
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f96490a.readFully(bArr, i10, i11, z10);
    }

    @Override // oa.s
    public void resetPeekPosition() {
        this.f96490a.resetPeekPosition();
    }

    @Override // oa.s
    public int skip(int i10) {
        return this.f96490a.skip(i10);
    }

    @Override // oa.s
    public void skipFully(int i10) {
        this.f96490a.skipFully(i10);
    }

    @Override // oa.s
    public void advancePeekPosition(int i10) {
        this.f96490a.advancePeekPosition(i10);
    }

    @Override // oa.s
    public void peekFully(byte[] bArr, int i10, int i11) {
        this.f96490a.peekFully(bArr, i10, i11);
    }

    @Override // oa.s
    public void readFully(byte[] bArr, int i10, int i11) {
        this.f96490a.readFully(bArr, i10, i11);
    }
}
