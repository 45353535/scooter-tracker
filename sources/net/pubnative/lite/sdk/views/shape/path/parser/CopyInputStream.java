package net.pubnative.lite.sdk.views.shape.path.parser;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
class CopyInputStream {
    private static final String TAG = SvgToPath.TAG;
    private ByteArrayOutputStream _copy;
    private final InputStream _is;

    public CopyInputStream(InputStream inputStream) {
        this._is = inputStream;
        try {
            copy();
        } catch (IOException e10) {
            HyBid.reportException((Exception) e10);
            Log.w(TAG, "IOException in CopyInputStream " + e10.toString());
        }
    }

    private void copy() throws IOException {
        this._copy = new ByteArrayOutputStream();
        byte[] bArr = new byte[256];
        while (true) {
            int i10 = this._is.read(bArr);
            if (-1 == i10) {
                this._copy.flush();
                return;
            }
            this._copy.write(bArr, 0, i10);
        }
    }

    public ByteArrayInputStream getCopy() {
        return new ByteArrayInputStream(this._copy.toByteArray());
    }
}
