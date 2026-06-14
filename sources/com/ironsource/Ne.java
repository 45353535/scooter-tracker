package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public enum Ne {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41466b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41471a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ne a(int i10) {
            Ne ne2;
            Ne[] neArrValues = Ne.values();
            int length = neArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    ne2 = null;
                    break;
                }
                ne2 = neArrValues[i11];
                if (ne2.f41471a == i10) {
                    break;
                }
                i11++;
            }
            return ne2 == null ? Ne.CurrentlyLoadedAds : ne2;
        }

        private a() {
        }
    }

    Ne(int i10) {
        this.f41471a = i10;
    }

    public final int b() {
        return this.f41471a;
    }
}
