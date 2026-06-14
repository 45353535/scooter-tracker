package z9;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v9.c2;
import z9.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements e0 {
    @Override // z9.e0
    public /* synthetic */ void b(byte[] bArr, c2 c2Var) {
        d0.a(this, bArr, c2Var);
    }

    @Override // z9.e0
    public t9.b createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public int getCryptoType() {
        return 1;
    }

    @Override // z9.e0
    public e0.a getKeyRequest(byte[] bArr, List list, int i10, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public e0.d getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // z9.e0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // z9.e0
    public void release() {
    }

    @Override // z9.e0
    public void a(e0.b bVar) {
    }

    @Override // z9.e0
    public void closeSession(byte[] bArr) {
    }
}
