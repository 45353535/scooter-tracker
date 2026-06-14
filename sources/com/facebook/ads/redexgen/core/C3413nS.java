package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3413nS implements C7H {
    public static byte[] A05;
    public InterfaceC2040Dn A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final C9U A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, -31, -44, -31, -30, -75, -48, -46, -29, -34, -31, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, Ascii.RS, 33, -49, Ascii.CAN, Ascii.GS, 34, 35, Ascii.DLE, Ascii.GS, 35, Ascii.CAN, Ascii.DLE, 35, Ascii.CAN, Ascii.GS, Ascii.SYN, -49, -2, Ascii.US, 36, 34, -49, Ascii.DC4, 39, 35, Ascii.DC4, Ascii.GS, 34, Ascii.CAN, Ascii.RS, Ascii.GS, 6, 51, 51, 48, 51, -31, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, -31, Ascii.ETB, 17, -6, -31, 38, 57, 53, 38, 47, 52, 42, 48, 47, Ascii.DLE, 51, 37, 40, 41, 40, -28, 10, 42, 49, 52, 41, 43, 5, 57, 40, 45, 51, Ascii.SYN, 41, 50, 40, 41, 54, 41, 54, -14, Ascii.SO, 49, 35, 38, 39, 38, -30, Ascii.SO, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, Ascii.DC4, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, Ascii.ESC, Ascii.RS, Ascii.US, Ascii.RS, -38, 6, 35, Ascii.FS, 41, 42, 47, 45, -5, 47, Ascii.RS, 35, 41, Ascii.FF, Ascii.US, 40, Ascii.RS, Ascii.US, 44, Ascii.US, 44, -24, 4, 39, Ascii.EM, Ascii.FS, Ascii.GS, Ascii.FS, -40, 4, 33, Ascii.SUB, 46, 40, 48, Ascii.SO, 33, Ascii.FS, Ascii.GS, 39, 10, Ascii.GS, 38, Ascii.FS, Ascii.GS, 42, Ascii.GS, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, Ascii.SO, -60, 3, -5, -6, -1, -9, -55, -60, -5, Ascii.SO, 5, 6, 2, -9, Ascii.SI, -5, 8, -60, -5, Ascii.SO, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, Ascii.VT, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, Ascii.ESC, 39, 37, -26, Ascii.RS, Ascii.EM, Ascii.ESC, Ascii.GS, Ascii.SUB, 39, 39, 35, -26, Ascii.EM, Ascii.FS, 43, -26, Ascii.EM, 38, Ascii.FS, 42, 39, 33, Ascii.FS, 48, -26, 37, Ascii.GS, Ascii.FS, 33, Ascii.EM, -21, -26, Ascii.GS, 48, 39, 40, 36, Ascii.EM, 49, Ascii.GS, 42, -26, Ascii.GS, 48, 44, -26, Ascii.RS, 36, Ascii.EM, Ascii.ESC, -26, 4, 33, Ascii.SUB, Ascii.RS, 36, Ascii.EM, Ascii.ESC, -7, 45, Ascii.FS, 33, 39, 10, Ascii.GS, 38, Ascii.FS, Ascii.GS, 42, Ascii.GS, 42, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, -39, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, Ascii.FF, 41, 34, 54, 48, 56, Ascii.SYN, 41, 36, 37, 47, Ascii.DC2, 37, 46, 36, 37, 50, 37, 50};
    }

    public C3413nS(Context context) {
        this(context, 0);
    }

    public C3413nS(Context context, int i10) {
        this(context, null, i10, 5000L);
    }

    @Deprecated
    public C3413nS(Context context, C9U c9u, int i10, long j10) {
        this.A00 = new C3414nT(this);
        this.A03 = context;
        this.A01 = i10;
        this.A02 = j10;
        this.A04 = c9u;
    }

    private final void A02(Context context, C9U c9u, long j10, Handler handler, InterfaceC2093Fo interfaceC2093Fo, int extensionRendererIndex, ArrayList<InterfaceC3407nM> arrayList) throws Exception {
        arrayList.add(new C0O(context, C3092hv.A0S, new MediaCodecRendererMetaParameters(null, false), InterfaceC1969Ar.A00, j10, c9u, false, false, handler, interfaceC2093Fo, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(487, 70, 110));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (InterfaceC3407nM) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC2093Fo.class, clazz3, clazz3).newInstance(true, Long.valueOf(j10), handler, interfaceC2093Fo, 50, 5));
                    Log.i(A00(0, 23, 29), A00(243, 27, 102));
                } catch (Exception e10) {
                    e = e10;
                    throw new RuntimeException(A00(127, 33, 111), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final void A03(Context context, C9U c9u, AnonymousClass38[] anonymousClass38Arr, Handler handler, C8D c8d, int extensionRendererIndex, ArrayList<InterfaceC3407nM> arrayList) throws Exception {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String strA00 = A00(0, 23, 29);
        arrayList.add(new C0Q(context, C3092hv.A0S, new MediaCodecRendererMetaParameters(null, false), InterfaceC1969Ar.A00, c9u, false, false, false, handler, c8d, C19027p.A02(context), anonymousClass38Arr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            arrayList.add(size, (InterfaceC3407nM) Class.forName(A00(TTAdConstant.VIDEO_COVER_URL_CODE, 72, 19)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class).newInstance(handler, c8d, anonymousClass38Arr));
            Log.i(strA00, A00(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 28, 104));
        } catch (ClassNotFoundException unused2) {
            size = extensionRendererIndex2;
            extensionRendererIndex2 = size;
        } catch (Exception e11) {
            e = e11;
            throw new RuntimeException(A00(93, 34, 93), e);
        }
        try {
            Constructor<?> constructor = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
            try {
                arrayList.add(extensionRendererIndex2, (InterfaceC3407nM) constructor.newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(strA00, A00(187, 28, 112));
            } catch (ClassNotFoundException unused3) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
            } catch (Exception e12) {
                e = e12;
                throw new RuntimeException(A00(59, 34, 35), e);
            }
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e13) {
            e = e13;
        }
        try {
            try {
                Constructor<?> constructor2 = Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC3407nM) constructor2.newInstance(handler, c8d, anonymousClass38Arr));
                    Log.i(strA00, A00(160, 27, 114));
                } catch (Exception e14) {
                    e = e14;
                    throw new RuntimeException(A00(23, 36, 10), e);
                }
            } catch (ClassNotFoundException unused5) {
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    private final void A04(Context context, B3 b32, Looper looper, int i10, ArrayList<InterfaceC3407nM> arrayList) {
        arrayList.add(new AnonymousClass13(b32, looper));
    }

    private final void A05(Context context, InterfaceC2043Dq interfaceC2043Dq, Looper looper, int i10, ArrayList<InterfaceC3407nM> arrayList) {
        arrayList.add(new C17320z(interfaceC2043Dq, looper, this.A00));
    }

    private final AnonymousClass38[] A06() {
        return new AnonymousClass38[0];
    }

    @Override // com.facebook.ads.redexgen.core.C7H
    public final InterfaceC3407nM[] A5Q(Handler handler, InterfaceC2093Fo interfaceC2093Fo, C8D c8d, InterfaceC2043Dq interfaceC2043Dq, B3 b32, C9U c9u) throws Exception {
        C9U c9u2 = c9u;
        if (c9u2 == null) {
            c9u2 = this.A04;
        }
        ArrayList<InterfaceC3407nM> arrayList = new ArrayList<>();
        A02(this.A03, c9u2, this.A02, handler, interfaceC2093Fo, this.A01, arrayList);
        A03(this.A03, c9u2, A06(), handler, c8d, this.A01, arrayList);
        A05(this.A03, interfaceC2043Dq, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, b32, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC3407nM[]) arrayList.toArray(new InterfaceC3407nM[arrayList.size()]);
    }
}
