package com.google.android.odml.image;

/* JADX INFO: loaded from: classes9.dex */
final class zzb extends zzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f28608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f28609b;

    zzb() {
    }

    @Override // com.google.android.odml.image.zzh
    final zzh a(int i10) {
        this.f28608a = Integer.valueOf(i10);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    final zzh b(int i10) {
        this.f28609b = Integer.valueOf(i10);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    final ImageProperties c() {
        Integer num = this.f28608a;
        if (num != null && this.f28609b != null) {
            return new zzc(num.intValue(), this.f28609b.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f28608a == null) {
            sb2.append(" imageFormat");
        }
        if (this.f28609b == null) {
            sb2.append(" storageType");
        }
        String strValueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(strValueOf);
        throw new IllegalStateException(sb3.toString());
    }
}
