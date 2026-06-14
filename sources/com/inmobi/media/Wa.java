package com.inmobi.media;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ya f37941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5 f37942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f37943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37945e;

    public Wa(Ya ya2, U5 embeddedBrowserViewClient) {
        Intrinsics.checkNotNullParameter(embeddedBrowserViewClient, "embeddedBrowserViewClient");
        this.f37941a = ya2;
        this.f37942b = embeddedBrowserViewClient;
        this.f37943c = new LinkedHashSet();
    }

    public final void a(int i10, boolean z10, String str, Integer num) {
        try {
            if (this.f37945e) {
                return;
            }
            Ya ya2 = this.f37941a;
            if (ya2 != null) {
                ya2.f38042f = "IN_CUSTOM";
            }
            switch (i10) {
                case 1:
                    if (z10) {
                        this.f37944d = str;
                        U5 u52 = this.f37942b;
                        Na funnelState = Na.f37434h;
                        u52.getClass();
                        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
                        Pa.a(funnelState, ya2, null, u52.f37824i);
                    }
                    break;
                case 2:
                    if (z10) {
                        this.f37944d = str;
                        this.f37945e = true;
                        if (!this.f37943c.contains(1)) {
                            U5 u53 = this.f37942b;
                            Na funnelState2 = Na.f37434h;
                            Ya ya3 = this.f37941a;
                            u53.getClass();
                            Intrinsics.checkNotNullParameter(funnelState2, "funnelState");
                            Pa.a(funnelState2, ya3, 8006, u53.f37824i);
                        }
                        this.f37942b.f37822g.invoke();
                        U5 u54 = this.f37942b;
                        Na funnelState3 = Na.f37435i;
                        Ya ya4 = this.f37941a;
                        u54.getClass();
                        Intrinsics.checkNotNullParameter(funnelState3, "funnelState");
                        Pa.a(funnelState3, ya4, null, u54.f37824i);
                    }
                    break;
                case 3:
                    if (z10 || (str != null && Intrinsics.areEqual(str, this.f37944d))) {
                        this.f37945e = true;
                        if (!this.f37943c.contains(1)) {
                            U5 u55 = this.f37942b;
                            Na funnelState4 = Na.f37434h;
                            Ya ya5 = this.f37941a;
                            u55.getClass();
                            Intrinsics.checkNotNullParameter(funnelState4, "funnelState");
                            Pa.a(funnelState4, ya5, 8006, u55.f37824i);
                        }
                        U5 u56 = this.f37942b;
                        Na funnelState5 = Na.f37436j;
                        Ya ya6 = this.f37941a;
                        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        u56.getClass();
                        Intrinsics.checkNotNullParameter(funnelState5, "funnelState");
                        Pa.a(funnelState5, ya6, numValueOf, u56.f37824i);
                    }
                    break;
                case 4:
                    if (z10) {
                        this.f37944d = str;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f37945e = true;
                    switch (i10) {
                        case 5:
                            i = 8200;
                            break;
                        case 6:
                            i = 8300;
                            break;
                        case 7:
                            i = 8400;
                            break;
                        case 8:
                            i = 8600;
                            break;
                        case 9:
                            i = 8500;
                            break;
                    }
                    int i11 = 4;
                    if (!this.f37943c.contains(4)) {
                        i11 = 0;
                    }
                    int i12 = i + i11;
                    U5 u57 = this.f37942b;
                    Na funnelState6 = Na.f37436j;
                    Ya ya7 = this.f37941a;
                    Integer numValueOf2 = Integer.valueOf(i12);
                    u57.getClass();
                    Intrinsics.checkNotNullParameter(funnelState6, "funnelState");
                    Pa.a(funnelState6, ya7, numValueOf2, u57.f37824i);
                    break;
            }
            this.f37943c.add(Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.toString();
        }
    }
}
