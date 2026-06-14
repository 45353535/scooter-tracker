package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzchu extends zzchr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = DesugarCollections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzchu(zzcge zzcgeVar) {
        super(zzcgeVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfxl.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfxl.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d6, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03de, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03e0, code lost:
    
        r0 = r10.format(r4);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r34).length());
        r5.append(r18);
        r5.append(r0);
        r5.append(" bytes from ");
        r5.append(r34);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0412, code lost:
    
        r14.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x041d, code lost:
    
        if (r7.isFile() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x041f, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042b, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b9  */
    @Override // com.google.android.gms.internal.ads.zzchr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(final java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchu.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzh = true;
    }
}
