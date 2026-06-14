package net.pubnative.lite.sdk.vpaid.helpers;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidBmpUtil {
    private final int BMP_WIDTH_OF_TIMES = 4;
    private final int BYTE_PER_PIXEL = 3;

    private boolean isBitmapWidthLastPixcel(int i10, int i11) {
        return i11 > 0 && i11 % (i10 - 1) == 0;
    }

    private boolean isBmpWidth4Times(int i10) {
        return i10 % 4 > 0;
    }

    private byte[] write24BitForPixcel(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((65280 & i10) >> 8), (byte) ((i10 & 16711680) >> 16)};
    }

    private byte[] writeInt(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((65280 & i10) >> 8), (byte) ((16711680 & i10) >> 16), (byte) ((i10 & ViewCompat.MEASURED_STATE_MASK) >> 24)};
    }

    private byte[] writeShort(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 & 65280) >> 8)};
    }

    public boolean save(Bitmap bitmap, String str) {
        byte[] bArr;
        int i10;
        boolean z10;
        if (bitmap == null || str == null) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (isBmpWidth4Times(width)) {
            i10 = 4 - (width % 4);
            int i11 = i10 * 3;
            bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i12] = -1;
            }
            z10 = true;
        } else {
            bArr = null;
            i10 = 0;
            z10 = false;
        }
        byte[] bArr2 = bArr;
        int i13 = width * height;
        int[] iArr = new int[i13];
        int i14 = (i13 * 3) + (i10 * height * 3);
        int i15 = i14 + 54;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i15);
        try {
            byteBufferAllocate.put((byte) 66);
            byteBufferAllocate.put((byte) 77);
            byteBufferAllocate.put(writeInt(i15));
            byteBufferAllocate.put(writeShort((short) 0));
            byteBufferAllocate.put(writeShort((short) 0));
            byteBufferAllocate.put(writeInt(54));
            byteBufferAllocate.put(writeInt(40));
            byteBufferAllocate.put(writeInt(width));
            byteBufferAllocate.put(writeInt(height));
            byteBufferAllocate.put(writeShort((short) 1));
            byteBufferAllocate.put(writeShort((short) 24));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(i14));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            while (height > 0) {
                int i16 = height * width;
                for (int i17 = (height - 1) * width; i17 < i16; i17++) {
                    byteBufferAllocate.put(write24BitForPixcel(iArr[i17]));
                    if (z10 && isBitmapWidthLastPixcel(width, i17)) {
                        byteBufferAllocate.put(bArr2);
                    }
                }
                height--;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteBufferAllocate.array());
            fileOutputStream.close();
            return true;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
