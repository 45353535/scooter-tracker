package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhx extends zzgt {
    private final Context zza;

    @Nullable
    private zzhf zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhx(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("rawresource:///");
        sb2.append(i10);
        return Uri.parse(sb2.toString());
    }

    private static AssetFileDescriptor zzk(Context context, zzhf zzhfVar) throws zzhw {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = zzhfVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 61);
                sb2.append("rawresource:// URI must have exactly one path element, found ");
                sb2.append(size);
                throw new zzhw(sb2.toString());
            }
            identifier = zzl(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                StringBuilder sb3 = new StringBuilder(String.valueOf(scheme).length() + 62);
                sb3.append("Unsupported URI scheme (");
                sb3.append(scheme);
                sb3.append("). Only android.resource is supported.");
                throw new zzhw(sb3.toString(), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new zzhw("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                StringBuilder sb4 = new StringBuilder(packageName.length() + 1 + path.length());
                sb4.append(packageName);
                sb4.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb4.append(path);
                identifier = resourcesForApplication.getIdentifier(sb4.toString(), "raw", null);
                if (identifier == 0) {
                    throw new zzhw("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzhw("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new zzhw(null, e11, 2005);
        }
    }

    private static int zzl(String str) throws zzhw {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhw("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzhw {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzhw(null, e10, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzfj.zza;
        int i12 = inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhw("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - ((long) i12);
        }
        zzh(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhw {
        long size;
        this.zzb = zzhfVar;
        zzf(zzhfVar);
        AssetFileDescriptor assetFileDescriptorZzk = zzk(this.zza, zzhfVar);
        this.zzc = assetFileDescriptorZzk;
        long length = assetFileDescriptorZzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhfVar.zze > length) {
                    throw new zzhw(null, null, 2008);
                }
            } catch (zzhw e10) {
                throw e10;
            } catch (IOException e11) {
                throw new zzhw(null, e11, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j10 = zzhfVar.zze;
        long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
        if (jSkip != j10) {
            throw new zzhw(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new zzhw(null, null, 2008);
                }
            }
        } else {
            long j11 = length - jSkip;
            this.zze = j11;
            if (j11 < 0) {
                throw new zzhc(2008);
            }
            size = j11;
        }
        long j12 = zzhfVar.zzf;
        if (j12 != -1) {
            this.zze = size == -1 ? j12 : Math.min(size, j12);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j12 != -1 ? j12 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhf zzhfVar = this.zzb;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhw {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e10) {
                        throw new zzhw(null, e10, 2000);
                    }
                } catch (Throwable th2) {
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                        throw th2;
                    } catch (IOException e11) {
                        throw new zzhw(null, e11, 2000);
                    }
                }
            } catch (Throwable th3) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th3;
            }
        } catch (IOException e12) {
            throw new zzhw(null, e12, 2000);
        }
    }
}
