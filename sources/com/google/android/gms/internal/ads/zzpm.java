package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.analytics.l3;
import androidx.media3.exoplayer.analytics.o3;
import androidx.media3.exoplayer.analytics.v2;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(31)
public final class zzpm implements zzna, zzpn {
    private boolean zzA;
    private final Context zza;
    private final zzpo zzc;
    private final PlaybackSession zzd;

    @Nullable
    private String zzj;

    @Nullable
    private PlaybackMetrics.Builder zzk;
    private int zzl;

    @Nullable
    private zzau zzo;

    @Nullable
    private zzpl zzp;

    @Nullable
    private zzpl zzq;

    @Nullable
    private zzpl zzr;

    @Nullable
    private zzv zzs;

    @Nullable
    private zzv zzt;

    @Nullable
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpm(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpf zzpfVar = new zzpf(zzpf.zza);
        this.zzc = zzpfVar;
        zzpfVar.zza(this);
    }

    private final void zzA(int i10, long j10, @Nullable zzv zzvVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = l3.a(i10).setTimeSinceCreatedMillis(j10 - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzvVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzvVar.zzj;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzvVar.zzv;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzvVar.zzw;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzvVar.zzG;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzvVar.zzH;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfj.zza;
                String[] strArrSplit = str4.split(TokenBuilder.TOKEN_DELIMITER, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzvVar.zzz;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    private final void zzB(zzbf zzbfVar, @Nullable zzwk zzwkVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzwkVar == null || (iZze = zzbfVar.zze(zzwkVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i10 = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzF = zzfj.zzF(zzagVar.zza);
            i10 = iZzF != 0 ? iZzF != 1 ? iZzF != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        long j10 = zzbeVar.zzm;
        if (j10 != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfj.zzp(j10));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l10 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzk.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzD(int i10) {
        switch (zzfj.zzE(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    public static zzpm zza(Context context) {
        MediaMetricsManager mediaMetricsManagerA = v2.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new zzpm(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private final boolean zzw(@Nullable zzpl zzplVar) {
        if (zzplVar != null) {
            return zzplVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j10, @Nullable zzv zzvVar, int i10) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i11 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j10, zzvVar, i11);
    }

    private final void zzy(long j10, @Nullable zzv zzvVar, int i10) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i11 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j10, zzvVar, i11);
    }

    private final void zzz(long j10, @Nullable zzv zzvVar, int i10) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i11 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j10, zzvVar, i11);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzc(zzmy zzmyVar, String str) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = o3.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.0-beta01");
            zzB(zzmyVar.zzb, zzwkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzd(zzmy zzmyVar, String str, boolean z10) {
        zzwk zzwkVar = zzmyVar.zzd;
        if ((zzwkVar == null || !zzwkVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzde(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i10) {
        if (i10 == 1) {
            this.zzv = true;
            i10 = 1;
        }
        this.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdf(zzmy zzmyVar, zzwg zzwgVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return;
        }
        zzv zzvVar = zzwgVar.zzb;
        zzvVar.getClass();
        zzpl zzplVar = new zzpl(zzvVar, 0, this.zzc.zzb(zzmyVar.zzb, zzwkVar));
        int i10 = zzwgVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzq = zzplVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzr = zzplVar;
                return;
            }
        }
        this.zzp = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdg(zzmy zzmyVar, int i10, long j10, long j11) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar != null) {
            String strZzb = this.zzc.zzb(zzmyVar.zzb, zzwkVar);
            HashMap map = this.zzi;
            Long l10 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l11 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            map2.put(strZzb, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdh(zzmy zzmyVar, zzin zzinVar) {
        this.zzx += zzinVar.zzg;
        this.zzy += zzinVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029a  */
    @Override // com.google.android.gms.internal.ads.zzna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzdi(com.google.android.gms.internal.ads.zzbb r20, com.google.android.gms.internal.ads.zzmz r21) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpm.zzdi(com.google.android.gms.internal.ads.zzbb, com.google.android.gms.internal.ads.zzmz):void");
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zze(zzmy zzmyVar, int i10) {
        q1.f(this, zzmyVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzk(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        q1.i(this, zzmyVar, zzvVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzl(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        q1.j(this, zzmyVar, zzvVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzm(zzmy zzmyVar, int i10, long j10) {
        q1.k(this, zzmyVar, i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzo(zzmy zzmyVar, Object obj, long j10) {
        q1.l(this, zzmyVar, obj, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzpl zzplVar = this.zzp;
        if (zzplVar != null) {
            zzv zzvVar = zzplVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(zzbvVar.zzb);
                zztVarZza.zzu(zzbvVar.zzc);
                this.zzp = new zzpl(zztVarZza.zzM(), 0, zzplVar.zzc);
            }
        }
    }

    final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
