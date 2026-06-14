package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.media3.common.PlaybackException;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UN extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final VM A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -14, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, Ascii.DC2, Ascii.DLE, Ascii.GS, 0, 19, Ascii.FF, 2, 10, 3, Ascii.GS, 9, 3, Ascii.ETB, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, Ascii.NAK, Ascii.SYN, Ascii.DC4, 33, Ascii.NAK, 7, Ascii.DC4, Ascii.CAN, Ascii.VT, 5, 7, 33, Ascii.NAK, 6, 13, 33, Ascii.CAN, 7, Ascii.DC4, Ascii.NAK, Ascii.VT, 17, Ascii.DLE};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = UN.class.getSimpleName();
    }

    public UN(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = VM.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C3041gz A01(C3037gv c3037gv, String str) {
        C3041gz c3041gz = new C3041gz(c3037gv, this.A03, str);
        c3041gz.A0G(c3037gv.A0B(), c3037gv.A07());
        return c3041gz;
    }

    private C3038gw A02(C3028gm c3028gm, String str) {
        C3038gw c3038gw = new C3038gw(c3028gm, this.A03, str);
        c3038gw.A0J(c3028gm.A05, c3028gm.A02, c3028gm.A08);
        return c3038gw;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        String strVerifyPackage;
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    VM.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C2820dL c2820dLA05 = RB.A05(this.A00, callingAppPackage);
            c2820dLA05.A0F().AIi(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                strVerifyPackage = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                strVerifyPackage = null;
            }
            if (strVerifyPackage == null) {
                if (messenger != null) {
                    VM.A00().A07(20, callingAppPackage, null, messenger);
                }
                c2820dLA05.A0F().AHB();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    UK ukA04 = VM.A00().A04(callingAppPackage);
                    if (ukA04 == null) {
                        ukA04 = VM.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C3037gv intAdModel = AbstractC2304Nt.A04(c2820dLA05, msg.getData(), strVerifyPackage);
                    if (ukA04.A00 == null) {
                        ukA04.A00 = A01(intAdModel, callingAppPackage);
                    } else if (ukA04.A00 instanceof C3041gz) {
                        ((C3041gz) ukA04.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    VM.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case 1012:
                case 2002:
                    VM.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    UK ukA042 = VM.A00().A04(callingAppPackage);
                    if (ukA042 == null) {
                        ukA042 = VM.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C3028gm c3028gmA05 = AbstractC2304Nt.A05(c2820dLA05, msg.getData(), strVerifyPackage);
                    if (ukA042.A00 == null) {
                        ukA042.A00 = A02(c3028gmA05, callingAppPackage);
                    } else if (ukA042.A00 instanceof C3038gw) {
                        C3038gw c3038gw = (C3038gw) ukA042.A00;
                        String adId = c3028gmA05.A05;
                        c3038gw.A0J(adId, c3028gmA05.A02, c3028gmA05.A08);
                    }
                    VM.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    InterfaceC2287Nc interfaceC2287NcA03 = VM.A00().A03(callingAppPackage);
                    if (interfaceC2287NcA03 instanceof C3038gw) {
                        RewardData rewardDataA01 = AbstractC2305Nu.A01(msg.getData());
                        C3038gw c3038gw2 = (C3038gw) interfaceC2287NcA03;
                        if (rewardDataA01 != null) {
                            c3038gw2.A0I(rewardDataA01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th2) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
