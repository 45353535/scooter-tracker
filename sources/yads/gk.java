package yads;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes4.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f111232a;

    public gk(hk hkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(hkVar.f111608b).setFlags(hkVar.f111609c).setUsage(hkVar.f111610d);
        int i10 = w83.f117341a;
        if (i10 >= 29) {
            ek.a(usage, hkVar.f111611e);
        }
        if (i10 >= 32) {
            fk.a(usage, hkVar.f111612f);
        }
        this.f111232a = usage.build();
    }
}
