package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes8.dex */
final class zzcic extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzht zzg;
    private zzhf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    zzcic(String str, zzhz zzhzVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzcib(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzht();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzhq {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzo;
                    long j11 = this.zzm;
                    if (j10 == j11) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i12 = this.zzj.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i12;
                    zzh(i12);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzn;
            if (j12 != -1) {
                long j13 = j12 - this.zzp;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j13);
            }
            int i13 = this.zzj.read(bArr, i10, i11);
            if (i13 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i13;
            zzh(i13);
            return i13;
        } catch (IOException e10) {
            throw new zzhq(e10, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x028d, B:98:0x029a, B:100:0x02ab, B:103:0x02b4, B:104:0x02c1, B:106:0x02cb, B:107:0x02d2, B:108:0x02d3, B:109:0x02f0), top: B:116:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029a A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x028d, B:98:0x029a, B:100:0x02ab, B:103:0x02b4, B:104:0x02c1, B:106:0x02cb, B:107:0x02d2, B:108:0x02d3, B:109:0x02f0), top: B:116:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhf r24) throws com.google.android.gms.internal.ads.zzhq {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.zzb(com.google.android.gms.internal.ads.zzhf):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzhq(e10, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgt, com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i10) {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e10) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
