package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: loaded from: classes8.dex */
public enum EC2Algorithm implements Algorithm {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    EC2Algorithm(int i10) {
        this.zzb = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public int getAlgoValue() {
        return this.zzb;
    }
}
