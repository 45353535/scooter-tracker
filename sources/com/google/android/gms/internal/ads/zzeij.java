package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzeij extends zzeim {

    @Nullable
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    zzeij(@Nullable String str, String str2, @Nullable Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeim) {
            zzeim zzeimVar = (zzeim) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzeimVar.zza()) : zzeimVar.zza() == null) {
                if (this.zzb.equals(zzeimVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzeimVar.zzc()) : zzeimVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb2.append("OfflineAdAssets{advertiserName=");
        sb2.append(str);
        sb2.append(", imageUrl=");
        sb2.append(str2);
        sb2.append(", icon=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeim
    @Nullable
    final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeim
    final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeim
    @Nullable
    final Drawable zzc() {
        return this.zzc;
    }
}
