package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzfxs;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL urlZze = null;
        try {
            urlZze = new URI(str).toURL();
        } catch (IllegalArgumentException e10) {
            e = e10;
            zzf(str, e);
        } catch (MalformedURLException e11) {
            e = e11;
            zzf(str, e);
        } catch (URISyntaxException e12) {
            zzf(str, e12);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzf)).booleanValue()) {
                urlZze = zze(str);
            }
        }
        if (urlZze != null) {
            return urlZze;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.zzd(sb2.toString());
        return new URL(str);
    }

    @Nullable
    private final URL zze(String str) {
        URL url;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String string = uri.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
                sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb2.append(str);
                sb2.append("\" -> encoded URI: ");
                sb2.append(string);
                zzo.zzd(sb2.toString());
                return url;
            } catch (IllegalArgumentException e10) {
                e = e10;
                zzf(str, e);
                return url;
            } catch (MalformedURLException e11) {
                e = e11;
                zzf(str, e);
                return url;
            } catch (URISyntaxException e12) {
                e = e12;
                zzf(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e13) {
            e = e13;
            url = null;
        }
    }

    private final void zzf(String str, Throwable th2) {
        String message = th2.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        zzo.zzi(sb2.toString());
        zzbyp.zza(this.zza).zzi(th2, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbhe.zzoi)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @WorkerThread
    public final zzt zzc(String str, @Nullable Map map) {
        HttpURLConnection httpURLConnection;
        zzt zztVar = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() || !zzbb.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb2 = new StringBuilder(str.length() + 13);
                            sb2.append("Pinging URL: ");
                            sb2.append(str);
                            zzo.zzd(sb2.toString());
                            URL urlZzd = zzd(str);
                            int i10 = zzfxs.zzb;
                            httpURLConnection = (HttpURLConnection) urlZzd.openConnection();
                        } catch (IOException e10) {
                            e = e10;
                            String message = e.getMessage();
                            StringBuilder sb3 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                            sb3.append("Error while pinging URL: ");
                            sb3.append(str);
                            sb3.append(". ");
                            sb3.append(message);
                            zzo.zzi(sb3.toString());
                            zztVar = zzt.RETRIABLE_FAILURE;
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        } catch (IndexOutOfBoundsException e11) {
                            e = e11;
                            zzf(str, e);
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        } catch (RuntimeException e12) {
                            e = e12;
                            String message2 = e.getMessage();
                            StringBuilder sb32 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                            sb32.append("Error while pinging URL: ");
                            sb32.append(str);
                            sb32.append(". ");
                            sb32.append(message2);
                            zzo.zzi(sb32.toString());
                            zztVar = zzt.RETRIABLE_FAILURE;
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        } catch (MalformedURLException e13) {
                            e = e13;
                            zzf(str, e);
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        }
                        try {
                            zzbb.zza();
                            String str2 = this.zzb;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            zzl zzlVar = new zzl(null);
                            zzlVar.zza(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzlVar.zzc(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb4.append("Received non-success response code ");
                                sb4.append(responseCode);
                                sb4.append(" from pinging URL: ");
                                sb4.append(str);
                                zzo.zzi(sb4.toString());
                                if (responseCode == 502) {
                                    zztVar = zzt.RETRIABLE_FAILURE;
                                }
                            } else {
                                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzjc)).booleanValue()) {
                                    this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                zztVar = zzt.SUCCESS;
                            }
                            httpURLConnection.disconnect();
                            if (!ClientLibraryUtils.isPackageSide()) {
                                return zztVar;
                            }
                            TrafficStats.clearThreadStatsTag();
                            return zztVar;
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        if (ClientLibraryUtils.isPackageSide()) {
                            TrafficStats.clearThreadStatsTag();
                        }
                        throw th3;
                    }
                }
            }
        }
        return zztVar;
    }
}
