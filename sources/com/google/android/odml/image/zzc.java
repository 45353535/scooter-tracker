package com.google.android.odml.image;

/* JADX INFO: loaded from: classes9.dex */
final class zzc extends ImageProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28611b;

    /* synthetic */ zzc(int i10, int i11, zza zzaVar) {
        this.f28610a = i10;
        this.f28611b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.f28610a == imageProperties.getImageFormat() && this.f28611b == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.f28610a;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.f28611b;
    }

    public final int hashCode() {
        return ((this.f28610a ^ 1000003) * 1000003) ^ this.f28611b;
    }

    public final String toString() {
        int i10 = this.f28610a;
        int i11 = this.f28611b;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("ImageProperties{imageFormat=");
        sb2.append(i10);
        sb2.append(", storageType=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
