package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
final class zzjj implements zzfx {
    static final zzfx zza = new zzjj();

    private zzjj() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final boolean zza(int i10) {
        return (i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : zzjk.ALTERNATIVE_BILLING_ACTION : zzjk.LOCAL_PURCHASES_UPDATED_ACTION : zzjk.PURCHASES_UPDATED_ACTION : zzjk.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
