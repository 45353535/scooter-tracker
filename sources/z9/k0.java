package z9;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.media3.common.DrmInitData;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v9.c2;
import z9.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0.c f119283d = new e0.c() { // from class: z9.h0
        @Override // z9.e0.c
        public final e0 acquireExoMediaDrm(UUID uuid) {
            return k0.d(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f119284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f119285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119286c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, c2 c2Var) {
            LogSessionId logSessionIdA = c2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            androidx.media3.exoplayer.drm.c0.a(q9.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private k0(UUID uuid) {
        q9.a.e(uuid);
        q9.a.b(!n9.f.f95288b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f119284a = uuid;
        MediaDrm mediaDrm = new MediaDrm(j(uuid));
        this.f119285b = mediaDrm;
        this.f119286c = 1;
        if (n9.f.f95290d.equals(uuid) && q()) {
            m(mediaDrm);
        }
    }

    public static /* synthetic */ void c(k0 k0Var, e0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        k0Var.getClass();
        bVar.a(k0Var, bArr, i10, i11, bArr2);
    }

    public static /* synthetic */ e0 d(UUID uuid) {
        try {
            return r(uuid);
        } catch (p0 unused) {
            q9.u.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new b0();
        }
    }

    private static byte[] e(byte[] bArr) {
        q9.d0 d0Var = new q9.d0(bArr);
        int iU = d0Var.u();
        short sW = d0Var.w();
        short sW2 = d0Var.w();
        if (sW != 1 || sW2 != 1) {
            q9.u.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sW3 = d0Var.w();
        Charset charset = StandardCharsets.UTF_16LE;
        String strF = d0Var.F(sW3, charset);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            q9.u.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i10 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String f(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (q9.o0.f98837a >= 33 && "https://default.url".equals(str)) {
            String strN = n("version");
            if (Objects.equals(strN, POBCoreNativeConstants.NATIVE_DEFAULT_VERSION) || Objects.equals(strN, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] g(UUID uuid, byte[] bArr) {
        return n9.f.f95289c.equals(uuid) ? z9.a.a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] h(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = n9.f.f95291e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = ib.p.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = e(r4)
            byte[] r4 = ib.p.a(r0, r4)
        L18:
            boolean r1 = k(r3)
            if (r1 == 0) goto L2e
            ib.p$a r1 = ib.p.d(r4)
            if (r1 == 0) goto L2e
            java.util.UUID r4 = n9.f.f95288b
            java.util.UUID[] r2 = r1.f74122d
            byte[] r1 = r1.f74121c
            byte[] r4 = ib.p.b(r4, r2, r1)
        L2e:
            int r1 = q9.o0.f98837a
            r2 = 23
            if (r1 >= r2) goto L3c
            java.util.UUID r1 = n9.f.f95290d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6e
        L3c:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
        L6e:
            byte[] r3 = ib.p.e(r4, r3)
            if (r3 == 0) goto L75
            return r3
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.k0.h(java.util.UUID, byte[]):byte[]");
    }

    private static String i(UUID uuid, String str) {
        return (q9.o0.f98837a < 26 && n9.f.f95289c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID j(UUID uuid) {
        return k(uuid) ? n9.f.f95288b : uuid;
    }

    private static boolean k(UUID uuid) {
        return q9.o0.f98837a < 27 && Objects.equals(uuid, n9.f.f95289c);
    }

    private static void m(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData o(UUID uuid, List list) {
        if (!n9.f.f95290d.equals(uuid)) {
            return (DrmInitData.SchemeData) list.get(0);
        }
        if (q9.o0.f98837a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i10);
                byte[] bArr = (byte[]) q9.a.e(schemeData2.f80515f);
                if (Objects.equals(schemeData2.f80514e, schemeData.f80514e) && Objects.equals(schemeData2.f80513d, schemeData.f80513d) && ib.p.c(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) q9.a.e(((DrmInitData.SchemeData) list.get(i12)).f80515f);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length2);
                i11 += length2;
            }
            return schemeData.b(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i13);
            int iG = ib.p.g((byte[]) q9.a.e(schemeData3.f80515f));
            int i14 = q9.o0.f98837a;
            if ((i14 < 23 && iG == 0) || (i14 >= 23 && iG == 1)) {
                return schemeData3;
            }
        }
        return (DrmInitData.SchemeData) list.get(0);
    }

    private boolean p() {
        if (!this.f119284a.equals(n9.f.f95290d)) {
            return this.f119284a.equals(n9.f.f95289c);
        }
        String strN = n("version");
        return (strN.startsWith("v5.") || strN.startsWith("14.") || strN.startsWith("15.") || strN.startsWith("16.0")) ? false : true;
    }

    private static boolean q() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static k0 r(UUID uuid) throws p0 {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new p0(1, e10);
        } catch (Exception e11) {
            throw new p0(2, e11);
        }
    }

    @Override // z9.e0
    public void a(final e0.b bVar) {
        this.f119285b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: z9.i0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                k0.c(this.f119278a, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // z9.e0
    public void b(byte[] bArr, c2 c2Var) {
        if (q9.o0.f98837a >= 31) {
            try {
                a.b(this.f119285b, bArr, c2Var);
            } catch (UnsupportedOperationException unused) {
                q9.u.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // z9.e0
    public void closeSession(byte[] bArr) {
        this.f119285b.closeSession(bArr);
    }

    @Override // z9.e0
    public int getCryptoType() {
        return 2;
    }

    @Override // z9.e0
    public e0.a getKeyRequest(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataO;
        byte[] bArrH;
        String strI;
        if (list != null) {
            schemeDataO = o(this.f119284a, list);
            bArrH = h(this.f119284a, (byte[]) q9.a.e(schemeDataO.f80515f));
            strI = i(this.f119284a, schemeDataO.f80514e);
        } else {
            schemeDataO = null;
            bArrH = null;
            strI = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f119285b.getKeyRequest(bArr, bArrH, strI, i10, map);
        byte[] bArrG = g(this.f119284a, keyRequest.getData());
        String strF = f(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strF) && schemeDataO != null && !TextUtils.isEmpty(schemeDataO.f80513d)) {
            strF = schemeDataO.f80513d;
        }
        return new e0.a(bArrG, strF, q9.o0.f98837a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // z9.e0
    public e0.d getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f119285b.getProvisionRequest();
        return new e0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // z9.e0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f0 createCryptoConfig(byte[] bArr) {
        return new f0(j(this.f119284a), bArr);
    }

    public String n(String str) {
        return this.f119285b.getPropertyString(str);
    }

    @Override // z9.e0
    public byte[] openSession() {
        return this.f119285b.openSession();
    }

    @Override // z9.e0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (n9.f.f95289c.equals(this.f119284a)) {
            bArr2 = z9.a.b(bArr2);
        }
        return this.f119285b.provideKeyResponse(bArr, bArr2);
    }

    @Override // z9.e0
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f119285b.provideProvisionResponse(bArr);
    }

    @Override // z9.e0
    public Map queryKeyStatus(byte[] bArr) {
        return this.f119285b.queryKeyStatus(bArr);
    }

    @Override // z9.e0
    public synchronized void release() {
        int i10 = this.f119286c - 1;
        this.f119286c = i10;
        if (i10 == 0) {
            this.f119285b.release();
        }
    }

    @Override // z9.e0
    public boolean requiresSecureDecoder(byte[] bArr, String str) throws Throwable {
        if (q9.o0.f98837a >= 31 && p()) {
            MediaDrm mediaDrm = this.f119285b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(j(this.f119284a), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z10 = !this.f119284a.equals(n9.f.f95289c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // z9.e0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f119285b.restoreKeys(bArr, bArr2);
    }
}
