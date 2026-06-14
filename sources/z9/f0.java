package z9;

import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements t9.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f119198d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f119199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f119200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f119201c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            z9.f0.f119198d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.f0.<clinit>():void");
    }

    public f0(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public f0(UUID uuid, byte[] bArr, boolean z10) {
        this.f119199a = uuid;
        this.f119200b = bArr;
        this.f119201c = z10;
    }
}
