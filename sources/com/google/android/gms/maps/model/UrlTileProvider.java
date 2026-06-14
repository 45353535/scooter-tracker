package com.google.android.gms.maps.model;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes8.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    public UrlTileProvider(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @Nullable
    public final Tile getTile(int i10, int i11, int i12) {
        URL tileUrl = getTileUrl(i10, i11, i12);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzh.zzb(4352);
            int i13 = this.zza;
            int i14 = this.zzb;
            int i15 = com.google.android.gms.internal.maps.zze.zzb;
            InputStream inputStream = tileUrl.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i16 = inputStream.read(bArr);
                if (i16 == -1) {
                    Tile tile = new Tile(i13, i14, byteArrayOutputStream.toByteArray());
                    com.google.android.gms.internal.maps.zzh.zza();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, i16);
            }
        } catch (IOException unused) {
            com.google.android.gms.internal.maps.zzh.zza();
            return null;
        } catch (Throwable th2) {
            com.google.android.gms.internal.maps.zzh.zza();
            throw th2;
        }
    }

    @Nullable
    public abstract URL getTileUrl(int i10, int i11, int i12);
}
