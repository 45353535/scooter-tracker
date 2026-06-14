package yads;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class iw0 implements km0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final im0 f112162d = new im0() { // from class: yads.v8
        @Override // yads.im0
        public final km0 a(UUID uuid) {
            return iw0.b(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f112163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f112164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112165c;

    public iw0(UUID uuid) {
        fi.a(uuid);
        fi.a("Use C.CLEARKEY_UUID instead", !ar.f108752b.equals(uuid));
        this.f112163a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f112164b = mediaDrm;
        this.f112165c = 1;
        if (ar.f108754d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    public static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // yads.km0
    public final int b() {
        return 2;
    }

    @Override // yads.km0
    public final byte[] c() {
        return this.f112164b.openSession();
    }

    @Override // yads.km0
    public final w10 d(byte[] bArr) {
        return new gw0(a(this.f112163a), bArr, w83.f117341a < 21 && ar.f108754d.equals(this.f112163a) && "L3".equals(this.f112164b.getPropertyString("securityLevel")));
    }

    @Override // yads.km0
    public final synchronized void release() {
        int i10 = this.f112165c - 1;
        this.f112165c = i10;
        if (i10 == 0) {
            this.f112164b.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0204  */
    @Override // yads.km0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.gm0 a(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.iw0.a(byte[], java.util.List, int, java.util.HashMap):yads.gm0");
    }

    @Override // yads.km0
    public final void b(byte[] bArr) {
        this.f112164b.closeSession(bArr);
    }

    @Override // yads.km0
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f112164b.provideProvisionResponse(bArr);
    }

    public static /* synthetic */ km0 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (y73 unused) {
            uf1.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new uj0();
        }
    }

    public static iw0 c(UUID uuid) throws y73 {
        try {
            return new iw0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new y73(e10);
        } catch (Exception e11) {
            throw new y73(e11);
        }
    }

    @Override // yads.km0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (ar.f108753c.equals(this.f112163a) && w83.f117341a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, st.f115925c));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(st.f115925c);
            } catch (JSONException e10) {
                uf1.b("ClearKeyUtil", uf1.a("Failed to adjust response data: ".concat(new String(bArr2, st.f115925c)), e10));
            }
        }
        return this.f112164b.provideKeyResponse(bArr, bArr2);
    }

    public static boolean d() {
        return li2.f113105f.a().equals(w83.f117344d);
    }

    @Override // yads.km0
    public final jm0 a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f112164b.getProvisionRequest();
        return new jm0(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public final void a(hm0 hm0Var, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        oc0 oc0Var = ((nc0) hm0Var).f113797a.f116190y;
        oc0Var.getClass();
        oc0Var.obtainMessage(i10, bArr).sendToTarget();
    }

    @Override // yads.km0
    public final Map a(byte[] bArr) {
        return this.f112164b.queryKeyStatus(bArr);
    }

    @Override // yads.km0
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f112164b.restoreKeys(bArr, bArr2);
    }

    @Override // yads.km0
    public final void a(final nc0 nc0Var) {
        this.f112164b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: yads.w8
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f117338a.a(nc0Var, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // yads.km0
    public final void a(byte[] bArr, wc2 wc2Var) {
        if (w83.f117341a >= 31) {
            try {
                hw0.a(this.f112164b, bArr, wc2Var);
            } catch (UnsupportedOperationException unused) {
                uf1.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // yads.km0
    public final boolean a(String str, byte[] bArr) {
        if (w83.f117341a >= 31) {
            return hw0.a(this.f112164b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f112163a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public static UUID a(UUID uuid) {
        return (w83.f117341a >= 27 || !ar.f108753c.equals(uuid)) ? uuid : ar.f108752b;
    }
}
