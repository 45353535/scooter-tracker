package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3015gY extends C2315Og {
    @Override // com.facebook.ads.redexgen.core.C2315Og
    public final View.AccessibilityDelegate A00(AbstractC2316Oh abstractC2316Oh) {
        return new C2313Oe(this, abstractC2316Oh);
    }

    @Override // com.facebook.ads.redexgen.core.C2315Og
    public final PU A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new PU(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C2315Og
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
    }
}
