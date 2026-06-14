package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfwe {
    public static boolean zza(zzbch zzbchVar) {
        int iOrdinal = zzbchVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbch zzb(Context context, zzfvh zzfvhVar) {
        zzbch zzbchVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgxn(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfvhVar != null) {
                    zzfvhVar.zze(5017, "No .so");
                } else {
                    zzfvhVar = null;
                }
                zzbchVar = zzbch.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e10) {
                    zzc(null, e10.toString(), context, zzfvhVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfvhVar);
                        zzbchVar = zzbch.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s10 = ByteBuffer.wrap(bArr2).getShort();
                        if (s10 == 3) {
                            zzbchVar = zzbch.X86;
                        } else if (s10 == 40) {
                            zzbchVar = zzbch.ARM7;
                        } else if (s10 == 62) {
                            zzbchVar = zzbch.X86_64;
                        } else if (s10 == 183) {
                            zzbchVar = zzbch.ARM64;
                        } else if (s10 != 243) {
                            zzc(bArr, null, context, zzfvhVar);
                            zzbchVar = zzbch.UNSUPPORTED;
                        } else {
                            zzbchVar = zzbch.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbchVar = zzbch.UNSUPPORTED;
                }
            }
        } else {
            if (zzfvhVar != null) {
                zzfvhVar.zze(5017, "No lib/");
            } else {
                zzfvhVar = null;
            }
            zzbchVar = zzbch.UNKNOWN;
        }
        if (zzbchVar == zzbch.UNKNOWN) {
            String strZzd = zzd(context, zzfvhVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfvhVar);
                zzbchVar = zzbch.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzbchVar = zzbch.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzbchVar = zzbch.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbchVar = zzbch.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbchVar = zzbch.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbchVar = zzbch.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfvhVar);
                zzbchVar = zzbch.UNSUPPORTED;
            }
        }
        if (zzfvhVar != null) {
            zzfvhVar.zze(5018, zzbchVar.name());
        }
        return zzbchVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfvh zzfvhVar) {
        if (zzfvhVar == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("os.arch:");
        sb2.append(zzgrs.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        zzfvhVar.zze(4007, sb2.toString());
    }

    private static final String zzd(Context context, zzfvh zzfvhVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzgrs.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            if (zzfvhVar != null) {
                zzfvhVar.zzc(2024, 0L, e10);
            }
        } catch (NoSuchFieldException e11) {
            if (zzfvhVar != null) {
                zzfvhVar.zzc(2024, 0L, e11);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
