package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.35, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass35 {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C3463oH, C3458oC> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{Utf8.REPLACEMENT_BYTE, 61, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public AnonymousClass35() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public AnonymousClass35(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public AnonymousClass35(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C3456oA.A0e, C3456oA.A0U.A06);
        this.A05 = bundle.getInt(C3456oA.A0d, C3456oA.A0U.A05);
        this.A04 = bundle.getInt(C3456oA.A0c, C3456oA.A0U.A04);
        this.A03 = bundle.getInt(C3456oA.A0b, C3456oA.A0U.A03);
        this.A0A = bundle.getInt(C3456oA.A0i, C3456oA.A0U.A0A);
        this.A09 = bundle.getInt(C3456oA.A0h, C3456oA.A0U.A09);
        this.A08 = bundle.getInt(C3456oA.A0n(), C3456oA.A0U.A08);
        this.A07 = bundle.getInt(C3456oA.A0f, C3456oA.A0U.A07);
        this.A0F = bundle.getInt(C3456oA.A0v, C3456oA.A0U.A0F);
        this.A0E = bundle.getInt(C3456oA.A0t, C3456oA.A0U.A0E);
        this.A0Q = bundle.getBoolean(C3456oA.A0u, C3456oA.A0U.A0Q);
        this.A0M = AbstractC1964Am.A07((String[]) AbstractC3154j1.A00(bundle.getStringArray(C3456oA.A0p), new String[0]));
        this.A0D = bundle.getInt(C3456oA.A0q, C3456oA.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC3154j1.A00(bundle.getStringArray(C3456oA.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages12 = new String[0];
        this.A0I = A0G((String[]) AbstractC3154j1.A00(bundle.getStringArray(C3456oA.A0j), preferredVideoLanguages12));
        this.A0B = bundle.getInt(C3456oA.A0l, C3456oA.A0U.A0B);
        this.A02 = bundle.getInt(C3456oA.A0a, C3456oA.A0U.A02);
        this.A01 = bundle.getInt(C3456oA.A0Z, C3456oA.A0U.A01);
        String[] preferredVideoLanguages13 = new String[0];
        this.A0J = AbstractC1964Am.A07((String[]) AbstractC3154j1.A00(bundle.getStringArray(C3456oA.A0k), preferredVideoLanguages13));
        String[] preferredVideoLanguages14 = new String[0];
        this.A0K = A0G((String[]) AbstractC3154j1.A00(bundle.getStringArray(C3456oA.A0m), preferredVideoLanguages14));
        this.A0C = bundle.getInt(C3456oA.A0n, C3456oA.A0U.A0C);
        this.A00 = bundle.getInt(C3456oA.A0e(), C3456oA.A0U.A00);
        this.A0P = bundle.getBoolean(C3456oA.A0s, C3456oA.A0U.A0P);
        this.A0O = bundle.getBoolean(C3456oA.A0X, C3456oA.A0U.A0O);
        this.A0N = bundle.getBoolean(C3456oA.A0W, C3456oA.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C3456oA.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C3S.A01(C3458oC.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i10 = 0; i10 < listA01.size(); i10++) {
            C3458oC c3458oC = (C3458oC) listA01.get(i10);
            this.A0G.put(c3458oC.A00, c3458oC);
        }
        int[] iArr = (int[]) AbstractC3154j1.A00(bundle.getIntArray(C3456oA.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i11 : iArr) {
            this.A0H.add(Integer.valueOf(i11));
        }
    }

    public AnonymousClass35(C3456oA c3456oA) {
        A0R(c3456oA);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static AbstractC1964Am<String> A0G(String[] strArr) {
        C17401h c17401hA01 = AbstractC1964Am.A01();
        for (String str : (String[]) C3M.A01(strArr)) {
            c17401hA01.A04(AbstractC18094a.A0k((String) C3M.A01(str)));
        }
        return c17401hA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC18094a.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = AbstractC1964Am.A04(AbstractC18094a.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C3456oA c3456oA) {
        this.A06 = c3456oA.A06;
        this.A05 = c3456oA.A05;
        this.A04 = c3456oA.A04;
        this.A03 = c3456oA.A03;
        this.A0A = c3456oA.A0A;
        this.A09 = c3456oA.A09;
        this.A08 = c3456oA.A08;
        this.A07 = c3456oA.A07;
        this.A0F = c3456oA.A0F;
        this.A0E = c3456oA.A0E;
        this.A0Q = c3456oA.A0Q;
        this.A0M = c3456oA.A0M;
        this.A0D = c3456oA.A0D;
        this.A0L = c3456oA.A0L;
        this.A0I = c3456oA.A0I;
        this.A0B = c3456oA.A0B;
        this.A02 = c3456oA.A02;
        this.A01 = c3456oA.A01;
        this.A0J = c3456oA.A0J;
        this.A0K = c3456oA.A0K;
        this.A0C = c3456oA.A0C;
        this.A00 = c3456oA.A00;
        this.A0P = c3456oA.A0P;
        this.A0O = c3456oA.A0O;
        this.A0N = c3456oA.A0N;
        this.A0H = new HashSet<>(c3456oA.A0H);
        this.A0G = new HashMap<>(c3456oA.A0G);
    }

    public AnonymousClass35 A0W(C3456oA c3456oA) {
        A0R(c3456oA);
        return this;
    }

    public AnonymousClass35 A0m(int i10, int i11, boolean z10) {
        this.A0F = i10;
        this.A0E = i11;
        this.A0Q = z10;
        return this;
    }

    public AnonymousClass35 A0n(Context context) {
        if (AbstractC18094a.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public AnonymousClass35 A0o(Context context, boolean z10) {
        Point viewportSize = AbstractC18094a.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z10);
    }

    public C3456oA A0p() {
        return new C3456oA(this);
    }
}
