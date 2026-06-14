package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import j$.util.Objects;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgck implements zzgce {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgck(ExecutorService executorService, String str, long j10) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j10;
    }

    private final ListenableFuture zze(final String str, final boolean z10, final byte[] bArr, final String str2) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.google.android.gms.internal.ads.zzgch
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.zza.zzc(str, z10, str2, bArr, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(String str, CallbackToFutureAdapter.Completer completer, boolean z10, String str2, byte[] bArr) {
        Throwable th2;
        SocketTimeoutException e10;
        final HttpURLConnection httpURLConnection;
        int responseCode;
        InputStream inputStream;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
            } catch (SocketTimeoutException e11) {
                e10 = e11;
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                Objects.requireNonNull(httpURLConnection);
                completer.addCancellationListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgci
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        httpURLConnection.disconnect();
                    }
                }, this.zza);
                httpURLConnection.setRequestProperty("User-Agent", this.zzb);
                int i10 = (int) this.zzc;
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                if (z10) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("Content-Type", str2);
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.close();
                    } finally {
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            } catch (SocketTimeoutException e12) {
                e10 = e12;
                httpURLConnection2 = httpURLConnection;
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 9);
                sb2.append("Timeout: ");
                sb2.append(message);
                completer.setException(new TimeoutException(sb2.toString()));
                httpURLConnection = httpURLConnection2;
            } catch (Throwable th4) {
                th2 = th4;
                httpURLConnection2 = httpURLConnection;
                completer.setException(th2);
                httpURLConnection = httpURLConnection2;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (inputStream == null) {
                        byteArray = new byte[0];
                        byteArrayOutputStream.close();
                    } else {
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int i11 = inputStream.read(bArr2);
                            if (i11 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, i11);
                            }
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                    }
                    completer.set(new zzgcj(responseCode, byteArray));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final ListenableFuture zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final ListenableFuture zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    final /* synthetic */ Object zzc(final String str, final boolean z10, final String str2, final byte[] bArr, final CallbackToFutureAdapter.Completer completer) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgcg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(str, completer, z10, str2, bArr);
            }
        });
        return "";
    }
}
