package com.fyber.inneractive.sdk.config.global.features;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f20383e = t.NONE;

    public u() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        u uVar = new u();
        a(uVar);
        return uVar;
    }

    public final t c() {
        String strA = a("click_action", f20383e.mKey);
        for (t tVar : t.values()) {
            if (strA.equalsIgnoreCase(tVar.mKey)) {
                return tVar;
            }
        }
        return t.NONE;
    }
}
